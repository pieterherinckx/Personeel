
/**
 * Write a description of class Bediende here.
 *
 * @author (your name)
 * @version (a version number or a date)
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
