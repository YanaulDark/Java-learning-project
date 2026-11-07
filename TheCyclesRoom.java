public class TheCyclesRoom {
  public static void main(String[] args) {
    for (int i = 11; i <= 21; i++) {
      int sectPoints = i * 100;
      System.out.println("Уровень " + i + ": " + sectPoints + " очков");
    }
    int sectPoints = 0;
    int dailyReward = 12;

    for (int day = 1; day <= 7; day++) {
      sectPoints += dailyReward;
      System.out.println("Day " + day + ": points is " + sectPoints);
    }
  }
}
