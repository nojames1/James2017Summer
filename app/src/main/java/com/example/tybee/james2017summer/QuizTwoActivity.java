package com.example.tybee.james2017summer;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.example.tybee.james2017summer.dialog.QuizDialog;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class QuizTwoActivity extends BaseActivity {
    @BindView(R.id.quiz2layout)RelativeLayout rl;

    @OnClick(R.id.showquiz2)
    public void OnClick(View view){

        QuizDialog customDialog = new QuizDialog(this, new QuizDialog.ICustomDialogListner() {
            @Override
            public void onOkClick(String msg) {
                shortToast(msg);
            }
        });

        customDialog.show();
    }


    @OnClick(R.id.showquiz5)
        public void Click(View view){
            Intent i = new Intent(QuizTwoActivity.this, QuizFiveActivity.class);
            startActivity(i);
        }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_to);
        ButterKnife.bind(this);
    }
}
