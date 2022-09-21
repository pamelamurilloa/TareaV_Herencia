package Objects;

import java.util.ArrayList;


public class Insects {

    private String diet; //This can be "Herbivoro, Carnivoro u Omnivoro"
    private String size; //Small (<5cm), Medium(4cm < < 15 cm), Big (> 15)
    private String color;
    private int legs;
    private int lifeSpan;

    public Insects(String diet, String size, String color, int legs, int lifeSpan) {
        this.diet = diet;
        this.size = size;
        this.legs = legs;
        this.lifeSpan = lifeSpan;
        this.color = color;
    }

    public static ArrayList insectList = new ArrayList<>(); 
    
    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan;
    }
    
    public static ArrayList getInsectList() {
        return insectList;
    }

    public static void setInsectList(ArrayList insectList) {
        Insects.insectList = insectList;
    }
    
    public String[] getInfo() {
        String[] insectInformation = { 
                                        getDiet() + ", "
                                        + getSize() +  ", "
                                        + getColor() + ", "
                                        + getLegs() + ", "
                                        + getLifeSpan()
                                     } ;
    
        return insectInformation;
    }
    
    public String eatSomething(String insectType) {
        return "El " + insectType + " ha comido";
    }
    
}
