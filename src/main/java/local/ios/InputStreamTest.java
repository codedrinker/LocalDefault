package local.ios;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by codedrinker on 6/27/16.
 */
public class InputStreamTest {
    public static void main(String[] args) throws IOException {
        try (ObjectInputStream oos = new ObjectInputStream(new FileInputStream("D:\\work\\link1.data"))) {
            // List<ILRawData> datas = collectRawDataLTH.getDatas();
            //for (ILRawData data : datas) {
            List<ILRawData> datas = new ArrayList<>();
            try {
                ILRawData data = (ILRawData) oos.readObject();
                datas.add(data);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}
