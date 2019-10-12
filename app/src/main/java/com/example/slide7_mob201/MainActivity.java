package com.example.slide7_mob201;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
private ImageView imgGai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgGai=findViewById(R.id.imgGai);
    }

    public void runAnimation(View view) {
        //khoi tao doi tuong anumation Property ANimotion
        ObjectAnimator objectAnimator=ObjectAnimator.ofFloat(imgGai,"scaleX",0f,1f);
        //alpha la nhap nhay

        //dat thoi gian chay
        objectAnimator.setDuration(100);
            objectAnimator.setRepeatCount(1000);

        //chay animation
        objectAnimator.start();
        //khoi tao doi tuong anumation Property ANimotion
        ObjectAnimator objectAnimator1=ObjectAnimator.ofFloat(imgGai,"scaleY",0f,1f);
        //alpha la nhap nhay

        //dat thoi gian chay
        objectAnimator1.setDuration(100);
        objectAnimator1.setRepeatCount(1000);

        //chay animation
        objectAnimator1.start();

        //khoi tao doi tuong anumation Property ANimotion
        ObjectAnimator objectAnimator3=ObjectAnimator.ofFloat(imgGai,"rotation",0f,360f);
        //alpha la nhap nhay

        //dat thoi gian chay
        objectAnimator3.setDuration(1000);
        objectAnimator3.setRepeatCount(1000);

        //chay animation
        objectAnimator3.start();
    }

    public void runAnimationXML(View view) {
        Animator animator= AnimatorInflater.loadAnimator(this,R.animator.my_animator1);
        animator.setTarget(imgGai);
        animator.start();
    }

    public void openActivity(View view) {
        Intent intent=new Intent(MainActivity.this,Main2Activity.class);

        startActivity(intent);
        overridePendingTransition(R.anim.slide_in,R.anim.slide_out);
    }

    public void openMaro(View view) {
        imgGai.setImageResource(R.drawable.animation_list);
        AnimationDrawable animationDrawable=(AnimationDrawable) imgGai.getDrawable();
        animationDrawable.start();

    }
}
