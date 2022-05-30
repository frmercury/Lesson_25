package StarWars.api;

import java.util.Arrays;
import java.util.List;

public class Converter <T> {

    List convertedList;

    public <T> void numericArrayToList(T[] arr) {
       convertedList = Arrays.asList(arr);
    }

   public List<T> getList() {
        return convertedList;
   }

   public void printList() {
       convertedList.forEach(System.out::println);
       System.out.println("\n");
   }
}
