package questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortInteger {

    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList() {{
            add(1);
            add(5);
            add(3);
            add(9);
            add(6);
        }};

        integerList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer t1, Integer t2) {
                return t2-t2;
            }
        });

        // sort list
        integerList.sort((t1, t2) -> t1 - t2);

        // min value
        Collections.min(integerList);
        integerList.get(0);

        // max value
        Collections.max(integerList);
        integerList.get(integerList.size()-1);

        int max = integerList.stream().max((t1, t2)-> t1-t2).get();

//        for(Integer i: integerList) {
//            if(i==5)
//                integerList.remove(1);
//        }

        integerList.removeIf(i -> i==2);

    }
}
