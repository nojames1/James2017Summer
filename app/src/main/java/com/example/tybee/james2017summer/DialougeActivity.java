package com.example.tybee.james2017summer;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

import com.example.tybee.james2017summer.dialog.CustomDialog;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class DialougeActivity extends BaseActivity{
    private String checkID;
    private int foundID = 0;

    @BindView(R.id.activity_d_group)
    RadioGroup radioGroup;

    @OnClick(R.id.activity_dialouge_ok)
    public void OnClick(View view){
        switch(foundID){
            case R.id.activity_d_btn1:
                break;
            case R.id.activity_d_btn2:
                break;
            case R.id.activity_d_btn3:
                break;
            case R.id.activity_d_btn4:
                break;
            case R.id.activity_d_btn5:
                break;
            case R.id.activity_d_btn6:
                break;
            case R.id.activity_d_btn7:
                break;
            case R.id.activity_d_btn8:
              CustomDialog customDialog = new CustomDialog(this, new CustomDialog.ICustomDialogListner() {
                  @Override
                  public void onOkClick(String msg) {
                      shortToast(msg);
                  }
              });

                customDialog.show();
                break;
            default:
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialouge);
        ButterKnife.bind(this);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                checkID =  " " + checkedId;
                foundID = checkedId;
            }
        });

    }
}
