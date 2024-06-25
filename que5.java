
import java.util.*;

 class Test {
    public static void main(String[] args) {
        String str = "Happiness";
        HashMap<Character, Integer> hmap = new HashMap();
               for (char c : str.toCharArray()) {
            hmap.put(c,hmap.getOrDefault(c, 0) + 1);
        	}
             System.out.println("Non-repeating characters:");
        	for (char c : str.toCharArray()) {
           	 if (hmap.get(c) == 1) {
                System.out.print(c + " ");
            }
        }
    }
}
