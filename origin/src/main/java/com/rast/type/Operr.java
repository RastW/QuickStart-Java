package com.rast.type;

/**
 * @author goumang
 * @description
 * @date 2022/10/15 21:29
 */
public interface Operr<T, R> {

    R run(T t);

}
