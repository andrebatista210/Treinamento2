package com.example.andre_home.treinamento2.helpers;

import android.text.TextUtils;
import android.util.Patterns;

public class ValidationHelper {
    public static boolean isEmailValid(String email){
        return !TextUtils.isEmpty(email) && Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }
}
