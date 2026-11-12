public class Student {
  String name;
  int age;
  int level;
  int energy;
  int stress;
  int sectPoints;
  boolean active;
  
  boolean canRankUp = sectPoints >= 100*level && active && stress <= 20;

  void rankUp() {
    if (canRankUp) {
      sectPoints -= 100*level;
      stress += 5;
      level += 1;
      System.out.println("You up your level to " + level + ".");
    } else {
      System.out.println("You can't rank up at the moment");
    }
  }

  void train(int numberOfRepetitions) {
    if (energy >= 10 * numberOfRepetitions && stress <= 50 * numberOfRepetitions) {
      energy -= 10;
      stress += 2;
      sectPoints += 15;
      System.out.println("You train.");
    } else if (stress >= 50) {
      System.out.println("You have so much stress, please rest.");
    } else {
      System.out.println("You have too small quantity for train, please rest.");
    }
  }

  void rest() {
    stress -= 5;
    energy += 15;
    System.out.println("You rest.");
  }

  Student(String name) {
    this.name = name;
    this.level = 1;
    this.sectPoints = 0;
    this.energy = 40;
    this.active = true;
    this.stress = 10;
    this.age = 17;
  }
}
