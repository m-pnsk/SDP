package org.example.strategy.impl;

import com.google.maps.model.TravelMode;
import org.example.strategy.GoogleMapsAPI;
import org.example.strategy.WayService;

public class PublicTransportWayService implements WayService {
    @Override
    public String calculateWayTime() {
        GoogleMapsAPI.travelMode = TravelMode.TRANSIT;
        return GoogleMapsAPI.calculateWayTime();
    }
}
