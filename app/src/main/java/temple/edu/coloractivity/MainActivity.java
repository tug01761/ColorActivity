package temple.edu.coloractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    String[] colors={"Red", "Blue", "Yellow", "Purple", "Orange", "Gray"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = (Spinner) findViewById(R.id.mySpinner);
        spinner.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id)
    {

    }
}
