package com.laibao.rxjava.introduction.reactive;

import io.reactivex.Observable;

/**
 * @author laibao wang
 */
public class LauncherLengthTest {
    public static void main(String[] args) {
        Observable<String> myStrings = Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon");

        myStrings.map(x -> x.length())
                .subscribe(System.out::println);
    }
}
