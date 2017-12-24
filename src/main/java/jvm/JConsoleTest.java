package jvm;

import sun.awt.windows.ThemeReader;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by codedrinker on 24/12/2017.
 */
public class JConsoleTest {
    /**
     * 内存占位符对象，一个OOMObject大约占64K
     */
    static class OOMObject {
        public byte[] placeholder = new byte[64 * 1024];
    }

    public static void fillHeap(int num) throws InterruptedException {
        Thread.sleep(30000l);
        System.out.println("begin");
        List<OOMObject> list = new ArrayList<OOMObject>();
        for (int i = 0; i < num; i++) {
            // 稍作延时，令监视曲线的变化更加明显
            Thread.sleep(50);
            list.add(new OOMObject());
        }
    }

    public static void main(String[] args) throws Exception {
        fillHeap(1000);
        System.gc();
        Thread.sleep(30000l);
    }


}
