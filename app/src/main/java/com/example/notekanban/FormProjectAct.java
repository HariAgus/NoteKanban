package com.example.notekanban;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.notekanban.Model.DataBaseHelper;

public class FormProjectAct extends AppCompatActivity {

    EditText inputTitle;
    Button btn_save, btn_newList;

    DataBaseHelper db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_project);

        inputTitle = findViewById(R.id.inputTitle);
        btn_save = findViewById(R.id.btn_save);
        btn_newList = findViewById(R.id.btn_newList);

        db = new DataBaseHelper(this);

        btn_newList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showListDialog();
            }
        });


    }

    private void showListDialog() {


    }


}
