import java.util.*;
public class JavaUtil {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		
        arrayList.add("hi");
        arrayList.add("welcome");
        arrayList.add("to");
        arrayList.add("java");
        System.out.println("ArrayList elements: " + arrayList);
        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1, "Java");
        hashMap.put(2, "lang");
        hashMap.put(3, "util");
        hashMap.put(4, "awt");
        System.out.println("\nHashMap elements:" + hashMap);
	}

}
