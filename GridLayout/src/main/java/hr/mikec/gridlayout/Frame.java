/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hr.mikec.gridlayout;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;


public class Frame {

    public Frame() {
        load();
    }

    private void load() {
       
        //Grid Layout places components in a grid of cells.
        // Each component takes all the available space within its cell,
        // and each cell is the same size.
        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new GridLayout(3,3,10,10)); // 3 rows,3 columns, 10px horizontal spacing, 10px vertical spacing
        
 
        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));
        
        frame.setVisible(true);
    }

    
}
