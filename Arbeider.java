
/**
 * Write a description of class Arbeider here.
 *
 * @author (your name)
 * @version (a version number or a date)
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
    
    public void werk(int uren){
        aantalUren += uren; //zelfde als aantalUren = aantalUren + uren;
    }
    
    public int getLoon(){
        return aantalUren * uurloon;
    }
}
