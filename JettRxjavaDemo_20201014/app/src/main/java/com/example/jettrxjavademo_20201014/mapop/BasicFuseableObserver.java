package com.example.jettrxjavademo_20201014.mapop;


import com.example.jettrxjavademo_20201014.Observer;

public abstract class BasicFuseableObserver<T,U> implements Observer<T> {

    protected final Observer<U> actual;

    //参数actual就是下游的observer
    public BasicFuseableObserver(Observer<U> actual) {
        this.actual = actual;
    }

    @Override
    public void onSubscribe() {

    }

    @Override
    public void onError(Throwable e) {

    }

    @Override
    public void onComplete() {

    }
}
