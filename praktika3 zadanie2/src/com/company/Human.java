package com.company;

public class Human {
    private Hand hand1 = new Hand();
    private Hand hand2 = new Hand();
    private Head head = new Head();
    private Leg leg1 = new Leg();
    private Leg leg2 = new Leg();

    public Hand getHand1() {
        return hand;
    }

    public Hand getHand2() {
        return hand;
    }
    
    public void setHand1(Hand hand) {
        this.hand = hand;
    }

    public void setHand2(Hand hand) {
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

    
    public Leg getLeg1() {
        return leg;
    }
    
    
    public Leg getLeg2() {
        return leg;
    }
    
    public void setLeg1(Leg leg) {
        this.leg = leg;
    }

    public void setLeg2(Leg leg) {
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
