/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasprak3;

/**
 *
 * @author Arif
 */
public class Lingkaran implements MenghitungBidang
{
    public int jariJari;
        public Lingkaran(int jari)
        {
            this.jariJari = jariJari;
        }
    
        @Override
        public double Luas()
        {
            return Math.PI*jariJari*jariJari;
        }
    
        @Override
        public double Keliling()
        {
            return Math.PI*2*jariJari;
        }
    }
