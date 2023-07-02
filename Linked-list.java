import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String>  myLink = new LinkedList<String>();

        myLink.addFirst("Hello");
        myLink.add("Ok bye");
        myLink.addLast("Guys");

        Collections.sort(myLink);

        for(String i : myLink){
            System.out.println(i);
        }

    }
}


