package com.example.recyclercardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclercardview.Adapters.HorizontalitemAdapter;
import com.example.recyclercardview.Adapters.VerticalitemAdapters;
import com.example.recyclercardview.Models.HorizontalitemModel;
import com.example.recyclercardview.Models.VerticalitemModels;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerViewVER,recyclerViewHor;
    //Horizontal
    List<HorizontalitemModel> horizontalitemModelList;
    HorizontalitemAdapter adapter;

    //Vertical
    List<VerticalitemModels> list;
    VerticalitemAdapters adapters;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerViewHor=findViewById(R.id.recHor);
        recyclerViewVER=findViewById(R.id.recVer);
        //Horizontal

        horizontalitemModelList=new ArrayList<>();
        horizontalitemModelList.add(new HorizontalitemModel(R.drawable.hamburger,"Hamburger"));
        horizontalitemModelList.add(new HorizontalitemModel(R.drawable.pizza,"Pizza"));
        horizontalitemModelList.add(new HorizontalitemModel(R.drawable.hamburger,"Hamburger"));
        horizontalitemModelList.add(new HorizontalitemModel(R.drawable.ice_cream,"Ice_cream"));
        horizontalitemModelList.add(new HorizontalitemModel(R.drawable.sandwich,"Sandwich"));
        horizontalitemModelList.add(new HorizontalitemModel(R.drawable.ice_cream,"Ice_cream"));

        adapter=new HorizontalitemAdapter(getApplicationContext(),horizontalitemModelList);
        recyclerViewHor.setAdapter(adapter);

        recyclerViewHor.setLayoutManager(new LinearLayoutManager(getApplicationContext(),RecyclerView.HORIZONTAL,false));
        //Vertical
        list=new ArrayList<>();
        list.add(new VerticalitemModels(R.drawable.coffee1,"Coffee","Coffee is best","5.0","60"));
        list.add(new VerticalitemModels(R.drawable.coffee2,"Coffee1","Coffee is best","4.9","50"));
        list.add(new VerticalitemModels(R.drawable.coffee3,"Coffee2","Coffee is best","5.0","70"));
        list.add(new VerticalitemModels(R.drawable.coffee4,"Coffee3","Coffee is best","4.7","80"));
        list.add(new VerticalitemModels(R.drawable.coffee2,"Coffee4","Coffee is best","4.8","65"));
        list.add(new VerticalitemModels(R.drawable.coffee3,"Coffee5","Coffee is best","4.0","75"));
        list.add(new VerticalitemModels(R.drawable.coffee4,"Coffee6","Coffee is best","5.0","50"));
        list.add(new VerticalitemModels(R.drawable.coffee1,"Coffee7","Coffee is best","4.4","45"));
        list.add(new VerticalitemModels(R.drawable.coffee1,"Coffee8","Coffee is best","4.9","76"));

        adapters=new VerticalitemAdapters(getApplicationContext(),list);
        recyclerViewVER.setAdapter(adapters);
        //recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.v));

        recyclerViewVER.setLayoutManager(new LinearLayoutManager(getApplicationContext(),RecyclerView.VERTICAL,false));
    }
}