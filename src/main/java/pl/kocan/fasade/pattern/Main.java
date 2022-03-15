package pl.kocan.fasade.pattern;

import pl.kocan.fasade.pattern.delivery.DeliveryBoxFacade;

public class Main {

    public static void main(String[] args) {

        DeliveryBoxFacade deliveryBoxFacade = new DeliveryBoxFacade();
        deliveryBoxFacade.pickupPackage();
    }
}
