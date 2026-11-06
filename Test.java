public class Test {
  public static void main(String[] args) {
    int baseReward = 10;
    int difficulty = 3;
    int difficultyMultiplier = 5;
    int bonus = 7;

    int totalReward = baseReward + difficulty * difficultyMultiplier + bonus;

    System.out.println("Reward is " + totalReward);
  }
}
