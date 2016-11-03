package utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
 * Created by codedrinker on 7/1/16.
 */
public class HttpUtils {


    //定义JSON反序列化类型,为什么定义Result 嵌套B,因为我获取的JSON结构如下
    //必须有set 和 get方法

    /**
     * "{"data":{"type":"VIDEO"}}"
     */
    class Result {
        class Data {
            private String type;

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            @Override
            public String toString() {
                return "Data{" +
                        "type='" + type + '\'' +
                        '}';
            }
        }

        private Data data;

        public Data getData() {
            return data;
        }

        public void setData(Data data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "Result{" +
                    "data=" + data +
                    '}';
        }
    }

    public static Result get(String url) throws IOException {
        try {

            //创建HTTP实例
            CloseableHttpClient httpClient = new DefaultHttpClient();

            //设置请求地址
            HttpGet getRequest = new HttpGet(url);

            //设置请求类型
            getRequest.addHeader("accept", "application/json");


            //执行请求
            HttpResponse response = httpClient.execute(getRequest);


            //判断状态如果不等于200就是有异常
            if (response.getStatusLine().getStatusCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : " + response.getStatusLine().getStatusCode());
            }

            //定义JSON解析,解析出自己想要的东西
            Gson gson = new GsonBuilder().create();
            Result result = gson.fromJson("{\"data\":{\"type\":\"VIDEO\"}}", Result.class);
            return result;

        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        try {
            Result result = get("http://localhost:8080/api/videos?id=635823");
            //这样你就可以获取你想要的内容了,比如你想要的就是type字段放到你的desc里面

            String type = result.getData().getType();
            //用type做事情

            System.out.println(result);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
