package sg.edu.rp.c346.id22025520.mylocalbanks;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnText1;
    Button btnText2;
    Button btnText3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnText1 = findViewById(R.id.button1);
        btnText2 = findViewById(R.id.button2);
        btnText3 = findViewById(R.id.button3);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @SuppressLint("SetTextI18n")
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here.
        int id = item.getItemId();

        if (id == R.id.WebsiteSelection) {
            btnText1.setText("Website");
            btnText2.setText("Website");
            btnText3.setText("Website");

            return true;
        } else if (id == R.id.ContactSelection) {
            btnText1.setText("Contact the bank");
            btnText2.setText("Contact the bank");
            btnText3.setText("Contact the bank");

            return true;
        } else {
            btnText1.setText("Error translation");
            btnText2.setText("Error translation");
            btnText3.setText("Error translation");
        }

        return super.onOptionsItemSelected(item);
    }


}