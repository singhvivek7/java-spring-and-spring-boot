package com.vivekinc.learn_spring_framework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address) {};
record Address(String firstLine, String city) {};

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name () {
        return "Vivek";
    }

    @Bean
    public int age () {
        return 25;
    }

    @Bean
    public Person person() {
        return new Person("Vishu", 26, new Address("Baker Street", "London"));

    }

    @Bean
    public Person person2() {
        return new Person(name(), age(), addr());

    }

    @Bean
    public Person person3ParametersCall(String name, int age, Address addr) {
        return new Person(name, age, addr);

    }

    @Bean
    public Person person4QualifierCall(String name, int age,@Qualifier("add3Qualifier") Address addr) {
        return new Person(name, age, addr);

    }

    @Bean(name = "address")
    public Address addr() {
        return  new Address("123, Main Street", "New York");
    }

    @Bean(name = "address2")
    @Primary // primary address - in multiple candidates beans, this will be selected
    public Address addr2() {
        return  new Address("435, Old Street", "Hong Kong");
    }

    @Bean(name = "address3")
    @Qualifier("add3Qualifier")
    public Address addr3() {
        return  new Address("678, BTM Layout", "Bengaluru");
    }
}
