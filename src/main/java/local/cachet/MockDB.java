package local.cachet;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by codedrinker on 11/04/2017.
 */
public class MockDB {
    private static Map<String, String> mockPersistence = new HashMap<String, String>() {{
        this.put("github", "codedrinker");
    }};

    public static String loadFromPersistence(String key) {
        System.out.println("load key from persistence : " + key);
        return mockPersistence.get(key);
    }
}
