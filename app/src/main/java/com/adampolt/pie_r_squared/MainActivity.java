package com.adampolt.pie_r_squared;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Get variables for all the views we created in our layout file
        Button submitButton = findViewById(R.id.submit);
        final EditText inputText = findViewById(R.id.input);
        final TextView resultView = findViewById(R.id.result);

        //Add an onClickListener to the submit button
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Get the value from the input EditText
                String inputValue = String.valueOf(inputText.getText());

                //Convert to a Double
                double inputValueAsDouble = Double.parseDouble(inputValue);

                //Take the (value / 2)^2 * Pi and store it in a variable
                double result = Math.PI * (inputValueAsDouble / 2) * (inputValueAsDouble / 2); //Alternatively, you can do: double result = Math.Pi * Math.pow(inputValueAsDouble / 2, 2);

                //Show the result in resultView
                resultView.setText("The pizza is " + String.valueOf(result) + " square inches");
            }
        });
    }
}









