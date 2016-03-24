package utils;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig.Feature;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;
import org.codehaus.jackson.type.TypeReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JsonUtils {

    private static Logger LOGGER = LoggerFactory.getLogger(JsonUtils.class);
    public static ObjectMapper sharedMapper = new ObjectMapper();


    static {
        sharedMapper.configure(Feature.WRITE_NULL_MAP_VALUES, Boolean.FALSE);
        sharedMapper.setSerializationInclusion(Inclusion.NON_NULL);
    }

    public static String getJacksonStringByObject(Object object) {
        try {
            return sharedMapper.writeValueAsString(object);
        } catch (Exception e) {
            LOGGER.error("getJacksonStringByObject error", e);
        }
        return null;
    }

    public static <T> T getObjectByString(String jackson, Class<T> clazz) {
        T c = null;
        try {
            c = (T) sharedMapper.readValue(jackson, clazz);
        } catch (Exception e) {
            LOGGER.error("getObjectByString error", e);
        }
        return c;
    }

    public static <T> T getObjectByString(String jackson, TypeReference<T> type) {
        T c = null;
        try {
            c = (T) sharedMapper.readValue(jackson, type);
        } catch (Exception e) {
            LOGGER.error("getObjectByString error", e);
        }
        return c;
    }

}
