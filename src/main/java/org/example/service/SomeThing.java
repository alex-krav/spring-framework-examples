package org.example.service;

public class SomeThing {
    public SomeThing() {}

    public static class NestedThing {
        public String getName() {
            return "nested thing";
        }
    }

    public class InnerThing {
        public InnerThing() {}

        public String getName() {
            return "inner thing";
        }
    }
}
