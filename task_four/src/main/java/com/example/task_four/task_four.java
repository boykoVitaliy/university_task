package com.example.task_four;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class task_four extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.check_box_test);
    }

    public boolean onCheckOne(View view){
        CheckBox check = findViewById(R.id.checkBoxOne);
        boolean isCheck = check.isChecked();
        return isCheck;
    }
    public boolean onCheckTwo(View view){
        CheckBox check = findViewById(R.id.checkBoxTwo);
        boolean isCheck2 = check.isChecked();
        return isCheck2;
    }

    private String inCheckBox (View view){
        String result;
        if(onCheckOne(view)){
            result="Wrong its yellow";
        }
        else if (onCheckTwo(view)){
            result="Yes is blue";
        }
        else{
            result="No-No-No its green. Stupid!!!";
        }
        return result;
    }
    public void gustClick(View view) {
        ImageView beforeImageView = (ImageView)
                findViewById(R.id.click_button);
        beforeImageView.setImageResource(R.drawable.attention);
        TextView statusInitialTextView = (TextView)
                findViewById(R.id.status_text_view);
        statusInitialTextView.setText(inCheckBox(view) );
    }

}