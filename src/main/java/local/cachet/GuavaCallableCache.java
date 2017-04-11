package local.cachet;

import com.google.common.base.Optional;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.RemovalListener;
import com.google.common.cache.RemovalNotification;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * Created by codedrinker on 11/04/2017.
 */
public class GuavaCallableCache {
    public static void main(String[] args) {
        String key = "github";
        Cache<String, Optional<String>> cache = CacheBuilder.newBuilder()
                .expireAfterWrite(3, TimeUnit.SECONDS)
                .removalListener(new RemovalListener<String, Optional<String>>() {
                    @Override
                    public void onRemoval(RemovalNotification<String, Optional<String>> notification) {
                        System.out.println("cache expired, remove key : " + notification.getKey());
                    }
                }).build();
        try {
            Optional<String> optional;
            System.out.println("load from cache once : " + cache.get(key, new Callable<Optional<String>>() {
                @Override
                public Optional<String> call() throws Exception {
                    return Optional.fromNullable(MockDB.loadFromPersistence(key));
                }
            }).orNull());
            Thread.sleep(2000);
            System.out.println("load from cache twice : " + cache.get(key, new Callable<Optional<String>>() {
                @Override
                public Optional<String> call() throws Exception {
                    return Optional.fromNullable(MockDB.loadFromPersistence(key));
                }
            }).orNull());
            Thread.sleep(2000);
            System.out.println("load from cache third : " + cache.get(key, new Callable<Optional<String>>() {
                @Override
                public Optional<String> call() throws Exception {
                    return Optional.fromNullable(MockDB.loadFromPersistence(key));
                }
            }).orNull());
            Thread.sleep(2000);
            String nullKey = "email";
            optional = cache.get(nullKey, new Callable<Optional<String>>() {
                @Override
                public Optional<String> call() throws Exception {
                    return Optional.fromNullable(MockDB.loadFromPersistence(nullKey));
                }
            });
            System.out.println("load not exist key from cache : " + optional.orNull());
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
