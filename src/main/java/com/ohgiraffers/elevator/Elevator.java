package com.ohgiraffers.elevator;

public class Elevator {

    private boolean isGo;  // 초기에는 임의의 층에 멈춰진 false 상태
    private int layer;
    private boolean isOpen; // 초기에는 문이 닫혀진 false 상태

    public Elevator() {}

    public Elevator(boolean isGo, int layer, boolean isOpen) {
        this.isGo = isGo;
        this.layer = layer;
        this.isOpen = isOpen;
    }

    public boolean isGo() {
        return isGo;
    }

    public void setGo(boolean go) {
        isGo = go;
    }

    public int getLayer() {
        return layer;
    }

    public void setLayer(int layer) {
        this.layer = layer;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    @Override
    public String toString() {
        return "Elevator{" +
                "isGo=" + isGo +
                ", layer=" + layer +
                ", isOpen=" + isOpen +
                '}';
    }

    public void startMovement(int userLayer) {
        this.layer = (int) (Math.random() * 20 + 1); // 1~20층 있다
        if (this.layer > userLayer) {

            System.out.println("엘리베이터가 " + this.layer + "층에 있습니다. 엘리베이터가 아래로 내려갑니다.");
        } else if (this.layer < userLayer) {
            System.out.println("엘리베이터가 " + this.layer + "층에 있습니다. 엘리베이터가 위로 올라갑니다.");

            try {
                System.out.println("엘리베이터가 " + this.layer + "층에 있습니다. 엘리베이터가 아래로 내려갑니다.");
                Thread.sleep(2000);
                System.out.println("엘리베이터가 도착했습니다.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else if (this.layer < userLayer) {
            try {
                System.out.println("엘리베이터가 " + this.layer + "층에 있습니다. 엘리베이터가 위로 올라갑니다.");
                Thread.sleep(2000);
                System.out.println("엘리베이터가 도착했습니다.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        } else {
            System.out.println("엘리베이터가 현재 층에 있습니다.");
        }
    }
    public void movement(int moveLayer) {
        doorClose();

        System.out.println("엘리베이터가 " + moveLayer + "층으로 이동합니다.");

        try {
            System.out.println("엘리베이터가 " + moveLayer + "층으로 이동합니다.");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void doorOpen() {
//        if(!isOpen) {
//            this.isOpen = true;
//            System.out.println("문이 열립니다.");
//        }
        try {
            System.out.println("문이 열립니다.");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void doorClose() {
//        if(isOpen) {
//            this.isOpen = false;
//            System.out.println("문이 닫힙니다.");
//        }

        System.out.println("문이 닫힙니다.");

        try {
            Thread.sleep(100);
            System.out.println("문이 닫힙니다.");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void arriveLayer(int moveLayerN) {

        try {
            System.out.println("엘리베이터가 " + moveLayerN + "층에 도착했습니다.");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        doorOpen();

//        doorOpen();

    }
}
