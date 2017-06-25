package me.zzxb.pullrefreshdemo3.ui;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import me.zzxb.pullrefreshdemo3.R;
import me.zzxb.pullrefreshdemo3.service.MyService;

public class MainActivity extends Activity implements SwipeRefreshLayout.OnRefreshListener{
    private SwipeRefreshLayout swipeRefreshLayout = null;
    private ListView myListView = null;
    private List<String> listData = null;
    private ArrayAdapter adapter = null;
    private int start = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        swipeRefreshLayout = (SwipeRefreshLayout)findViewById(R.id.swipeRefreshLayout);
        myListView = (ListView)findViewById(R.id.myListView);

        listData = new ArrayList<>();
        adapter = new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,listData);
        myListView.setAdapter(adapter);

        swipeRefreshLayout.setOnRefreshListener(this);
        swipeRefreshLayout.post(new Runnable() {
            @Override
            public void run() {
                swipeRefreshLayout.setRefreshing(true);
                fetchData();
            }
        });

    }


    @Override
    public void onRefresh() {
        fetchData();
    }

    private void fetchData(){
        swipeRefreshLayout.setRefreshing(true);
        List<String> tmp = MyService.getData(start);
        for (String s: tmp) {
            listData.add(0,s);
        }
        start += 10;
        adapter.notifyDataSetChanged();
        swipeRefreshLayout.setRefreshing(false);
    }
}
