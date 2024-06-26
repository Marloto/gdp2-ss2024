package chapter10.lecture20240617.test;

public class LambdaCase {
  public static void main(String[] args) {
    Runnable example = () -> System.out.println("Hello, World");

    example.run();
  }
}
