
 import java.util.ArrayList; 
public class Main {
   public static void main(String[] args) {
      ArrayList objArray = new ArrayList();
      objArray.clear();
      objArray.add(0,"element");
      objArray.add(1,"element2");
      objArray.add(2,"element3");
     
      System.out.println("Przed usunieciem"+objArray);
      objArray.remove(1);
      objArray.remove("0th element");
      System.out.println("Po usunieciu"+objArray);
   }
    }

  
