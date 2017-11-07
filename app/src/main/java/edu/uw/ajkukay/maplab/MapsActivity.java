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
        PolylineOptions iSchoolLogo1 = new PolylineOptions()
                .add(new LatLng(47.6545282,-122.3072854))
                .add(new LatLng(47.6545011,-122.3073605))
                .add(new LatLng(47.6544939,-122.3074517))
                .add(new LatLng(47.6544975,-122.3075858))
                .add(new LatLng(47.6545119,-122.3077038))
                .add(new LatLng(47.6545589,-122.3078755))
                .add(new LatLng(47.6546366,-122.3079935))
                .add(new LatLng(47.6547775,-122.3080686))
                .add(new LatLng(47.6549130,-122.3080578))
                .add(new LatLng(47.6550485,-122.3079050))
                .add(new LatLng(47.6550702,-122.3078205))
                .add(new LatLng(47.6550413,-122.3077923))
                .add(new LatLng(47.6550214,-122.3078607))
                .add(new LatLng(47.6549157,-122.3079881))
                .add(new LatLng(47.6547893,-122.3080069))
                .add(new LatLng(47.6546646,-122.3079412))
                .add(new LatLng(47.6546104,-122.3078392))
                .add(new LatLng(47.6545725,-122.3076877))
                .add(new LatLng(47.6545580,-122.3075791))
                .add(new LatLng(47.6545508,-122.3074584))
                .add(new LatLng(47.6545598,-122.3073739))
                .add(new LatLng(47.6545788,-122.3073108))
                .add(new LatLng(47.6545282,-122.3072854))
                .color(Color.rgb(51,0,111));
        PolylineOptions iSchoolLogo2 = new PolylineOptions()
                .add(new LatLng(47.6552093,-122.3077118))
                .add(new LatLng(47.6550531,-122.3077118))
                .add(new LatLng(47.6550549,-122.3076287))
                .add(new LatLng(47.6552075,-122.3075885))
                .add(new LatLng(47.6552093,-122.3077118))
                .color(Color.rgb(51,0,111));
        PolylineOptions iSchoolLogo3 = new PolylineOptions()
                .add(new LatLng(47.6550567,-122.3075844))
                .add(new LatLng(47.6550540,-122.3075201))
                .add(new LatLng(47.6550377,-122.3074543))
                .add(new LatLng(47.6550124,-122.3073833))
                .add(new LatLng(47.6549718,-122.3073404))
                .add(new LatLng(47.6549203,-122.3072948))
                .add(new LatLng(47.6548742,-122.3072733))
                .add(new LatLng(47.6548272,-122.3072559))
                .add(new LatLng(47.6547694,-122.3072545))
                .add(new LatLng(47.6547324,-122.3073028))
                .add(new LatLng(47.6547152,-122.3073739))
                .add(new LatLng(47.6547179,-122.3074691))
                .add(new LatLng(47.6547369,-122.3075536))
                .add(new LatLng(47.6547811,-122.3076126))
                .add(new LatLng(47.6548390,-122.3076274))
                .add(new LatLng(47.6549058,-122.3076287))
                .add(new LatLng(47.6549618,-122.3076247))
                .add(new LatLng(47.6550151,-122.3076274))
                .add(new LatLng(47.6550223,-122.3077038))
                .add(new LatLng(47.6549989,-122.3077038))
                .add(new LatLng(47.6549329,-122.3077105))
                .add(new LatLng(47.6548995,-122.3077145))
                .add(new LatLng(47.6548426,-122.3077212))
                .add(new LatLng(47.6547857,-122.3077159))
                .add(new LatLng(47.6547360,-122.3076609))
                .add(new LatLng(47.6546953,-122.3075925))
                .add(new LatLng(47.6546718,-122.3074785))
                .add(new LatLng(47.6546646,-122.3073819))
                .add(new LatLng(47.6546800,-122.3072988))
                .add(new LatLng(47.6547224,-122.3072210))
                .add(new LatLng(47.6547866,-122.3071700))
                .add(new LatLng(47.6548832,-122.3071781))
                .add(new LatLng(47.6549419,-122.3072170))
                .add(new LatLng(47.6550106,-122.3072666))
                .add(new LatLng(47.6550531,-122.3073095))
                .add(new LatLng(47.6550865,-122.3074141))
                .add(new LatLng(47.6551145,-122.3075134))
                .add(new LatLng(47.6551271,-122.3075710))
                .add(new LatLng(47.6550567,-122.3075844))
                .color(Color.rgb(51,0,111));

        Polyline polyline = mMap.addPolyline(bigWOptions);
        Polyline polyline2 = mMap.addPolyline(iSchoolLogo1);
        Polyline polyline3 = mMap.addPolyline(iSchoolLogo2);
        Polyline polyline4 = mMap.addPolyline(iSchoolLogo3);
    }
}
