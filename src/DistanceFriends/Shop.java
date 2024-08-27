package DistanceFriends;

public class Shop extends Dealer {
    double boostMRP = 100;
    double boostSellingPrice = 98;

    Shop(double boostMRP) {
        super(boostMRP);
        System.out.println(this.boostMRP);
        System.out.println(super.boostMRP);
    }

    public static void main(String[] args) {
        Shop shop = new Shop(110);
    }
}
