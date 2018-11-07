package com.laibao.rxjava.fundamental.reactiveextensions;

import java.math.BigInteger;
import java.util.Iterator;

/**
 * @author laibao wang
 */
public class NaturalNumberIterator implements Iterator<BigInteger>{

    private BigInteger currentValue = BigInteger.ZERO;

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public BigInteger next() {
        return currentValue.add(BigInteger.ONE);
    }
}
