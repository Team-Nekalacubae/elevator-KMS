package com.ohgiraffers.elevator;

public class User {

    private int userLayer;
    private final com.ohgiraffers.semiproject.elevator.Elevator elevator = new com.ohgiraffers.semiproject.elevator.Elevator();

    public User() {}

    public User(int userLayer) {
        this.userLayer = userLayer;
    }

    public int getUserLayer() {
        return userLayer;
    }

    public void setUserLayer(int userLayer) {
        this.userLayer = userLayer;
    }

    @Override
    public String toString() {
        return "User{" +
                "userLayer=" + userLayer +
                '}';
    }

    public void inputLayer(int userLayerN) {
        this.userLayer = userLayerN;
        elevator.startMovement(this.userLayer);
    }
    public void moveLayer(int moveLayerN) {
        elevator.movement(moveLayerN);
    }

    public void inputOpen() {
        elevator.doorOpen();
    }

    public void inputClose() {
        elevator.doorClose();
    }

    public void arrive(int moveLayerN) {
        elevator.arriveLayer(moveLayerN);
    }
}
