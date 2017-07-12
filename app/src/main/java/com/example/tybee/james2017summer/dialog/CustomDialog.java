package com.example.tybee.james2017summer.dialog;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;

import com.example.tybee.james2017summer.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by tybee on 6/21/2017.
 *
 *
 */




public class CustomDialog extends Dialog {

    private final ICustomDialogListner listener;

    public interface ICustomDialogListner{
        public void onOkClick(String msg);
    }


    @OnClick(R.id.dialog_custom_btn)
    public void ok(View view){
        listener.onOkClick("you clicked ok");
        cancel();
    }
    public CustomDialog(@NonNull Context context, ICustomDialogListner listner) {
        super(context, R.style.dialog);
        setContentView(R.layout.dialog_custom);
        ButterKnife.bind(this);
        this.listener = listner;
    }
}
