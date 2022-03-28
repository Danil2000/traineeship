package net.broscorp.equals.hashcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {
  private static List<Human> humans = new ArrayList<>();

  @BeforeAll
  public static void config() {
    humans.add(new Human("Dan", "Yan", 22));
    humans.add(new Human("Dan", "Yan", 22));
    humans.add(new Human("Val", "Val", 44));
  }
  @Test
  public void checkEqualsForTwoObjects() {
    assertTrue(humans.get(0).equals(humans.get(1)));
  }
  @Test
  public void CheckHashCodeForOneObject() {
    assertEquals(humans.get(0).hashCode(), humans.get(0).hashCode());
  }

}