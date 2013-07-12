/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nowaczesc;

/**
 *
 * @author LordofDestruction
 */
public class Japonia extends Kraj {

    public Japonia(int populacja, long powierzchnia) {
        super(populacja, powierzchnia, "Japonia");
        ladneDupy = 23;
    }
    public void zrobMotocykl(){
        System.out.println("Japonia robi motocykle");       
}
}
