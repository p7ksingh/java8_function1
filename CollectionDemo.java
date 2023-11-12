import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionDemo {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("panakj");
        list.add("Dhiraj");
        list.add("Niraj");
        list.add("Alam");
        System.out.println(list);

        Set set = new HashSet();
        set.add("pankaj");
        set.add("Dhiraj");
        set.add("Niraj");
        set.add("Alam");
        System.out.println(set);

        Map<String, String> map = new HashMap<String, String>();
        map.put("1", "pankaj");
        map.put("2", "Dhiraj");
        map.put("3", "Niraj");
        map.put("4","Alam");
        System.out.println(map);
    }
}
