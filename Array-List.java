import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Audi");
        cars.add("Maruti");
        cars.add("Hondaaaa");
        cars.add("BMW");

        ArrayList<Integer> number = new ArrayList<Integer>();
        number.add(23);
        number.add(89);
        number.add(1);

        number.remove(2 );


        Collections.sort(number);
        System.out.println(number.get(0));
        for(int j : number){
            System.out.println(j);
        }

        Collections.sort(cars);

        for(String i : cars){
            System.out.println(i);
        }

    }
}


