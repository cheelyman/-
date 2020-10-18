package com.example.jettrxjavademo_20201014.mapop;

import com.example.jettrxjavademo_20201014.ObservableSource;
import com.example.jettrxjavademo_20201014.Observer;

public class ObservableMap<T,U> extends AbstractObservableWithUpStream<T,U> {

    final Function<T,U> function;

    public ObservableMap(ObservableSource<T> source, Function<T, U> function) {
        super(source);
        this.function = function;
    }
    //真实的功能
    @Override
    protected void subscribeActual(Observer observer) {
        source.subscribeObserver(new MapObserver<>(observer,function));
    }

    static final class MapObserver<T,U> extends BasicFuseableObserver<T,U>{

        final Function<T,U> mapper;

        public MapObserver(Observer<U> actual, Function<T, U> mapper) {
            super(actual);
            this.mapper = mapper;
        }

        @Override
        public void onNext(T t) {
            U apply=mapper.apply(t);
            actual.onNext(apply);
        }
    }
}
