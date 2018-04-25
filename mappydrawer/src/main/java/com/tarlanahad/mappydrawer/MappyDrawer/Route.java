package com.tarlanahad.mappydrawer.MappyDrawer;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by tarlanahad on 4/25/2018.
 */

public class Route {
    private LatLng Start;
    private LatLng End;
    private int pathColor;


    public Route(LatLng start, LatLng end) {
        Start = start;
        End = end;

    }

    public Route setPathColor(int pathColor) {
        this.pathColor = pathColor;
        return this;
    }

    public int getPathColor() {
        return pathColor;
    }

    public LatLng getStart() {
        return Start;
    }

    public LatLng getEnd() {
        return End;
    }




}
