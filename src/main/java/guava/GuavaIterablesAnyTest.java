package guava;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by codedrinker on 2/29/16.
 */
public class GuavaIterablesAnyTest {
    public static void main(String[] args) {
        List<Entity> entities = new ArrayList<Entity>();

        entities.add(new Entity(1, 4));
        entities.add(new Entity(2, 5));
        entities.add(new Entity(3, 6));
        System.out.println(entities);

        ArrayList<PredicateEntity> predicates = new ArrayList<PredicateEntity>();
        predicates.add(new PredicateEntity(4));
        predicates.add(new PredicateEntity(4));
        predicates.add(new PredicateEntity(5));

        System.out.println(predicates);


        for (final Entity entity : entities) {
            final Entity predicateEntity = entity;
            boolean exist = Iterables.any(predicates, new Predicate<PredicateEntity>() {
                public boolean apply(PredicateEntity input) {
                    return input.getReId() == predicateEntity.getPid();
                }
            });

            if (exist) {
                System.out.println("exist!");
                System.out.println(entity.getId());
            }

        }
    }
}
