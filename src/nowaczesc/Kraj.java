/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nowaczesc;

/**
 *
 * @author LordofDestruction
 */
public abstract class Kraj {

    int populacja;
    long powWJardachKwadrat;
    short ladneDupy = 3;
    String nazwa;

    public Kraj(int populacja, long powierzchnia, String nazwa) {
        powWJardachKwadrat = powierzchnia;
        this.populacja = populacja;
        this.nazwa = nazwa;
    }

    public void terror() {
        System.out.println("Rosja najechana przez " + nazwa + " !");
    }

    public void wypiszDane() {
        System.out.println(nazwa + " ma " + populacja + " populacji.");
        System.out.println(nazwa + " ma " + powWJardachKwadrat + " jardów kwadratowych");
        System.out.println(nazwa + " ma " + ladneDupy + " ladne dupy");
    }
}
