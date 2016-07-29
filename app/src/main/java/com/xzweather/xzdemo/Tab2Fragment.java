package com.xzweather.xzdemo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.MultiAutoCompleteTextView;
import android.widget.ToggleButton;

/**
 * 我想知道的碎片页面
 * @author wwj_748
 *
 */
public class Tab2Fragment extends Fragment implements CompoundButton.OnCheckedChangeListener {
    private MultiAutoCompleteTextView macTextView;
	private String[] res = {"bob1","bob2","rachel1","rachel2","rachel3"};
	private ToggleButton tb;
	private ImageView img;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.tab2_fragment, container, false);
		macTextView = (MultiAutoCompleteTextView) view.findViewById(R.id.multiAutoCompleteTextView);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,res);
		macTextView.setAdapter(adapter);
		macTextView.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
//		按钮切换图片
		tb = (ToggleButton) view.findViewById(R.id.toggleButton1);
		img = (ImageView) view.findViewById(R.id.imageView1);
		tb.setOnCheckedChangeListener(this);
		return view;
	}
	@Override
	public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
		img.setBackgroundResource(isChecked?R.drawable.laugh:R.drawable.weep);
	}
}
