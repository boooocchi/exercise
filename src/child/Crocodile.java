package child;


import parent.Reptile;

public class Crocodile extends Reptile{
   
   public Crocodile(){
    super(20, 200, "reptile", "A", "dry", "backbone", "hard");

   }

    public Crocodile(int height, int weight, String animalType, String bloodType, String skin, String bone,
            String eggType) {
        super(height, weight, animalType, bloodType, skin, bone, eggType);
    }
  
  

    public String Showinfo(){
        return "Crocodile [Height="+ getHeight()+", Weight="+ getWeight()+", Animaltype ="+ getAnimalType()+",Bloodtype="+getBloodType()+", Skin="+getSkin()+", Bone="+getBone()+"]";
    }

  }

