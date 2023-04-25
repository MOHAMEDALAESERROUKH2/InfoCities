package ma.projet.infocities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText inputCountry;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button startBtn = findViewById(R.id.startBtn);
        inputCountry = findViewById(R.id.inputCountry);

        startBtn.setOnClickListener(view -> {
            String country = inputCountry.getText().toString().trim();
            Toast.makeText(this, "Country Name " + country, Toast.LENGTH_LONG).show();
            startExploring(country);
        });
    }

    public void startExploring(String name) {
        Intent intent = new Intent(this, CityActivity.class);
        intent.putExtra("country", name);
        startActivity(intent);
    }
}