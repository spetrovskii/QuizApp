package com.example.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score;

    boolean answer1 = false;
    boolean answer2 = false;
    boolean answer3 = false;
    boolean answer4 = false;

    RadioButton radioButton1;
    RadioButton radioButton2;
    RadioButton radioButton3;
    RadioButton radioButton4;
    RadioButton radioButton5;
    RadioButton radioButton6;

    CheckBox checkBox1;
    CheckBox checkBox2;
    CheckBox checkBox3;
    CheckBox checkBox4;

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioButton1 = findViewById(R.id.radio_yes);
        radioButton2 = findViewById(R.id.radio_no);
        radioButton3 = findViewById(R.id.new_krypton);
        radioButton4 = findViewById(R.id.warworld);
        radioButton5 = findViewById(R.id.krypton);
        radioButton6 = findViewById(R.id.argo_city);

        checkBox1 = findViewById(R.id.calvin);
        checkBox2 = findViewById(R.id.daniels);
        checkBox3 = findViewById(R.id.nixon);
        checkBox4 = findViewById(R.id.obama);

        editText = findViewById(R.id.editText);

    }

    /**
     * This method checks the answers of the questions.
     */


    public void checkQuestions() {

        /* Checks the first question if it's answered correctly. */

        if (radioButton1.isChecked()) {

            answer1 = true;
            score++;

        }

        /* Checks the second question if it's answered correctly. */

        if (checkBox1.isChecked() && checkBox3.isChecked() && checkBox4.isChecked() && !checkBox2.isChecked()) {

            answer2 = true;
            score++;

        }

        /* Checks the third question if it's answered correctly. */

        String answer = editText.getText().toString();

        if (answer.equals("Mercury") || answer.equals("mercury")) {

            answer3 = true;
            score++;

        }

        /* Checks the fourth question if it's answered correctly. */

        if (radioButton5.isChecked()) {

            answer4 = true;
            score++;

        }

    }

    /**
     * This method is for the Result button.
     */

    public void resultClicked(View view) {

        checkQuestions();

        if (answer1 && answer2 && answer3 && answer4) {

            Toast toast = Toast.makeText(getApplicationContext(), "Congratulations ! Your score is: " + score + "/4", Toast.LENGTH_SHORT);
            toast.show();

        } else {

            Toast toast = Toast.makeText(getApplicationContext(), "Your score is: " + score + "/4", Toast.LENGTH_SHORT);
            toast.show();


        }

        resetApp();

    }

    /**
     * This method resets the answers, so you can answer again the questions.
     */

    public void resetApp() {

        score = 0;

        answer1 = false;
        answer2 = false;
        answer3 = false;
        answer4 = false;

        radioButton1.setChecked(false);
        radioButton2.setChecked(false);
        radioButton3.setChecked(false);
        radioButton4.setChecked(false);
        radioButton5.setChecked(false);
        radioButton6.setChecked(false);

        checkBox1.setChecked(false);
        checkBox2.setChecked(false);
        checkBox3.setChecked(false);
        checkBox4.setChecked(false);

        editText.getText().clear();

    }

}


