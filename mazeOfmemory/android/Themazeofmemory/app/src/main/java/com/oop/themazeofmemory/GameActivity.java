package com.oop.themazeofmemory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class GameActivity extends AppCompatActivity {

    private GameView mGLView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_game);

        mGLView =  (GameView)findViewById(R.id.game_view);

        mGLView.setOnTouchListener(new OnSwipeTouchListener(this) {
            public boolean onSwipeTop() {
                return true;
            }

            public boolean onSwipeRight() {
                return true;
            }

            public boolean onSwipeLeft() {
                return true;
            }

            public boolean onSwipeBottom() {
                return true;
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        mGLView.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mGLView.onPause();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_right);
    }
}
