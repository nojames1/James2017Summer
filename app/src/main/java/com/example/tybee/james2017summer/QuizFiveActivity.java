package com.example.tybee.james2017summer;


import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.example.tybee.james2017summer.util.UtilLog;

import butterknife.BindView;
import butterknife.ButterKnife;

public class QuizFiveActivity extends BaseActivity implements View.OnTouchListener {

    private GestureDetector mGD;
    private Animation forward;
    private Animation backwards;
    private  Animation invscale;

    @BindView(R.id.anim_tv_q5)
    TextView textView;
    @BindView(R.id.invis_view)
    TextView invisT;

    private int location =0;
    private int sumX = 0;
    private int sumY = 0;
    private boolean swiped = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_five);
        ButterKnife.bind(this);
        mGD = new GestureDetector(this, new QuizFiveActivity.sgListener());
        textView.setOnTouchListener(this);
        textView.setFocusable(true);
        textView.setClickable(true);
        textView.setLongClickable(true);
        invisT.setOnTouchListener(this);
        invisT.setFocusable(true);
        invisT.setClickable(true);
        invisT.setLongClickable(true);
        initialAnimation();
    }

    private void initialAnimation() {

        forward = AnimationUtils.loadAnimation(this, R.anim.anim_forward);
        backwards = AnimationUtils.loadAnimation(this, R.anim.anim_backwards);
        invscale = AnimationUtils.loadAnimation(this, R.anim.anim_invisscale);

    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        return mGD.onTouchEvent(event);
    }
    public void trans() {
     textView.startAnimation(forward);

    }
    public void reversetrans() {
        textView.startAnimation(backwards);
    }

private class sgListener extends GestureDetector.SimpleOnGestureListener{

    public sgListener() {
        super();
    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        return super.onSingleTapUp(e);
    }

    @Override
    public void onLongPress(MotionEvent e) {
        super.onLongPress(e);
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        sumX +=distanceX;
        sumY +=distanceY;


        return super.onScroll(e1, e2, distanceX, distanceY);
    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        if(!swiped) {
            if (e1.getX() < 100) {
                if (sumX < 0) {
                    if (Math.abs(sumX) > 50) {
                        shortToast("left to right");
                        trans();
                        swiped = true;
                        UtilLog.d("gesture", e1 + " " + e2);
                    }
                }
            }
        }
        if(swiped) {
            if (sumX > 0) {
                if (Math.abs(sumX) > 50) {
                    shortToast("right to left");
                    reversetrans();
                    swiped = false;
                }
            }
        }
        return super.onFling(e1, e2, velocityX, velocityY);
    }

    @Override
    public void onShowPress(MotionEvent e) {
        super.onShowPress(e);
    }

    @Override
    public boolean onDown(MotionEvent e) {
        return super.onDown(e);
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        return super.onDoubleTap(e);
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        return super.onDoubleTapEvent(e);
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        return super.onSingleTapConfirmed(e);
    }

    @Override
    public boolean onContextClick(MotionEvent e) {
        return super.onContextClick(e);
    }
}
}
