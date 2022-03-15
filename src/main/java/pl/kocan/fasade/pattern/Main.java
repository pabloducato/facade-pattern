package pl.kocan.fasade.pattern;

import pl.kocan.fasade.pattern.delivery.DeliveryBox;
import pl.kocan.fasade.pattern.delivery.DeliveryBoxSystem;

public class Main {

    public static void main(String[] args) {

        pickupPackage();
    }

    private static void pickupPackage() {

        DeliveryBox deliveryBox = new DeliveryBox();
        DeliveryBoxSystem deliveryBoxSystem = new DeliveryBoxSystem();

        deliveryBox.getUserData();
        if (deliveryBoxSystem.isUserDataValidated() && deliveryBoxSystem.isPaymentSecured()) {
            deliveryBox.openBox();
        }
    }
}
