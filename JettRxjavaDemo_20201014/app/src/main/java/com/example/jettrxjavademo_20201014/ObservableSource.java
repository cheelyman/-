package com.example.jettrxjavademo_20201014;

public interface ObservableSource<T> {
    //绑定Observable与Observer的联系    订阅   add(observer)
    void subscribeObserver(Observer<T> observer);

}
