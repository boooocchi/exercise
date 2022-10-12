package parent;
import parent2.Animal;


public class Reptile extends Animal {
    private String skin;
    private String bone;
    private String eggType;

    public Reptile(int height, int weight, String animalType, String bloodType, String skin, String bone,
            String typeOfEgg) {
        super(height, weight, animalType, bloodType);
        this.skin = skin;
        this.bone = bone;
        this.eggType = typeOfEgg;
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public String getBone() {
        return bone;
    }

    public void setBone(String bone) {
        this.bone = bone;
    }

    public String getTypeOfEgg() {
        return eggType;
    }

    public void eggType(String eggType) {
        this.eggType = eggType;
    }

    

    
}
