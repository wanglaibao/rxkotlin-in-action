package com.laibao.rxjava.introduction.reactive;


import io.reactivex.Observable;

/**
 * @author laibao wang
 */
public class LauncherTest {
    public static void main(String[] args) {
        Observable<String> myStrings = Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon");
        myStrings.subscribe(System.out::println);
    }
}
