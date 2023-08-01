public class Main {
  public static void main (String [] args) {
  int age = 14;
  if (age >= 18) {
    System.out.println("Если возраст человека равен " + age + " , то он совершеннолетний");
  } else {
    System.out.println("Если возраст человека равен " + age + " , то он не достиг совершеннолетия, нужно немного подождать");
  }

  int temperature = 8;
  if (temperature < 5) {
System.out.println("На улице " + temperature + " градуса, нужно надеть шапку");
} else {
    System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
  }

  int speed = 60;
  if (speed > 60) {
    System.out.println("Если скорость " + speed + ", придется заплатить штраф");
  } else {
    System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
  }
  }}