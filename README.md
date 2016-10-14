这是一个基于Android平台开发的基础案例集。旨在用于给初学者快速了解Android平台的开发。

开发工具和平台

- Android Studio 2.0以上
- java语言
- android sdk
- gradle 2.0以上
- git
- github

## 问答

#### 案例集面向谁？

主要是面对高校以及一些对Android开发零基础的人群。<br/>

## 目录
1. LayoutDemo 关于android中布局相关案例集，包括：线性布局，表格布局，相对布局，绝对布局以及Frame布局
2. ComponentUI 关于android中核心控件以及控件事件处理的相关案例集。

## 开发者

- zzxb


## 版本

V 1.0.0

## 核心知识点

#### 学习前准备

1.[下载android studio IDE](http://www.android-studio.org/index.php/download/androidstudio-download-baidudisk/)<br>
2.熟悉最基本的面向对象语言开发JAVA<br/>

#### android studio 开发工具的安装

参考[安装与配置](http://stormzhang.com/devtools/2014/11/25/android-studio-tutorial1/)

![](images/android-colors.png)

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

![](images/android-prjlist.png)

2.新建工程，已在安装Android Studio中介绍了。

3.打开已存在的工程。如下图：

![](images/android-openprj.png)

4.进入主界面，各Bar介绍

![](images/android-asui.png)

5.菜单栏，如下图：

![](images/android-menu.png)

6.工程项目透视图有多种，常用两种，如下图：

![](images/android-struts.png) ![](images/android-projects.png)

7.代码编辑区，如下图：

![](images/android-coding.png)

8.用于观察后台日志或监控程序执行过程以及性能的监控控制台，如下图：

![](images/android-logs.png)

9.对Gradle自动构建手动的操作，使用Gradle生命周期控制台，如下图:

![](images/android-gradle-life.png)

######  以上就是对于Android Studio IDE界面的介绍，下面我们来看看，基于Android Studio的目录结构。

首先，Android Studio中没有像Eclipse或MyEclipse中WorkSpace(工作空间)的概念，只有工程或项目的概念，在Android Studio中的工程包含多个Moudle(模块).每个模块都可以独立运行或被引用。Android Studio强烈建议一个工程或项目多Moudle(模块)的设计，这样更加的便于维护和开发。

那么，我们来看一下目录结构，以及它们的作用。

1.我们再来回顾一下Android工程透视图,如下图：

![](images/android-struts.png)

app模块是我们关注的重点

2.mainifests目录下mainifest.xml，如下图:

![](images/android-mainifest.png)

该文件是每个android程序中必须的文件。它位于整个项目的根目录，描述了package中暴露的组件（activities, services, 等等），他们各自的实现类，各种能被处理的数据和启动位置。 除了能声明程序中的Activities, ContentProviders, Services, 和Intent Receivers,还能指定permissions和instrumentation（安全控制和测试），同时用于控制Android应用的名称、图标、访问权限等整体属性。

3.java目录是源代码目录，如下图:

![](images/android-javadir.png)

4.res目录是所有android模块下所有资源文件的集合，比如：layout布局xml配置文件，图片资源文件集合，资源信息或国际化配置信息文件。

![](images/android-res.png)

那么，我们逐个看一下各个子目录作用以及文件。

###### drawable目录，将图片等资源放在drawable-hdip中，将一些和XML文件相关的内容（图片选择器、文字颜色选择器、自定义形状等）放在drawable中。

![](images/android-drawalbe.png)

###### layout目录，放置所有界面的布局xml文件。

![](images/android-layoutxmls.png)

###### 具体布局样例，如图：

![](images/android-layout.png)

###### mipmap目录，用于存放原生图片（图ic_launcher.png），缩放上有性能优化; 

![](images/android-minmap.png)

###### values目录，讲所有字符串资源文件，颜色等资源文件

![](images/android-values.png)

###### strings.xml 字符串资源文件

![](images/android-strings.png)

###### colors.xml 颜色资源文件

![](images/android-colors.png)

###### dimens.xml 颜色资源文件

![](images/android-dimens.png)

5.Gradle Script目录，关于所有Gradle的配置文件。

![](images/android-gradles.png)

另外，import “”与<>区别:

"":用于引入内部第三方类或类库

<>:用于引用系统类或类库


#### 2.ocprj4之指针以及引用

1.什么是指针？<br/>

在内存中，任何一个变量都可以看成由三部分组成：变量名，值，以及存放该值的地址。<br/>

如果有一个变量，里面存储的值等于另外一个变量的地址值，则，可以把这个变量看做指针。<br/>

例如：声明指针变量<br/>

```Objective-C

        int *var; //声明指针变量
        int a = 10;  //int变量
        var = &a //a变量的引用(&)，即是a变量地址，那么p的值就为a的地址
        NSLog(@"a变量的地址为:%p",&a);//打印a的地址：0x7fff5fbff83c
        NSLog(@"var指针变量的值为:%p",var);//0x7fff5fbff83c
        NSLog(@"*var的值与a的值相同,%i",*var);//10

```

那么，指针的指针变量：<br/>

```Objective-C
        int **myPoint;//指针的指针变量
        myPoint = &var;
        NSLog(@"**myPoint的值与a的值相同,%i",**myPoint);//10
```

#### 3.ocprj5之类基础定义以及自定方法

定义一个类，是由两个部分文件组成：.h和.m<br/>

.h文件：是头文件，定义变量以及声明方法。例如：<br/>

Teacher.h<br/>

```Objective-C

@interface Teacher : NSObject
{
    //定义变量区
    int tid;
    NSString *tName;
}

/**
 * 方法的定义：
 *
 */

- (void) setTid: (int)tid;
- (void) setTName: (NSString *)tName;
- (int) getTid;
- (NSString *) getTName;

@end

```

@interface 定义类的关键字<br/>

NSObject   是一切类的基类，相当于java中的Object类<br/>

在.h文件中声明的变量基本上都是公有变量，也可以用@private声明为私有变量。但苹果的代码规范中很少使用@private声明.由于Objective-C的动态消息传递机制，OC中不存在真正意义上的私有方法,如果你不在.h文件中声明，只在.m文件中实现，或在.m文件的Class Extension里声明，那么基本上和私有方法差不多。简而言之，将你希望公有的放到.h文件，私有的放到.m文件。在import时只import .h文件.<br/>

Teacher.m<br/>

```Objective-C

#import "Teacher.h"

@implementation Teacher

- (void) setTid:(int)parTid
{
    self.tid = parTid;
}

- (NSString *) getTName
{
    return tName;
}

- (int) getTid
{
    return tid;
}

- (void) setTName:(NSString *)parTName
{
    self.tName = parTName;
}

- (void)test
{
    NSLog(@"私有方法");
}


@end

```

import           引用.h文件<br/>

@implementation  实现.h文件中的所有方法.<br/>

test方法          私有方法<br/>

Student.h<br/>

```Objective-C

@interface Student : NSObject
@property(assign,nonatomic) int stuID;
@property(strong,nonatomic) NSString *stuName;

+ (Student *) instance;
- (id) initWithStuId:(int) stuId
          andStuName:(NSString *)stuName;
@end

```

@property 用于定义可自动生成getter/setter变量

#### 对于@property属性的详解

使用@property定义property时可以在@property与类型之间用括号添加一些额外的指示符，常用的指示符有assign、atomic、copy、retain、strong、week、等。下面对它们的用途和常常对应的属性讲解一下。
 
 - assign：该指示符号对属性只是简单的赋值，不更改引用计数。常用于NSInteger等OC基础类型，以及short、int、double、结构体等C数据类型，因为这些类型不存在被内存回收的问题。
 - atomic、nonatomic：指定setter和getter是否是原子操作，即是否线程安全。如果是atomic，那么存取方法都是线程安全的，即某一线程访问存或者取方法，其他线程不可以进入该存、取方法。nonatomic则不具备线程安全的功能。需要指出的是atomic是默认值，可以保证数据的完整性，但是相应的降低了性能，所以在单线程环境中建议使用nonatomic来提升性能。
 - copy：如果使用copy指示符，当调用setter方法对成员变量赋值时，会将被赋值的对象复制的一个副本，再将该副本给成员变量，相应的原先的被赋值的对象的引用计数加1。当成员变量的类型是可变类型，或其子类是可变类型，被赋值的对象在赋值后有可能再被修改，如果不需要这种修改，则可以考虑copy指示符。
 - getter、setter：用于为getter方法、setter方法指定自定义方法名。比如getter＝myName,setter=setName:，我们可以看到setter方法后面有一个（:）,这是因为我们需要在后面添加参数。
 - readonly、readwrite：readonly指示系统只合成getter方法，不合成setter方法；readwrite是默认值，指示系统需要合成setter方法和getter方法。
 - retain：当把某个对象赋值给该属性时，该属性原来所引用的对象的引用计数减1，被赋值对象的引用计数加1。在未启用ARC机制的的情况下，retain可以保证一个对象的引用计数大于1时，该对象不会被回收。启用ARC后一般较少使用retain
 - strong、weak：strong指示符该属性对被赋值对象持有强引用，而weak指示符指定该属性对被赋值对象持有弱引用。强引用的意思是：只要该强引用指向被赋值的对象，那么该对象就不会自动回收。弱引用的意思是：即使该弱引用指向被赋值的对象，该对象也可能被回收。如果不希望对象被回收，可以使用strong指示符。如果需要保证程序性能，避免内存溢出，可以使用weak，内存一旦被回收，指针会被赋值为nil。
 - unsafe_unretained：与weak不同，被unsafe_unretained指针所引用的对象被回收后，unsafe_unretained指针不会被赋为nil，可能会导致程序出错

总结一下：
 
 - strong 和原来的retain比较相似，strong的property将对应__strong的指针，它将持有所指向的对象
 - weak 不持有所指向的对象，而且当所指对象销毁时能将自己置为nil，基本所有的outlet都应该用weak
 - unsafe_unretained 这就是原来的assign。当需要支持iOS4时需要用到这个关键字
 - copy 和原来基本一样..copy一个对象并且为其创建一个strong指针
 - assign 对于对象来说应该永远不用assign了，实在需要的话应该用unsafe_unretained代替(基本找不到这种时候，大部分assign应该都被weak替代)。但是对于基本类型比如int,float,BOOL这样的东西，还是要用assign
 
 基本数据类型，如：int,float,BOOL,double等，使用assign
 
 对象一般使用strong，在非ARC环境下，使用retain.
 
 所有UI界面的对象使用weak，例如outlet对象
 
 - atomic //default
 - nonatomic
 - strong = retain
 - weak = assign
 - retain
 - assign //default
 - unsafe_unretained
 - copy
 - readonly
 - readwrite //default

#### oc中方法的定义

1.定义结构<br/>

StudentService.h<br/>

```Objective-C
@interface StudentService : NSObject
- (BOOL)loginFromForStuName:(NSString *) stuName
                  andStuPwd:(NSString *) stuPwd;

@end

```

-/+: - 代表公有方法。+ 代表静态方法<br/>

(type):返回值类型，void/BOOL/int/....<br/>

方法名：loginFormForStuName......andStuPwd<br/>

(NSString *) 参数类型,stuName变量名，用:分隔多个参数<br/>

2.自定义构造方法<br/>

```Objective-C
//自定义构造方法
- (id) initWithStuId:(int) stuId
          andStuName:(NSString *)stuName
{
    //调用父类构造方法
    self = [super init];
    if(self != nil)
    {
        _stuID = stuId;
        _stuName = stuName;
    }
    return self;
}
```

3.静态方法<br/>

```Objective-C
//静态方法
+ (Student *)instance
{
    return [[Student alloc] init];
}
```

#### 使用类(调用方法)

使用类/调用构造方法,使用alloc实例化类，而尽量不要用new<br/>

```Objective-C
Student *stu = [[Student alloc] init];
Student *stu2 = [[Student alloc] initWithStuId:1 andStuName:@"KKK"];//自定义构造方法
```

调用自定义方法<br/>

```Objective-C
StudentService *myService = [[StudentService alloc] init];
BOOL isLogin = [myService loginFromForStuName:@"zzxb" andStuPwd:@"qaz123"];
```

###### super相当于java中的super,self相当于java中的this.

调用静态方法<br/>

```Objective-C
Student *stu = [Student instance];
```

使用类的属性<br/>

```Objective-C
stu.stuID = 1;
stu.stuName = @"zzxb";
```

##### 总结：调用类属性使用点语法(.),调用类方法使用[],实例化类使用alloc

#### ocprj6之常用字符串操作函数 

常见的字符串创建

```Objective-C
NSString *str = @"abcdefg";
```

指针字符类型的转换为字符串

```Objective-C
char *text = "一二三四五六七八九十";
str = [NSString stringWithUTF8String:text];
```

将URL请求响应转换为字符串

```Objective-C
NSURL *url = [NSURL URLWithString:@"http://www.weather.com.cn/adat/sk/101010100.html"];
NSString *strText = [NSString stringWithContentsOfURL:url encoding:NSUTF8StringEncoding error:nil];
```

将字符串转换为全大写字母/全部小写/首字母大写

```Objective-C
//转换成大写
NSLog(@"大写: %@", [str uppercaseString]);
    
//转换成小写
NSLog(@"小写: %@", [str lowercaseString]);
    
//转换成首字母大写
NSLog(@"首字母大写: %@", [str capitalizedString]);
```

判断两个字符串是否相等

```Objective-C
BOOL result = [@"abc" isEqualToString:@"ABC"];
```

字符串连接

```Objective-C
NSString *str2 = [str stringByAppendingString:@"Shandong"];

NSString *str3 = [NSString stringWithFormat: @"城市信息为： %@ 市 %@ 省",str,str2];

```

字符串搜索

```Objective-C
    NSString *str = @"ShangHai123456";
    
    NSLog(@"是否已Sh开头%i", [str hasPrefix:@"Sh"]);
    NSLog(@"是否已56结尾%i", [str hasSuffix:@"56"]);
    
    //查找字符串所在位置
    NSRange range = [str rangeOfString:@"i12"];
    
    if (range.location == NSNotFound)
    {
        NSLog(@"不能找到");
    }
    else
    {
        NSLog(@"找到的范围: %@", NSStringFromRange(range));
    }    

```

字符串截取

```Objective-C
    NSString *str = @"123456789";
    
    NSLog(@"%@", [str substringFromIndex:3]);
    
    NSLog(@"%@", [str substringToIndex:3]);
    
    NSRange range = NSMakeRange(4, 5);
    NSLog(@"%@", [str substringWithRange:range]);
    
    NSString *str2 = @"1,2,3-4-5-6,7,8,9";
    NSArray *array = [str2 componentsSeparatedByString:@"-"];
    for (NSString *var in array) {
        NSLog(@"%@",var);
    }
    
    NSString *str3 = [array objectAtIndex:0];
    NSLog(@"%@", str3);

```

字符串转换

```Objective-C
    NSString *str = @"123";
    
    int a = [str intValue];
    NSLog(@"%i", a);
    
    float b = [str floatValue];
    NSLog(@"%.2f", b);
    
    //返回字符串的个数
    NSString *str1 = @"我是字符串!";
    NSLog(@"%zi", [str1 length]);
    
    //取出对应的字符串
    unichar temp = [@"abcdefg" characterAtIndex:3];
    NSLog(@"%c", temp);
    
    //字符串转换为字符
    const char *s = [@"uvwxyz" UTF8String];
    NSLog(@"%s", s);

```

### ocprj7之数组

##### 不可变数组

创建数组

```Objective-C
        // 创建数组两种方式
        NSArray *array = @[@"one",@"two",@"three"];
        
         NSArray *array2 = nil;
        // 注意最后的nil只是一个结束标识，而不是其中的一个元素
        array2 = [NSArray arrayWithObjects:@"one",@"two",@"three",nil];

```

取元素(查)

```Objective-C
NSLog(@"%@", array[2]);
// 取出相关元素的另一种写法
NSLog(@"%@", [array objectAtIndex:1]);        
//第一个元素
NSLog(@"%@", [array firstObject]);
//最后一个元素
NSLog(@"%@", [array lastObject]);
// 从一个数组提取一个子数组
NSArray *array5 = [array2subarrayWithRange:NSMakeRange(2, 2)];
// containsObject可以用来判断数组是否包含一个指定的元素
if ([array4 containsObject:@"one"]) {
   NSLog(@"array4 包含 one");
}
// 查出一个元素在数组中的索引位置
NSLog(@"one 在array4中的索引位置 %lu", [array4 indexOfObject:@"three"]);        
```

新增元素生成新的数组(改)

```Objective-C
// arrayByAddingObject给一个数组对象加一个元素生成一个新的数组
NSArray *array1 = [array arrayByAddingObject:@"four"];
// arrayByAddingObjectsFromArray给一个数组对象加一个数组生成一个新的数组
NSArray *array2 = [array arrayByAddingObjectsFromArray:array1];        NSLog(@"array:%@", array2);      
```

获取大小

```Objective-C
NSLog(@"%lu", [array count]);
```

循环

```Objective-C

for(NSString *var in array){
	NSLog(@"%@",var)
}

```

其他

```Objective-C
NSString *str1 = @"one:two:three:four";
// 用一个固定的分隔符把一个字符串隔开创建一个数组
NSArray *array4 = [str1 componentsSeparatedByString:@":"];
```

##### 可变数组(相当于List)

创建

```Objective-C
// 创建一个可变数组
NSMutableArray *mtArray2 = [NSMutableArray arrayWithCapacity:50];
NSMutableArray *mtArray1 = [[NSMutableArray alloc] init];
```

添加元素(增)

```Objective-C
// 往可变数组添加一个新的元素
[mtArray1 addObject:@"one"];
NSObject *newObj1 = [NSObject new];
[mtArray1 addObject:newObj1];
[mtArray1 addObject:@"one1"];
[mtArray1 addObject:@"one2"];
[mtArray1 addObject:@"one3"];
```

获取元素(查)

```Objective-C
NSLog(@"%@", array[2]);
// 取出相关元素的另一种写法
NSLog(@"%@", [array objectAtIndex:1]);    
```

修改元素(改)

```Objective-C
// 替换掉指定索引位置的元素
[mtArray1 replaceObjectAtIndex:2 withObject:@"xxxxx"];
//在指定的索引位置插入一个新的元素
[mtArray1 insertObject:@"one4" atIndex:2];   
```

删除元素(删除)

```Objective-C
 // 从可变数组中移除一个元素
 [mtArray1 removeObject:@"one2"]; 
 [mtArray1 removeObjectAtIndex:2];  
```

### ocprj7_1之NSDictionary（字典）

##### 不可变字典

创建

```Objective-C
#value-key的赋值,最后一个必须是nil
NSDictionary *dictionary = [NSDictionary dictionaryWithObjectsAndKeys:@"zzxb",@"name",@"13905310001",@"number", nil];
#初始化一个元素
NSDictionary *dict1 = [NSDictionary dictionaryWithObject:@"1" forKey:@"a"];
#初始化，利用数组
NSDictionary *dict2 = [NSDictionary dictionaryWithObjects:[NSArray arrayWithObjects:@"1",@"2",@"3", nil] forKeys:[NSArray arrayWithObjects:@"a",@"b",@"c", nil]];
```

数量

```Objective-C
int count = [dist2 count];
```

得到词典中所有KEY值/VALUE值

```Objective-C
NSArray * allKeys = [dict2 allKeys];
NSLog(@"allKeys = %@",allKeys);
NSArray *allValues = [dict2 allValues];
NSLog(@"allValues = %@",allValues);
```

获取KEY对应VALUE

```Objective-C
NSString *value = [dict2 valueForKey:@"b"];
NSLog(@"value = %@",value);
        
NSString *value2 = [dict2 objectForKey:@"b"];
NSLog(@"value = %@",value2);
```

获得KEYS对应VALUES（数组）

```Objective-C
NSArray *strarray = [dict2 objectsForKeys:[NSArray arrayWithObjects:@"a",@"d",@"c", nil] notFoundMarker:@"not found"];
NSLog(@"strarray = %@",strarray);
```

遍历之for循环

```Objective-C
for (NSString *key in dict2) {
    NSLog(@"%@ = %@",key,[dict2 objectForKey:key]);
}
```
注意：必须变量名为key

遍历之枚举

```Objective-C
NSEnumerator *en = [dict2 keyEnumerator];
id keyvalue = nil;
while (keyvalue = [en nextObject]) {
  NSLog(@"key:%@-value:%@",keyvalue,[dict2 valueForKey:keyvalue]);
}
```

##### 可变字典

创建

```Objective-C
NSMutableDictionary *dict3 = [[NSMutableDictionary alloc] init];
```

添加元素(增)

```Objective-C
[dict3 setObject:@"1" forKey:@"a"];
```

删除元素(删)

```Objective-C
[dict3 removeObjectForKey:@"a"];
```

获取KEY对应VALUE（查）

```Objective-C
NSString *value = [dict2 valueForKey:@"b"];
NSLog(@"value = %@",value);
        
NSString *value2 = [dict2 objectForKey:@"b"];
NSLog(@"value = %@",value2);
```

修改元素值

```Objective-C
//原来有key=a的值，再设置就相当于修改
[dict3 setObject:@"ffff" forKey:@"a"];
```

#### ocprj8之继承与多态

##### OC中的继承

1.OC中的继承用":"(冒号),java中用extends

2.OC所有类的父类都是NSObject,而JAVA是Object

3.在OC中不允许隐身继承，例如：必须每个类显示继承NSObject，而JAVA默认继承Object是隐式的

例如：

```Objective-C
@interface Teacher : NSObject{
}
```

##### oc中原则上没有重载,这与其函数语法定义有关系.

##### oc中的重写与多态,同JAVA中的概念一致。

##### oc中用@class实现动态后期引入,等同于java中的Class.forname();

#### ocprj10之OC协议

OC协议与JAVA中的接口概念非常相似

协议常用UI开发中事件设计模式，即委托设计模式的实现.

@protocol为协议定义关键字，通常协议只是定义方法（函数），所以，只有.h文件

与JAVA区别，在OC中协议常用分为两块，@required(必须、要求)和@optional(可选)

@required关键字下定义的方法，实现协议的类，必须实现该方法,默认的方法都是@required

@optional可选关键字是指可以选择性实现或不实现

OC协议中不允许定义非方法的变量

所以，OC中的协议概念更加灵活，比JAVA中对接口的定义更加严谨。

例如：

Emp.h

```Objective-C
@protocol Emp <NSObject>

//必须要实现的方法
@required
- (void) work;
- (void) gongzi;

//可选
@optional
- (void) dakai;

@end
```

在OC中实现一个协议的方法:

SEEmp.h

```Objective-C
//引入协议
#import "Emp.h"

@interface SEEmp : NSObject<Emp>

- (void) goutong;

@end
```

说明：

1.利用<>(尖括号)引入协议名称，如果是实现多个协议用逗号分隔(,).

2.需要实现协议中的方法，不用在.h文件再次定义。(goutong是扩展方法)

协议的实例化方式：

1.实例化协议的子类

```Objective-C
SEEmp *se = [[SEEmp alloc] init];
```
2.多态方式的实例化

```Objective-C
id<Emp> se = [[SEEmp alloc] init];
```

3.强制类型转换

```Objective-C
(SEEmp *)se
```

4.基于协议的多态

```Objective-C
- (void) tinghuibao : (id<Emp>)emp;
```
#### ocprj18之基于AFNetworking框架的异步webservice访问

##### 什么是AFNetworking框架？

AFNetworking是IOS和MAC OS上常用的第三方网络异步访问库，它是一个开源的，在[GITHUB](https://github.com/AFNetworking/AFNetworking)上有最新的源码和说明。

##### 基于cocoapods依赖安装AFNetworking框架

1.编写配置文件Podfile

```
source 'https://github.com/CocoaPods/Specs.git'
platform :ios,'8.0'
platform :osx,'10.11'
target 'ocprj18' do
pod 'AFNetworking', '~> 3.0'
end
```

2.执行

```
$ pod install
```



##### 使用AFNetworking框架：GET请求和POST请求的访问

```Objective-C
//GET
AFHTTPSessionManager *manager = [AFHTTPSessionManager manager];
[manager GET:@"http://example.com/resources.json" parameters:nil progress:nil success:^(NSURLSessionTask *task, id responseObject) {
    NSLog(@"JSON: %@", responseObject);
} failure:^(NSURLSessionTask *operation, NSError *error) {
    NSLog(@"Error: %@", error);
}];
```

```Objective-C
//POST
AFHTTPSessionManager *session = [AFHTTPSessionManager manager];
session.requestSerializer = [AFJSONRequestSerializer serializer];
NSMutableDictionary *params = [NSMutableDictionary dictionary];
params[@"start"] = @"1";
params[@"end"] = @"5";
    
[session POST:urlStr parameters:params progress:nil success:^(NSURLSessionDataTask * _Nonnull task, id  _Nullable responseObject) {
    NSLog(@"请求成功");
} failure:^(NSURLSessionDataTask * _Nullable task, NSError * _Nonnull error) {
    NSLog(@"请求成功");
}];
```

##### 在MAC OS命令行下使用AFNetworking的说明
由于AFNetworking是基于网络的异步访问库，而Main函数下命令行程序是同步访问，所以，需要使用NSRunLoop模拟异步。

代码如下：

```Objective-C
    do {
        @autoreleasepool
        {
            //在此处添加AFNetworking代码
            [[NSRunLoop currentRunLoop] run];
        }
    } while (YES);
```

##### 关于AFNetworking 3.0 @"NSLocalizedDescription" :@"Request failed: unacceptable content-type: text/html"错误的解决方案

1.修改AFNetworking中AFURLResponseSerialization.m文件

2.在226行,将

```Objective-C
self.acceptableContentTypes = [NSSet setWithObjects:@"application/json", @"text/json", @"text/javascript", nil];
```

改成

```Objective-C
self.acceptableContentTypes = [NSSet setWithObjects:@"application/json", @"text/html",@"text/json", @"text/javascript", nil];
```

增加了一个 @"text/html"

##### 解决JSON串在XCODE控制台显示UNICODE（乱码问题）

```Objective-C
NSData *jsonData = [NSJSONSerialization dataWithJSONObject:responseObject options:NSJSONWritingPrettyPrinted error:nil];    
NSString *jsonStr = [[NSString alloc] initWithData:jsonData encoding:NSUTF8StringEncoding];
```

## 修改日志
- 2016-10-13:
- [x] 创建演示项目,并对一些配置文件进行了注解。
- 2016-8-30:
- [x] 规划了整个教程的目录以及先后顺序。

## 参考资源
以下是在编写案例中收集的资源,对深入理解与运用有帮助

- [Gradle基础](http://stormzhang.com/devtools/2014/12/18/android-studio-tutorial4/)
- [Google Objective-C Style Guide 中文版](http://zh-google-styleguide.readthedocs.io/en/latest/google-objc-styleguide/)
- [iOS开发60分钟入门](https://github.com/qinjx/30min_guides/blob/master/ios.md)


------
建议使用Android Studio开发工具。

