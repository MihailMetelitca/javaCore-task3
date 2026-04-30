import java.util.HashMap;
import java.util.Map;

public class Main {
    public static Map<Object,Integer> countOfElements (Object[] elements){
        if(elements.length == 0) return null;
        Map<Object,Integer> resultMap = new HashMap<>();
        for(Object obj:elements){
            resultMap.put(obj, resultMap.getOrDefault(obj,0)+1);
        }
        return resultMap;
    }
    public static void main(String[] args) {
        String[]words = {"IVAN", "IVAN","Petr","Slava","SLAVA"};
        System.out.println(countOfElements(words));
        Integer[] nums= {1,2,2,3,3,3,4,4,5,6,6,7,7,7,7};
        System.out.println(countOfElements(nums));
    }
}
