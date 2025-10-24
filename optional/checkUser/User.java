package study.optional.checkUser;

import java.util.*;
import java.lang.*;

public class User {

  private String name;
  private int age;

  public User() {

  }

  public User(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getAge() {
    return this.age;
  }

  public String getName() {
    return this.name;
  }

  @Override
  public String toString() {
    return String.format("name = %s, age = %d \n", this.name, this.age);
  }
}
