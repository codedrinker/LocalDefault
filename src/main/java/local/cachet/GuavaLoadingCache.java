package local.cachet;

import com.google.common.base.Optional;
import com.google.common.cache.*;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * Created by codedrinker on 10/04/2017.
 */
public class GuavaLoadingCache {
    public static void main(String[] args) {
        LoadingCache<String, Optional<String>> loadingCache = CacheBuilder
                .newBuilder()
                .expireAfterWrite(3, TimeUnit.SECONDS)
                .removalListener(new RemovalListener<String, Optional<String>>() {
                    @Override
                    public void onRemoval(RemovalNotification<String, Optional<String>> notification) {
                        System.out.println("cache expired, remove key : " + notification.getKey());
                    }
                })
                .build(new CacheLoader<String, Optional<String>>() {
                    @Override
                    public Optional<String> load(String key) throws Exception {
                        return Optional.fromNullable(MockDB.loadFromPersistence(key));
                    }
                });
        try {
            System.out.println("load from cache once : " + loadingCache.get("github").orNull());
            Thread.sleep(2000);
            System.out.println("load from cache twice : " + loadingCache.get("github").orNull());
            Thread.sleep(2000);
            System.out.println("load from cache third : " + loadingCache.get("github").orNull());
            Thread.sleep(2000);
            System.out.println("load not exist key from cache : " + loadingCache.get("email").orNull());
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
