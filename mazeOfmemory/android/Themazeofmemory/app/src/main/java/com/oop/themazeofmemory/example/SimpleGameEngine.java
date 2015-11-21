package com.oop.themazeofmemory.example;

import android.app.Activity;
import android.os.Bundle;

public class SimpleGameEngine extends Activity {
 
    // gameView will be the view of the game
    // It will also hold the logic of the game
    // and respond to screen touches as well
    SimpleGameView gameView;
 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
 
        // Initialize gameView and set it as the view
        gameView = new SimpleGameView(this);
        setContentView(gameView);
 
    }
 
    // GameView class will go here    
 
    // Here is our implementation of GameView
    // It is an inner class.
    // Note how the final closing curly brace }
    // is inside SimpleGameEngine

    // This is the end of our GameView inner class
 
    // More SimpleGameEngine methods will go here
 
    // This method executes when the player starts the game
    @Override
    protected void onResume() {
        super.onResume();
 
        // Tell the gameView resume method to execute
        gameView.resume();
    }
 
    // This method executes when the player quits the game
    @Override
    protected void onPause() {
        super.onPause();
 
        // Tell the gameView pause method to execute
        gameView.pause();
    }
 
}