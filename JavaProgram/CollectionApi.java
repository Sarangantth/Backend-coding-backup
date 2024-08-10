package JavaProgram;

import java.util.HashMap;
import java.util.Map;

public class CollectionApi {
    public static void main(String a[]){
        Map<String, Integer> Students = new HashMap<>();
        Students.put("Sarangantth", 99);
        Students.put("Vijay", 69);
        Students.put("Deepika", 100);
        Students.put("Rakesh", 79);

        for(String key : Students.keySet()){
            System.out.println(key + " : " + Students.get(key));
        }
    }
}
