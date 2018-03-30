package com.tx.mystudytrip.animation;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.tx.mystudytrip.R;

public class FrameActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView imageView;
    private AnimationDrawable animationDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame);

        imageView = (ImageView) findViewById(R.id.imageView);
        findViewById(R.id.start).setOnClickListener(this);
        findViewById(R.id.stop).setOnClickListener(this);

        setXml2FrameAnim1();
        // setXml2FrameAnim2();

    }

    /**
     * 通过XML添加帧动画方法一
     */
    private void setXml2FrameAnim1() {

        // 把动画资源设置为imageView的背景,也可直接在XML里面设置
        imageView.setBackgroundResource(R.drawable.frame_anim);
        animationDrawable = (AnimationDrawable) imageView.getBackground();
    }

    /**
     * 通过XML添加帧动画方法二
     */
    private void setXml2FrameAnim2() {

        // 通过逐帧动画的资源文件获得AnimationDrawable示例
        animationDrawable = (AnimationDrawable) getResources().getDrawable(
                R.drawable.frame_anim);
        imageView.setBackground(animationDrawable);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.start:
                if (animationDrawable != null && !animationDrawable.isRunning()) {
                    animationDrawable.start();
                }
                break;
            case R.id.stop:
                if (animationDrawable != null && animationDrawable.isRunning()) {
                    animationDrawable.stop();
                }
                break;

            default:
                break;
        }
    }

}