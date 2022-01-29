/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jPack_ip_calculator;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;


/**
 *
 * @author Jairo M-M
 */
public class jClass_colorJtable extends DefaultTableCellRenderer{

    private Component component;
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        if(row == 0){
            component.setBackground(Color.RED);
        }else{
            component.setBackground(Color.WHITE);
            component.setForeground(Color.BLACK);
        }
        
        
        return component;

    }
    
}
