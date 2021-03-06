package tyfrontier.cleanarchitecturesample.data.cache;

import java.util.List;

import io.realm.RealmObject;
import rx.Observable;

public interface CacheService {

    <T, E extends RealmObject & CacheObject<T>> void set(final Class<E> clazz, T model);

    <T, E extends RealmObject & CacheObject<T>> Observable<List<T>> get(final Class<E> clazz);

    <T, E extends RealmObject & CacheObject<T>> long count(final Class<E> clazz);

    <T, E extends RealmObject & CacheObject<T>> void deleteAll(final Class<E> clazz);
}
