package org.example.facade;

import com.google.maps.*;
import com.google.maps.model.*;

public class GoogleMapsAPI {
    private static final GeoApiContext context;

    static {
        context = new GeoApiContext.Builder()
                .apiKey("Your_API_Key")
                .build();
    }

    public static void getPlaceData(String keyword, String place) {
        LatLng location = null;
        try {
            GeocodingResult[] results = GeocodingApi.geocode(context, place).await();
            if (results.length > 0) {
                GeocodingResult result = results[0];
                location = result.geometry.location;
            }

            int radius = 500;
            PlacesSearchResponse response = PlacesApi.nearbySearchQuery(context, location)
                    .radius(radius)
                    .keyword(keyword)
                    .await();

            for (PlacesSearchResult result : response.results) {
                System.out.println("Name: " + result.name);
                System.out.println("Rating: " + result.rating);
                System.out.println("Is open now?: " + result.openingHours.openNow);
                assert location != null;
                System.out.println("Distance: " + distance(location.lat, location.lng, result.geometry.location.lat, result.geometry.location.lng) + " m");
                System.out.println("------------------------------------");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String calculateTravelTimeAndDistance(String startPoint, String endPoint) {
        DirectionsApiRequest request = DirectionsApi.newRequest(context)
                .origin(startPoint)
                .destination(endPoint);

        try {
            DirectionsResult result = request.await();
            if (result.routes.length > 0) {
                DirectionsLeg leg = result.routes[0].legs[0];
                Duration duration = leg.duration;
                Distance distance = leg.distance;
                return "Distance: " + distance + ". Travel Time: " + duration.humanReadable + "\n";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Time and distance cannot be calculated\n";
    }

    private static double distance(double lat1, double lng1, double lat2, double lng2) {
        double earthRadius = 6371; // Радіус Землі в кілометрах

        double dLat = Math.toRadians(lat2 - lat1);
        double dLng = Math.toRadians(lng2 - lng1);

        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2)
                + Math.cos(Math.toRadians(lat1))
                * Math.cos(Math.toRadians(lat2))
                * Math.sin(dLng / 2) * Math.sin(dLng / 2);

        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        return earthRadius * c * 1000; // Переведення в метри
    }
}
