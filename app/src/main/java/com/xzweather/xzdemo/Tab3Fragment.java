package com.xzweather.xzdemo;



import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * “我的”碎片页面
 * @author wwj_748
 *
 */
public class Tab3Fragment extends Fragment {
	private Button btnL;
	private ImageView fImage;
	private ImageView sImage;
	private ImageView tImage;
	private GridView gridView;
	private List<Map<String, Object>> dataList;
	private int[] icon = {R.drawable.a1, R.drawable.a2, R.drawable.a3, R.drawable.a4,
			R.drawable.f1, R.drawable.f2, R.drawable.f3, R.drawable.f4, R.drawable.f5};
	private String[] iconName = {"我的", "优惠券", "扫一扫", "资讯", "分享", "应用推荐", "意见反馈", "系统刷新", "常见问题"};
	private SimpleAdapter adapter;
	@Override

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.is_me, container, false);
		btnL = (Button) view.findViewById(R.id.Logon);
		fImage = (ImageView) view.findViewById(R.id.firstImage);
		sImage = (ImageView) view.findViewById(R.id.secondImage);
		tImage = (ImageView) view.findViewById(R.id.thirdlyImage);
		gridView = (GridView) view.findViewById(R.id.gridView);

		btnL.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(getActivity(),MeLogon.class);
				startActivity(intent);
			}
		});
		fImage.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(getActivity(),MeFirstImage.class);
				startActivity(intent);
			}
		});
		sImage.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(getActivity(),MeSecondImage.class);
				startActivity(intent);
			}
		});
		tImage.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(getActivity(),MeThirdlyImage.class);
				startActivity(intent);
			}
		});
		dataList = new ArrayList<Map<String, Object>>();
		adapter = new SimpleAdapter(getActivity(), getDate(), R.layout.item,
				new String[]{"image", "text"}, new int[]{R.id.image, R.id.text});
		gridView.setAdapter(adapter);
		gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
									int position, long id) {
// TODO Auto-generated method stub
				switch (position) {
					case 0://点击图片0跳转
					{
						startActivity(new Intent(getActivity(), Test.class));
					}
					break;
					case 1://点击图片1跳转
					{
						startActivity(new Intent(getActivity(), Test.class));
					}
					break;
					case 2:
					{
						startActivity(new Intent(getActivity(), Test.class));
					}
					break;
					case 3://点击图片1跳转
					{
						startActivity(new Intent(getActivity(), Test.class));
					}
					break;
					case 4://点击图片1跳转
					{
						startActivity(new Intent(getActivity(), Test.class));
					}
					break;
					case 5://点击图片1跳转
					{
						startActivity(new Intent(getActivity(), Test.class));
					}
					break;
					case 6://点击图片1跳转
					{
						startActivity(new Intent(getActivity(), Test.class));
					}
					break;
					case 7://点击图片1跳转
					{
						startActivity(new Intent(getActivity(), Test.class));
					}
					break;
					case 8://点击图片1跳转
					{
						startActivity(new Intent(getActivity(), Test.class));
					}
				}
			}
		});
		return view;
	}


	private List<Map<String, Object>> getDate() {
		for (int i = 0; i < icon.length; i++) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("image", icon[i]);
			map.put("text", iconName[i]);
			dataList.add(map);
		}
		return dataList;


	}
}