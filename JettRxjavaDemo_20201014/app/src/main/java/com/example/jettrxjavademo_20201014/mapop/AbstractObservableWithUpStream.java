package com.example.jettrxjavademo_20201014.mapop;

import com.example.jettrxjavademo_20201014.Observable;
import com.example.jettrxjavademo_20201014.ObservableSource;

/**
 * 这就是装饰类
 */
public abstract class AbstractObservableWithUpStream<T,U> extends Observable<U> {
    protected final ObservableSource<T> source;

    public AbstractObservableWithUpStream(ObservableSource<T> source) {
        this.source = source;
    }
}
