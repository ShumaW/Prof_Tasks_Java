package org.example;

import lombok.*;

import java.util.Random;

@Getter
@Setter
public class Account {

    private String id;
    private boolean status = true;
    private Zone zone;
    private double balance;

    public Account(boolean status, Zone zone, double balance) {
        if (balance < 0){
            throw new IllegalArgumentException();
        }
        this.id = generateId(6);
        this.status = status;
        this.zone = zone;
        this.balance = balance;
    }

    public Account() {
        this.id = generateId(6);
        this.zone = Zone.ZONE_1;
        this.balance = 0.00;
    }

    public boolean getStatus() {
        return status;
    }

    public enum Zone {
        ZONE_1,
        ZONE_2,
        ZONE_3
    }

    private static String generateId(int length) {
        int leftLimit = 97;
        int rightLimit = 122;
        Random random = new Random();

        return random.ints(leftLimit, rightLimit + 1)
                .limit(length)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }
}
