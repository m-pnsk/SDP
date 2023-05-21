package org.example.strategy;

import org.example.strategy.impl.CarWayService;
import org.example.strategy.impl.PedestrianWayService;
import org.example.strategy.impl.PublicTransportWayService;

public class StrategyMain {
    public static void main(String[] args) {
        String startPoint = "Kyiv";
        String endPoint = "Lviv";
        System.out.println(getWayTime("On foot", startPoint, endPoint).calculateWayTime());
    }

    public static WayService getWayTime(String tripType, String startPoint, String endPoint) {
        GoogleMapsAPI.startPoint = startPoint;
        GoogleMapsAPI.endPoint = endPoint;
        return switch (tripType) {
            case "On foot" -> new PedestrianWayService();
            case "Public transport" -> new PublicTransportWayService();
            case "Car", default -> new CarWayService();
        };
    }
}
