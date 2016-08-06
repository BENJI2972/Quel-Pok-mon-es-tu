package com.lambdacompany.quelpokemonestu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DisplayQuestion extends AppCompatActivity {
    public Question[] Questions = new Question[30];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_question);
    }
    void displayQuestion(){

    }
}
