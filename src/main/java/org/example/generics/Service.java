package org.example.generics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class Service {
    @Autowired
    private Store<String> s1; // <String> qualifier, injects the stringStore bean

    @Autowired
    private Store<Integer> s2; // <Integer> qualifier, injects the integerStore bean

    @Autowired
    private List<Store<Integer>> s;

    @Override
    public String toString() {
//        return super.toString() + " + " + s1 + " + " + s2;
        return super.toString() + " + " + s;
    }
}
