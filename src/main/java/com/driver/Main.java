package com.driver;

public class Main {
  RWOnly obj = new RWOnly();
  obj.name = "John"; // Error: Cannot access private variable 'name'
System.out.println(obj.name);
}
