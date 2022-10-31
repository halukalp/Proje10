package com.migros.ucg.event_delegation.program;

import javax.swing.*;

public class Main
{
    public static void main(String[] args)
    {
        JFrame mainFrame = VisualFactory.getINSTANCE().getMainFrame();

        JButton button1 = new JButton("Buton");

        button1.addActionListener(new ButtonHandler());

        mainFrame.add(button1);

        mainFrame.pack();
    }
}
