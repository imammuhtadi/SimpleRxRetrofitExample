package com.imammuhtadi.simplerxretrofitexample;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.imammuhtadi.simplerxretrofitexample.adapter.MemeAdapter;
import com.imammuhtadi.simplerxretrofitexample.model.DataResponse;

public class MainActivity extends AppCompatActivity implements MemeView{

    RecyclerView list;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        MemePresenter memePresenter = new MemePresenter(this);
        memePresenter.getMeme();
    }

    @Override
    public void getMemeSuccess(DataResponse dataResponse){
        MemeAdapter adapter = new MemeAdapter(dataResponse.getResult());
        list.setAdapter(adapter);
    }

    public void init(){
        list = (RecyclerView) findViewById(R.id.recycleView);
        list.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        list.setLayoutManager(llm);
        //list.setLayoutManager(new LinearLayoutManager(context));
        //final GridLayoutManager mng_layout = new GridLayoutManager(MainActivity.this, 2);
        //list.setLayoutManager(mng_layout);
    }
}
