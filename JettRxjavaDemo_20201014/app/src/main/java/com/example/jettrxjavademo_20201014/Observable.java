package com.example.jettrxjavademo_20201014;

import com.example.jettrxjavademo_20201014.mapop.Function;
import com.example.jettrxjavademo_20201014.mapop.ObservableMap;

/**
 * 具体的被观察者
 */
public abstract class Observable<T> implements ObservableSource{
    @Override
    public void subscribeObserver(Observer observer) {
        //map   flatMap  concatMap......
        subscribeActual(observer);
    }
    protected abstract void subscribeActual(Observer observer);

    //创建具体的被观察者，给程序员用
    public static<T> Observable create(ObservableOnSubscribe<T> source){
        return new ObservableCreate<>(source);
    }

    //map操作
    public <U> Observable map(Function<T,U> function){
        return new ObservableMap(this,function);
    }
}
