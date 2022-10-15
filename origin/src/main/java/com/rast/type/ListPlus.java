package com.rast.type;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * @author goumang
 * @description
 * @date 2022/10/15 21:01
 */
public class ListPlus<T> {

    private List<T> list = new ArrayList();

    // add
    // del
    public void add(T t) {
        list.add(t);
    }

    public T get(int index) {
        return list.get(index);
    }

    public int size() {
        return list.size();
    }

    public void foreach(Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }
    }

    public <R> ListPlus<R> map(Function<T, R> function) {
        ListPlus result = new ListPlus<R>();
        for (T t : list) {
            R r = function.apply(t);
            result.add(r);
        }

        return result;
    }
}
