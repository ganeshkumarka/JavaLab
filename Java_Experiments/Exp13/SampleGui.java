/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exp13;

/**
 *
 * @author cusat
 */
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
public class SampleGui extends JFrame {
    
    JPanel myPanel;
    JButton myButton;
    public SampleGui() {
        
        this.setTitle("welcome");
        this.setSize(300,300);
        this.setLocation(700,350);
        //this.setBounds(300,300,900,500);
        
        myButton = new JButton("click me");
        myButton.setBounds(100,90,100,30);
        
        //this.setVisible(true);
        //this.setBounds(900,500,300,300);
        myPanel = new JPanel();
        myPanel.setLayout(null);
        myPanel.add(myButton);
        this.add(myPanel);
        this.setVisible(true);
        
        
        
       myButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Your Clicked", "Response", 1);
            }
       });
    }
    public static void main(String[] args) {
        new SampleGui();
    }
    
   }
