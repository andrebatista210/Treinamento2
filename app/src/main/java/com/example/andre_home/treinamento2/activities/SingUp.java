package com.example.andre_home.treinamento2.activities;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;

import com.example.andre_home.treinamento2.R;

import butterknife.BindView;
import butterknife.OnClick;

public class SingUp extends AppCompatActivity {

    @BindView(R.id.til_email)  TextInputLayout emailTextInputLayout;
    @BindView(R.id.tie_email)  TextInputEditText emailTextEditLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_up);
    }

    private boolean validate(){
        if(TextUtils.isEmpty(emailTextEditLayout.getText())){
            emailTextInputLayout.setError("Digite um email valido!");
            return false;
        }
        return true;
    }

    @OnClick(R.id.vw_enter)
    public void onEnterClick(View view){
        if(validate()){
            Intent intent = new Intent(this,Tela_Cadastro.class);
            startActivity(intent);
        }
    }

}
