package local.groovyt;

import groovy.lang.Binding;
import groovy.util.GroovyScriptEngine;
import groovy.util.ResourceException;
import groovy.util.ScriptException;

import javax.script.Invocable;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by codedrinker on 8/4/16.
 */
public class ExecuteGroovyTest {
    public static void main(String[] args) {
//        Object world = execute("GroovyShell.groovy", "world");
//        System.out.println(world);

        Object execute = execute("GroovyMapShell.groovy", new HashMap<String, String>() {
            {
                put("key", "value");
            }
        });
        System.out.println(execute);
    }

    private static Object execute(String target, Object input) {
        String property = System.getProperty("user.dir") +
                File.separator + "src" +
                File.separator + "main" +
                File.separator + "resources" +
                File.separator;

        String[] roots = new String[]{property};
        GroovyScriptEngine gse = null;
        try {
            gse = new GroovyScriptEngine(roots);
            Binding binding = new Binding();
            binding.setVariable("a", input);
            Object run = gse.run(target, binding);

//            Map time = (Map)gse).invokeFunction("getMap", input);
//            System.out.println(time);
            return null;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ResourceException e) {
            e.printStackTrace();
        } catch (ScriptException e) {
            e.printStackTrace();
        }
        return null;
    }
}
