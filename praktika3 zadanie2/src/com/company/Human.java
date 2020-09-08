package com.company;

public class Human {
    private Hand hand = new Hand();
    private Head head = new Head();
    private Leg leg = new Leg();

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    private int tall;

    public int getTall() {
        return tall;
    }

    public void setTall(int tall) {
        this.tall = tall;
    }

    @Override
    public String toString() {
        return "Human{" +
                "hand=" + hand +
                ", head=" + head +
                ", leg=" + leg +
                ", tall=" + tall +
                '}';
    }
}
