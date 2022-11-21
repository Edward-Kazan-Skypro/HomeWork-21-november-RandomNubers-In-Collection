import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new LinkedHashMap<>();
        for (int i = 0; i < 10; i++) {
            int numberAsKey = (int) (Math.random() * 1000);
            String stringAsValue = "";
            for (int j = 0; j < 3; j++) {
                char c = (char) ((int)(Math.random() * (122-97+1)) + 97);
                String string  = Character.toString(c);
                stringAsValue += string;
            }
            map.put(numberAsKey, stringAsValue);
        }
        System.out.println(map);
    }
}