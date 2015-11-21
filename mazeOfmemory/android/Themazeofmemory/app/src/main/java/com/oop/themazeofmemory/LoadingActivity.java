package com.oop.themazeofmemory;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.ProgressBar;

public class LoadingActivity extends AppCompatActivity {

    private ProgressBar mProgress;
    private int mProgressStatus = 0;

    private Handler mHandler = new Handler();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_loading);

        mProgress = (ProgressBar) findViewById(R.id.progressBar);

        new LoadingTask().execute();

    }

    private class LoadingTask extends AsyncTask<String, Integer, Integer> {

        @Override
        protected Integer doInBackground(String... params) {
            while (mProgressStatus < 100) {
                mProgressStatus += 1;
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                // Update the progress bar
                mHandler.post(new Runnable() {
                    public void run() {
                        mProgress.setProgress(mProgressStatus);
                    }
                });
            }
            return 0;
        }

        @Override
        protected void onPostExecute(Integer integer) {
            onLoadingComplete();
        }
    }

    protected void onLoadingComplete() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_left);
    }

}
