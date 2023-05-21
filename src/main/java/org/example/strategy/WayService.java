package org.example.strategy;

import com.google.maps.DirectionsApi;
import com.google.maps.DirectionsApiRequest;
import com.google.maps.GeoApiContext;
import com.google.maps.model.*;

public interface WayService {
    String calculateWayTime();
}
