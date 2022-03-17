/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxectomaquinabebidasalejandro;

/**
 *
 * @author Alejandro García Losas
 */
public class TarxetaMoedeiro {
    
    private int saldo;

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public TarxetaMoedeiro(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int pagarCafe(){
        if (this.saldo>=1){
            return this.saldo-1;
        }else{
            return -1;
        }
    }
}
