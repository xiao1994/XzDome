package com.xzweather.xzdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2015/11/12.
 */
public class Evaluate extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    private TextView textView;
    private Spinner spinner;
    private List<String> list;
    private ArrayAdapter<String>adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.evaluate);
        textView = (TextView) findViewById(R.id.textView);
        spinner = (Spinner) findViewById(R.id.spinner);
        textView.setText("五分最高，您的评分是?");
//设置数据源
        list = new ArrayList<String>();
        list.add("5");
        list.add("4");
        list.add("3");
        list.add("2");
        list.add("1");
// 新建ArrayAdapter（数组适配器）
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,list);
//        adapter设置一个下拉列表样式
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//      spinner加载适配器
        spinner.setAdapter(adapter);
//        spinner设置监听器
        spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String grade = adapter.getItem(position);
        textView.setText("您的评分是"+grade+"分！");
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}

