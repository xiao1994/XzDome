package com.xzweather.xzdemo;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Commodity extends AppCompatActivity {

    private GridView gview;
    private List<Map<String, Object>> data_list;
    private SimpleAdapter sim_adapter;
    // 图片封装为一个数组
    private int[] icon = { R.drawable.handbag3, R.drawable.handbag2,
            R.drawable.handbag1, R.drawable.handbag2, R.drawable.handbag3,
            R.drawable.handbag2, R.drawable.handbag1, R.drawable.handbag2,
            R.drawable.handbag3, R.drawable.handbag2, R.drawable.handbag1,
            R.drawable.handbag1 };
    private String[] iconName = { "贵包包贵包包贵包包贵包包贵包包贵包包贵包包贵包包贵包包贵包包贵包包贵包包贵包包贵包包贵包包贵包包", "贵包包", "贵包包", "贵包包", "贵包包", "贵包包", "贵包包",
            "贵包包", "贵包包", "贵包包", "贵包包", "贵包包" };
    private String[] price = {"￥2000","￥3000","￥222","￥2100","￥2000","￥2000","￥20100","￥20400",
            "￥20100","￥20002","￥23000","￥20500",};
    private String[] collect_number = {"230","2100","2003","2040","2500","1200","2600","2200","6200","2010",
            "200","200",};
    private Context mContext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.commodity);
        getSupportActionBar().hide();
        mContext = this;
        gview = (GridView) findViewById(R.id.grid_view);
        //新建List
        data_list = new ArrayList<Map<String, Object>>();
        //获取数据
        getData();
        //新建适配器name
        String [] from ={"image","name","price","collect_number"};
        int [] to = {R.id.image,R.id.name,R.id.price,R.id.collect_number};
        sim_adapter = new SimpleAdapter(this, data_list, R.layout.handbag_item, from, to);
        //配置适配器
        gview.setAdapter(sim_adapter);
        gview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
// TODO Auto-generated method stub
                switch(position){
                    case 0://点击图片0跳转
                    {
                        startActivity(new Intent(mContext,MerchandiseDetails.class));
                    }
                    break;
                    case 1://点击图片1跳转
                    {
                        startActivity(new Intent(mContext,MerchandiseDetails.class));
                    }
                    break;
                    case 2:
                    {
                        startActivity(new Intent(mContext,MerchandiseDetails.class));
                    }
                    break;
                    case 3:
                    {
                        startActivity(new Intent(mContext,MerchandiseDetails.class));
                    }
                    break;
                    case 4:
                    {
                        startActivity(new Intent(mContext,MerchandiseDetails.class));
                    }
                    break;
                    case 5:
                    {
                        startActivity(new Intent(mContext,MerchandiseDetails.class));
                    }
                    break;
                    case 6:
                    {
                        startActivity(new Intent(mContext,MerchandiseDetails.class));
                    }
                    break;
                    case 7:
                    {
                        startActivity(new Intent(mContext,MerchandiseDetails.class));
                    }
                    break;
                    case 8:
                    {
                        startActivity(new Intent(mContext,MerchandiseDetails.class));
                    }
                    break;
                    case 9:
                    {
                        startActivity(new Intent(mContext,MerchandiseDetails.class));
                    }
                    break;
                    case 10:
                    {
                        startActivity(new Intent(mContext,MerchandiseDetails.class));
                    }
                    break;
                    case 11:
                    {
                        startActivity(new Intent(mContext,MerchandiseDetails.class));
                    }
                }
            }
        });

    }



    public List<Map<String, Object>> getData(){
        //cion和iconName的长度是相同的，这里任选其一都可以
        for(int i=0;i<icon.length;i++){
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("image", icon[i]);
            map.put("name", iconName[i]);
            map.put("price", price[i]);
            map.put("collect_number", collect_number[i]);
            data_list.add(map);
        }

        return data_list;
    }
}
