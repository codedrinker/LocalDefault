package local.dynimicproxy;

import sun.misc.ProxyGenerator;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Proxy;

/**
 * Created by codedrinker on 12/10/2017.
 */
public class DynamicProxyTest {
    public static void main(String[] args) {
        System.setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        User target = new UserImpl();
        InvocationInterceptor invocationInterceptor = new InvocationInterceptor(target);
        User proxyInstance = (User) Proxy.newProxyInstance(UserImpl.class.getClassLoader(),
                UserImpl.class.getInterfaces(),
                invocationInterceptor);
        proxyInstance.create();
//        generateClassFile();
    }

    public static void generateClassFile() {
        byte[] classFile = ProxyGenerator.generateProxyClass("$Proxy0", UserImpl.class.getInterfaces());

        FileOutputStream out = null;

        try {
            out = new FileOutputStream(new File("/home/codedrinker/Proxy0.class"));
            out.write(classFile);
            out.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
