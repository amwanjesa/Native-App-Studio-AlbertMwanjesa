package com.example.albert.albertpset1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;

public abstract class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private CheckBox arms, body, ears, brows, eyes, glass, hat, mouth, mustache, nose, shoes;


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
        }
    }
}
