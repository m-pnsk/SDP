package org.example.strategy.impl;

import com.google.maps.DirectionsApi;
import com.google.maps.DirectionsApiRequest;
import com.google.maps.model.*;
import org.example.strategy.GoogleMapsAPI;
import org.example.strategy.WayService;

public class CarWayService implements WayService {
    @Override
    public String calculateWayTime() {
        GoogleMapsAPI.travelMode = TravelMode.DRIVING;
        return GoogleMapsAPI.calculateWayTime();
    }
}
