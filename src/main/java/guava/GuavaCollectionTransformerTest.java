package guava;

import com.google.common.base.Function;
import com.google.common.collect.Collections2;
import com.google.common.collect.ComparisonChain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by codedrinker on 2/29/16.
 */
public class GuavaCollectionTransformerTest {
    public static void main(String[] args) {
        final List<Entity> collectionTestEntities = new ArrayList<Entity>();


        collectionTestEntities.add(new Entity(1, 2));
        collectionTestEntities.add(new Entity(2, 2));
        collectionTestEntities.add(new Entity(3, 2));
        System.out.println(collectionTestEntities);

        Collection<Integer> transform = Collections2.transform(collectionTestEntities, new Function<Entity, Integer>() {
            public Integer apply(Entity entity) {
                return entity.getId();

            }
        });

        System.out.println(transform);
    }
}
