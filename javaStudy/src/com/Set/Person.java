package com.Set;

import java.util.Objects;

public class Person {
    private int age;
    private String name;
    public Person(){}
    public Person(String name,int age){
        this.age=age;
        this.name=name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        if (getAge() != person.getAge()){
            return false;
        }
        return name != null ? name.equals(person.name) : person.name == null;

    }

    @Override
    public int hashCode() {
        return Objects.hash(getAge(), getName());
    }

    @Override
    public String toString() {
        return "Person{" + "age=" + age + ", name='" + name + '\'' + '}';
    }
}
