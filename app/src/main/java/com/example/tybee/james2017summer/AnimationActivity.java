package com.example.tybee.james2017summer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class AnimationActivity extends AppCompatActivity {


    @BindView(R.id.activity_animation_tv)TextView textView;
    private Animation alphaAnimation;
    private Animation scaleAnimation;
    private Animation rotateAnimation;
    private Animation transAnimation;
    private Animation setAnimation;

    @OnClick(R.id.activity_animation_btalpha)
    public void alpha(View view){
        textView.startAnimation(alphaAnimation);

    }
    @OnClick(R.id.activity_animation_btscale)
    public void scale(View view){
    textView.startAnimation(scaleAnimation);
    }
    @OnClick(R.id.activity_animation_btrotate)
    public void rotate(View view){
    textView.startAnimation(rotateAnimation);
    }
    @OnClick(R.id.activity_animation_bttrans)
    public void trans(View view){
    textView.startAnimation(transAnimation);
    }
    @OnClick(R.id.activity_animation_btset)
    public void set(View view){
        textView.startAnimation(setAnimation);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);
        ButterKnife.bind(this);
        
        initialAnimation();
    }

    private void initialAnimation() {
        alphaAnimation = AnimationUtils.loadAnimation(this, R.anim.anim_alpha);
        scaleAnimation = AnimationUtils.loadAnimation(this, R.anim.anim_scale);
        rotateAnimation = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
        transAnimation = AnimationUtils.loadAnimation(this, R.anim.anim_trans);
        setAnimation = AnimationUtils.loadAnimation(this, R.anim.anim_set);
    }
}
