/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dasar;

/**
 *
 * @author user
 */
public class NewClass {
    public int panjang;
    public int lebar;
    public double jari;
    public double phi=3.14;
    public double jariA;
    public double jariB;
    
public int getLuasp(){
    return this.panjang*this.lebar;
 }

public int getKelilingp(){
    return (this.panjang+this.lebar)*2;
}

public double getLuasC(){
    return this.phi*this.jari*this.jari;
}

public double getKelC(){
    return this.phi*(this.jari*2);
}

public double getLuasO(){
    return this.phi*this.jariA*this.jariB;
}

public double getKelO(){
    return this.phi*(this.jariA+this.jariB);
}
}