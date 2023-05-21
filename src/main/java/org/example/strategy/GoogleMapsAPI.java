package org.example.strategy;

import com.google.maps.DirectionsApi;
import com.google.maps.DirectionsApiRequest;
import com.google.maps.GeoApiContext;
import com.google.maps.model.*;

public class GoogleMapsAPI {
    public static final GeoApiContext context;
    public static String startPoint;
    public static String endPoint;
    public static TravelMode travelMode;

    static {
        context = new GeoApiContext.Builder()
                .apiKey("Your_API_key")
                .build();
        startPoint = "Kyiv";
        endPoint = "Lviv";
        travelMode = TravelMode.DRIVING;
    }

    public static String calculateWayTime() {
        DirectionsApiRequest request = DirectionsApi.newRequest(context)
                .origin(startPoint)
                .destination(endPoint)
                .mode(travelMode);

        try {
            DirectionsResult result = request.await();
            if (result.routes.length > 0) {
                DirectionsLeg leg = result.routes[0].legs[0];
                Duration duration = leg.duration;
                Distance distance = leg.distance;
                return travelMode.name() + ": Distance: " + distance + ". Travel Time: " + duration.humanReadable + "\n";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return travelMode.name() + ": Time and distance cannot be calculated\n";
    };

}
