import java.util.ArrayList;
import java.util.List;

public class RoughTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
//        for(int i=0;i<list.size();i++){
//            System.out.println(list.get(i));
//        }
        for (Integer x:list) {
            System.out.println(x);
        }

    }
}

