package com.epam.autotasks.collections;

import java.util.*;

class RangedOpsIntegerSet extends AbstractSet<Integer> {

    //Methods has been implemented from HashSet
    TreeMap<Integer, Object> map = new TreeMap<>();
    private static final Object PRESENT = new Object();

    public boolean add(int fromInclusive, int toExclusive) {
        boolean result = false;
        for(; fromInclusive < toExclusive; fromInclusive++)
            {
                if(map.put(fromInclusive, PRESENT)==null) result = true;
            }
        return result;
    }

    public boolean remove(int fromInclusive, int toExclusive) {
        boolean result = false;
        for(; fromInclusive < toExclusive; fromInclusive++)
            {
                if(map.remove(fromInclusive)==PRESENT) result = true;
            }
        return result;
    }

    @Override
    public boolean add(final Integer integer) {
       return map.put(integer, PRESENT)==null;
    }

    @Override
    public boolean remove(final Object o) {
        return map.remove(o)==PRESENT;
    }

    @Override
    public Iterator<Integer> iterator() {
        return map.keySet().iterator();
    }

    @Override
    public int size() {
        return map.size();
    }
}
