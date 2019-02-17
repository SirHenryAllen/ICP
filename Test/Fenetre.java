import java.awt.BorderLayout;

import java.awt.Color;

import java.awt.Dimension;

import javax.swing.JComboBox;

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JPanel;

 

public class Fenetre extends JFrame {

  private JPanel container = new JPanel();

  private JComboBox combo = new JComboBox();

  private JLabel label = new JLabel("Une ComboBox");


  public Fenetre(){

    this.setTitle("Animation");

    this.setSize(300, 300);

    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    this.setLocationRelativeTo(null);

    container.setBackground(Color.white);

    container.setLayout(new BorderLayout());

    combo.setPreferredSize(new Dimension(100, 20));


    JPanel top = new JPanel();

    top.add(label);

    top.add(combo);

    container.add(top, BorderLayout.NORTH);

    this.setContentPane(container);

    this.setVisible(true);            

  }

}