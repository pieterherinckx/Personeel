import java.util.ArrayList;
/**
 * Write a description of class Personeel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Personeel
{
    private ArrayList<Personeelslid> leden;
 
    public Personeel(){
        this.leden = new ArrayList<Personeelslid>();
        Bediende bediende = new Bediende("Jan", 2000);
        Arbeider arbeider = new Arbeider("Piet", 20);
        arbeider.werk(150);
        leden.add(bediende);
        leden.add(arbeider);
    }
    
    public void betaalDag(){
        for(Personeelslid p: leden){
            System.out.println(p.getNaam() + ": € " + p.getLoon());
        }
    }
}
