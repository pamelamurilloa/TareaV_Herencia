package Objects;


public class Araneae extends Insects {
    
    private String webShape; //Funnel, leaf or Spiral
    private boolean biggerFemales;

    public Araneae(boolean biggerFemales, String webShape, String diet, String size, String color, int legs, int lifeSpan) {
        super(diet, size, color, legs, lifeSpan);
        this.biggerFemales = biggerFemales;
        this.webShape = webShape;
    }

    
    public boolean isBiggerFemales() {
        return biggerFemales;
    }

    public void setBiggerFemales(boolean biggerFemales) {
        this.biggerFemales = biggerFemales;
    }

    public String getWebShape() {
        return webShape;
    }

    public void setWebShape(String webShape) {
        this.webShape = webShape;
    }
    
    @Override
    public String[] getInfo() {
        String[] insectInformation = { 
                                        getDiet() + ", "
                                        + getSize() +  ", "
                                        + getColor() + ", "
                                        + getLegs() + ", "
                                        + getLifeSpan() + ", "
                                        + isBiggerFemales() + ", "
                                        + getWebShape()
                                     } ;
    
        return insectInformation;
    }
    
}
