package com.example.yuriiostrovskyi.pictureanimator;

import android.animation.Animator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView mLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLogo = (ImageView) findViewById(R.id.logo);

        animator();
    }

    void animator() {
        mLogo.animate().scaleX(0.5f).scaleY(0.5f).setDuration(2000).setListener(new AnListener()).start();
    }

    class AnListener implements Animator.AnimatorListener{

        @Override
        public void onAnimationStart(Animator animation) {

        }

        @Override
        public void onAnimationEnd(Animator animation) {
            mLogo.animate().scaleY(1).scaleX(1).setDuration(2000).setListener(new AListener()).start();
        }

        @Override
        public void onAnimationCancel(Animator animation) {

        }

        @Override
        public void onAnimationRepeat(Animator animation) {

        }
    }

    class AListener implements Animator.AnimatorListener{

        @Override
        public void onAnimationStart(Animator animation) {

        }

        @Override
        public void onAnimationEnd(Animator animation) {
            mLogo.animate().scaleY(0.5f).scaleX(0.5f).setDuration(2000).setListener(new AnListener()).start();
        }

        @Override
        public void onAnimationCancel(Animator animation) {

        }

        @Override
        public void onAnimationRepeat(Animator animation) {

        }
    }

}
