/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasprak5;
import java.awt.event.*;
import javax.swing.*;
import bidang.Persegi;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import ruang.Balok;
/**
 *
 * @author Indiv
 */
    public class GUI extends JFrame implements ActionListener {

    JLabel Panjang = new JLabel("Panjang");
    final JTextField fPanjang = new JTextField(10);  
    JLabel Lebar = new JLabel("Lebar");
    final JTextField fLebar = new JTextField(10);  
    JLabel Tinggi = new JLabel("Tinggi");
    final JTextField fTinggi = new JTextField(10);
    
    JLabel Hasil = new JLabel("Hasil : ");
    JLabel LuasPersegi = new JLabel(); 
    JLabel KelilingPersegi = new JLabel();
    JLabel VolumeBalok = new JLabel();
    JLabel LuasBalok = new JLabel(); 
    
    JButton bHitung = new JButton("Hitung");
    JButton bReset = new JButton("Reset");
    
    GUI()
    { 
        setTitle("Tugas Praktikum ke 5 ");
        //setSize merupakan pengaturan ukuran dari jframe
        setSize(440,440);
        setLayout(null);
        add(Panjang);
        add(fPanjang);
        add(Lebar);
        add(fLebar);
        add(Tinggi);
        add(fTinggi);
        add(Hasil);
        add(bHitung);
        add(bReset);
        Panjang.setBounds(50,10,200,20);
        fPanjang.setBounds(110, 10, 200, 20);
        Lebar.setBounds(50,40,150,20);
        fLebar.setBounds(110, 40, 200, 20);
        Tinggi.setBounds(50,70,150,20);
        fTinggi.setBounds(110, 70, 200, 20);
        Hasil.setBounds(50, 100, 150, 40);
        bHitung.setBounds(105, 315, 100, 30);
        bReset.setBounds(225, 315, 100, 30);
        bHitung.addActionListener(this);
        bReset.addActionListener(this);      
        
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == bHitung) 
        {
            
            try{
                double panjang, lebar, tinggi;
                panjang = Double.parseDouble(fPanjang.getText());
                lebar = Double.parseDouble(fLebar.getText());
                tinggi = Double.parseDouble(fTinggi.getText());
                Persegi persegi = new Persegi (panjang, lebar);
                Balok balok = new Balok(panjang, lebar, tinggi);               

                LuasPersegi.setText("Luas Persegi : " + Double.toString(persegi.luas()));
                add(LuasPersegi);
                LuasPersegi.setBounds(100, 150, 200, 30);
                
                KelilingPersegi.setText("Keliling Persegi : " + Double.toString(persegi.keliling()));
                add(KelilingPersegi);
                KelilingPersegi.setBounds(100, 170, 200, 30);
                
                VolumeBalok.setText("Volume Balok : " + Double.toString(balok.volume()));
                add(VolumeBalok);
                VolumeBalok.setBounds(100, 190, 200, 30);
                
                LuasBalok.setText("Luas Permukaan Balok : " + Double.toString(balok.luas()));
                add(LuasBalok);
                LuasBalok.setBounds(100, 210, 200, 30);
            }
            catch(NumberFormatException ae){
                JOptionPane.showMessageDialog(null, ""+ae.getMessage());
            }
        }
        if (e.getSource() == bReset) 
        {
            fPanjang.setText(null);
            fLebar.setText(null);
            fTinggi.setText(null);
            LuasPersegi.setText(null);
            KelilingPersegi.setText(null);
            VolumeBalok.setText(null);
            LuasBalok.setText(null);
        }
    }

    
}
