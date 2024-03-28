
/**
 * class Arbeider - geef hier een beschrijving van deze class
 *
 * @author (jouw naam)
 * @version (versie nummer of datum)
 */
public class Arbeider extends Personeelslid
{
    private int uurloon;
    private int aantalUren;
    
    public Arbeider(String naam, int uurloon){
        super(naam);
        this.uurloon = uurloon;
        this.aantalUren = 0;
    }
    
    public void werken(int uren){
        aantalUren += uren;
    }
    
    public int getLoon(){
        return aantalUren * uurloon;
    }
}
