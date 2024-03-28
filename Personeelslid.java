/**
 * class Personeelslid - geef hier een beschrijving van deze class
 *
 * @author (jouw naam)
 * @version (versie nummer of datum)
 */
public class Personeelslid
{
    private String naam;
    
    public Personeelslid(String naam){
        this.naam = naam;
    }
    
    public String getNaam(){
        return naam;
    }
    
    public void setNaam(String naam){
        this.naam = naam;
    }
    
    public int getLoon(){
        return 0;
    }
}
