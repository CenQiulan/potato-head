package mg.studio.android.lab001;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView mouth, arms, ears, eyebrows, eyes, glasses, hat, mustache, nose, shoes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mouth = findViewById(R.id.mouth);
        arms = findViewById(R.id.arms);
        ears = findViewById(R.id.ears);
        eyebrows = findViewById(R.id.eyebrows);
        eyes = findViewById(R.id.eyes);
        glasses = findViewById(R.id.glasses);
        hat = findViewById(R.id.hat);
        mustache = findViewById(R.id.mustache);
        nose = findViewById(R.id.nose);
        shoes = findViewById(R.id.shoes);
    }
    public void CheckBox(View v){
        ImageView addView=(ImageView)findViewById(R.id.body);
        switch (v.getId()){
            case R.id.cb_arms:
                addView=(ImageView)findViewById(R.id.arms);
                break;
            case R.id.cb_ears:
                addView=(ImageView)findViewById(R.id.ears);
                break;
            case R.id.cb_eye:
                addView=(ImageView)findViewById(R.id.eyes);
                break;
            case R.id.cb_eyebrow:
                addView=(ImageView)findViewById(R.id.eyebrows);
                break;
            case R.id.cb_glasses:
                addView=(ImageView)findViewById(R.id.glasses);
                break;
            case R.id.cb_hat:
                addView=(ImageView)findViewById(R.id.hat);
                break;
            case R.id.cb_mouth:
                addView=(ImageView)findViewById(R.id.mouth);
                break;
            case R.id.cb_mustache:
                addView=(ImageView)findViewById(R.id.mustache);
                break;
            case R.id.cb_nose:
                addView=(ImageView)findViewById(R.id.nose);
                break;
            case R.id.cb_shoes:
                addView=(ImageView)findViewById(R.id.shoes);
                break;
        }
        if(addView.getId()!=R.id.body){
            setJPG(addView);
        }

    }

    private void setJPG(ImageView iv){
        if (iv.getVisibility()!=View.VISIBLE){
            iv.setVisibility(View.VISIBLE);
        }
        else{
            iv.setVisibility(View.GONE);
        }
    }

    
}
