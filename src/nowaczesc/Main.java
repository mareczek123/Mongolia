/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nowaczesc;

/**
 *
 * @author LordofDestruction
 */
public class Main {

    public static void main(String[] args) {
        Mongolia mong1;
        mong1 = new Mongolia(112, 23);
        mong1.wypiszDane();
        mong1.terror();

        Mongolia mong2;
        mong2 = new Mongolia(32, 32);
        mong2.wypiszDane();
        mong2.terror();

        Mongolia mong3 = new Mongolia(6, 7);
        mong3.wypiszDane();
        mong3.terror();
        
        
        Japonia jap1 = new Japonia(80, 100);
        jap1.wypiszDane();
        jap1.terror();
        jap1.zrobMotocykl();
    }
}
