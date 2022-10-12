package parent;
import parent2.Animal;

public class Birds extends Animal {
    private boolean feathers;
    private boolean abilityToFly;
    
    public Birds(int height, int weight, String animalType, String bloodType, boolean feathers, boolean abilityToFly) {
        super(height, weight, animalType, bloodType);
        this.feathers = feathers;
        this.abilityToFly = abilityToFly;
    }

    public boolean isFeathers() {
        return feathers;
    }

    public void setFeathers(boolean feathers) {
        this.feathers = feathers;
    }

    public boolean isAbilityToFly() {
        return abilityToFly;
    }

    public void setAbilityToFly(boolean abilityToFly) {
        this.abilityToFly = abilityToFly;
    }

  

 

    
}
