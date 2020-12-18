import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class StringtoArrayList {
    public static void main(String args[]){
        String strings = "99,42,55,81,79,64,22";
        String str[] = strings.split(",");

        List nl = new ArrayList();
        nl = Arrays.asList(str);
        for(Object s: nl){
            System.out.println(s);
        }
    }
}