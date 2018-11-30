/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geraldo.quiz2;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ALDO
 */
public class TblTransaksi  extends DefaultTableModel{
    private String[] kolom;

    public TblTransaksi() {
        this.kolom = new String[]{
            "Nama","Harga","Jumlah"
        };
    }
    
    public String[] getKolomNama(){
        return this.kolom;
        
    }
        
    
}
