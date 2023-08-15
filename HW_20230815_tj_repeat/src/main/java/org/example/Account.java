package org.example;

import lombok.*;

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
        this.id = "000000";
        this.status = status;
        this.zone = zone;
        this.balance = balance;
    }

    public Account() {
        this.id = "000000";
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
}
