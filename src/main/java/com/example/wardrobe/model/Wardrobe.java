package com.example.wardrobe.model;

public class Wardrobe {

    private String name;
    private int health;
    private boolean isBroken;
    private boolean isOpen;
    private boolean isInside;
    private String status;

    public Wardrobe(String name) {
        this.health = 100;
        this.name = name;
        this.isBroken = false;
        this.isOpen = false;
        this.isInside = false;
    }

    public Wardrobe(){

    }
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isBroken() {
        return isBroken;
    }

    public void setBroken(boolean broken) {
        isBroken = broken;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public boolean isInside() {
        return isInside;
    }

    public void setInside(boolean inside) {
        isInside = inside;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
