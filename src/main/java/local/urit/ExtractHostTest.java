package local.urit;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by codedrinker on 11/3/16.
 */
public class ExtractHostTest {
    public static void main(String[] args) {
        String urls[] = new String[]{"http://www.baidu.com?h=12", "http://www.hh.com/shj/dj", "http://js.baidu.com/ssf?ddh=s&s=sjdh"};

        for(String url:urls){
            try {
                URL url1 = new URL(url);
                String host = url1.getHost();
                System.out.println(host);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
    }
}
