package parent;
import parent2.Animal;

public class Fish extends Animal {
    private String habitat;
    private String respiration;
    
    public Fish(int height, int weight, String animalType, String bloodType, String habitat, String respiration) {
        super(height, weight, animalType, bloodType);
        this.habitat = habitat;
        this.respiration = respiration;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getRespiration() {
        return respiration;
    }

    public void setRespiration(String respiration) {
        this.respiration = respiration;
    }

 

    
}
