package temple.edu.coloractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    String[] text={"Red", "Blue", "Yellow", "Purple", "Gray"};
    int[] color={Color.parseColor("red"),
                 Color.parseColor("blue"),
                 Color.parseColor("yellow"),
                 Color.parseColor("purple"),
                 Color.parseColor("grey")};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = (Spinner) findViewById(R.id.mySpinner);
        spinner.setOnItemSelectedListener(this);

        ColorAdapter colorAdapter = new ColorAdapter(getApplicationContext(), text, color);
        spinner.setAdapter(colorAdapter);

    }

    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {

    }
}
