package com.tx.mystudytrip;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.tx.mystudytrip.animation.FrameActivity;
import com.tx.mystudytrip.animation.TweenActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn_tween;
    private Button btn_frame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_tween = (Button) findViewById(R.id.btn_tween);
        btn_frame = (Button) findViewById(R.id.btn_frame);

        btn_tween.setOnClickListener(this);
        btn_frame.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_tween:
                startActivity(new Intent(this, TweenActivity.class));
                break;
            case R.id.btn_frame:
                startActivity(new Intent(this, FrameActivity.class));
                break;
            default:

                break;
        }
    }
}
