import java.util.ArrayList;
/**
 * class Personeel - geef hier een beschrijving van deze class
 *
 * @author (jouw naam)
 * @version (versie nummer of datum)
 */
public class Personeel
{
    private ArrayList<Personeelslid> leden;
    
    public Personeel(){
        this.leden = new ArrayList<>();
        Bediende bediende = new Bediende("Jan", 2000);
        leden.add(bediende);
        Arbeider arbeider = new Arbeider("Piet",15);
        arbeider.werken(10);
        leden.add(arbeider);
    }
    
    public void voegPersoneelslidToe(Personeelslid lid){
        leden.add(lid);
    }
    
    public void betaalDag(){
        for(Personeelslid lid: leden){
            System.out.println(lid.getNaam() + ": € " + lid.getLoon());
        }
    }
}
