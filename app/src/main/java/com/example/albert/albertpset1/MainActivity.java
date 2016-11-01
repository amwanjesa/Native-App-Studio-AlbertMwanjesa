package com.example.albert.albertpset1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.arms:
                if (checked)
                // Put some meat on the sandwich
                else
                // Remove the meat
                break;
            case R.id.body:
                if (checked)
                // Cheese me
                else
                // I'm lactose intolerant
                break;
            case R.id.ears:
                if (checked)
                // Cheese me
                else
                // I'm lactose intolerant
                break;
            case R.id.brows:
                if (checked)
                // Cheese me
                else
                // I'm lactose intolerant
                break;
            case R.id.eyes:
                if (checked)
                // Cheese me
                else
                // I'm lactose intolerant
                break;
            case R.id.glass:
                if (checked)
                // Cheese me
                else
                // I'm lactose intolerant
                break;
            case R.id.hat:
                if (checked)
                // Cheese me
                else
                // I'm lactose intolerant
                break;
            case R.id.mouth:
                if (checked)
                // Cheese me
                else
                // I'm lactose intolerant
                break;
            case R.id.mustache:
                if (checked)
                // Cheese me
                else
                // I'm lactose intolerant
                break;
            case R.id.nose:
                if (checked)
                // Cheese me
                else
                // I'm lactose intolerant
                break;
            case R.id.shoes:
                if (checked)
                // Cheese me
                else
                // I'm lactose intolerant
                break;
        }
    }
}
