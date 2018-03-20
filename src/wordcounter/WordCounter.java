/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordcounter;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
 
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author ReyadMahabub
 */
public class WordCounter extends JFrame implements ActionListener {
    JTextArea ta;
    JButton b1,b2,b3;
    JLabel label;

    public WordCounter() {
        super();
        label=new JLabel("Word and Character count Application");
        label.setBounds(50, 25, 300, 20);
        label.setBackground(Color.red);
        ta=new JTextArea();
        ta.setBounds(50, 50, 300, 200);
        ta.setBackground(Color.CYAN);
        
        
        b1=new JButton("word");
        b1.setBounds(50, 300, 100, 30);
        b1.addActionListener(this);
        
        b2=new JButton("character");
        b2.setBounds(160, 300, 100, 30);
        b2.addActionListener(this);
        
        b3=new JButton("clear");
        b3.setBounds(270,300,80,30);
        b3.addActionListener(this);
        
        add(b1);
        add(b2);
        add(b3);
        add(ta);
        add(label);
        setSize(400,400);
        setLayout(null);
        setVisible(true);
        
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new WordCounter();
        // TODO code application logic here
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String text=ta.getText();
        if(e.getSource()==b1 && text!=null){
           
            String[]words=text.split("\\s");
            JOptionPane.showMessageDialog(this,"Total words: "+words.length);    
        }else if(e.getSource()==b1 && text==null){
            JOptionPane.showMessageDialog(this,"NO WORDS"); 
        }
        if(e.getSource()==b2){
            JOptionPane.showMessageDialog(this, "Total character with space: "+text.length());
        }
        if(e.getSource()==b3){
            ta.setText("");
        }
     
    }
    
}
