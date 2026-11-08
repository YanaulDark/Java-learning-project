public class InternalContestPreparation {
  public static void main(String[] args) {
    String studentName = "Путник";
    int sectPoints = 0;
    int energy = 50;
    int stress = 10;

    for (int day = 1; day <= 14; day++) {
      boolean notHaveEnergy = energy < 10;
      boolean fourthyDay = day % 4 == 0;
      boolean veryHighStress = stress > 30;

      if (stress < 0) {
        stress = 0;
      }
      if (notHaveEnergy || fourthyDay || veryHighStress) {
        energy += 20;
        stress -= 5;
        System.out.println(energy + " " + stress);
        continue;
      }

      sectPoints += 15;
      energy -= 10;
      stress += 5;
      System.out.println(energy + " " + stress + " " + sectPoints);

    }
    
    System.out.println("Points " + sectPoints + " energy " + energy + " stress " + stress);
  }

}
