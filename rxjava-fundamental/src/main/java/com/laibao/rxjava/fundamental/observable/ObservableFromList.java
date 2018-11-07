package com.laibao.rxjava.fundamental.observable;

import rx.Observable;
import rx.Observer;
import rx.Subscription;

import java.util.ArrayList;
import java.util.List;

/**
 * @author laibao wang
 */
public class ObservableFromList {

    public static void main(String[] args) {
        List<Integer> items = new ArrayList<Integer>();
        items.add(1);
        items.add(10);
        items.add(100);
        items.add(200);

        Observable<Integer> observableString = Observable.from(items);

        Subscription subscriptionPrint = observableString.subscribe(new Observer<Integer>() {
                                                                                @Override
                                                                                public void onCompleted() {
                                                                                    System.out.println("Observable completed");
                                                                                }
                                                                                @Override
                                                                                public void onError(Throwable e) {
                                                                                    System.out.println("Oh,no! Something wrong happened！");
                                                                                }
                                                                                @Override
                                                                                public void onNext(Integer item) {
                                                                                    System.out.println("Item is " + item);
                                                                                }
                                                                            });

    }
}
