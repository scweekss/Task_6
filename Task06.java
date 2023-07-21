package Java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Task06 {
      public static void main(String[] args) {
        Map<String, Integer> abon = new HashMap<>() {
            {
                put("Вершинин", new ArrayList<Integer>() {
                    {
                        add(3331313);
                        add(4442424);
                    }
                });
                put("Гончаров", new ArrayList<Integer>() {
                    {
                        add(5553535);
                    }
                });
                put("Дружинин", new ArrayList<Integer>() {
                    {
                        add(6664646);
                        add(7775757);

                    }
                });
                put("Ельцев", new ArrayList<Integer>() {
                    {
                     
                        add(8886868);
                        add(9997979);
                    }
                });
            }
        };
    
    };
}
