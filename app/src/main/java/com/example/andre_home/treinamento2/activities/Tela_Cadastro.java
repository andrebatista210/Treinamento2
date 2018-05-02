package com.example.andre_home.treinamento2.activities;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.example.andre_home.treinamento2.R;

import butterknife.OnClick;


public class Tela_Cadastro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_cadastro);
    }

    @OnClick(R.id.vw_back)
    public  void onBackClick(){
        finish();
    }

}
