import java.util.concurrent.ConcurrentHashMap;

public class Concurrency {
	public static void main(String[] args) {
		ConcurrentHashMap<String, Integer> hashMap = new ConcurrentHashMap<>();
		hashMap.put("AAA", 1);
		hashMap.put("BBB", 2);
		hashMap.put("CCC", 3);
		hashMap.put("DDD", 4);
		hashMap.put("EEE", 5);
		hashMap.put("FFF", 6);
		hashMap.put("GGG", 7);

		// parallelismThreshold = 1 --> Parallel
		hashMap.forEach(1, (k, v) -> System.out.println("key->" + k + " value-> " + v));

		String result = hashMap.search(1, (k, v) -> {
			if (k.equals("AAA"))
				return k + "->" + v;
			return null;
		});
		System.out.println("result = " + result);

		ConcurrentHashMap<String, Integer> map1 = new ConcurrentHashMap<>();
		map1.put("AAA", 1);
		map1.put("BBB", 2);
		map1.put("CCC", 3);
		// Compute a new value for the existing key
		System.out.println("Display 1 -> " + map1.compute("AAA", (k, v) -> v == null ? 105 : v + 200));
		System.out.println("Display 2 -> " + map1);

	}
}
