package local.groovyt;

import groovy.lang.Binding;
import groovy.util.GroovyScriptEngine;
import groovy.util.ResourceException;
import groovy.util.ScriptException;

import java.io.IOException;

/**
 * Created by codedrinker on 8/4/16.
 */
public class ExecuteGroovyTest {
    public static void main(String[] args) {
        String[] roots = new String[] { "/my/groovy/script/path" };
        GroovyScriptEngine gse = null;
        try {
            gse = new GroovyScriptEngine(roots);

            Binding binding = new Binding();
            binding.setVariable("input", "world");
            gse.run("hello.groovy", binding);
            System.out.println(binding.getVariable("output"));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ResourceException e) {
            e.printStackTrace();
        } catch (ScriptException e) {
            e.printStackTrace();
        }
    }
}
