
import java.awt.Component;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ich
 */
public class TableRenderer implements TableCellRenderer {
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        JLabel label = new JLabel();
        label.setText(value.toString());
        label.setOpaque(true); //Hintergrund zeichnen

        Sender s = (Sender) value;
        switch (column) {
            case 0:
                label.setText(s.getSender());
                break;
            case 1:
                label.setText("" + s.getFrequenz());
                break;
            case 2:
                label.setText(s.getBand());
                break;
        }
        
        switch (s.getBand()) {
            case "AM":
                label.setBackground(Color.red);
                break;
            case "FM":
                label.setBackground(Color.blue);
                break;
            default:
                label.setBackground(Color.white);
                break;
        }
        
        if (isSelected) {
            label.setBackground(Color.gray);
        }
        
        return label;
    }
    
}
