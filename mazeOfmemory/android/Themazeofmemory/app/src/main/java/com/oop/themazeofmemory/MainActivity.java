package com.oop.themazeofmemory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button_start;
    private Button button_option;
    private Button button_quit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_start = (Button)findViewById(R.id.button_start);
        button_option = (Button)findViewById(R.id.button_option);
        button_quit = (Button)findViewById(R.id.button_quit);



    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    public void onButtonClicked(View view) {
        int id = view.getId();
        switch (id){
            case R.id.button_start:
                Intent intent = new Intent(this, GameActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_left);
                break;
            case R.id.button_option:
                break;
            case R.id.button_quit:
                finish();
                break;
        }
    }

}
