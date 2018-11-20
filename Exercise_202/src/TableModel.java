
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ich
 */
public class TableModel extends AbstractTableModel{

    private ArrayList<Sender> sender = new ArrayList<>();
    private static String[] colNames = {"Sender", "Frequenz", "Band"};
    
    private boolean hideLast = false;

    public void setHideLast(boolean hideLast) {
        this.hideLast = hideLast;
        fireTableStructureChanged();
    }
    
    
    
    public void add(Sender s) {
        sender.add(s);
        fireTableDataChanged();
    }
    
    @Override
    public String getColumnName(int i) {
        return colNames[i];
    }
    
    @Override
    public int getRowCount() {
        return sender.size();
    }

    @Override
    public int getColumnCount() {
        return hideLast ? colNames.length -1 : colNames.length;
    }

    @Override
    public Object getValueAt(int row, int col) {
        Sender s = sender.get(row);
        return s;
        //move switch to renderer
//        switch(col){
//            case 0: return s.getSender();
//            case 1: return s.getFrequenz();
//            case 2: return s.getBand();
//            default: return "???";
//        }
    }
    
}
