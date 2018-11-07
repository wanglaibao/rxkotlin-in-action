package com.laibao.rxjava.fundamental.observable;

import rx.Observable;

/**
 * @author laibao wang
 */
public class ObservableOther {

    public static void main(String[] args) {
        Observable<String> observable = Observable.empty();
        Observable<String> observable1 = Observable.never();
        Observable<String> observable2 = Observable.error(new RuntimeException("asfdasfd"));
    }
}
