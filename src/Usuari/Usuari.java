/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuari;

/**
 *
 * @author Miquel
 */
abstract class Usuari {
    protected int ID;
    protected int telefon;
    protected String correu;
    protected String direcció;
    
    public void retirarDiners(){};
    public void ingressarDiners(){};
    public void transferenciaDiners(){};
    public void consultarDiners(){};
    abstract void demanarPrestec();

    public int getID() {
        return ID;
    }
}
