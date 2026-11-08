public class TrainingAndRest {
  public static void main(String[] args) {
    int energy = 15;
    int sectPoints = 0;

    for (int day = 1; day <= 10; day++) {
      if (day % 3 == 0) {
        energy += 20;
        System.out.println("Rest, you have " + energy + " energy"  );
        continue;
      }
      if (energy >= 8) {
        sectPoints += 12;
        energy -= 8;
      } else {
        energy += 20;
        System.out.println("Rest, you have " + energy + " energy"  );
      }

      System.out.println("Sect points: " + sectPoints + ", and energy: " + energy);
    }
    System.out.println("You had " + sectPoints );
  }

}
