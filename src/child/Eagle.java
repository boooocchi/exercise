package child;
import parent.Birds;

public class Eagle extends Birds {

    public Eagle(){
super(80, 10000, "bird", "B",true,true);
    }

    public Eagle(int height, int weight, String animalType, String bloodType, boolean feathers, boolean abilityToFly) {
        super(height, weight, animalType, bloodType, feathers, abilityToFly);
    }


    public String Showinfo(){
        return "Eagle [Height="+ getHeight()+", Weight="+ getWeight()+", Animaltype ="+ getAnimalType()+",Bloodtype="+getBloodType()+", Feathers="+isFeathers()+", AbilityToFly="+isAbilityToFly()+"]";
    }

  
    
}
