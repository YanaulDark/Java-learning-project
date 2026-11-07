public class ActionSwitch {
  public static void main(String[] args) {
    String action = "TRAIN";

    int sectPoits = 10;
    int energy = 50;
    int stress = 20;

    switch(action) {
      case "TRAIN":
        sectPoits += 15;
        energy -= 10;
        stress += 5;
        System.out.println("Action is TRAIN");
        break;
      case "REST":
        energy += 20;
        stress -= 10;
        System.out.println("Action is REST");
        break;
      case "BATTLE":
        sectPoits += 25;
        energy -= 20;
        stress += 15;
        System.out.println("Acrion is BATTLE");
        break;
      case "MEDITATE":
        sectPoits += 5;
        energy += 5;
        stress -= 5;
        System.out.println("Action is MEDITATE");
        break;
      default:
        System.out.println("Not valid data");
    }
  }
}
