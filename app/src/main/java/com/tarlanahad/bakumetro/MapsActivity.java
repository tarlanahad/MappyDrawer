package com.tarlanahad.bakumetro;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.tarlanahad.mappydrawer.MappyDrawer.MappyDrawer;
import com.tarlanahad.mappydrawer.MappyDrawer.Route;
import com.tarlanahad.mappydrawer.MappyDrawer.TravelMode;


public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {

        mMap = googleMap;

        mMap.setMapStyle(MapStyleOptions.loadRawResourceStyle(this, R.raw.map_style));

        LatLng origin = new LatLng(40.379570, 49.848762);
        LatLng destination = new LatLng(40.417589, 49.934182);

        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(origin, 12));

        new MappyDrawer(mMap)
                .travelMode(TravelMode.TRANSIT)
                .setRoute(new Route(origin, destination).setPathColor(Color.parseColor("#FFFFFF")))
                .draw();

    }


}
