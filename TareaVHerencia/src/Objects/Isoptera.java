package Objects;


public class Isoptera extends Insects{
    
    private int numberWings;
    private boolean plague;

    public Isoptera(int numberWings, boolean plague, String diet, String size, String color, int legs, int lifeSpan) {
        super(diet, size, color, legs, lifeSpan);
        this.numberWings = numberWings;
        this.plague = plague;
    }

    public int getNumberWings() {
        return numberWings;
    }

    public void setNumberWings(int numberWings) {
        this.numberWings = numberWings;
    }

    public boolean isPlague() {
        return plague;
    }

    public void setPlague(boolean plague) {
        this.plague = plague;
    }
    
    @Override
    public String[] getInfo() {
        String[] insectInformation = { 
                                        getDiet() + ", "
                                        + getSize() +  ", "
                                        + getColor() + ", "
                                        + getLegs() + ", "
                                        + getLifeSpan() + ", "
                                        + getNumberWings() + ", "
                                        + isPlague()
                                     } ;
    
        return insectInformation;
    }
    
}
