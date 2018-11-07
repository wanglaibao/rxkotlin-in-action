package com.laibao.rxjava.fundamental.observable;

import rx.Observable;
import rx.Observer;
import rx.Subscription;

/**
 *@author  laibao wang
 */
public class ObservableJust {

    private static String helloWorld(){
        return "Hello World";
    }

    public static void main(String[] args) {

        Observable<String> observable = Observable.just(helloWorld());

        Subscription subscriptionPrint = observable.subscribe(new Observer<String>() {
                                                                                @Override
                                                                                public void onCompleted() {
                                                                                    System.out.println("Observable completed");
                                                                                }
                                                                                @Override
                                                                                public void onError(Throwable e) {
                                                                                    System.out.println("Oh,no! Something wrong happened!");
                                                                                }
                                                                                @Override
                                                                                public void onNext(String message) {
                                                                                    System.out.println(message);
                                                                                }
                                                                            });
    }
}
