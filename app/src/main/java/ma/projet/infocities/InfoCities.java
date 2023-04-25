package ma.projet.infocities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import ma.projet.infocities.model.City;

public class InfoCities extends AppCompatActivity {

    TextView infoTextView;
    Button siteWebBtn;
    Button exitBtn;
    TextView header;

    City currentCity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_cities);

        infoTextView = findViewById(R.id.infoTextView);
        siteWebBtn = findViewById(R.id.siteWebBtn);
        exitBtn = findViewById(R.id.exitBtn);
        header = findViewById(R.id.countryName);

        Intent intent = getIntent();
        currentCity = (City) intent.getSerializableExtra("city");

        header.setText(currentCity.getCountry());
        infoTextView.setText(currentCity.getFullDesc());

        exitBtn.setOnClickListener(v -> {
            finish();
        });

        siteWebBtn.setOnClickListener(v -> {
            Uri url = Uri.parse(getString(currentCity.getSite()));
            Intent intent2 = new Intent(Intent.ACTION_VIEW, url);
            startActivity(intent2);
        });


    }
}