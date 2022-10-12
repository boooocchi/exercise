import child.Crocodile;
import child.Eagle;
import child.Eel;

public class Zoo {
    public static void main(String[] args){
        Crocodile crocodile=new Crocodile();
       
        System.out.println(crocodile.Showinfo());
        
        Eagle eagle=new Eagle();
        System.out.println(eagle.Showinfo());

        Eel eel=new Eel();
        System.out.println(eel.Showinfo());
        // Eagle eagle=new  Eagle();
        // System.out.println(eagle);
        
        // Eel eel=new Eel();
        // System.out.println(eel);
        }
}
