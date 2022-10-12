
package child;
import parent.Fish;

public class Eel extends Fish{
    
   private String ability;

   public Eel(){
    super(4, 300, "fish", "O", "in water", "gills"); //constructor of super/parent class
    this.ability = "Release electric charge";
}
    
    public Eel(int height, int weight, String animalType, String bloodType, String habitat, String respiration,
            String ability) {
        super(height, weight, animalType, bloodType, habitat, respiration);
        this.ability = ability;
    }

    
    public String getAbility() {
        return ability;
    }
    
    
    public void setAbility(String ability) {
        this.ability = ability;
    }
    

    public String Showinfo(){
        return "Eel [Height="+ getHeight()+", Weight="+ getWeight()+", Animaltype ="+ getAnimalType()+",Bloodtype="+getBloodType()+", Habitat="+getHabitat()+", Respiration="+getRespiration()+", Ability="+getAbility()+"]";
    }

}
