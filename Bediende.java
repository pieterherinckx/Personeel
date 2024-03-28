
/**
 * class Bediende - geef hier een beschrijving van deze class
 *
 * @author (jouw naam)
 * @version (versie nummer of datum)
 */
public class Bediende extends Personeelslid
{
    private int maandloon;
    
    public Bediende(String naam, int maandloon){
        super(naam);
        this.maandloon = maandloon;
    }
    
    public int getLoon(){
        return maandloon;
    }
}
