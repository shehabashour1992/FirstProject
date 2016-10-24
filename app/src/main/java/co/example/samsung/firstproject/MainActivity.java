package co.example.samsung.firstproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    @Override
    // onCreate is executed when the activity is created
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        // Sets the file activity_main.xml as the user interface
        setContentView(R.layout.activity_main);

        // To be able to edit the TextView with our code we have to create it and bind it to a TextView object.
        //I need to use final because it will be used in the inner class below.
        final TextView firstTextView =(TextView)findViewById(R.id.textView);

        // I set up the Button just like I did the TextView
        Button firstButton=(Button) findViewById(R.id.firstButton);

        // This is how you make the Button change the text in the TextView when it is clicked
        firstButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                firstTextView.setText("You Clicked");
            }
        }
        );
    }
}



