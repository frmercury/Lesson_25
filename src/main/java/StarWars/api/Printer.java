package StarWars.api;

import java.util.ArrayList;
import java.util.List;

public class Printer {

    public static void main(String[] args) {

        Integer[] arr = {1, 23, 43, 123, -213};
        Double[] doubles = {1.12, 23.12, 43.12, 123.4123};
        String[] strings = {"dwsf", "sfgd", "fsdg"};
        Float[] myArr = {8.5F, 2.7F};


        Converter<Integer> converterInt = new Converter<>();
        converterInt.numericArrayToList(arr);
        converterInt.printList();

        Converter<Double> converterDouble = new Converter<>();
        converterDouble.numericArrayToList(doubles);
        converterDouble.printList();

        Converter<Float> converter = new Converter<>();
        converter.numericArrayToList(myArr);
//        converter.convertedList.add(12.68);
        List<Float> in = converter.getList();
    }
}
