package org.example.strategy.impl;

import com.google.maps.model.TravelMode;
import org.example.strategy.GoogleMapsAPI;
import org.example.strategy.WayService;

public class PedestrianWayService implements WayService {
    @Override
    public String calculateWayTime() {
        GoogleMapsAPI.travelMode = TravelMode.WALKING;
        return GoogleMapsAPI.calculateWayTime();
    }
}
