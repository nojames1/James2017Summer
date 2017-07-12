package com.example.tybee.james2017summer.dialog;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.RadioGroup;

import com.example.tybee.james2017summer.R;
import com.example.tybee.james2017summer.util.UtilLog;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by tybee on 7/3/2017.
 */

public class QuizDialog extends Dialog {

    private final ICustomDialogListner listener;

    @BindView(R.id.quizrg)RadioGroup rg;

    private int foundID = 0;

    public String chosen;


    public interface ICustomDialogListner{
        public void onOkClick(String msg);
    }

    private String chosen(){
        String picked="";
        if(foundID==1)
            picked="yes";
        if (foundID==2)
            picked="no";
        if(foundID==3)
            picked="kill";


        return picked;
    }

    @OnClick(R.id.quiz2_ok)
    public void ok(View view){
       chosen = chosen();
        if(chosen!="kill"){
        listener.onOkClick("you clicked " + chosen );
        cancel();
        }else{
            System.exit(1);
        }






    }
    @OnClick(R.id.quiz2_cancel)
    public void cancel(View view){

        cancel();
    }
    public QuizDialog(@NonNull Context context, ICustomDialogListner listner) {
        super(context, R.style.dialog);
        setContentView(R.layout.dialog_quiz);
        ButterKnife.bind(this);
        this.listener = listner;

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {

                foundID = checkedId;
                UtilLog.d("quiz", foundID+"");
            }
        });
    }
}