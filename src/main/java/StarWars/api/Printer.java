package StarWars.api;

import java.util.ArrayList;
import java.util.List;

public class Printer {

    public static void main(String[] args) {

        Integer[] arr = {1, 23, 43, 123, -213};
        Double[] doubles = {1.12, 23.12, 43.12, 123.4123};


        Converter converterInt = new Converter<>();
        converterInt.numericArrayToList(arr);
        converterInt.printList();

        Converter converterDouble = new Converter<>();
        converterDouble.numericArrayToList(doubles);
        converterDouble.printList();
    }
}
