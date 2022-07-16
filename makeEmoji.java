package Emojis;

import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import java.awt.*;
import java.lang.management.GarbageCollectorMXBean;

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

    private void makeEmojiHappy (Graphics eh){
        super.paintComponent(eh);
        this.makeFace(eh);
        eh.setColor(Color.black);
        eh.fillOval(108, 80, 20, 35);
        eh.fillOval(148, 80, 20, 35);
        eh.drawArc(90, 100, 100,100, 180,180);

    }
    private void makeEmojiSad (Graphics es){
        super.paintComponent(es);
        this.makeFace(es);
        es.setColor(Color.white);
        es.fillOval(106, 80, 30, 35);
        es.fillOval(146, 80, 30, 35);
        es.setColor(Color.blue);
        es.fillOval(112, 81, 22, 25);
        es.fillOval(152, 81, 22, 25);
        es.setColor(Color.white);
        es.fillOval(116, 85, 14, 14);
        es.fillOval(156, 85, 14, 14);
        es.setColor(Color.black);
        es.drawArc(90, 150, 100,80, 0,180);
        es.drawArc(110, 55, 20,20, 212,130);
        es.drawArc(155, 55, 20,20, 180,130);
    }

    private void makeEmojiScary (Graphics ec){
        super.paintComponent(ec);
        this.makeFace(ec);
        ec.setColor(Color.white);
        ec.fillOval(100, 80, 40, 55);
        ec.fillOval(135, 80, 40, 55);
        ec.setColor(Color.darkGray);
        ec.fillArc(107,160,70,35,0,360);
        ec.setColor(Color.blue);
        ec.fillOval(108, 88, 29, 35);
        ec.fillOval(142, 88, 29, 35);
        ec.setColor(Color.white);
        ec.fillOval(114, 98, 16, 18);
        ec.fillOval(148, 98, 16, 18);
        ec.setColor(Color.black);
        ec.drawArc(100, 55, 23,23, 238,120);
        ec.drawArc(155, 55, 23,23, 180,120);
        ec.setColor(Color.cyan);
        ec.fillOval(67, 80, 15, 50);
    }

    private void makeEmojiAngry (Graphics ea){
        al(ea);
        ea.setColor(Color.yellow);
        ea.fillArc(100,80,40,30,-30,180);
        ea.fillArc(135,80,40,30,30,180);
        ea.setColor(Color.black);
        ea.drawArc(100, 80, 40,30, -30,180);
        ea.drawArc(135, 80, 40,30, 30,180);
        ea.setColor(Color.red);
        ea.fillArc(118,100,20,30,0,360);
        ea.fillArc(153,100,20,30,0,360);
        ea.setColor(Color.white);
        ea.fillOval(115, 98, 10, 15);
        ea.fillOval(150, 98, 10, 15);
    }

    private void makeEmojiHeart (Graphics et){
        et.setColor(ColorUIResource.red);
        et.drawArc(80,80,75,50,0,195);
        et.drawArc(155,80,75,50,-10,195);
        et.drawLine(81,113,155,210);
        et.drawLine(231,108,155,210);

    }

    private void makeEmojiConfused (Graphics ef){
        super.paintComponent(ef);
        this.makeFace(ef);
        ef.setColor(Color.black);
        ef.fillOval(108, 80, 20, 35);
        ef.fillOval(148, 80, 20, 35);
        ef.fillArc(135,80,40,15,0,180);
        ef.fillArc(100,60,40,15,-10,200);
        ef.fillArc(111,160,60,15,-10,200);
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
                this.makeEmojiHappy(g);
                break;

            // Amorlais: To do
            case 2:
                this.makeEmojiSad (g);
                break;

            // Amorlais: To do
            case 3:
                this.makeEmojiScary(g);
                break;

            // I: Complete Surprised Emoji
            case 4:
                this.makeEmojiSurprised(g);
                break;

            // Amorlais: To do
            case 5:
                this.makeEmojiAngry(g);
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
                this.makeEmojiHeart(g);
                break;

            // Amorlais: To do
            case 10:
                this.makeEmojiConfused(g);
                break;

            // I: Complete Upside-Down Emoji
            case 11:
                this.makeEmojiUpsideDown(g);
                break;

            // I: Complete Serious Emoji
            case 12:
                this.makeEmojiSerious(g);
                break;

            case 13:
                System.exit(0);
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