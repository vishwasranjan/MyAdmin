package com.prabisha.myadmin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class AdminLogin extends AppCompatActivity {
    EditText admin_login_phone_number,admin_login_password;
    Button admin_login;
    TextView admin_forget_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login);
        admin_login_phone_number=findViewById(R.id.admin_login_phone_number_input);
        admin_login_password=findViewById(R.id.admin_login_password_input);
        admin_login=findViewById(R.id.login_btn);
        admin_forget_password=findViewById(R.id.forget_password);

        admin_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AdminLogin.this,AdminCategoryActivity.class);
                startActivity(intent);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
            }
        });
    }
}