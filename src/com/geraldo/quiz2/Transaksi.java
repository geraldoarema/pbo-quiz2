/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geraldo.quiz2;

import java.util.ArrayList;

/**
 *
 * @author ALDO
 */
public class Transaksi {
    private  String code;
    private ArrayList<Item> item = new ArrayList();
    private float total;

    public Transaksi() {
        this.code = null;
    }

    public Transaksi(String code, ArrayList<Item> item) {
        this.code = code;
        this.item = item;
    }

    public void setTotal() {
        float total = 0 ;
        for(Item item : this.item){
            total += item.getTotal();
        }
        this.total = total;
    }
    
    public String Pembayaran(){
    setTotal();
    String o = "";
    o += "Code\t\t : " + this.code + "\n";
    o += "Daftar Belanja : \n ";
    for(Item item : this.item){
        o += "\t" + item.getNama() + "(" + item.getJumlah() + ") : " + item.getTotal() + "\n";
    }
    o += "Total\t\t : " + this.total;
    return o;
    }
    
    
    
}
