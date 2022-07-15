package Emojis;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        // Request option
        Schema schema = new Schema();
        boolean band = true;
        int optionChose = 0;
        while(band){
            optionChose = schema.optionMenu();
            if (optionChose > 0 & optionChose < 13){
                band = false;
            } else {
                JOptionPane.showConfirmDialog(null, "Not valid option", "ERROR"
                        , JOptionPane.YES_NO_OPTION);
            }
        }


        // Instance for do emoji
        makeEmoji emoji = new makeEmoji();
        emoji.setOption(optionChose);

        // Create a window and characteristics
        JFrame frame = new JFrame("Emoji Window");
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        frame.setSize( 300, 300);
        frame.add(emoji);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        ImageIcon image = new ImageIcon("C:\\Users\\pc\\IdeaProjects\\POO\\src\\Emojis\\avatar.png");
        frame.setIconImage(image.getImage());
    }
}