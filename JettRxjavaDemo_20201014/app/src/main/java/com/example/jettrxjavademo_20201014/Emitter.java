package com.example.jettrxjavademo_20201014;

/**
 * 给Observer发送消息用的
 */
public interface Emitter<T> {
    void onNext(T t);
    void onError(Throwable e);
    void onComplete();
}
