package local.stringt;

import com.google.common.base.Joiner;
import org.apache.commons.lang.StringUtils;

/**
 * Created by codedrinker on 11/29/16.
 */
public class StringArgumentsTest {
    public String append(String... arguments) {
        String source = "SOURCE";
        String join = Joiner.on("_").join(arguments);
        if (StringUtils.isNotBlank(join)) {
            source = source + "_" + join;
        }
        return source;
    }

    public static void main(String[] args) {
        String append = new StringArgumentsTest().append();
        System.out.println(append);

        String append1 = new StringArgumentsTest().append("1", "2");
        System.out.println(append1);
    }
}
