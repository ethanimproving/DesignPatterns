package com.activemesa.structural.bridge.exercise;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Evaluate
{
  @Test
  public void test()
  {
    assertEquals("Drawing Square as lines",
      new com.activemesa.structural.bridge.exercise.Square(new com.activemesa.structural.bridge.exercise.VectorRenderer()).toString());
  }
}
