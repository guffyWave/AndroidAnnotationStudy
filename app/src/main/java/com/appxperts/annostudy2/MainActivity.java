package com.appxperts.annostudy2;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity
public class MainActivity extends AppCompatActivity {

    @ViewById
    EditText userNameEditText;
    @ViewById
    LinearLayout myLinearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("GUFRAN", "Inside on create ");
        System.out.println("Added Second Line ");
    }


    @AfterViews
    void calledAfterViewInjection() {
        Log.d("GUFRAN", "calledAfterViewInjection");
    }


    public void clickMe(View v) {
        userNameEditText.setText("Hello Dosto");
        myLinearLayout.setBackgroundColor(Color.RED);
    }


}
