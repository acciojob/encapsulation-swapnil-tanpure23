package com.driver;

public class Main {
  RWOnly obj = new RWOnly();
  //obj.name = "John"; // Error: Cannot access private string name
//System.out.println(obj.name);
obj.setName("John");
System.out.println("Name: " + obj.getName());
}
