public class main {
  public static void main(String [] args) {
    String studentName = "Yanaul";
    int level = 1;
    int sectPoints = 30;
    boolean active = true;
    int questReward = 15;
    int finalPenalty = 7;
    
    String resourceName = "Пилюля концентрации";
    int resourceCost = 8;

    sectPoints += questReward;
    sectPoints -= finalPenalty;

    System.out.println("Name :" + studentName);
    System.out.println("Level :" + level);
    System.out.println("Sect Points: " + sectPoints);
    System.out.println("Status: " + active);
    System.out.println("Куплен предмет " + resourceName);
    System.out.println("Осталось" + (sectPoints - resourceCost));
  }
}
