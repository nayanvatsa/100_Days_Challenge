import java.util.ArrayList;
import java.util.List;

public class FindSublist{

    public static void main(String[] args){

      
        List<Integer> list = new ArrayList<>();

       
        list.add(15);
        list.add(25);
        list.add(35);
        list.add(45);
        list.add(55);
        list.add(65);

      
        System.out.println("Original List: " + list);

       
        List<Integer> sublist = list.subList(2, 5);

        
        System.out.println("Sublist: " + sublist);
    }
}
