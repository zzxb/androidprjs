# Android教程

这是一个基于Android平台开发的基础案例集。旨在用于给初学者快速了解Android平台的开发。

开发工具和平台

* Android Studio 2.0以上
* java语言
* android sdk
* gradle 2.0以上
* git
* github

## 问答

#### 案例集面向谁？
主要是面对高校以及一些对Android开发零基础的人群。

## 目录
1. LayoutDemo 关于android中布局相关案例集，包括：线性布局，表格布局，相对布局，绝对布局以及Frame布局
2. ComponentUI 关于android中核心控件以及控件事件处理的相关案例集。

## 开发者

* zzxb

## 版本
V 1.0.0

## 核心知识点

#### 学习前准备
1.[下载android studio IDE](http://www.android-studio.org/index.php/download/androidstudio-download-baidudisk/)
2.熟悉最基本的面向对象语言开发JAVA
3.学习android开发的知识体系，如下图
![](Android%E6%95%99%E7%A8%8B/android-mind1.png)

#### android studio 开发工具的安装
参考[安装与配置](http://stormzhang.com/devtools/2014/11/25/android-studio-tutorial1/)

#### 关于Gradle知识的了解
在首次安装Android Studio或首次创建Android工程时，会自动下载一个软件，你会发现很慢，甚至你会认为软件处于假死状态，请注意，不要强制关闭软件，因为这样会导致日后工程不能使用等问题。那么，到底是自动下载什么呢？为什么这么慢呢？

1.首先自动下载的是一个自动化构建的工具，它叫Gradle,与[Maven](https://github.com/zzxb/tec-docs/blob/master/Maven_install.md)是一样的功能。

2.下载慢是因为Gradle这个软件在Google端，需要科学上网才能提高或者顺利下载。建议大家，在学习android的时候一定要学会科学上网方式。

那么，到底什么是Gradle？

Gradle是一种依赖管理工具，基于Groovy语言，面向Java应用为主，它抛弃了基于XML的各种繁琐配置，取而代之的是一种基于Groovy的内部领域特定（DSL）语言。

Android Studio除了要下载Gradle，还需要下载一个插件[gradle-plugin](https://developer.android.com/studio/releases/gradle-plugin.html),它是后期在Android Studio编译打包代码最重要的插件.

###### 注意：初学者首次使用Android Studio时，很多不能正常运行的工程大部分都是由于Gradle和Gradle-plugin下载不完整导致。

#### Android Studio的使用
1.首页介绍，如下图：

![](Android%E6%95%99%E7%A8%8B/android-prjlist.png)

2.新建工程，已在安装Android Studio中介绍了。

3.打开已存在的工程。如下图：

![](Android%E6%95%99%E7%A8%8B/android-openprj.png)

4.进入主界面，各Bar介绍

![](Android%E6%95%99%E7%A8%8B/android-asui.png)

5.菜单栏，如下图：

![](Android%E6%95%99%E7%A8%8B/android-menu.png)

6.工程项目透视图有多种，常用两种，如下图：

![](Android%E6%95%99%E7%A8%8B/android-struts.png) ![](Android%E6%95%99%E7%A8%8B/android-projects.png)

7.代码编辑区，如下图：

![](Android%E6%95%99%E7%A8%8B/android-coding.png)

8.用于观察后台日志或监控程序执行过程以及性能的监控控制台，如下图：

![](Android%E6%95%99%E7%A8%8B/android-logs.png)

9.对Gradle自动构建手动的操作，使用Gradle生命周期控制台，如下图:

![](Android%E6%95%99%E7%A8%8B/android-gradle-life.png)

###### 以上就是对于Android Studio IDE界面的介绍，下面我们来看看，基于Android Studio的目录结构。
首先，Android Studio中没有像Eclipse或MyEclipse中WorkSpace(工作空间)的概念，只有工程或项目的概念，在Android Studio中的工程包含多个Moudle(模块).每个模块都可以独立运行或被引用。Android Studio强烈建议一个工程或项目多Moudle(模块)的设计，这样更加的便于维护和开发。

那么，我们来看一下目录结构，以及它们的作用。

1.我们再来回顾一下Android工程透视图,如下图：

![](Android%E6%95%99%E7%A8%8B/android-struts%201.png)

app模块是我们关注的重点

2.mainifests目录下mainifest.xml，如下图:

![](Android%E6%95%99%E7%A8%8B/android-mainifest.png)

该文件是每个android程序中必须的文件。它位于整个项目的根目录，描述了package中暴露的组件（activities, services, 等等），他们各自的实现类，各种能被处理的数据和启动位置。 除了能声明程序中的Activities, ContentProviders, Services, 和Intent Receivers,还能指定permissions和instrumentation（安全控制和测试），同时用于控制Android应用的名称、图标、访问权限等整体属性。

3.java目录是源代码目录，如下图:

![](Android%E6%95%99%E7%A8%8B/android-javadir.png)

4.res目录是所有android模块下所有资源文件的集合，比如：layout布局xml配置文件，图片资源文件集合，资源信息或国际化配置信息文件。

![](Android%E6%95%99%E7%A8%8B/android-res.png)

那么，我们逐个看一下各个子目录作用以及文件。

###### drawable目录，将图片等资源放在drawable-hdip中，将一些和XML文件相关的内容（图片选择器、文字颜色选择器、自定义形状等）放在drawable中。
![](Android%E6%95%99%E7%A8%8B/android-drawalbe.png)

###### layout目录，放置所有界面的布局xml文件。
![](Android%E6%95%99%E7%A8%8B/android-layoutxmls.png)

###### 具体布局样例，如图：
![](Android%E6%95%99%E7%A8%8B/android-layout.png)

###### mipmap目录，用于存放原生图片（图ic_launcher.png），缩放上有性能优化;
![](Android%E6%95%99%E7%A8%8B/android-minmap.png)

###### values目录，讲所有字符串资源文件，颜色等资源文件
![](Android%E6%95%99%E7%A8%8B/android-values.png)

###### strings.xml 字符串资源文件
![](Android%E6%95%99%E7%A8%8B/android-strings.png)

###### colors.xml 颜色资源文件
![](Android%E6%95%99%E7%A8%8B/android-colors.png)

###### dimens.xml 颜色资源文件
![](Android%E6%95%99%E7%A8%8B/android-dimens.png)

5.Gradle Script目录，关于所有Gradle的配置文件。

![](Android%E6%95%99%E7%A8%8B/android-gradles.png)

###### build.gradle(project)
设置整个工程的gradle配置文件

###### build.gradle(Module)
设置工程中某个模块的gradle配置文件，这个文件是我们关注的重点，尤其是当我们引入第三方类库时，要在这个文件中配置。如下图：

![](Android%E6%95%99%E7%A8%8B/android-gradle-app.png)

###### gradle-wrapper.properties
配置gradle的基本信息，例如：安装目录等信息。一般，我们很少修改。

###### gradle.properties
配置gradle编译运行以及性能的配置文件

###### local.properties
配置android sdk目录位置

#### 关于android运行
对于android程序运行，目前有两种方式：虚拟机和真机运行

虚拟机，这种方式可以在android studio中配置，也可以直接使用第三方虚拟机，比如：[genymotion](https://www.genymotion.com/)和[海马玩](http://droid4x.haimawan.com/)等.介于genymotion访问速度非常慢的原因，大家也可以使用海马玩。第三方虚拟机的方式不需要配置安装直接运行，android studio会以真机运行方式执行安装和运行。

真机运行，这种方式用USB线连接电脑的方式直接安装运行。

##### 我建议使用这种方式，因为真机运行可以更准确的测试程序兼容性、性能等情况。

###### 推荐一个基于chrome的第三方插件-Vysor,这是一个可以将真机屏幕投射到电脑上的插件，可以用于演示项目。

#### 1. LayoutDemo之android布局

##### 有哪些布局类型？
Android系统中为我们提供的五大布局：LinearLayout(线性布局)、FrameLayout(单帧布局)、AbsoluteLayout(绝对布局)、TablelLayout(表格布局)、RelativeLayout(相对布局)。其中最常用的的是LinearLayout、TablelLayout和RelativeLayout。这些布局都可以嵌套使用。

##### LinearLayout(线性布局)
线性布局是按照水平或垂直的顺序将子元素(可以是控件或布局)依次按照顺序排列，每一个元素都位于前面一个元素之后。线性布局分为两种：水平方向和垂直方向的布局。分别通过属性android:orientation="vertical" 和 android:orientation="horizontal"来设置。

案例代码分析：

```xml
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:gravity="center_vertical|center_horizontal"
    tools:context="zzxb.me.layoutdemo.MainActivity">

    <Button
        android:id="@+id/linearLO"
        android:text="@string/linear_name"
        android:layout_weight="1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content" />

    <TextView
        android:layout_weight="4"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content" />

    <Button
        android:id="@+id/tableLO"
        android:text="@string/table_name"
        android:layout_weight="1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content" />

    <TextView
        android:layout_weight="4"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content" />


    <Button
        android:id="@+id/frameLO"
        android:text="@string/frame_name"
        android:layout_weight="1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content" />

    <TextView
        android:layout_weight="4"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content" />


    <Button
        android:id="@+id/relativeLO"
        android:text="@string/relative_name"
        android:layout_weight="1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content" />

    <TextView
        android:layout_weight="4"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content" />


    <Button
        android:id="@+id/absLO"
        android:text="@string/abslayout_name"
        android:layout_weight="1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content" />

</LinearLayout>
```

线性布局是用<LinearLayout>标签标示，其中常用的属性：
layout_width/layout_height:设置宽度和高度，其值有：wrap_content(适配内容大小)，match_parent(适配父容器大小),此两个属性在各个控件中为通用属性
id:唯一标识该控件值
orientation:设置该布局是水平布局(horizontal)还是纵向布局(vertical)
gravity:设置控件的对齐方式，常用值：center_vertical(纵向居中)|center_horizontal(水平居中)

在<Button>标签中，也同样有id,layout_width以及lay_height属性。同时，还有如下常用属性：
text:设置按钮文字，这里有两种方式，一种是直接硬编码，即直接写内容，例如：

```xml
   android:text="按钮"
```

第二种方式是非硬编码方式，是通过配置strings.xml文件来配置，例如：

```xml
<resources>
   <string name="btnText">按钮</string>
</resources>
```

然后，通过：

```xml
android:text="@string/btnText"
```

引用。

页面跳转的方式：

```java
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,LinearActivity.class);
                startActivity(intent);
```

##### TableLayout(表格布局)
表格布局与常见的表格类似，以行、列的形式来管理放入其中的UI组件。表格布局使用<TableLayout>标签定义，在表格布局中，可以添加多个<TableRow>标签占用一行。由于<TableRow>标签也是容器，所以还可以在该标签中添加其他组件，每添加一个组件，表格就会增加一列。在表格布局中，列可以被隐藏，也可以被设置为伸展的，从而填充可利用的屏幕空间，还可以设置为强制收缩，直到表格匹配屏幕大小。

TableLayout跟TableRow 是一组搭配应用的布局，TableLayout置底，TableRow在TableLayout的上方，而Button、TextView等控件就在TableRow之上.TableLayout是一个应用错杂的布局，最简单的用法就仅仅是拖沓控件做出个界面，但实际上，会经常在代码里应用TableLayout，例如做出表格的结果。

重要的几个属性如下:

```xml
    android:collapseColumns="1,3" 隐藏第二列和第4列的控件
    android:stretchColumns="0,2,4" 第一列和三列以及第五列的空白textview被拉伸
    android:shrinkColumns="1,3"  第二列和第4列的控件被收缩
```

案例代码：

```xml
    <TableLayout
        android:stretchColumns="0,2,4"
        android:layout_width="match_parent"
        android:layout_height="match_parent">
        <EditText
            android:hint="请输入用户名"
            android:textSize="15sp"
            android:layout_margin="6dp"
            android:background="@drawable/corner_round"
            android:drawableLeft="@mipmap/account"
            android:layout_width="match_parent"
            android:layout_height="wrap_content" />

        <EditText
            android:hint="请输入密码"
            android:layout_margin="6dp"
            android:textSize="15sp"
            android:inputType="textPassword"
            android:background="@drawable/corner_round"
            android:drawableLeft="@mipmap/passwowrd"
            android:layout_width="match_parent"
            android:layout_height="wrap_content" />

        <TableRow>
            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content" />

            <Button
                android:text="登录"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content" />

            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content" />

            <Button
                android:text="注册"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content" />

            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content" />

        </TableRow>
    </TableLayout>
```

##### FrameLayout(帧布局)
帧布局被设计成在一个屏幕区域显示一个单一的项(single item)。通常FrameLayout显示一个单一的子控件，它支持的布局属性不够丰富，一般通过layout_gravity来设置子控件的位置。
FrameLayout的子控件被绘制在一个堆栈中，最近添加进来的子控件在堆栈的顶部。

图例：



案例代码：

```xml
    <FrameLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent">

        <ImageView
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:src="@mipmap/movie"
            android:contentDescription="@string/movie_desc"
            />
        <ImageView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:src="@mipmap/button"
            android:contentDescription="@string/pause_desc"
            android:layout_gravity="center"
            />


    </FrameLayout>
```

##### RelativeLayout(相对布局)
相对布局，子控件的位置关系可以通过子控件与父控件、子控件与子控件来确定，子控件之间位置可以重叠,后面的控件会盖在前面控件之上，拓展性好，灵活方便，是使用最多的布局方式。

案例代码：

```xml
    <RelativeLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content">

        <EditText
            android:id="@+id/et_uname"
            android:hint="请输入用户名"
            android:textSize="20sp"
            android:background="@drawable/corner_round"
            android:layout_alignParentTop="true"
            android:layout_width="match_parent"
            android:layout_height="wrap_content" />

        <EditText
            android:id="@+id/et_pwd"
            android:hint="请输入密码"
            android:inputType="textPassword"
            android:layout_marginTop="12dp"
            android:background="@drawable/corner_round"
            android:textSize="20sp"
            android:layout_below="@+id/et_uname"
            android:layout_width="match_parent"
            android:layout_height="wrap_content" />

    </RelativeLayout>

    <RelativeLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content">

        <Button
            android:id="@+id/btn_login"
            android:text="登录"
            android:layout_width="150dp"
            android:layout_height="wrap_content" />

        <View
            android:id="@+id/v1"
            android:layout_toRightOf="@+id/btn_login"
            android:layout_width="50dp"
            android:layout_height="0dp" />

        <Button
            android:id="@+id/btn_reg"
            android:layout_toRightOf="@+id/v1"
            android:text="注册"
            android:layout_width="150dp"
            android:layout_height="wrap_content" />

    </RelativeLayout>
```

相对布局使用<RelativeLayout>标签，其常用属性如下：

android:layout_toLeftOf="@+id/name" 指定控件的左边
android:layout_toRightOf="@+id/name" 指定控件的右边
android:layout_above="@+id/name" 指定控件的上边
android:layout_below="@+id/name" 指定控件的下边
ndroid:layout_alignLeft="@+id/name" 与指定控件左对齐
android:layout_alignRight="@+id/name" 与指定控件右对齐
android:layout_alignTop="@+id/name" 与指定控件顶部对齐
android:layout_alignBottom="@+id/name" 与指定控件底部对齐
android:layout_alignParentLeft="true" 与父控件的左边对齐
android:layout_alignParentRight="true" 与父控件的右边对齐
android:layout_alignParentTop="true" 与父控件顶部对齐
android:layout_alignParentBottom="true" 与父控件底部对齐
android:layout_centerHorizontal="true" 在父控件中水平居中
android:layout_centerVertical="true" 在父控件中垂直居中
android_layout_centerInParent="true" 在父控件中中部居中

##### AbsoluteLayout(绝对布局)
绝对布局，子控件的位置以绝对的位置定位，子控件之间可以重叠，相对于其他布局，缺少灵活性，在最新的android版本中已经不建议使用。

##### 总结
在android布局控制中，最常用的是线性布局和相对布局，往往它们通常是配合使用，也就是嵌套使用。

##### 关于layout_gravity与gravity的区别
从名字上可以看到，android:gravity是对元素本身说的，元素本身的文本显示在什么地方靠着换个属性设置，不过不设置默认是在左侧的。

android:layout_gravity是相对与它的父元素说的，说明元素显示在父元素的什么位置。

比如说button： android:layout_gravity 表示按钮在界面上的位置。 android:gravity表示button上的字在button上的位置。

#### ComponentUI之核心控件

##### 文本框与编辑框
android中提供了两种文本组件：一种是文本框(TextView),用于在屏幕上显示文本；另外一种是编辑框(EditText),用于在屏幕上显示可编辑的文本框。EditText是TextView的子类，所以，很多EditView上的属性在TextView上也适用。

##### 文本框
<TextView>标签是文本控件，用于文字显示的控件，常用的属性也有id,text,textSize,layout_width以及lay_height属性等，同时，该控件也可以用作间隔控件与控件间距的作用。
layout_weight:设置该控件占父控件的权重。该属性也同样用于其他控件。
例如：

```xml
    <Button
        android:id="@+id/relativeLO"
        android:text="@string/relative_name"
        android:layout_weight="1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content" />

    <TextView
        android:layout_weight="4"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content" />


    <Button
        android:id="@+id/absLO"
        android:text="@string/abslayout_name"
        android:layout_weight="1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content" />
```

特殊属性说明：

android:drawableLeft/Right:用于在文本框内文本的左侧(右侧)绘制制定图像。

##### 编辑框
<EditText>标签是编辑框，由于是TextView的子类，所以，很多TextView的属性也适用于编辑框。

常用属性：

android:hint:用于设置当编辑框中文本内容为空时，默认显示的提示文本
android:inputType:用于指定当前编辑框输入内容的文本类型，其中常用有textPassword,phone等等
android:singleLine:用于指定该编辑框是否为单行模式，其属性值为：true/false。

##### 按钮
android中提供了普通按钮和图片按钮两种按钮组件。

普通按钮<Button>标签和图片按钮<ImageButton>

图片按钮常用属性：

android:src:图片地址

##### 单选按钮
在android中，单选按钮和复选框都继承了普通按钮，因此，它们都可以直接使用普通按钮支持的属性和方法。与普通按钮不同的是，它们都提供了可选中的功能。

单选按钮在默认情况下，显示为一个圆形图标，并且在该图标旁边放置一些说明文字。它使用<RadioButton>标签。通常情况下，RadioButton控件需要与RadioGroup组件一起使用，组成一个单选按钮组。

例如:

```xml
        <RadioGroup
            android:orientation="horizontal"
            android:id="@+id/bg_sex"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content">

            <RadioButton
                android:id="@+id/sexMan"
                android:text="男"
                android:checked="true"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content" />

            <RadioButton
                android:id="@+id/sexWoman"
                android:text="女"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content" />

            <RadioButton
                android:id="@+id/sexOther"
                android:text="保密"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content" />

        </RadioGroup>
```

RadioButton常用属性：

android:checked:是否选中，其值为true/false.

使用单选按钮(RadioButton)有两种方式，第一种，直接在xml中布局单选按钮。这种方式常用于固定的单选值，例如：选中性别等功能。
另外一种，代码动态生成单选按钮。这种方式比较常用于单选值是动态获取的，而非固定。

第一种方式：相对简单，如上例展示。

第二种方式：使用代码生成。案例如下：

定义一个RadioGroup组。

```xml
    <LinearLayout
        android:gravity="center"
        android:orientation="horizontal"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content">

        <TextView
            android:text="状态:"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content" />

        <RadioGroup
            android:orientation="horizontal"
            android:id="@+id/rg_state"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content">

        </RadioGroup>

    </LinearLayout>
```

在Activity中，代码生成RadioButton,并添加到RadioGroup中。

```java
    private RadioGroup radioGroup = null;
    private String[] rbState = {"离职","在职","其他"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio);
        radioGroup = (RadioGroup)findViewById(R.id.rg_state);
        for(int i = 0;i < rbState.length;i++){
            RadioButton rb = new RadioButton(this);
            rb.setText(rbState[i]);
            radioGroup.addView(rb);
            //设置第一个单选按钮为默认选中 
            if(i == 0){
                radioGroup.check(rb.getId());
            }
        }

    }
```

##### 复选框(CheckBox)
在默认情况下，复选框显示为一个方块图标，并且在该图标旁边放置一些说明性文字。与单选框按钮唯一不同的是，复选框可以进行多选设置，每一个复选框都提供“选中”和“不选中”两种状态。CheckBox类同样是Button的子类，所以，可以直接使用Button支持的各种属性。

与单选按钮类似，复选框也有两种方式添加到屏幕中，一种是通过在XML布局文件中使用<CheckBox>标签添加。

例如：

```xml
    <LinearLayout
        android:orientation="horizontal"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content">

        <TextView
            android:text="@string/checkViewName"
            android:textSize="16sp"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content" />
        <LinearLayout
            android:id="@+id/sportsChecksGroup"
            android:orientation="horizontal"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content">

        <CheckBox
            android:text="@string/footBallName"
            android:textSize="16sp"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content" />

        <CheckBox
            android:text="@string/basketBallName"
            android:textSize="16sp"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content" />

        <CheckBox
            android:text="@string/ppBallName"
            android:textSize="16sp"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content" />
        </LinearLayout>
    </LinearLayout>
```

与单选按钮不同的是，复选按钮没有类似单选按钮中的<RadioGruop>标签，如果要想实现复选框类似的分组，需要使用<LinearLayout>等布局标签。即一个布局标签内的所有复选框控件为一组。

另一种方式，是在JAVA文件中，通过代码实现动态的加载复选框，如下：

```xml
    <LinearLayout
        android:orientation="horizontal"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content">

        <TextView
            android:text="@string/check2Name"
            android:textSize="16sp"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content" />

        <LinearLayout
            android:id="@+id/mingXingChecksGruop"
            android:orientation="horizontal"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content" />


    </LinearLayout>
```

则java代码为：

```java
private String[] mingXings = {"陈奕迅","张学友","王菲"};
private LinearLayout mingXingChecksGroup = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checks);
        mingXingChecksGroup = (LinearLayout) findViewById(R.id.mingXingChecksGruop);
        for(String mingXing : mingXings){
            CheckBox cb = new CheckBox(this);
            cb.setText(mingXing);
            cb.setTextSize(16);
            mingXingChecksGroup.addView(cb);
        }
    }
```

复选框的动态加载方式，与单选按钮类似。

当点击按钮获得复选框值，也与单选按钮类似，代码如下：

```java
        btnChecksSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(int i = 0;i < mingXingChecksGroup.getChildCount();i++){
                    CheckBox cb = (CheckBox)mingXingChecksGroup.getChildAt(i);
                    if(cb.isChecked()){
                        Log.i("mingxing",cb.getText().toString());
                    }
                }
        });
```

##### 选择按钮:ToggleButton和Switch
ToggleButton和Switch按钮非常相近，只是在表现样式上有区别，如下图：

ToggleButton:
![](Android%E6%95%99%E7%A8%8B/toggle-button.png)

Switch:
![](Android%E6%95%99%E7%A8%8B/switchbutton.png)

这两个控件只有在表现形式上有些区别，其他的包括属性，使用方式上基本一致。它们通用常用属性，如下：

```xml
            android:textOff="关闭WIFI"
            android:textOn="打开WIFI"
```

常用的监听方法：

```java
        tbnWifi.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    Log.i("wifi",tbnWifi.getTextOn().toString());
;                }else{
                    Log.i("wifi",tbnWifi.getTextOff().toString());
                }
            }
        });
```

获取按钮提交后的值，如下：

```java
tbnWifi = (ToggleButton)findViewById(R.id.tbn_wifi);
Log.i("tbnwifistate",""+tbnWifi.isChecked());
```

##### SeekBar(拖动条)和RatingBar(星级评分条)
在Android中，提供了两种允许用户通过拖动来改变进度的控件，分别是SeekBar(拖动条)和RatingBar(星级评分条)。

如图:

拖动条：
![](Android%E6%95%99%E7%A8%8B/seekbar.png)

星级评分条:
![](Android%E6%95%99%E7%A8%8B/ratingbar.png)

拖动条允许用户拖动滑块来改变值，通常用于实现对某种数值的调节。比如：调节图片大小、透明度或音量等。

在XML布局文件中使用<SeekBar>标签。

```xml
    <SeekBar
        android:layout_marginTop="30dp"
        android:id="@+id/seekbar1"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:max="100"
        android:progress="30" />
```

常用属性：

```xml
android:max : 最大值
android:progress : 当前值
```

在JAVA文件中常用监听：

```java
private SeekBar.OnSeekBarChangeListener seekBarChange = new SeekBar.OnSeekBarChangeListener() {

        //当滑动停止时调用该方法
        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {
        }

        //当开始滑动时调用该方法
        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        //当滑动值发生变化时调用该方法
        @Override
        public void onProgressChanged(SeekBar seekBar, int progress,
                                      boolean fromUser) {
        }
    };
```

星级评分条与拖动条类似，都允许用户拖动来改变进度，所不同的是，星级评分条通过星星图案表示进度。

在XML布局文件中使用<RatingBar>标示星级评分条。

```xml
    <RatingBar
        android:id="@+id/rbRating1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:isIndicator="false"
        android:max="100"
        android:numStars="4"
        android:rating="2.5"
        android:stepSize="0.5" />
```

常用属性：

```xml
        android:isIndicator : 是否允许用户改变星级，true为不允许改变
        android:max         : 最大值
        android:numStars    : 共有多少个星
        android:rating      : 默认的星级
        android:stepSize    : 步进值
```

常用监听方法：

```java
    public void onRatingChanged(RatingBar ratingBar, float rating,
                                boolean fromUser) {
    }
```

提交获得值常用方法：

```java
   getRating():获得等级,表示选中了几颗星。
   getProgress():获得进度值.
```

##### ImageView(图像视图)
图像视图用于在屏幕中显示任何Drawable对象，通常用来显示图片。在XML布局文件中，使用<ImageView>标签。

常用属性：

```xml
  android:adjustViewBounds : 用于设置ImageView是否调整自己的边界来保持所显示图片的长宽比
  android:maxHeight        : 最大高度
  android:maxWidth         : 最大宽度
  android:scaleType        : 用于设置所显示图片如何缩放或移动以适应ImageView的大小
  android:src              : 地址id
```

##### AutoCompleteTextView(自动完成文本框)
自动完成文本框(AutoComleteTextView),用于实现允许用户输入一定字符后，显示一个下拉菜单，供用户从中选择，当用户选择某个选项后，按用户选择自动填写该文本框。AutoCompleteTextView控件继承于EditText,所以它支持所有EditText组件提供的属性。

在XML布局文件中，使用<AutoCompleteTextView>标签创建，常用属性：

```xml
   android:completionHint          : 为弹出的下拉菜单指定提示标题
   android:completionThreshold     : 指定用户至少输入几个字符才会显示提示
```

在JAVA代码中具体实现：

1.获得控件对象
```java
autotext=(AutoCompleteTextView)findViewById(R.id.autotext);
```

2.设置数据源
```java
String[] autoStrings=new String[]{"New York","Tokyo","beijing","london","Seoul Special","Los Angeles"};
```

3.创建ArrayAdapter适配器,设置ArrayAdapter，并且设定以单行下拉列表风格展示（第二个参数设定）。
```java
ArrayAdapter<String> adapter=new ArrayAdapter<String>(AutoTextActivity.this,
                android.R.layout.simple_dropdown_item_1line, autoStrings);
```

4.将适配器装配到组件中
```java
autotext.setAdapter(adapter);
```

同时，在android中还有一种是多选选项(<MultiAutoCompleteTextView>)与<AutoCompleteTextView>基本一致。

##### Spinner(列表选择框)
列表选择框(Spinner)相当于在网页中常见的下拉列表框，通常用于提供一系列可选择的列表项供用户进行选择。

在XML布局文件中使用<S	pinner>标签添加，如下：

```xml
    <Spinner
        android:id="@+id/spinnerBase1"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:entries = "@array/beijing"
        android:spinnerMode="dropdown" />
```

常用属性：

```xml
	android:spinnerMode : 下拉框显示样式，dropdown默认下拉式，dialog弹出对话框模式
	android:entries     : 绑定静态数据源
```

在列表选择框中，数据源有两种：第一种配置静态数据源。第二种在java代码中配置动态数据源。

静态数据源配置方式：

1.在strings.xml中配置<string-array>标签

```xml
    <string-array name="beijing">
        <item>朝阳区</item>
        <item>海淀区</item>
        <item>房山区</item>
        <item>丰台区</item>
        <item>东城区</item>
        <item>西城区</item>
    </string-array>
```

2.<Spinner>的属性中绑定

```xml
	android:entries = "@array/beijing"
```

Java代码中动态绑定数据源方式:

1.获得控件对象
```java
spinner1 = (Spinner) findViewById(R.id.spinnerBase);
```

2.设置数据源
```java
String[] autoStrings=new String[]{"New York","Tokyo","beijing","london","Seoul Special","Los Angeles"};
```

3.创建ArrayAdapter适配器,设置ArrayAdapter，并且设定以单行下拉列表风格展示（第二个参数设定）。
```java
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                SpinnerActivity.this, android.R.layout.simple_spinner_item,autoStrings);
```

4.将适配器装配到组件中
```java
spinner1.setAdapter(adapter);
```

##### ProgressBar(进度条)
当一个应用在后台执行时，前台界面不会有任何信息。这时用户根本不知道程序是否在执行以及执行进度等，因此需要使用进度条来提示程序执行的进度。在A	ndroid中，进度条(ProgressBar)用于用户显示某个耗时操作完成的百分比。

在XML布局文件中通过<ProgressBar>标签。

```xml
    <ProgressBar
        android:id="@+id/pbHor"
        style="@android:style/Widget.ProgressBar.Horizontal"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:max="100"
        android:progress="20"
        android:secondaryProgress="60" />
```

常用属性：

```xml
	style : 可以为进度指定风格。@android:style/Widget.ProgressBar.Horizontal(粗水平长条进度条)、@android:style/Widget.ProgressBar.Small(小跳跃、旋转画面进度条)、@android:style/Widget.ProgressBar.Large(大跳跃、旋转画面进度条)
	android:max : 最大值
	android:progress : 当前进度值
	android:secondaryProgress : 第二块进度条值
```

##### TabHost(选项卡)
TabHost可以方便地在窗口上放置多个标签页，每个标签页相当于获得了一个与外部容器大小相同的组件摆放区域.

如下图:

![](Android%E6%95%99%E7%A8%8B/tabhost1.png)

![](Android%E6%95%99%E7%A8%8B/tabhost2.gif)

在XML布局文件中，选项卡常用的标签有<TabHost>和<TabWidget>两个标签，通常这两个标签需要配合使用。

代码如下：

```xml
    <TabHost
        android:id="@+id/tabHost"
        android:layout_alignParentLeft="true"
        android:layout_alignParentBottom="true"
        android:layout_width="match_parent"
        android:layout_height="match_parent">

        <LinearLayout
            android:orientation="vertical"
            android:layout_width="match_parent"
            android:layout_height="match_parent">

            <FrameLayout
                android:id="@android:id/tabcontent"
                android:layout_weight="1"
                android:layout_width="match_parent"
                android:layout_height="match_parent">

                <LinearLayout
                    android:id="@+id/tab1"
                    android:orientation="vertical"
                    android:layout_width="match_parent"
                    android:layout_height="match_parent">

                </LinearLayout>

                <LinearLayout
                    android:id="@+id/tab2"
                    android:orientation="vertical"
                    android:layout_width="match_parent"
                    android:layout_height="match_parent">


                </LinearLayout>


                <LinearLayout
                    android:id="@+id/tab3"
                    android:orientation="vertical"
                    android:layout_width="wrap_content"
                    android:layout_height="match_parent">

                </LinearLayout>

            </FrameLayout>

            <TabWidget
                android:id="@android:id/tabs"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"></TabWidget>


        </LinearLayout>
    </TabHost>
```

布局文件说明：
1.将TabHost标签作为最外层包裹元素。
2.在其里面创建一个LinearLayout纵向线性布局
3.在线性布局下创建两个子元素，一个是FrameLayout帧式布局，在此布局下创建多个子页面布局(LinearLayout)，相当于多个Tab子页面。二个是创建TabWidget,相当于切换按钮。

##### 注意：
1.TabHost标签自带id值必须是：

```xml
android:id="@+id/tabHost"
```

2.TabWidget标签自带id值必须是:

```xml
android:id="@android:id/tabs"
```

3.如果想将选项按钮放置在最下方，必须设置如下：

```xml
    <TabHost
        android:id="@+id/tabHost"
        android:layout_alignParentLeft="true"
        android:layout_alignParentBottom="true" />
```

将TabWeight放置在FrameLayout之后。

在JAVA文件中装配步骤：

1.Activity继承ActivityGroup类。

```java
public class TabHostActivity extends ActivityGroup
```

2.获得TabHost对象实例.

```java
tabHost = (TabHost)findViewById(R.id.tabHost);
```

3.设置装配管理对象。

```java
tabHost.setup(this.getLocalActivityManager());
```

4.装配每一个Tab。

```java
TabHost.TabSpec ts = tabHost.newTabSpec("tab1").setIndicator("首页").setContent(new Intent(this,MainActivity.class));
tabHost.addTab(ts);
```

"tab1"是选项卡的唯一标识，只需唯一即可，与XML中的tab1无关。

##### Toast(消息提示框)与AlertDialog(对话框)
在项目开发中，经常需要将一些临时信息显示给用户，虽然使用一些基本组件也能达到显示信息的目的，但是这样做不仅会增加代码量，而且对于用户来说也不够友好。为此，Android提供了消息提示框和对话框显示这些信息。同时，它们没有对应的XML布局，都是通过JAVA代码来实现的。

消息提示框：

```java
Toast.makeText(AlertActivity.this,"这是提示框", Toast.LENGTH_SHORT).show();
```

对话框：

```java
AlertDialog.Builder ab = new AlertDialog.Builder(AlertActivity.this);
ab.setTitle("对话框");
ab.setMessage("这是一个普通对话框!");
ab.setPositiveButton("确定", new DialogInterface.OnClickListener() {
	@Override
 	public void onClick(DialogInterface dialog, int which) {
     //处理业务的
     Toast.makeText(AlertActivity.this, "你点击了确定",Toast.LENGTH_SHORT).show();
  }
});
ab.setNeutralButton("取消", new DialogInterface.OnClickListener() {
   @Override
   public void onClick(DialogInterface dialog, int which) {
     Toast.makeText(AlertActivity.this,"你点击的which值:"+which,Toast.LENGTH_SHORT).show();
   }
});
ab.create().show();
```

#### LuncherDmeo之引导页面案例
在Android项目中，经常出现加载应用前显示全屏图片的页面，在几秒之后，立刻跳转到项目首页的情况，我们管这种页面叫做项目引导页。

项目引导页制作步骤如下：

1.创建将引导页图片导入到资源目录中(drawable目录或mimap目录)
2.创建引导页Activity类以及layout布局文件(XML)
3.设置引导页XML布局文件的背景图。

```xml
android:background="@drawable/start"
```

4.设置AndroidManifest.xml配置文件，将初始页改为引导页Activity.

```xml
        <activity android:name=".WelcomeActivity"
            android:theme="@android:style/Theme.NoTitleBar.Fullscreen">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />

                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>
```

将引导页设为全屏显示：

```xml
android:theme="@android:style/Theme.NoTitleBar.Fullscreen"
```

5.编写引导页Activity类。

5.1 创建Hander类

```java
    Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            //引导页跳转到下一页
            Intent i = new Intent(WelcomeActivity.this, MainActivity.class);
            startActivity(i);
            finish();
            super.handleMessage(msg);
        }
    };
```

5.2 在onCreate()方法中，编写定时跳转.

```java
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                    handler.sendEmptyMessage(0);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }).start();
```

完整代码如下：

```java
public class WelcomeActivity extends Activity {
    Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            Intent i = new Intent(WelcomeActivity.this, MainActivity.class);
            startActivity(i);
            finish();
            super.handleMessage(msg);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                    handler.sendEmptyMessage(0);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }).start();
    }
}
```

配置应用logo以及应用名字的方式：

在AndroidManifest.xml文件中。

```xml
    <application
        android:allowBackup="true"
        android:icon="@drawable/logo"
        android:label="@string/app_name"
        android:supportsRtl="true"
        android:theme="@style/AppTheme">
```

其中icon属性为应用logo地址，label属性为app名字.

#### 在日常手机app的使用中，出现频率最高的便是ListView和GridView。ListView的例子是微信主界面，而GridView的例子则是支付宝的主界面，不明白的打开手机便一目了然。然而这两个控件同时也称成为最难使用的控件，两个控件使用方法完全相同，那么首先我们来看一下ListView。

## ListViewD	emo之ListView（列表视图）

ListView是手机系统中使用非常广泛的一种组件，它以垂直列表的形式显示所有列表项，*并且能够根据数据的长度自适应显示*。系统使用 Adapter 自动将列表项目插入列表，适配器从来源（例如数组或数据库查询）提取内容，并将每个项目结果转换为视图放置到列表中。

如下图：

简单列表视图：

![](Android%E6%95%99%E7%A8%8B/android-listview-example1.png)

复杂列表视图：

![](Android%E6%95%99%E7%A8%8B/android_custom_listview.png)


 列表的显示需要三个元素：

1．ListView 用来展示列表的View。

2．适配器 用来把数据映射到ListView上的中介。

3．数据    具体的将被映射的字符串，图片，或者基本组件。

根据列表的适配器类型，列表分为三种，ArrayAdapter，SimpleAdapter和SimpleCursorAdapter

其中以ArrayAdapter最为简单，只能展示一行字。SimpleAdapter有最好的扩充性，可以自定义出各种效果。SimpleCursorAdapter可以认为是SimpleAdapter对数据库的简单结合，可以方面的把数据库的内容以列表的形式展示出来。

那么，ListView，Adapter，List(数据)之间的交互关系，如下图：

![](Android%E6%95%99%E7%A8%8B/adapter.png)


首先，我们先来看一下简单列表视图。

1.xml布局文件中，控件(ListView)，其标签使用<ListView>，其核心属性如下：

```
android:choiceMode     : 设置ListView的选择行为
android:divider        : 设置List列表的分隔线
android:dividerHeight  : 设置分隔线高度
android:entries        : 指定一个数组资源，Android将把该资源生成列表
android:footerDividerEnable: 设置在底部是否显示分隔线，默认true
android:headerDividerEnable: 设置在头部是否显示分隔线，默认true
```

代码例如：

```xml

    <ListView
        android:id=“@+id/lv_data”
        android:layout_width=“fill_parent”
        android:layout_height=“wrap_content”
        android:divider=“#ffce5dff”
        android:dividerHeight=“1dp”
        android:footerDividersEnabled=“true”
        android:headerDividersEnabled=“true”>
    </ListView>

```

*注意：如果设置底部或头部显示分割线，除了设置footerDividerEnable=true，还要在代码中添加addFooterView，例如：*

```java

        //当设置android:footerDividersEnabled=“true”，显示分割线
        lv_data.addFooterView(new View(this));
        //当设置android:headerDividersEnabled=“true”，显示分割线
        lv_data.addHeaderView(new View(this));

```

2.代码实现

```java

public class ListViewWithOutImageActivity extends Activity {

    private ListView lv_data;
    private String[] items = {“铅笔”,”橡皮”,”钢笔”,”扫描仪”,”尺子”};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_with_out_image);
        lv_data = (ListView)findViewById(R.id.lv_data);
        //生成Adaptor
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,items);
        //装配
        lv_data.setAdapter(adapter);

        lv_data.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int I, long l) {
                Toast.makeText(ListViewWithOutImageActivity.this,items[I],Toast.LENGTH_SHORT).show();
            }
        });
        //当设置android:footerDividersEnabled=“true”，显示分割线
        lv_data.addFooterView(new View(this));
        //当设置android:headerDividersEnabled=“true”，显示分割线
        lv_data.addHeaderView(new View(this));
    }
}

```

上面的程序中代码创建了一个ArrayAdapter，创建ArrayAdapter时必须指定一个ResourceId,该参数决定每个列表项的外观形式。Android为该属性提供了如下属性值。

* simple_list_item_1:每个列表项都是一个普通的TextView。
* simple_list_item_2:每个列表项都是一个普通的TextView(字体略大)。
* simple_list_item_checked:每个列表项都是一个已勾选的列表项。
* simple_list_item_mulitiple_choice:每个列表项都是带多选框的文本。
* simple_list_item_single_choice:每个列表项都是带多单选框的文本。

*总结开发步骤：*

1. 在布局文件中创建ListView控件。
2. 准备要是显示的数据(Array，List等’)
3. 将数据装配到Adapter中。
4. 将Adapter装载到ListView控件中。

接下来，我们来看一下带图片和文本的ListView案例，

如下图：

![](Android%E6%95%99%E7%A8%8B/simplelistview.png)

第一步：创建布局文件

```
    <ListView
        android:id=“@+id/lv_data2”
        android:divider=“#ffd946ff”
        android:dividerHeight=“1dp”
        android:footerDividersEnabled=“false”
        android:headerDividersEnabled=“false”
        android:layout_width=“fill_parent”
        android:layout_height=“wrap_content”>
    </ListView>
```

第二步：创建一个自定义行的布局文件，如图：

![](Android%E6%95%99%E7%A8%8B/simplelistviewrow.png)

代码如下：

```
<RelativeLayout xmlns:android=“http://schemas.android.com/apk/res/android”
android:paddingTop=“10dip”
android:paddingBottom=“10dip”
android:layout_width=“fill_parent”
android:layout_height=“wrap_content”>

<ImageView
    android:id=“@+id/goods_img”
    android:layout_width=“70dip”
    android:layout_height=“70dip”
    android:layout_marginLeft=“10dip”/>

<TextView
    android:id=“@+id/goods_name”
    android:layout_width=“wrap_content”
    android:layout_height=“wrap_content”
    android:layout_toRightOf=“@+id/goods_img”
    android:layout_alignTop=“@+id/goods_img”/>

<TextView
    android:id=“@+id/goods_price”
    android:layout_width=“wrap_content”
    android:layout_height=“wrap_content”
    android:layout_alignLeft=“@+id/goods_name”
    android:layout_alignBottom=“@+id/goods_img”/>

</RelativeLayout>
```

第三步，编写Java Activity代码：

```
    private String[] goods_ids = {“1”,”2”,”3”,”4”,”5”};
    Private String[] goods_names = {“英雄钢笔”,”英雄钢笔套装”,”佳能彩色墨盒”,”爱普生扫描仪”,”透明胶带”};
    private String[] goods_prices = {“23.2”,”125.5”,”200.5”,”1034.6”,”5.0”};
    private int[] goods_imgs = {R.drawable.gangbi,
            R.drawable.gangbi2,
            R.drawable.mohe,
            R.drawable.smy,
            R.drawable.tmj};
    private ListView lv_data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_with_image);
        List<Map<String,Object>> data = new ArrayList<Map<String,Object>>();
        for (int I = 0;i < goods_names.length;i++){
            Map<String,Object> item = new HashMap<String,Object>();
            item.put(“goods_name”,goods_names[I]);
            item.put(“goods_price”,goods_prices[I]);
            item.put(“goods_img”,goods_imgs[I]);
            data.add(item);
        }
        SimpleAdapter adapter = new SimpleAdapter(ListViewWithImageActivity.this,data,R.layout.goods_item,
                new String[]{“goods_name”,”goods_price”,”goods_img”},
                new int[]{R.id.goods_name,R.id.goods_price,R.id.goods_img});
        lv_data = (ListView)findViewById(R.id.lv_data2);
        lv_data.setAdapter(adapter);

        lv_data.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int I, long l) {
                Intent intent = new Intent();
                intent.setClass(ListViewWithImageActivity.this,GoodsDetailActivity.class);
                Bundle bundle = new Bundle();
                System.out.println(goods_ids[I]);
                bundle.putString(“gid”,goods_ids[I]);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

    }
```

上面的程序中代码创建了一个SimpleAdapter，创建SimpleAdapter时必须指定四个参数分别为：

* context 上下文
* 行布局文件
* 数据对象(Map)的**key值**
* 对应行布局中**每一个组件ID值**

其中**setOnItemClickListener()方法**是ListView中监听某一行点击的事件。

**总结开发步骤:**

1.创建ListView布局文件
2.创建ListView中每一个行的布局样式文件(xml)
3.装配数据(SimpleAdapter)
4.将适配器添加到ListView中。

最后，我们来看一下，复杂自定义(Custom)的ListView，这里说的自定义是指每一个行布局样式和Adapter适配器的双重自定义。与SimpleAdapter相比，自定义Adapter数据存储的方式可以更加复杂和多样化，更能满足实际开发中客户复杂样式的需求。

如下图：

![](Android%E6%95%99%E7%A8%8B/android_custom_listview%201.png)

第一步：创建布局文件

```
    <ListView
        android:id=“@+id/cListView”
        android:scrollbars=“none”
        android:layout_width=“wrap_content”
        android:layout_height=“wrap_content”/>
```

android:scrollbars属性为：是否显示滚动条，**none**不显示。

第二步：创建行布局文件(xml)

```
<LinearLayout xmlns:android=“http://schemas.android.com/apk/res/android”
    android:orientation=“horizontal”
    android:background=“@drawable/listbg”
    android:paddingRight=“5dp”
    android:paddingLeft=“5dp”
    android:paddingTop=“5dp”
    android:paddingBottom=“5dp”
    android:layout_width=“match_parent”
    android:layout_height=“match_parent”>

    <TextView
        android:id=“@+id/line_myPic”
        android:layout_weight=“3”
        android:layout_width=“0dp”
        android:layout_height=“wrap_content” />

    <LinearLayout
        android:layout_weight=“4”
        android:layout_width=“0dp”
        android:layout_height=“wrap_content”>

        <TextView
            android:id=“@+id/line_myProductName”
            android:textSize=“14sp”
            android:textColor=“#6A5ACD”
            android:layout_width=“wrap_content”
            android:layout_height=“wrap_content” />

        <TextView
            android:id=“@+id/line_myTime”
            android:textSize=“14sp”
            android:textColor=“#6A5ACD”
            android:layout_width=“wrap_content”
            android:layout_height=“wrap_content” />

        <TextView
            android:id=“@+id/line_MyAddress”
            android:textSize=“14sp”
            android:textColor=“#6A5ACD”
            android:layout_width=“wrap_content”
            android:layout_height=“wrap_content” />

    </LinearLayout>

    <TextView
        android:id=“@+id/line_myPrice”
        android:layout_weight=“0.75”
        android:textColor=“#FFA500”
        android:layout_gravity=“center_horizontal”
        android:layout_width=“0dp”
        android:textSize=“12sp”
        android:layout_height=“wrap_content” />

</LinearLayout>
```

第三步：创建一个获得当前手机屏幕宽度和高度的工具(Goals)

```
public class Goals {
    public static int SCREEN_GAO = 0;
    public static int SCREEN_KUAN = 0;

    public static void init(Activity activity){
        SCREEN_GAO = activity.getWindowManager().getDefaultDisplay().getHeight();
        SCREEN_KUAN = activity.getWindowManager().getDefaultDisplay().getWidth();
    }
}
```


第四步:创建自定义Adapter

自定义Adapter需要继承**BaseAdapter**，比重写几个重要的方法，先看一下代码：

```
public class MyCustomAdapter extends BaseAdapter {
    private Context cxt;
    private List<Map<String,Object>> data;

    public MyCustomAdapter(Context cxt, List<Map<String, Object>> data) {
        this.cxt = cxt;
        this.data = data;
    }

    @Override
    public int getCount() {
        //行数
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        //获得某一行的对象
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null){
            convertView = LayoutInflater.from(cxt).inflate(R.layout.activity_custom_listview_row,null);
            convertView.setLayoutParams(new AbsListView.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,Goals.SCREEN_GAO / 10));
        }

        TextView myPic = (TextView)convertView.findViewById(R.id.line_myPic);

        myPic.getLayoutParams().height = Goals.SCREEN_GAO / 10;

        TextView myProductName = (TextView)convertView.findViewById(R.id.line_myProductName);

        TextView myTime = (TextView)convertView.findViewById(R.id.line_myTime);

        TextView myAddress = (TextView)convertView.findViewById(R.id.line_MyAddress);

        TextView myPrice = (TextView)convertView.findViewById(R.id.line_myPrice);

        Map<String,Object> row = data.get(position);

        myPic.setBackgroundResource((Integer)row.get(“myPic”));

        myProductName.setText(row.get(“myProductName”).toString());

        myTime.setText(row.get(“myTime”).toString());

        myAddress.setText(row.get(“myAddress”).toString());

        myPrice.setText(row.get(“myPrice”).toString());


        return convertView;
    }
}
```

首先，创建构造方法，其参数Context和List<Map<String,Object>>

```
public MyCustomAdapter(Context cxt, List<Map<String, Object>> data) {
        this.cxt = cxt;
        this.data = data;
    }
```

Context参数：主要用于获取View对象
如下：

```
convertView = LayoutInflater.from(cxt).inflate(R.layout.activity_custom_listview_row,null);
```

List<Map<String,Object>>参数：数据对象，设置数据到各个控件中

然后，重写几个重要的方法：

1.设置ListView行数

```
    public int getCount() {
        //行数
        return data.size();
    }
```

2.返回某一个行的数据

```
    public Object getItem(int position) {
        //获得某一行的对象
        return data.get(position);
    }
```

3.获得当前所在行数

```
public long getItemId(int position) {
        return position;
    }
```

4.获取每一行的View对象，该方法是最重要的重写方法，绘制每一行。

```
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null){
            convertView = LayoutInflater.from(cxt).inflate(R.layout.activity_custom_listview_row,null);
            convertView.setLayoutParams(new AbsListView.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,Goals.SCREEN_GAO / 10));
        }

        TextView myPic = (TextView)convertView.findViewById(R.id.line_myPic);

        myPic.getLayoutParams().height = Goals.SCREEN_GAO / 10;

        TextView myProductName = (TextView)convertView.findViewById(R.id.line_myProductName);

        TextView myTime = (TextView)convertView.findViewById(R.id.line_myTime);

        TextView myAddress = (TextView)convertView.findViewById(R.id.line_MyAddress);

        TextView myPrice = (TextView)convertView.findViewById(R.id.line_myPrice);

        Map<String,Object> row = data.get(position);

        myPic.setBackgroundResource((Integer)row.get(“myPic”));

        myProductName.setText(row.get(“myProductName”).toString());

        myTime.setText(row.get(“myTime”).toString());

        myAddress.setText(row.get(“myAddress”).toString());

        myPrice.setText(row.get(“myPrice”).toString());


        return convertView;
    }
```

在理解这段代码前，我们先看一张图：


![](Android%E6%95%99%E7%A8%8B/customlistview.png)

该方法的三个参数分别为：
Position: 该视图在适配器数据中的位置
convertView：旧视图
Parent: 此视图最终会被附加到的父级视图

我们来理解一下，该方法的代码：

1.判读当前是否存在行视图对象(convertView)，如果不存在(第一行之前)，创建视图对象，并设置每一行的高度(屏幕高度的十分之一)和宽度（wrap_content）。

```
if(convertView == null){
            convertView = LayoutInflater.from(cxt).inflate(R.layout.activity_custom_listview_row,null);
            convertView.setLayoutParams(new AbsListView.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,Goals.SCREEN_GAO / 10));
}
```

2.获得各个控件对象。

```
        TextView myPic = (TextView)convertView.findViewById(R.id.line_myPic);

        myPic.getLayoutParams().height = Goals.SCREEN_GAO / 10;

        TextView myProductName = (TextView)convertView.findViewById(R.id.line_myProductName);

        TextView myTime = (TextView)convertView.findViewById(R.id.line_myTime);

        TextView myAddress = (TextView)convertView.findViewById(R.id.line_MyAddress);

        TextView myPrice = (TextView)convertView.findViewById(R.id.line_myPrice);
```

3.根据当前行数，获得行数据

```
Map<String,Object> row = data.get(position);
```

4.设置每个控件的数据

```
myPic.setBackgroundResource((Integer)row.get(“myPic”));      myProductName.setText(row.get(“myProductName”).toString());
myTime.setText(row.get(“myTime”).toString());
myAddress.setText(row.get(“myAddress”).toString());
myPrice.setText(row.get(“myPrice”).toString());
```

5.返回当前行视图(View)

```
return convertView;
```

第五步：编写Activity类

准备数据
```
    private List<Map<String,Object>> data = new ArrayList<Map<String, Object>>();

    private int[] imgs = {R.drawable.neicun1,R.drawable.neicun2,R.drawable.neicun3,R.drawable.neicun4};
```

获得ListView对象，准备数据，创建自定义Adapter，绑定数据，添加到ListView对象中。
```
        myListView = (ListView)findViewById(R.id.cListView);

        Random r = new Random();

        for (int I = 0;i < 30;i++){
            Map<String,Object> row = new HashMap<String,Object>();
            row.put(“myPic”,imgs[r.nextInt(imgs.length)]);
            row.put(“myProductName”,”三星内存” + I + “G”);
            row.put(“myTime”,”成色：” + (int)(Math.random()*10)+”新 “ + (int)(Math.random()*10)+”小时发布”);
            row.put(“myAddress”,”山东 济南”);
            row.put(“myPrice”,(int)(Math.random()*1000)+”元”);
            data.add(row);
        }

        MyCustomAdapter myCustomAdapter = new MyCustomAdapter(this,data);

        myListView.setAdapter(myCustomAdapter);
```

**总结开发步骤:**

* 创建布局文件
* 创建行布局文件
* 创建自定义Adapter类
* 编写Activity类（获得ListView对象，准备数据，创建自定义Adapter，绑定数据，添加到ListView对象中）

## GridViewDemo之GridView（网格视图）
刚刚我们讲解了ListView控件，下面我们再来看看GridView控件，GridView控件与ListView控件的区别主要是显示样式的区别，ListView只是在一个方向上分布，而GridView则会在两个方向上分布。如下图：

![](Android%E6%95%99%E7%A8%8B/201683085735348.jpg)

上图就是典型的GridView列表，而GridView和ListView的数据交互模式和装配方式(Adapter)都是一样的。简单一句话，区别主要是在布局文件控件属性上的区别，而Activity代码基本上一致。

那么，首先我们来看一下，GridView中的核心属性：

```
android:columnWidth : 设置列的宽度
android:gravity     : 设置对齐方式
android:horizontalSpacing : 设置各元素之间的水平间距
android:numColumns  : 设置列数
android:stretchMode : 设置拉伸模式
android:verticalSpracing : 设置各元素之间的垂直距离
```

android :stretchMode属性支持如下几个属性值：

* NO_STRETCH : 不拉伸
* STRETCH_SPACING : 仅拉伸元素之间的间距
* STRETCH_SPACING_UNIFORM: 表格元素本身、元素之间的间距
* STRETCH_CLOUMN_WIDTH:仅拉伸元素表格元素本身

案例：

布局文件：

```
    <GridView
        android:id="@+id/gv_data"
        android:numColumns="2"
        android:layout_width="fill_parent"
        android:layout_height="wrap_content" />
```

cloumn布局文件：

```
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:orientation="vertical"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <ImageView
        android:id="@+id/goods_img"
        android:layout_width="100dip"
        android:layout_height="100dip"
        android:layout_margin="10px"/>

    <TextView
        android:id="@+id/goods_name"
        android:layout_margin="10px"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content" />

    <TextView
        android:id="@+id/goods_price"
        android:layout_margin="10px"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content" />

</LinearLayout>
```

Activity文件:

```
public class GridViewWithImageActivity extends Activity {
    private GridView gv_data = null;
    private String[] goods_ids = {"1","2","3","4","5"};
    private String[] goods_names = {"英雄钢笔","英雄钢笔套装","佳能彩色墨盒","爱普生扫描仪","透明胶带"};
    private String[] goods_prices = {"23.2","125.5","200.5","1034.6","5.0"};
    private int[] goods_imgs = {R.drawable.gangbi,
            R.drawable.gangbi2,
            R.drawable.mohe,
            R.drawable.smy,
            R.drawable.tmj};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view_with_image);
        List<Map<String,Object>> items = new ArrayList<Map<String,Object>>();
        for(int i = 0;i < goods_names.length;i++){
            Map<String,Object> item = new HashMap<String,Object>();
            item.put("goods_name",goods_names[i]);
            item.put("goods_price",goods_prices[i]);
            item.put("goods_img",goods_imgs[i]);
            items.add(item);
        }

        SimpleAdapter adapter = new SimpleAdapter(this,items,R.layout.goods_cell,
                new String[]{"goods_name","goods_price","goods_img"},
                new int[]{R.id.goods_name,R.id.goods_price,R.id.goods_img});

        gv_data = (GridView)findViewById(R.id.gv_data);
        gv_data.setAdapter(adapter);

    }
}
```

从以上的Activity代码可以看出，其实，与ListView的装配方式基本一致，在这里就不再次讲解了。

从某种意义上来讲，如果掌握了ListView，那么，GridView就很简单了。

## ViewPagerCase之ViewPager（画廊视图）
前段时间就发现Gallery这个控件被无情的打上了过期这个烙印。当时很好奇，谷歌为什么就让它过期了，就翻了翻Android SDK文档：
**This class was deprecated in API level 16.**
**This widget is no longer supported. Other horizontally scrolling widgets include HorizontalScrollView and ViewPager from the support library.**
啊哦，在API level 16（Android 4.1）就过期了，也就是谷歌不在维护这个类了。谷歌还推荐了可以用HorizontalScrollView 或者ViewPager 来代替它。
首先，先给Gallery默哀一分钟吧，过期了，离死也就不远了。原因是因为gallery的生理缺陷：它每次切换图片时都要新建视图造成浪费太多的资源。很有可能是因为这个原因被谷歌封杀的。
既然谷歌官方推荐使用ViewPager，那么，我们就来看看如何使用ViewPager实现画廊视图功能。

要是使用ViewPager，首先要引入用Support Library。

#### 基本程序单元Activity

 Activity是Android应用的重要组成单元之一（另外三个是Service,BroadcastReceiver和ContentProvider），而Activity又是Android应用最常见的组件之一。前面的案例中大部分都是只包含了一个Activity，但在实际应用中这是不大可能的，实际应用中往往包括多个Activity，不同的Activity向用户呈现不同的操作界面。Android应用的多个Activity组成Activity栈。当前活动的Activity位于栈顶。

![](Android%E6%95%99%E7%A8%8B/view.png)


有Web开发经验的对Servlet的概念应比较熟悉，实际上Activity对于Android应用的作用有点类似于Servlet对于Web应用的作用。那么一个Android应用通常也需要多个Activity组成。对于Web应用而言，Servlet主要负责与用户交互，并向用户呈现应用状态；对于Android应用而言，Activity大致也具有相同的功能。

##### 生命周期

![](Android%E6%95%99%E7%A8%8B/%E7%94%9F%E5%91%BD%E5%91%A8%E6%9C%9F.gif)

Android 應用程式的生命週期是由 Android 框架進行管理，而不是由應用程式直接控制。

通常，每一個應用程式（入口一般會是一個 Activity 的 onCreate 方法），都會佔據一個行程(Process)。當系統記憶體即將不足的時候，會依照優先級自動進行行程(process)的回收。不管是使用者或開發者，都無法確定的應用程式何時會被回收。

一個 Activity 類別除了 OnCreate 函式之外，還預先定義了 OnPause(暫停行程時的行為)、OnResume(繼續行程時的行為)等等的基本行為，當從一個 Activity 切換到另一個 Activity 的時候，原本的 Activity 將經過一連串的狀態改變。開發者可以在程式中添加一些各狀態相對應的流程，每次 Activity 改變狀態時，就會執行相對應的流程。

##### Activity的状态


Android 的虛擬機(VM)是使用堆疊 (Stack based) 管理。主要有四種狀態：

Active (活動)
Paused (暫停)
Stopped (停止)
Dead (已回收或未啟動)
 

Active (活動)


「Active」狀態是使用者啟動應用程式或 Activity 後，Activity 運行中的狀態。

在 Android 平台上，同一個時刻只會有一個 Activity 處於活動(Active)或運行(Running)狀態。其他的 Activity 都處於未啟動(Dead)、停止(Stopped)、或是暫停(Pause)的狀態。

 

Paused (暫停)


「Paused」狀態是當 Activity 暫時暗下來，退到背景畫面的狀態。

當我們使用Toast、AlertDialog、或是電話來了時，都會讓原本運行的 Activity 退到背景畫面。新出現的Toast、AlertDialog等介面元件蓋住了原來的 Activity 畫面。Activity 處在「Paused」狀態時，使用者無法與原 Activity 互動。

 

Stopped (停止)


「Stopped」狀態是有其他 Activity 正在執行，而這個 Activity 已經離開螢幕，不再動作的狀態。

透過長按「Home」鈕，可以叫出所有處於「Stopped」狀態的應用程式列表。

在「Stopped」狀態的 Activity，還可以透過「Notification」來喚醒。「Notification」會在後面章節中解說。

 

Dead (已回收或未啟動)


「Dead」狀態是 Activity 尚未被啟動、已經被手動終止，或已經被系統回收的狀態。

 

要手動終止 Activity，可以在程式中呼叫「finish」函式。我們在加入選單一章中已經提到過了。

如果是被系統回收，可能是因為記憶體不足了，所以系統根據記憶體不足時的回收規則，將處於「Stopped」狀態的 Activity 所佔用的記憶體回收。

記憶體不足時的行為


記憶體不足時，Dalvak 虛擬機會根據其記憶體回收規則來回收記憶體：

先回收與其他 Activity 或 Service/Intent Receiver 無關的行程(即優先回收獨立的Activity)
再回收處於「Stopped」狀態的其他類型 Activity（在背景等待的Activity）。最久沒有使用的 Activity 優先回收，還不夠？回收 Service 行程
快不行啦，關掉可見的 Activity/行程
關閉當前的 Activity

程序启动运行并结束上述生命周期的方法执行顺序是这样的：

onCreate –> onContentChanged –> onStart –> onPostCreate –> onResume –> onPostResume –> onPause –> onStop –> onDestroy

###### onContentChanged

onContentChanged()是Activity中的一个回调方法 当Activity的布局改动时，即setContentView()或者addContentView()方法执行完毕时就会调用该方法， 例如，Activity中各种View的findViewById()方法都可以放到该方法中。


###### onPause、 onStop

这里顺便再提一下onPause、 onStop的区别， onPause是在整个窗口被半遮盖或者半透明的时候会执行，而onStop则是在整个窗口被完全遮盖才会触发， 触发onStop的方法之前必定会触发onPause方法。

###### onCreate、 onStart

onCreate方法会在第一次创建的时候执行，紧接着便会执行onStart方法，之后页面被完全遮挡会执行onStop方法，再返回的时候一般便会执行onRestart –> onStart方法， 但是如果如果这时候App内存不够需要更多的内存的时候，App便会杀死该进程，结束掉该Activity，所以这时候再返回的时候便会重新执行onCreate –> onStart –> onResume方法。

###### 通常情况下，onCreate()和onPause()方法是最常用的，经常需要重写这两个方法。

##### 启动和关闭Activity

###### 启动Activity

在一个Android项目中，如果只有一个Activity，那么只需要在AndroidManifest.xml文件中进行配置，并且将其设置为程序的入口。如果是多个Activity，可以用**startActivity()方法**来启动需要的Activity。

###### 关闭Activity

在Android中，如果想要关闭当前的Activity，可以使用Activity类提供的finish()方法。

**注意：如果当前的Activity不是主活动，那么执行finish()方法后，将返回到调用它的那么Activity；否则，将返回到主屏幕中。**

##### 多个Activity的使用

###### 使用Bundle在Activity之间交换数据

当一个Activity中启动另一个Activity时，经常需要传递一些数据。这时就可以通过Intent来实现，因为Intent通常被称为是两个Activity之间的信使，通过将要传递的数据保存在Intent中，就可以将其传递到另一个Activity中了。

在Android中，可以将要保存的数据存放在Bundle对象中，然后通过Intent提供的putExtras()方法将要携带的数据保存到Intent中。

例如：

```
Intent intent = new Intent();                intent.setClass(ListViewWithImageActivity.this,GoodsDetailActivity.class);
Bundle bundle = new Bundle();
bundle.putString("gid",goods_ids[i]);
intent.putExtras(bundle);
startActivity(intent);
```

传递数据到另外一个Activity后，如何获得传递值，如下：

```
        Intent intent = this.getIntent();
        Bundle bundle = intent.getExtras();
        String goodsID = intent.getStringExtra("gid");
```

下面我们来看一下，在Bundle中传递对象，例如： 

首先，创建序列化对象。

```
public class MapSerializable implements Serializable {
    private Map<String,Object> map = null;

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }
}
```

第二步，传递对象。

```
Map<String,Object> row = new HashMap<>();
row.put("pid","1");
row.put("pname","pen");
Intent intent = new Intent();           intent.setClass(ListViewWtichForRowObjectActivity.this,DetailProductActivity.class);
Bundle bundle = new Bundle();
MapSerializable mapSerializable = new MapSerializable();
mapSerializable.setMap(row);
bundle.putSerializable("row",mapSerializable);
intent.putExtras(bundle);
startActivity(intent);
```

第三步，接受传递对象。

```
//接收
Intent intent = getIntent();
Bundle bundle = intent.getExtras();
MapSerializable mapSerializable = (MapSerializable)bundle.get("row");
Map<String,Object> row = mapSerializable.getMap();
```

###### 调用另一个Activity并返回结果

在Android应用开发时，有时需要在一个Activity中调用另一个Activity，当用户在第二个Activity中选择完成后，程序自动返回第一个Activity中，第一个Activity必须能够获取并显示用户在第二个Activity中选择的结果；或者，在第一个Activity中将一些数据传递到第二个Activity，由于某些原因，又要返回第一个Activity中，并显示传递的数据，如程序中经常出现的“返回上一步”功能。这是，也可以Intent和Bundle来实现。与在两个Activity之间交换数据不同的是，此处需要使用startActivityForResult()方法来启动另外一个Activity。

案例分析，首先假定两个Activity（MainActivity、DetailActivity）

首先，在MainActivity中创建一个INT类型的Result（结果状态码）

```
private final int CODE = 0x717;
```

第二步，在跳转事件中，使用startActivityForResult(intent,CODE)方法。

```
Intent intent = new Intent();
Bundle bundle = new Bundle();
bundle.putCharSequence("userName",userName);
bundle.putCharSequence("passWord",passWord);
intent.putExtras(bundle);             intent.setClass(MainActivity.this,DetailActivity.class);
startActivityForResult(intent,CODE);
```

第三步，在DetailActivity中创建返回上一页时间按钮。

第四步，在事件按钮中调用setResult(CODE,intent)方法
```
setResult(0x717,intent);
finish();
```

第五步，在MainActivity中重写onActivityResult方法，并获得其他操作

```
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == CODE && resultCode == CODE){
            editTextPassWord.setText("");
        }
```

其中，onActivityResult方法有三个参数：

* 请求代码
* 结果代码
* intent对象(可以获得再次传递的参数值)

###### Activity与Servlet的相似性与区别

Activity与Servlet的相似之处大致如下：

1. Activity、Servlet的职责都是向用户呈现界面。
2. 开发者开发Activity、Servlet都继承系统的基类。
3. Activity、Servlet开发出来之后都需要进行配置。
4. Activity运行于Android应用中，Servlet运行于Web应用中。
5. 开发者无须创建Activity、Servlet的实例，无须调用它们的方法。Activity、Servlet的方法都由系统以回调的方式调用。
6. Activity、Servlet都有各自的生命周期，它们的生命周期都由外部负责管理。
7. Activity、Servlet都不会直接互相调用，因此都不能直接进行数据交换。Servlet之间的数据交换需要借助于Web应用提供的Request，Session等；Activity之间的数据交换要借助于Bundle。

当然，Activity与Servlet之间的差别很多，因为它们本身所在场景是完全不同的，它们之间的区别也很明显：

* Activity与Android窗口的容器，因此Activity的本质还是通过各种界面组件来搭建界面；而Servlet则主要以IO流向浏览者生成文本响应，浏览者看到的界面其实由浏览器负责生成的
* Activity之间的跳转主要通过Intent对象来控制；而Servlet之间的跳转则主要由用户请求来控制。

#### FragmentDemo之Fragment(片段)

##### 什么是片段
Fragment 表示 Activity 中的行为或用户界面部分。您可以将多个片段组合在一个 Activity 中来构建多窗格 UI，以及在多个 Activity 中重复使用某个片段。您可以将片段视为 Activity 的模块化组成部分，它具有自己的生命周期，能接收自己的输入事件，并且您可以在 Activity 运行时添加或移除片段（有点像您可以在不同 Activity 中重复使用的“子 Activity”）

##### 创建片段
要想创建片段，您必须创建 Fragment 的子类（或已有其子类）。Fragment 类的代码与 Activity 非常相似。它包含与 Activity 类似的回调方法，如 onCreate()、onStart()、onPause() 和 onStop()。实际上，如果您要将现有 Android 应用转换为使用片段，可能只需将代码从 Activity 的回调方法移入片段相应的回调方法中。

通常，您至少应实现以下生命周期方法：

onCreateView()
系统会在片段首次绘制其用户界面时调用此方法。 要想为您的片段绘制 UI，您从此方法中返回的 View 必须是片段布局的根视图。如果片段未提供 UI，您可以返回 null。

##### 生命周期
图例：

![](Android%E6%95%99%E7%A8%8B/fragment_lifecycle.png)

要是使用Fragment，首先要引入用Support Library，那么什么是Support Library？

Support Library

我们都知道Android一些SDK比较分裂，为此google官方提供了Android Support Library package 系列的包来保证高版本sdk开发的向下兼容性, 所以你可能经常看到v4，v7，v13这些数字，首先我们就来理清楚这些数字的含义，以及它们之间的区别。

support-v4
用在API lever 4(即Android 1.6)或者更高版本之上。它包含了相对更多的内容，而且用的更为广泛，例如：Fragment，NotificationCompat，LoadBroadcastManager，ViewPager，PageTabStrip，Loader，FileProvider 等

Gradle引用方法：

```
compile ‘com.android.support:support-v4:25.1.1’
```

support-v7
这个包是为了考虑API level 7(即Android 2.1)及以上版本而设计的，但是v7是要依赖v4这个包的，v7支持了Action Bar以及一些Theme的兼容。

Gradle引用方法:
```
compile ‘com.android.support:appcompat-v7:25.1.1’
```
support-v13
这个包的设计是为了API level 13(即Android 3.2)及更高版本的，一般我们都不常用，平板开发中能用到，这里就不过多介绍了。

**注意事项：**

* gradle引用appcompat-v7包的时候就不需要引用v4了，因为v7里默认包含了v4包；
* compile ‘com.android.support:appcompat-v7:25.0.3’ 中的25代表API level 25推出的兼容包。
* 使用appCompat之后，你的所有的Activity应该继承自ActionBarActivity，而ActionBarActivity继承自FragmentActivity，所以放心的使用Fragment；


##### 具体实现
1.创建Fragment.

如下图：

![](Android%E6%95%99%E7%A8%8B/createfragment.png)

当创建完成后，会生成两个文件,.java文件和.xml文件,顾名思义，一个继承Fragment类文件，一个是该fragment的布局文件.

例如：

```java
public class HeaderFragment extends Fragment {


    public HeaderFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_header, container, false);
    }

}
```

onCreateView() 的 container 参数是您的片段布局将插入到的父 ViewGroup（来自 Activity 的布局）。savedInstanceState 参数是在恢复片段时，提供上一片段实例相关数据的 Bundle。

inflate() 方法带有三个参数：

您想要扩展的布局的资源 ID；
将作为扩展布局父项的 ViewGroup。传递 container 对系统向扩展布局的根视图（由其所属的父视图指定）应用布局参数具有重要意义；
指示是否应该在扩展期间将扩展布局附加至 ViewGroup（第二个参数）的布尔值。（在本例中，其值为 false，因为系统已经将扩展布局插入 container — 传递 true 值会在最终布局中创建一个多余的视图组。）

```xml
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context="me.zzxb.fragmentdemo.myfrag.HeaderFragment">

    <!-- TODO: Update blank fragment layout -->
    <TextView
        android:text="这是头fragment"
        android:textSize="20sp"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content" />


</LinearLayout>
```

fragment的布局文件，就是一个标准的布局文件，与Activity的布局文件格式基本一致。所以，我们认为fragment与Activity是一种宿主关系。

2.添加片段到Activity中

已经了解了如何创建提供布局的片段。接下来，需要将该片段添加到Activity 中。这一步骤有两种方式。

#### 注意宿主Activity一定要继承android.support.v4.app.FragmentActivity类，而非标准的Activity类.

##### 与Activity通信
Activity 也可以使用 findFragmentById() 或 findFragmentByTag()，通过从 FragmentManager 获取对 Fragment 的引用来调用片段中的方法。例如：

```java
ExampleFragment fragment = (ExampleFragment) getFragmentManager().findFragmentById(R.id.example_fragment);

```

第一种：在 Activity 的布局文件内声明片段

```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/activity_main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    tools:context="me.zzxb.fragmentdemo.MainActivity">

    <fragment
        android:id="@+id/fr_header"
        android:name="me.zzxb.fragmentdemo.myfrag.HeaderFragment"
        android:layout_width="match_parent"
        android:layout_height="wrap_content" />

    <fragment
        android:id="@+id/fr_content"
        android:name="me.zzxb.fragmentdemo.myfrag.ContentFragment"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"/>

    <Button
        android:id="@+id/btn_submit"
        android:text="提交"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content" />
</LinearLayout>
```

 中的 android:name 属性指定要在布局中实例化的 Fragment 类。
当系统创建此 Activity 布局时，会实例化在布局中指定的每个片段，并为每个片段调用 onCreateView() 方法，以检索每个片段的布局。系统会直接插入片段返回的 View 来替代  元素。
注：每个片段都需要一个唯一的标识符，重启 Activity 时，系统可以使用该标识符来恢复片段（您也可以使用该标识符来捕获片段以执行某些事务，如将其移除）。 可以通过三种方式为片段提供 ID：
为 android:id 属性提供唯一 ID。
为 android:tag 属性提供唯一字符串。
如果您未给以上两个属性提供值，系统会使用容器视图的 ID。

第二种方式：通过编程方式将片段添加到某个现有 ViewGroup

```java
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        ContentFragment contentFragment = new ContentFragment();
        fragmentTransaction.add(R.id.activity_main,contentFragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
```

你可以在 Activity 运行期间随时将片段添加到 Activity 布局中。您只需指定要将片段放入哪个 ViewGroup。
要想在您的 Activity 中执行片段事务（如添加、移除或替换片段），您必须使用 FragmentTransaction 中的 API。您可以像下面这样从 Activity 获取一个 FragmentTransaction 实例：

```java
FragmentManager fragmentManager = getFragmentManager();
FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
```

然后，您可以使用 add() 方法添加一个片段，指定要添加的片段以及将其插入哪个视图。例如：

```java
        ContentFragment contentFragment = new ContentFragment();
        fragmentTransaction.add(R.id.activity_main,contentFragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
```

传递到 add() 的第一个参数是 ViewGroup，即应该放置片段的位置，由资源 ID 指定，第二个参数是要添加的片段。
一旦您通过 FragmentTransaction 做出了更改，就必须调用 commit() 以使更改生效。

#### 注意：如果使用代码方式添加片段，一定要继承import android.app.Fragment类，而非android.support.v4.app.Fragment类

#### Android应用核心Intent

##### 什么是Intent以及其作用

一个Android程序由多个组件组成，各个组件之间使用Intent进行通信。Intent对象中包含组件名、动作、数据等内容。根据Intent中的内容，Android系统可以启动需要的组件。

**Activity、Service和Broadcast Receiver这三个组件都需要使用Intent来进行激活。Intent用于相同或不同应用程序组件间的后期运行时绑定。**

##### Intent激活类型

- [ ] Intent对象可以传递给Context.startActivity()或Activity.startActivityForResult()方法来启动Activity或者让已经存在的Activity去做其他任务。
- [ ] Intent对象可以传递给Context.startService()方法来初始化Service或者发送新指令到正在运行的Service
- [ ] Intent对象可以传递给Context.sendBroadcast()、Context.sendOrderedBroadcast()或Context.sendStickyBroadcast()等广播方法，使其被发送给所有感兴趣的BroadcastReceiver。

##### Intent组成

Intent是由**组件名称、动作、数据、种类、额外和标记**等组成。

###### 组件名称(Component Name)

**组件名称是指Intent目标组件的名称。**

组件名称是可选的。如果设置，Intent对象会被发送到给指定类的实例；如果没有设置，Android使用Intent对象中的其他信息决定合适的目标。

组件名称可以使用setComponent(),setClass()或setClassName()方法设置。

###### 动作(Action)

**Action是一个字符串，用来表示将要执行的动作。**

在Intent类中，定义了一系列动作常量，其目标组件包括Activity和Broadcast两类。

预制标准Activity动作，如下图：

![](Android%E6%95%99%E7%A8%8B/%E6%A0%87%E5%87%86%E5%8A%A8%E4%BD%9C%E4%B8%80.png)

**注意：在使用上图表格中的动作时，需要将其转换为对应的字符串信息。例如，将ACTION_MAIN转换为android.intent.action.Main。**

预制标准广播动作,如下图：

![](Android%E6%95%99%E7%A8%8B/%E6%A0%87%E5%87%86%E5%8A%A8%E4%BD%9C%E4%BA%8C.png)

**注意：在使用上图表格中的动作时，需要将其转换为对应的字符串信息。例如，将ACTION_TIME_TICK转换为android.intent.action.ACTION_TIME_TICK。**

除了预定义的动作，开发人员还可以自定义动作字符串来启动应用程序中的组件。

**动作很大程度上决定了Intent其他部分的组成，特别是数据(data)和额外 (extras)部分，就像方法名称决定了参数和返回值。**

Intent对象中的动作使用setAction()方法设置。

###### 数据(Data)

**Data表示操作数据的URI和MIME类型。不同动作与不同类型的数据规范匹配。**

例如：如果动作是ACTION_EDIT,数据应该是包含用来编辑的文档的URI;如果动作时ACTION_CALL,数据应该是包含呼叫号码的tel:URI。类似动作是ACTION_VIEW而且数据是http:URI,接收的Action用来下载和显示URI指向的数据。

setData()方法仅能指定数据的URI，setType()方法仅能指定数据的MIME类型，setDataAndType()方法可以同时设置URI和MIME类型。

###### 种类(Category)

**Category是一个字符串，其中包含了应该处理当前Intent的组件类型的附加信息。**

预制标准种类，如下图：

![](Android%E6%95%99%E7%A8%8B/%E7%A7%8D%E7%B1%BB.png)

addCategory()方法将种类增加到Intent对象中，removeCategory()方法删除上次增加的种类。

###### 额外(Extras)

**Extras是一组键值对时，其中包含了应该传递给处理Intent的组件的额外信息。例如：参数传值**

###### 标记(Flags)

**Flags表示不同来源的标记。**

**说明：所有标记都是整数类型。**


##### Intent分类（显式和隐式）

**Intent可以分成显式和隐式两类。**

**显式Intent通过组件名称来指定目标组件。**例如：Activity启动子Service或其他Activity。

**隐式Intent不指定组件名称，通常用于激活其他应用程序中的组件。**

对于隐式Intent，则需要使用不同的策略。在缺乏指定目标时，Android系统必须找到处理Intent的最佳组件——单个Activity或者Service来执行请求动作或一组BroadcastReceiver来响应广播通知。它是通过比较Intent对象内容和Intent过滤器来实现的。**Intent过滤器是与组件关联的结构，它能潜在地接收Intent。过滤器宣传组件的能力并划分可以处理的Intent，它们打开可能接收宣传类型的隐式Intent的组件。**如果组件没有任何Intent过滤器，但仅能接收显示Intent；如果组件包含过滤器，则可以接收显示和隐式类型的Intent。

##### Intent过滤器

Activity、Service和BroadcastReceiver能定义多个Intent过滤器来通知系统它们可以处理哪些隐式Intent。过滤器接收需要类型的Intent、拒绝不需要类型的Intent仅限于隐式Intent。对于显式Intent，无论内容如何，总可以发送给其目标，过滤器并不干预。

由于Android系统在启动组件前必须了解组件的能力，Intent过滤器通常不在JAVA代码中进行设置，而是**使用<intent-filter>标签写在应用程序的配置文件中(AndroidManifest.xml)。**

**过滤器中包含的域与Intent对象中动作、数据和分类域相对应。**

##### 案例分析

###### 隐式跳转

AndroidManifest.xml

```
<activity android:name=".OtherActivity">
<intent-filter>
<action android:name="me.zzxb.intentcase3.OtherActivity" />
<category android:name="android.intent.category.DEFAULT" />
</intent-filter>
</activity>
```

Java代码跳转

```
Intent intent = new Intent("me.zzxb.intentcase3.OtherActivity");
startActivity(intent);
```

###### 调用浏览器应用

AndroidManifest.xml

```
<activity android:name=".BrowserActivity">
<intent-filter>
<action android:name="android.intent.action.VIEW" />
<category android:name="android.intent.category.DEFAULT" />
<category android:name="android.intent.category.BROWSABLE" />
</intent-filter>
</activity>
```

java代码：

```
Uri uri= Uri.parse("http://www.baidu.com");
Intent intent = new Intent(Intent.ACTION_VIEW, uri);
startActivity(intent);
```

###### 调用打电话功能

```
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:10086"));
                startActivity(intent);
```



#### Android事件处理

##### 键盘事件

##### 触摸事件

#### 资源访问

##### 字符串资源(strings.xml)

##### Android程序国际化

#### 多媒体应用开发之相机

#### ContentProvider数据共享

#### 消息处理之Handler

#### Service应用

#### 网络编程之Volley

#### 打包发布

## 修改日志* 2016-10-13:
- [x] 创建演示项目,并对一些配置文件进行了注解。
* 2016-8-30:
- [x] 规划了整个教程的目录以及先后顺序。

## 参考资源
以下是在编写案例中收集的资源,对深入理解与运用有帮助

* [Gradle基础](http://stormzhang.com/devtools/2014/12/18/android-studio-tutorial4/)
* [官方API指南 中文版](https://developer.android.com/guide/index.html)
* android API版本与android系统版本对应表

![](Android%E6%95%99%E7%A8%8B/android-api-version.png)



- - - -
建议使用Android Studio开发工具。