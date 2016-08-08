package local.groovyt;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by codedrinker on 8/4/16.
 */
public class ExecuteGroovyTest2 {
    public static void main(String[] args) {
        ScriptEngineManager factory = new ScriptEngineManager();
        ScriptEngine engine = factory.getEngineByName("groovy");
        try {
            String script = "def handle(map){map.'hello' = '2';return map;}";
            engine.eval(script);

            HashMap<String, String> nodes = new HashMap<String, String>() {{
                put("key", "value");
            }};

            Map result = (Map) ((Invocable) engine).invokeFunction("handle", nodes);
            System.out.println(result);

        } catch (javax.script.ScriptException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
