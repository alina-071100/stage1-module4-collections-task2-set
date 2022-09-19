package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> hashSet = new HashSet<>();

        for (Integer x : sourceList) {
            hashSet.add(x);
            if (x % 2 == 1) {
                hashSet.add(x * 2);
            } else {
                while (x % 2 == 0) {
                    hashSet.add(x /= 2);
                }
            }
        }

        return hashSet;

    }

}