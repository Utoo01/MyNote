package com.utoo.test.mynote;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.utoo.test.mynote.date.Note;
import com.utoo.test.mynote.date.NoteDBUtil;

import java.util.Date;


/**
 * Created by Asus-pc on 2017/5/11.
 */

public class AddActivity extends AppCompatActivity {
    private Button btnAdd;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);


        btnAdd = (Button) findViewById(R.id.btnSave);
        btnAdd.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                String title = "asdfadsfasd";
                String content = "5241654641321";
                Date date = new Date();
                NoteDBUtil.addNote(AddActivity.this, title, content, date);
            }
        });
    }
}
