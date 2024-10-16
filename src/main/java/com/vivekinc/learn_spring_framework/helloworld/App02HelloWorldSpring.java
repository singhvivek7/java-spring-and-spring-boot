package com.vivekinc.learn_spring_framework.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
        // 1. Launch a spring context
        // 2. Configure the things that we want to spring to manage
        // HelloWorldConfiguration - @Configuration
        // 3. Get the bean

        try(var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
            var name = context.getBean("name");
            System.out.println("Hello " + name);

            var age = context.getBean("age");
            System.out.println("Age is " + age);

            var person = context.getBean("person");
            System.out.println("Person: " + person);

            var address = context.getBean(Address.class);
            System.out.println("Address: " + address);

            var person2 = context.getBean("person2");
            System.out.println("Person2: " + person2);

            var person3 = context.getBean("person3ParametersCall");
            System.out.println("Person3: " + person3);

            var person4 = context.getBean("person4QualifierCall");
            System.out.println("Person4: " + person4);

            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
   }
}
