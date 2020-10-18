package com.example.jettrxjavademo_20201014.mapop;

/**
 * 事件变换
 */
public interface Function<T,R> {
    R apply(T t);
}
