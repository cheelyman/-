package com.example.jettrxjavademo_20201014;

/**
 * 用来绑定发射器
 */
public interface ObservableOnSubscribe<T> {
    void subscribe(Emitter<T> emitter);
}
