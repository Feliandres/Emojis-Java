package Emojis;

import javax.swing.*;

public class Schema {
    public int optionMenu(){
        int option = 0;
        boolean band = true;
        String messageMain = "--- Welcome to: \'Make Emojis\'---\nChoose your favorite:"
                + "\n1) Happy\n2) Sad\n3) Scary\n4) Surprised\n5) Angry\n6) Eyes\n7) Sweat\n8) Flushed"
                + "\n9) Heart\n10) Confused\n11) Upside-Down\n12) Serious\n13) Salir";
        while (band){
            try{

                option = Integer.parseInt(JOptionPane.showInputDialog(null, messageMain, "Make Emoji"
                        , JOptionPane.INFORMATION_MESSAGE));


                band = false;
            } catch (Exception e){
                JOptionPane.showConfirmDialog(null, "Only accept numbers", "ERROR"
                        , JOptionPane.YES_NO_OPTION);
            }
        }

        return option;
    }
}