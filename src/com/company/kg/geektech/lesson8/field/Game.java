package com.company.kg.geektech.lesson8.field;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Game extends JFrame  {
    private JButton button = new JButton("Press");

    public Game (){
        super("Game");
        this.setBounds(100,100,500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = new Container();
        container.setLayout(new GridLayout(3,2,2,2));

        button.addActionListener(new ButtonEventListener());
        container.add(button);
    }
    class ButtonEventListener implements ActionListener{
        public void actionPerformed (ActionEvent e){
            RPG_Game k = new RPG_Game();
            Boss boss = new Boss(3000,80);

            Warrior warrior = new Warrior(250,15);
            Medic medic = new Medic(200,5,10);
            Hunter hunter = new Hunter(240,20);
            Magic magic = new Magic(100,25);
            Thor thor = new Thor(200,10);
            Golem golem = new Golem(300,10);
            Witcher witcher = new Witcher(200,0);

            Hero[] heroes = {warrior,magic,medic,hunter,thor,golem,witcher};
            k.statistics();
            JOptionPane.showMessageDialog(null,);
        }
    }
}
