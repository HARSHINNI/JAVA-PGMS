import java.util.*;
public class LoopExample {
   public static void main(String[] args) {

      ArrayList<Integer> arrlist = new ArrayList<Integer>();
      arrlist.add(1);
      arrlist.add(2);
      arrlist.add(3);
      arrlist.add(4);

      /* For Loop for iterating ArrayList */
      System.out.println("For Loop");
      for (int counter = 0; counter < arrlist.size(); counter++) { 		      
          System.out.println(arrlist.get(counter)); 		
      }   		

      /* Advanced For Loop*/ 		
      System.out.println("Advanced For Loop"); 		
      for (Integer num : arrlist) { 		      
           System.out.println(num); 		
      }

      /* While Loop for iterating ArrayList*/ 		
      System.out.println("While Loop"); 		
      int count = 0; 		
      while (arrlist.size() > count) {
	 System.out.println(arrlist.get(count));
         count++;
      }

   }
}