package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {

        return Stream.concat(firstSet.stream()
                                .filter(s -> secondSet.contains(s) && !thirdSet.contains(s)),
                        thirdSet.stream()
                                .filter(s -> !firstSet.contains(s) && !secondSet.contains(s)))
                .collect(Collectors.toSet());
    }
    }

