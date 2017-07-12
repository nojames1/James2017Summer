package com.example.tybee.james2017summer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import butterknife.BindView;
import butterknife.ButterKnife;

public class GesutreActivity extends BaseActivity implements View.OnTouchListener {

    private GestureDetector mGD;

    @BindView(R.id.activity_gesture_tv)
    TextView textView;

    private int location =0;
    private int sumX = 0;
    private int sumY = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gesutre);
        ButterKnife.bind(this);
        mGD = new GestureDetector(this, new simpleGestureListener());
        textView.setOnTouchListener(this);
        textView.setFocusable(true);
        textView.setClickable(true);
        textView.setLongClickable(true);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        return mGD.onTouchEvent(event);

    }
    private class simpleGestureListener extends GestureDetector.SimpleOnGestureListener{

        public simpleGestureListener() {
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
            if(sumX<0){
                if(Math.abs(sumX)>200){
                    shortToast("left to right");
                }
            }
            if(sumX>0){
                if(Math.abs(sumX)>200){
                    shortToast("right to left");
                }
            }
            if(sumY<0){
                if(Math.abs(sumY)>200){
                    shortToast("top to bottom");
                }
            }
            if(sumY>0){
                if(Math.abs(sumY)>200){
                    shortToast("bottom to top");
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
