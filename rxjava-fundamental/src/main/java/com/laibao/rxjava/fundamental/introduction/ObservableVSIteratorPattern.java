package com.laibao.rxjava.fundamental.introduction;

import com.laibao.rxjava.fundamental.common.Program;
import rx.Observable;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Demonstrate the differences between Iterator Pattern and Observables.
 *
 * @author laibao wang
 */
public class ObservableVSIteratorPattern implements Program {

    private void usingIteratorExample() {
        List<String> list = Arrays.asList("One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten");
        Iterator<String> iterator = list.iterator();
        // While there is a next element, PULL it from the source and print it.
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();

        List<String> list1 = Arrays.asList("One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten");
        for (String element: list1) {
            System.out.println(element);
        }
        System.out.println();

        List<String> list2 = Arrays.asList("One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten");
        list.forEach(System.out::println);
    }


    private  void usingObservableExample() {
        List<String> list = Arrays.asList("One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten");

        Observable<String> observable = Observable.from(list);

       observable.subscribe((String element) -> System.out.println(element),
                            (Throwable t) -> System.err.println(t),
                            () -> System.out.println("done"));
    }


    @Override
    public String name() {
        return "Iterator Pattern vs Observable";
    }

    @Override
    public int chapter() {
        return 1;
    }

    @Override
    public void run() {
        System.out.println("Running Iterator example:");
        usingIteratorExample();

        System.out.println("Running Observable example:");
        usingObservableExample();
    }

    public static void main(String[] args) {
        new ObservableVSIteratorPattern().run();
    }
}
