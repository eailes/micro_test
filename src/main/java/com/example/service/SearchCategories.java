package com.example.service;

/**
 * User: eailes
 * Created: 2/15/17
 * Time: 4:03 PM
 * Project: micro_test
 */
public enum SearchCategories {
    AGENT("agent"),
    ALLIANCE("alliance"),
    CHARACTER("character"),
    CONSTELLATION("constellation"),
    CORPORATION("corporation"),
    FACTION("faction"),
    INVENTORY_TYPE("inventorytype"),
    REGION("region"),
    SOLAR_SYSTEM("solarsystem"),
    STATION("station"),
    WORMHOLE("wormhole");


    private String value;

    SearchCategories(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
