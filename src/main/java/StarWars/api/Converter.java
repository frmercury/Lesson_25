package StarWars.api;

import java.util.Arrays;
import java.util.List;

public class Converter <T extends Number> {

   protected List<T> convertedList;

   public void numericArrayToList(T[] arr) {
       convertedList = Arrays.asList(arr);
    }

   public List getList() {
        return convertedList;
   }

   public void printList() {
       convertedList.forEach(System.out::println);
       System.out.println("\n");
   }
}
