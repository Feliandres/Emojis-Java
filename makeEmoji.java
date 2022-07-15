package Emojis;

import javax.swing.*;
import java.awt.*;

public class makeEmoji extends JPanel{
    private int option = 0;

    private void al(Graphics es) {
        super.paintComponent(es);
        this.makeFace(es);
        es.setColor(Color.white);
        es.fillOval(100, 80, 40, 55);
        es.fillOval(135, 80, 40, 55);
        es.setColor(Color.black);
        es.fillOval(110,160,50,20);
    }
    private void makeFace(Graphics f){
        super.paintComponent(f);
        f.setColor(Color.YELLOW);
        f.fillOval(50,50, 175, 175);
    }
    private void makeEmojiFlushed(Graphics ef){
        al(ef);
        ef.fillOval(105, 80, 20, 35);
        ef.fillOval(140, 80, 20, 35);
        ef.setColor(Color.PINK);
        ef.fillOval(73, 145,25,25);
        ef.fillOval(170, 145,25,25);
    }

    private void makeEmojiSurprised(Graphics es){
        al(es);
        es.fillOval(110, 90, 20, 35);
        es.fillOval(145, 90, 20, 35);
    }

    private void makeEmojiEyes(Graphics ee){
        super.paintComponent(ee);
        ee.setColor(Color.WHITE);
        ee.fillOval(85, 70, 88, 135);
        ee.fillOval(130, 70, 88, 135);
        ee.setColor(Color.black);
        ee.fillOval(90, 70, 48, 95);
        ee.fillOval(135, 70, 48, 95);
    }

    private void makeEmojiSweat(Graphics esw){
        super.paintComponent(esw);
        this.makeFace(esw);
        esw.setColor(Color.black);

        esw.drawArc(80,105, 45, 50, 0,180 );
        esw.drawArc(145,105, 45, 50, 0,180 );
        esw.drawArc(107, 165, 50,20, 180,180);
        esw.setColor(Color.CYAN);
        esw.fillOval(170, 50, 20,50);

    }

    private void makeEmojiUpsideDown(Graphics eu){
        super.paintComponent(eu);
        this.makeFace(eu);
        eu.setColor(Color.black);
        eu.drawArc(87,90, 100, 50, 0,180 );
        eu.setColor(Color.WHITE);
        eu.fillOval(100, 130, 40, 55);
        eu.fillOval(135, 130, 40, 55);
        eu.setColor(Color.black);
        eu.fillOval(110, 130, 20, 35);
        eu.fillOval(144, 130, 20, 35);
    }

    private void makeEmojiSerious(Graphics ese){
        super.paintComponent(ese);
        this.makeFace(ese);
        ese.setColor(Color.BLACK);
        ese.fillOval(80,105,50,5);
        ese.fillOval(140,105,50,5);
        ese.fillOval(85,160,100,5);
    }

    public void paintComponent( Graphics g ) {
        super.paintComponent(g);
        switch (this.option){

            // Amorlais: To do
            case 1:
                System.out.println("Java");
                break;

            // Amorlais: To do
            case 2:
                System.out.println("Java");
                break;

            // Amorlais: To do
            case 3:
                System.out.println("Java");
                break;

            // I: Complete Surprised Emoji
            case 4:
                this.makeEmojiSurprised(g);
                break;

            // Amorlais: To do
            case 5:
                System.out.println("Java");
                break;

            // I: Complete Eyes Emoji
            case 6:
                this.makeEmojiEyes(g);
                break;

            // I: Complete Sweat Emoji
            case 7:
                this.makeEmojiSweat(g);
                break;

            // I: Complete Flushed Emoji
            case 8:
                this.makeEmojiFlushed(g);
                break;

            // Amorlais: To do
            case 9:
                System.out.println("Java");
                break;

            // Amorlais: To do
            case 10:
                System.out.println("Java");
                break;

            // I: Complete Upside-Down Emoji
            case 11:
                this.makeEmojiUpsideDown(g);
                break;

            // I: Complete Serious Emoji
            case 12:
                this.makeEmojiSerious(g);
                break;

            default:
                System.out.println("This not to be show");

        }
    }

    public int getOption() {
        return option;
    }

    public void setOption(int option) {
        this.option = option;
    }
}