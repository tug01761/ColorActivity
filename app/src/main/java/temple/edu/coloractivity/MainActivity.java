package temple.edu.coloractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    String[] text={"White", "Red", "Blue", "Yellow", "Purple", "Gray", "Green", "Cyan", "Magenta", "Silver"};
    int[] color={Color.parseColor("white"),
                 Color.parseColor("red"),
                 Color.parseColor("blue"),
                 Color.parseColor("yellow"),
                 Color.parseColor("purple"),
                 Color.parseColor("grey"),
                 Color.parseColor("green"),
                 Color.parseColor("cyan"),
                 Color.parseColor("magenta"),
                 Color.parseColor("silver")};
    View background;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        background = (View) findViewById(R.id.background);

        Spinner spinner = (Spinner) findViewById(R.id.mySpinner);
        spinner.setOnItemSelectedListener(this);

        ColorAdapter colorAdapter = new ColorAdapter(getApplicationContext(), text, color);
        spinner.setAdapter(colorAdapter);

    }

    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
        background.setBackgroundColor(color[position]);
    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {

    }
}
