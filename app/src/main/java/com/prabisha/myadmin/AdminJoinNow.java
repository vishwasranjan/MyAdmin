package com.prabisha.myadmin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AdminJoinNow extends AppCompatActivity {
    EditText admin_phone_number,admin_password_input,admin_confirm_password_input;
    Button admin_create_account;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_join_now);
        admin_phone_number=findViewById(R.id.admin_phone_number_input);
        admin_password_input=findViewById(R.id.admin_password_input);
        admin_confirm_password_input=findViewById(R.id.admin_confirm_password_input);
        admin_create_account=findViewById(R.id.create_account);

        admin_create_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AdminJoinNow.this,AdminCategoryActivity.class);
                startActivity(intent);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
            }
        });
    }
}