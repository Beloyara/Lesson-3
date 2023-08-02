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

  int age1 = 60;
  boolean haveToGoToSleep = age1 < 2;
  if (haveToGoToSleep) {
    System.out.println("Если возраст человека равен " + age1 + ", то ему пора спать");
  }
  boolean haveToGoToKindergarden = age1 >=2 && age1 <=6;
  if (haveToGoToKindergarden) {
    System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в детский сад");
  }
  boolean haveToGoToSchool = age1 >= 7 && age1 <= 18;
  if (haveToGoToSchool) {
    System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в школу");
  }
  boolean haveToGoToUniversity = age1 > 18 && age1 < 24;
  if (haveToGoToUniversity) {
    System.out.println("Если возраст человека равен " + age1 + ", то его место в университете");
  }
  boolean haveToGoToWork = age1 >= 24 && age1 < 60;
  if (haveToGoToWork) {
    System.out.println("Если возраст человека равен " + age1 + ", то ему пора ходить на работу");
  }
  boolean haveToHaveAReast = age1 >= 60;
  if (haveToHaveAReast) {
    System.out.println("Если возраст человека равен " + age1 + ", то он может отдохнуть");
  }

  int age2 = 14;
  boolean cantRideTheRides = age2 < 5;
  boolean canRideTheRides = age2 >= 5 && age2 < 14;
  boolean canRideTheRidesAlone = age2 >= 14;
  if (cantRideTheRides) {
    System.out.println("Если возраст ребенка равен " + age2 + ", то ему нельзя кататься на аттракционе");
  }
  if (canRideTheRides) {
    System.out.println("Если возраст ребенка равен " + age2 + ", то ему можно кататься на аттракционе в сопровождении взрослого");
  }
  if (canRideTheRidesAlone) {
    System.out.println("Если возраст ребенка равен " + age2 + ", то ему можно кататься на аттракционе без сопровождения взрослого");
  }
  }}