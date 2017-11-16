package local.dynimicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by codedrinker on 12/10/2017.
 */
public class InvocationInterceptor implements InvocationHandler {

    private Object target;

    public InvocationInterceptor(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//        System.out.println(proxy);
        System.out.println("before user create");
        method.invoke(target, args);
        System.out.println("end user create");
        return null;
    }
}
