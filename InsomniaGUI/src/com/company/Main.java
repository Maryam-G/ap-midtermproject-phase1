package com.company;

import com.company.gui.InsomniaFrame;

import javax.swing.*;

/**
 * A class for testing Insomnia GUI
 *
 * @author Maryam Goli
 */
public class Main {

    public static void main(String[] args) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            // If Nimbus is not available, you can set the GUI to another look and feel.
        }

        InsomniaFrame frame = new InsomniaFrame();
        frame.setVisible(true);
    }
}
