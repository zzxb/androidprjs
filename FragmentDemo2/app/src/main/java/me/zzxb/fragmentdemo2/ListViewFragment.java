package me.zzxb.fragmentdemo2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link ListViewFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link ListViewFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ListViewFragment extends Fragment {
    private String[] data = {"钢笔","钢笔套餐","墨盒","扫描仪","透明胶"};
    private int[] pics = {R.drawable.gangbi,R.drawable.gangbi2,R.drawable.mohe,R.drawable.smy,R.drawable.tmj};

    public ListViewFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list_view, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ListView lv = (ListView) getActivity().findViewById(R.id.myList);

        ArrayAdapter adapter = new ArrayAdapter(getContext(),android.R.layout.simple_list_item_1,data);

        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int iHeight = getActivity().getWindowManager().getDefaultDisplay().getHeight();
                int iWidth = getActivity().getWindowManager().getDefaultDisplay().getWidth();
                ImageView ivPic = (ImageView)getActivity().findViewById(R.id.ivPic);
                ivPic.setImageResource(pics[position]);
                TextView ivName = (TextView)getActivity().findViewById(R.id.ivName);
                ivName.setText(data[position]);
                if(iWidth < iHeight){//竖屏
                    FragmentManager fr = getActivity().getSupportFragmentManager();
                    ListViewFragment f1 = (ListViewFragment) fr.findFragmentById(R.id.fragment1);
                    DetailViewFragment f2 = (DetailViewFragment)fr.findFragmentById(R.id.fragment2);
                    fr.beginTransaction().hide(f1).commit();
                    fr.beginTransaction().show(f2).commit();
                }
            }
        });

    }
}
