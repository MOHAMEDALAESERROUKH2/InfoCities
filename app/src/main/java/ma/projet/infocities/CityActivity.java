package ma.projet.infocities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import ma.projet.infocities.model.City;
import ma.projet.infocities.model.ManageCities;

public class CityActivity extends AppCompatActivity {
    ManageCities manageCities = new ManageCities();
    String countryName;
    int currentPosition = 0;
    City currentCity;

    Button moreInfo;
    Button next;
    Button back;

    ImageView imageCity;
    TextView cityName;
    TextView citySmallDesc;
    TextView cityHab;

    TextView countryNameHeader;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city);

        manageCities.manageCities();

        initialize();


        next.setOnClickListener(v -> {
            if (currentPosition < manageCities.countCitiesById(countryName) - 1)
                currentPosition++;
            else
                Toast.makeText(getApplicationContext(), "Last city in the list", Toast.LENGTH_SHORT).show();
            displayCity();
        });

        back.setOnClickListener(v -> {
            if (currentPosition > 0) {
                currentPosition--;
                displayCity();
            } else {
                finish();
            }
        });

        moreInfo.setOnClickListener(v -> {
            Intent intent = new Intent(this, InfoCities.class);
            intent.putExtra("city", currentCity);
            startActivity(intent);
        });
    }

    private void initialize() {
        countryNameHeader = findViewById(R.id.countryName);
        moreInfo = findViewById(R.id.moreInfo);
        next = findViewById(R.id.next);
        back = findViewById(R.id.back);

        imageCity = findViewById(R.id.imageCity);
        cityName = findViewById(R.id.cityName);
        citySmallDesc = findViewById(R.id.citySmallDesc);
        cityHab = findViewById(R.id.cityHab);

        Intent intent = getIntent();
        countryName = intent.getStringExtra("country");
        if (countryName.equals("")) {
            countryName = "Maroc";
        }

        countryNameHeader.setText(countryName);
        displayCity();
    }

    private void displayCity() {
        currentCity = manageCities.getCityByCountry(countryName, currentPosition);

        imageCity.setImageResource(currentCity.getImageId());
        cityName.setText(currentCity.getName());
        citySmallDesc.setText(currentCity.getSmallDesc());
        cityHab.setText("Habitants : " + currentCity.getHabitats());
    }
}