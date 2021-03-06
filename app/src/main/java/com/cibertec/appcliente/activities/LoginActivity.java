package com.cibertec.appcliente.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.cibertec.appcliente.R;

public class LoginActivity extends AppCompatActivity {
    private static final String TAG = "LOGIN_ACTIVITY";
    private EditText etxtEmail;
    private EditText etxtPassword;
    private Button btnLogin;
    private Context context;

    public static final String EXTRA_USUARIO="com.cibertec.appcliente.activities.EXTRA_USUARIOLOGEADO";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        inicializarControles();
    }
    private void inicializarControles() {
        etxtEmail=findViewById(R.id.etxtEmailLogin);
        etxtPassword=findViewById(R.id.etxtPasswordLogin);
        btnLogin=findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //openActivity();
                Toast.makeText(getApplicationContext(), "Abrir la siguiente Activity", Toast.LENGTH_SHORT).show();
                Log.i(TAG, "onClick: ");
            }
        });
    }

    private void openActivity() {

    }
}
