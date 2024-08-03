import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapAll1 {
    public static void main(String[] args) {

        HashMap<String,Integer> map = new HashMap<>();
        map.put("Second",20);
        map.put("First",5);
        System.out.println("HashMap : " + map);        // ordered map

        TreeMap<String,Integer> tmap = new TreeMap<>();
        tmap.put("Second",20);
        tmap.put("First",5);
        System.out.println("TreeMap : " + tmap);       //  sorted map
    }
}
