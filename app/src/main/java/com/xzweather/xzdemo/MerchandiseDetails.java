package com.xzweather.xzdemo;

import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MerchandiseDetails extends AppCompatActivity implements OnPageChangeListener {
    /**
     * ViewPager
     */
    private ViewPager viewPager;

    /**
     * 装点点的ImageView数组
     */
    private ImageView[] tips;

    /**
     * 装ImageView数组
     */
    private ImageView[] mImageViews;

    /**
     * 图片资源id
     */
    private int[] imgIdArray ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.merchandise_details);
        getSupportActionBar().hide();
        ViewGroup group = (ViewGroup)findViewById(R.id.viewGroup);
        viewPager = (ViewPager) findViewById(R.id.viewPager);

        //载入图片资源ID
        imgIdArray = new int[]{R.drawable.handbag3, R.drawable.handbag2, R.drawable.handbag3, R.drawable.handbag2};


        //将点点加入到ViewGroup中
        tips = new ImageView[imgIdArray.length];
        for(int i=0; i<tips.length; i++){
            ImageView imageView = new ImageView(this);
            imageView.setLayoutParams(new LayoutParams(10,10));
            tips[i] = imageView;
            if(i == 0){
                tips[i].setBackgroundResource(R.drawable.page_indicator_focused);
            }else{
                tips[i].setBackgroundResource(R.drawable.page_indicator_unfocused);
            }

            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(new ViewGroup.LayoutParams(LayoutParams.WRAP_CONTENT,
                    LayoutParams.WRAP_CONTENT));
            layoutParams.leftMargin = 5;
            layoutParams.rightMargin = 5;
            group.addView(imageView, layoutParams);
        }


        //将图片装载到数组中
        if (imgIdArray.length == 1) {
            mImageViews = new ImageView[2];
            for (int i = 0; i < (mImageViews.length); i++) {
                ImageView imageView = new ImageView(this);
                mImageViews[i] = imageView;
                imageView.setBackgroundResource(imgIdArray[0]);
            }
            group.setVisibility(View.GONE);
            viewPager.setOnTouchListener(new View.OnTouchListener() {

                @Override
                public boolean onTouch(View arg0, MotionEvent arg1) {
                    // TODO Auto-generated method stub
                    return true;
                }
            });
        }
        else if (imgIdArray.length == 2 || imgIdArray.length == 3) {
            mImageViews = new ImageView[imgIdArray.length * 2];
            for (int i = 0; i < (mImageViews.length); i++) {
                ImageView imageView = new ImageView(this);
                mImageViews[i] = imageView;
                imageView.setBackgroundResource(imgIdArray[(i > (imgIdArray.length-1)) ? i -imgIdArray.length  : i]);
            }
        } else {
            mImageViews = new ImageView[imgIdArray.length];
            for (int i = 0; i < mImageViews.length; i++) {
                ImageView imageView = new ImageView(this);
                mImageViews[i] = imageView;
                imageView.setBackgroundResource(imgIdArray[i]);
            }
        }

        //设置Adapter
        viewPager.setAdapter(new MyAdapter());
        //设置监听，主要是设置点点的背景
        viewPager.setOnPageChangeListener(this);
        //设置ViewPager的默认项, 设置为长度的100倍，这样子开始就能往左滑动
        viewPager.setCurrentItem((mImageViews.length) * 100);

    }

    /**
     *
     * @author xiaanming
     *
     */
    public class MyAdapter extends PagerAdapter{

        @Override
        public int getCount() {
            return Integer.MAX_VALUE;
        }

        @Override
        public boolean isViewFromObject(View arg0, Object arg1) {
            return arg0 == arg1;
        }

        @Override
        public void destroyItem(View container, int position, Object object) {
            ((ViewPager)container).removeView(mImageViews[position % mImageViews.length]);

        }

        /**
         * 载入图片进去，用当前的position 除以 图片数组长度取余数是关键
         */
        @Override
        public Object instantiateItem(View container, int position) {
            ((ViewPager)container).addView(mImageViews[position % mImageViews.length], 0);
            return mImageViews[position % mImageViews.length];
        }



    }

    @Override
    public void onPageScrollStateChanged(int arg0) {

    }

    @Override
    public void onPageScrolled(int arg0, float arg1, int arg2) {

    }

    @Override
    public void onPageSelected(int arg0) {
        setImageBackground(arg0 % mImageViews.length);
    }

    /**
     * 设置选中的tip的背景
     * @param selectItems
     */
    private void setImageBackground(int selectItems){
        for(int i=0; i<tips.length; i++){
            if(i == selectItems){
                tips[i].setBackgroundResource(R.drawable.page_indicator_focused);
            }else{
                tips[i].setBackgroundResource(R.drawable.page_indicator_unfocused);
            }
        }
    }

}