import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<String , String > course = new HashMap<String , String >();

        course.put("Sanjay","BCA");
        course.put("Jatin","BCA II");
        course.put("Badal","BCA III");
        course.put("Hello","Guys");

        //System.out.println(course.get("Sanjay"));
        

        for(String i : course.keySet()){
            System.out.println("Key :" + i + " " + "Value :" + course.get(i));
        }

    }
}


