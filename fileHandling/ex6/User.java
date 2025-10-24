package study.fileHandling.ex6;

import java.util.*;
import java.lang.*;

public class User {

  private String name;
  private int id;
  private float score;

  User() {
  };

  User(String name, int id, float score) {
    this.name = name;
    this.id = id;
    this.score = score;
  }

  @Override
  public String toString() {
    return String.format("user:[name:$s, id:$d, score:%f]", this.name, this.id, this.score);
  }
}
