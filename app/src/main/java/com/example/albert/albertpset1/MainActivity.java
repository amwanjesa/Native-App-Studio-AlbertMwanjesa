package com.example.albert.albertpset1;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void clearBoxes(){
        CheckBox arms = (CheckBox) findViewById(R.id.arms);
        unCheckBox(arms);

        CheckBox ears = (CheckBox) findViewById(R.id.ears);
        unCheckBox(ears);

        CheckBox hat = (CheckBox) findViewById(R.id.hat);
        unCheckBox(hat);

        CheckBox brows = (CheckBox) findViewById(R.id.brows);
        unCheckBox(brows);

        CheckBox eyes = (CheckBox) findViewById(R.id.eyes);
        unCheckBox(eyes);

        CheckBox glass = (CheckBox) findViewById(R.id.glass);
        unCheckBox(glass);

        CheckBox mouth = (CheckBox) findViewById(R.id.mouth);
        unCheckBox(mouth);

        CheckBox nose = (CheckBox) findViewById(R.id.nose);
        unCheckBox(nose);

        CheckBox mustache = (CheckBox) findViewById(R.id.mustache);
        unCheckBox(mustache);

        CheckBox shoes = (CheckBox) findViewById(R.id.shoes);
        unCheckBox(shoes);
    }

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        String viewName = view.getResources().getResourceName(view.getId());
        Log.d("MainActivity", "id:" + viewName);
        switch(view.getId()) {
            case R.id.arms:
                ImageView arms = (ImageView) findViewById(R.id.arms_image);
                if (checked){
                    arms.setVisibility(View.VISIBLE);
                }else{
                    arms.setVisibility(View.GONE);
                }
                break;

            case R.id.ears:
                ImageView ears = (ImageView) findViewById(R.id.ears_image);
                if (checked){
                    ears.setVisibility(View.VISIBLE);
                }else{
                    ears.setVisibility(View.GONE);
                }
                break;
                
            case R.id.brows:
                ImageView brows = (ImageView) findViewById(R.id.brows_image);
                if (checked){
                    brows.setVisibility(View.VISIBLE);
                }else{
                    brows.setVisibility(View.GONE);
                }
                break;
                
            case R.id.eyes:
                ImageView eye = (ImageView) findViewById(R.id.eye_image);
                if (checked){
                    eye.setVisibility(View.VISIBLE);
                }else{
                    eye.setVisibility(View.GONE);
                }
                break;
                
            case R.id.glass:
                ImageView glass = (ImageView) findViewById(R.id.glass_image);
                if (checked){
                    glass.setVisibility(View.VISIBLE);
                }else{
                    glass.setVisibility(View.GONE);
                }
                break;
                
            case R.id.hat:
                ImageView hat = (ImageView) findViewById(R.id.hat_image);
                if (checked){
                    hat.setVisibility(View.VISIBLE);
                }else{
                    hat.setVisibility(View.GONE);
                }
                break;
                
            case R.id.mouth:
                ImageView mouth = (ImageView) findViewById(R.id.mouth_image);
                if (checked){
                    mouth.setVisibility(View.VISIBLE);
                }else{
                    mouth.setVisibility(View.GONE);
                }
                break;
                
            case R.id.mustache:
                ImageView mustache = (ImageView) findViewById(R.id.mustache_image);
                if (checked){
                    mustache.setVisibility(View.VISIBLE);
                }else{
                    mustache.setVisibility(View.GONE);
                }
                break;
                
            case R.id.nose:
                ImageView nose = (ImageView) findViewById(R.id.nose_image);
                if (checked){
                    nose.setVisibility(View.VISIBLE);
                }else{
                    nose.setVisibility(View.GONE);
                }
                break;
                
            case R.id.shoes:
                ImageView shoes = (ImageView) findViewById(R.id.shoes_image);
                if (checked){
                    shoes.setVisibility(View.VISIBLE);
                }else{
                    shoes.setVisibility(View.GONE);
                }
                break;
                
        }
    }

    private void unCheckBox(CheckBox box){
        if(box.isChecked()){
            Log.d("Checkbox", Boolean.toString(box.isChecked()));
            box.setChecked(false);
        }
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        clearBoxes();
        setContentView(R.layout.activity_main);
    }
}
