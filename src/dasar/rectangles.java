/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dasar;

/**
 *
 * @author user
 */
public class rectangles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    NewClass A =  new NewClass();
    A.panjang = 4;
    A.lebar=2;
    System.out.println("Luas persegi panjang adalah "+A.getLuasp());
    System.out.println("Keliling persegi panjang adalah "+A.getKelilingp());
   
    NewClass circles= new NewClass();
    circles.jari= 7;
    System.out.println("Luas Lingkaran adalah "+circles.getLuasC());
    System.out.println("Keliling lingkaran adalah "+circles.getKelC());
    
    NewClass oval= new NewClass();
    oval.jariA=14;
    oval.jariB=7;
    System.out.println("luas oval adalah "+oval.getLuasO());
    System.out.println("Keliling oval adalah "+oval.getKelO());
    }}