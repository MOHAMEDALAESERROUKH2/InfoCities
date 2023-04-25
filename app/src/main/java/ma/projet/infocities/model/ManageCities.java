package ma.projet.infocities.model;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Objects;

import ma.projet.infocities.R;

public class ManageCities {

    private Hashtable<String, ArrayList<City>> cities = new Hashtable<String, ArrayList<City>>();

    public void manageCities() {
        ArrayList<City> maroc = new ArrayList<City>();
        ArrayList<City> algerie = new ArrayList<City>();

        maroc.add(new City(
                "Casablanca",
                "Maroc",
                4_270_750L,
                R.drawable.casablanca,
                R.string.casaSmallDesc,
                R.string.casaFullDesc,
                R.string.casaWebSite
        ));

        maroc.add(new City(
                "Rabat",
                "Maroc",
                577_827L,
                R.drawable.rabat,
                R.string.rabatSmallDesc,
                R.string.rabatFullDesc,
                R.string.siteRabat
        ));

        maroc.add(new City(
                "Tanger",
                "Maroc",
                947_952L,
                R.drawable.tanger,
                R.string.tangerSmallDesc,
                R.string.tangerFullDesc,
                R.string.siteTanger
        ));

        maroc.add(new City(
                "Oujda",
                "Maroc",
                410_000L,
                R.drawable.oujda,
                R.string.oujdaSmallDesc,
                R.string.oujdaFullDesc,
                R.string.siteOujda
        ));

        maroc.add(new City(
                "Meknès",
                "Maroc",
                410_000L,
                R.drawable.meknes,
                R.string.meknesSmallDesc,
                R.string.meknesFullDesc,
                R.string.siteMeknes
        ));

        maroc.add(new City(
                "Meknès",
                "Maroc",
                410_000L,
                R.drawable.meknes,
                R.string.meknesSmallDesc,
                R.string.meknesFullDesc,
                R.string.siteMeknes
        ));

        cities.put("Maroc", maroc);

        algerie.add(new City(
                "Oran",
                "Algerie",
                609_940L,
                R.drawable.oran,
                R.string.oranSmallDesc,
                R.string.oranFullDesc,
                R.string.siteOran
        ));

        algerie.add(new City(
                "Alger",
                "Algerie",
                8_000_000L,
                R.drawable.alger,
                R.string.algerSmallDesc,
                R.string.algerFullDesc,
                R.string.siteAlger
        ));

        cities.put("Algerie", algerie);
    }

    public City getCityByCountry(String country, int position) {
        if (position < cities.get(country).size()){
            return cities.get(country).get(position);
        } else {
            return null;
        }
    }

    public int countCitiesById(String country) {return cities.get(country).size();}

}
