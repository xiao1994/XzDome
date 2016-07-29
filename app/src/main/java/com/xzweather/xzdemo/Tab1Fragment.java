package com.xzweather.xzdemo;



import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * 知道碎片界面
 * @author wwj_748
 *
 */
public class Tab1Fragment extends Fragment {
	private ImageView btna;
	private ImageView btnb;
	private ImageView btnc;
	private ImageView btnd;
	private ImageView btna2;
	private ImageView btnb2;
	private ImageView btnc2;
	private ImageView btnd2;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view= inflater.inflate(R.layout.homepage,container,false);
		btna = (ImageView) view.findViewById(R.id.imageViewA);
		btnb = (ImageView) view.findViewById(R.id.imageViewB);
		btnc = (ImageView) view.findViewById(R.id.imageViewC);
		btnd = (ImageView) view.findViewById(R.id.imageViewD);
		btna2 = (ImageView) view.findViewById(R.id.imageViewA2);
		btnb2 = (ImageView) view.findViewById(R.id.imageViewB2);
		btnc2 = (ImageView) view.findViewById(R.id.imageViewC2);
		btnd2 = (ImageView) view.findViewById(R.id.imageViewD2);

		btna.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(getActivity(), PersonalData.class);
				startActivity(intent);
			}
		});

		btnb.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(getActivity(), Evaluate.class);
				startActivity(intent);
			}
		});

		btnc.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v){
				Intent intent = new Intent(getActivity(), Commodity.class);
				startActivity(intent);
			}
		});
		btnd.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v){
				Intent intent = new Intent(getActivity(), Test.class);
				startActivity(intent);
			}
		});
		btna2.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v){
				Intent intent = new Intent(getActivity(), Test.class);
				startActivity(intent);
			}
		});
		btnb2.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v){
				Intent intent = new Intent(getActivity(), Test.class);
				startActivity(intent);
			}
		});
		btnc2.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v){
				Intent intent = new Intent(getActivity(), Test.class);
				startActivity(intent);
			}
		});
		btnd2.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v){
				Intent intent = new Intent(getActivity(), Test.class);
				startActivity(intent);
			}
		});
		return view;
	}
}
