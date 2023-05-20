package org.example.facade;

public class FacadeMain {
    public static void main(String[] args) {
        System.out.println(GoogleMapsAPI.calculateTravelTimeAndDistance("Lviv, Ukraine", "Kyiv, Ukraine"));
        GoogleMapsAPI.getPlaceData("АЗК", "проспект Перемоги 82, Kyiv, Ukraine");
    }
}
