/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ich
 */
public class Sender {
    private String sender;
    private double frequenz;
    private String band;
    
    public Sender(String sender, double frequenz, String band) {
        this.sender = sender;
        this.frequenz = frequenz;
        this.band = band;
    }

    public String getBand() {
        return band;
    }

    public double getFrequenz() {
        return frequenz;
    }

    public String getSender() {
        return sender;
    }

    
    
}
