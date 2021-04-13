/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasprak3;

import java.util.Scanner;

/**
 *
 * @author Arif
 */
public class TugasPrak3 {
    
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int pilih, panjang, lebar, tinggi, jariJari;
        
        do 
        {
            System.out.println("\n===INPUT===");
            System.out.println("1. Balok");
            System.out.println("2. Kerucut");
            System.out.println("3. Exit");
            System.out.print("Pilih : "); 
            pilih = input.nextInt();
            if (pilih==1) 
            {
                System.out.print("Panjang : ");
                panjang = input.nextInt();
                System.out.print("Lebar   : ");
                lebar = input.nextInt();
                System.out.print("Tinggi  : ");
                tinggi = input.nextInt();
                
                PersegiPanjang persegipanjang = new PersegiPanjang(panjang,lebar);
                Balok balok = new Balok(panjang,lebar,tinggi);
                System.out.println("\n===OUTPUT===");
                System.out.println("Luas Persegi         : " + persegipanjang.Luas());
                System.out.println("Keliling Persegi     : " + persegipanjang.Keliling());
                System.out.println("Volume Balok         : " + balok.Volume());
                System.out.println("Luas Permukaan Balok : " + balok.Luaspermukaan()); 
            }
            
                else if (pilih==2)
                {
                    System.out.print("Jari-jari : ");
                    jariJari = input.nextInt();
                    System.out.print("tinggi    : ");
                    tinggi = input.nextInt();
                
                    Kerucut kerucut = new Kerucut(tinggi,jariJari);
                    Lingkaran lingkaran = new Lingkaran(jariJari);
                    System.out.println("\n===OUTPUT===");
                    System.out.println("Luas Lingkaran         : " + lingkaran.Luas());
                    System.out.println("Keliling Lingkaran     : " + lingkaran.Keliling());
                    System.out.println("Volume Kerucut         : " + kerucut.Volume());
                    System.out.println("Luas Permukaan Kerucut : " + kerucut.Luaspermukaan());
                }
            }while (pilih!=3);
    }
    
}
