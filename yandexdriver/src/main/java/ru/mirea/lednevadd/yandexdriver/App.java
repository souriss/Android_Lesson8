package ru.mirea.lednevadd.yandexdriver;

import android.app.Application;

import com.yandex.mapkit.MapKitFactory;


public class App extends Application {
    private final String MAPKIT_API_KEY = "1e6b8edf-0eea-4853-8fce-350c9eecebce";
    @Override
    public void onCreate() {
        super.onCreate();
        // Set the api key before calling initialize on MapKitFactory.
        MapKitFactory.setApiKey(MAPKIT_API_KEY);
    }
}