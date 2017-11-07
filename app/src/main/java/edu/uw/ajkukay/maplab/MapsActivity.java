package edu.uw.ajkukay.maplab;

import android.graphics.Color;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng fountainCenter = new LatLng(47.653805,  -122.307804);
        mMap.addMarker(new MarkerOptions()
                .position(fountainCenter)
                .title("Drumheller Fountain")
                .snippet("The fountain is home to a vibrant duck community." +
                        "The duck community even has its own duck ramp to get in and out of the fountain easier")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));
        PolylineOptions bigWOptions = new PolylineOptions()
                .add(fountainCenter)//middle
                .add(new LatLng(47.6536032,-122.3076877)) //1
                .add(new LatLng(47.6536176,-122.3074758)) //2
                .add(new LatLng(47.6539248,-122.3073980)) //3
                .add(new LatLng(47.6539302,-122.3072773)) //4
                .add(new LatLng(47.6540332,-122.3072800)) //5
                .add(new LatLng(47.6540332,-122.3076394)) //6
                .add(new LatLng(47.6539302,-122.3076367)) //7
                .add(new LatLng(47.6539320,-122.3075348)) //8
                .add(new LatLng(47.6537603,-122.3076019)) //9
                .add(new LatLng(47.6540458,-122.3077977)) //10
                .add(new LatLng(47.6540440,-122.3079157)) //11
                .add(new LatLng(47.6537712,-122.3080525)) //12
                .add(new LatLng(47.6539428,-122.3081678)) //13
                .add(new LatLng(47.6539428,-122.3080713)) //14
                .add(new LatLng(47.6540512,-122.3080766)) //15
                .add(new LatLng(47.6540494,-122.3084065)) //16
                .add(new LatLng(47.6539374,-122.3084012)) //17
                .add(new LatLng(47.6539428,-122.3082912)) //18
                .add(new LatLng(47.6536230,-122.3081571)) //19
                .add(new LatLng(47.6536158,-122.3079023)) //20
                .add(fountainCenter)//Completes the W
                .color(Color.rgb(232,211,162));

        Polyline polyline = mMap.addPolyline(bigWOptions);
    }
}
