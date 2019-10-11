package de.huebner;

public class Hello {

    public String sayHello(String name) {
        if (name == null || name.length() == 0) {
            throw new IllegalArgumentException("Name must be specified.");
        }
        
        return "Hello " + name;
    }
}
