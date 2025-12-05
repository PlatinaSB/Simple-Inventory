/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventory4ia17.Model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Platina Setia Budi
 */
public class ModelTabel extends AbstractTableModel {

    private List<Model> inventoryList;
    private String[] columnNames = {"ID", "Kode Barang", "Nama Barang", "Jumlah", "Lokasi"};

    public ModelTabel(List<Model> inventoryList) {
        this.inventoryList = inventoryList;
    }

    @Override
    public int getRowCount() {
        return inventoryList.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Model item = inventoryList.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return item.getId();
            case 1:
                return item.getKodebarang();
            case 2:
                return item.getNamabarang();
            case 3:
                return item.getJumlah();
            case 4:
                return item.getLokasi();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    public void setInventoryList(List<Model> inventoryList) {
        this.inventoryList = inventoryList;
        fireTableDataChanged();
    }
}
