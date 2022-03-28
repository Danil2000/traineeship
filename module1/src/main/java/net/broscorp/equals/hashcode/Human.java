package net.broscorp.equals.hashcode;

import lombok.Getter;

import java.util.Objects;

public class Human {
  private String firstName;
  private String lastName;
  private int age;

  public Human(String firstName, String lastName, int age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Human human = (Human) o;
    return firstName.equals(human.firstName) && lastName.equals(human.lastName);
  }

  @Override
  public int hashCode() {
    int res =  firstName != null ? firstName.hashCode() : 0;
    res = 31 * res + (lastName != null ? lastName.hashCode() : 0);
    return res;
  }

  @Override
  public String toString() {
    return "First name of person is" + this.firstName + ", last name of person is" + this.lastName;
  }
}
