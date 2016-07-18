package local.json;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.Map;

/**
 * Created by codedrinker on 7/17/16.
 */
public class GsonParseTest {
    public static void main(String[] args) {
        String jsonStr = "{\"success\":true,\"msg\":null,\"errCode\":\"ERH_HRDH\",\"errMsg\":\"订单出问题啦\"}";
        Gson gson = new Gson();
        Type type = new TypeToken<Map<String, String>>() {
        }.getType();


        Map map = gson.fromJson(jsonStr, type);

        Object errorCode = map.get("errorCode");
        if (errorCode == null) {
            errorCode = map.get("errCode");
        }
        System.out.println(errorCode);

    }
}
