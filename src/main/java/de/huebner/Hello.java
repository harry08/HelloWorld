package de.huebner;

public class Hello {

    public String sayHello(String name) {
        return "Hello " + name;
    }

    public static void main(String[] args) {
        System.out.println("Starting HelloWorld application");
        Hello hello = new Hello();
        String message = hello.sayHello("Peter");
        System.out.println(message);
    }
}
