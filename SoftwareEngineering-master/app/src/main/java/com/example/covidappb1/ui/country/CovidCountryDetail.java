package com.example.covidappb1.ui.country;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.covidappb1.R;

public class CovidCountryDetail extends AppCompatActivity {

    TextView tvDetailCountryName, tvDetailTotalCases, tvDetailTodayCases, tvDetailTotalDeaths,
            tvDetailTodayDeaths, tvDetailTotalRecovered, tvDetailTotalActive, tvDetailTotalCritical;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_covid_country_detail);

        tvDetailCountryName = findViewById(R.id.tvDetailCountryName);
        tvDetailTotalCases = findViewById(R.id.tvDetailTotalCases);

        tvDetailTotalDeaths = findViewById(R.id.tvDetailTotalDeaths);

        tvDetailTotalRecovered = findViewById(R.id.tvDetailTotalRecovered);



        CovidCountry covidCountry = getIntent().getParcelableExtra("Extra_Covid");

        tvDetailCountryName.setText(covidCountry.getmCovidCountry());
        String test2;
        test2 = Integer.toString(covidCountry.getmCases());
        tvDetailTotalCases.setText(test2);

        tvDetailTotalDeaths.setText(covidCountry.getmDeaths());

        tvDetailTotalRecovered.setText(covidCountry.getmRecovered());



    }
}
