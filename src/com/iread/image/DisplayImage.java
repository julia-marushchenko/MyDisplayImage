package com.iread.image;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

// DisplayImage class
public class DisplayImage {

    // Constants of sizes
    public static final int DEFAULT_WIDTH = 1200;
    public static final int DEFAULT_HEIHGT = 800;

    // Constructor of class DisplayImage
    public DisplayImage() {
        BufferedImage img = null;

        try {
            img = ImageIO.read(new File("C://ascii-table-alpharithms-scaled.jpg"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        ImageIcon icon = new ImageIcon(img);
        JFrame frame = new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setSize(1200, 800);
        JLabel lbl = new JLabel();
        lbl.setIcon(icon);
        frame.add(lbl);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(3);
    }

    // Main method to run java program
    public static void main(String [] args){
        DisplayImage di = new DisplayImage();
    }
}
