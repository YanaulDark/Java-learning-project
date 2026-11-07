public class Game {
  public static void main(String[] args) throws InterruptedException {
    String positionNull =     "================";
    String firstPosition =    "====#===========";
    String secondPosition =   "=====#==========";
    String thirdPosition =    "======#=========";
    String fourthyPosition =  "=======#========";
    String fifthyPosition =   "========#=======";
    String sixthyPosition =   "=========#======";
    String seventhyPosition = "==========#=====";
    String eighthyPosition =  "===========#====";
    
    String[] positions = {positionNull, firstPosition, secondPosition, thirdPosition, fourthyPosition,
      fifthyPosition, sixthyPosition, seventhyPosition, eighthyPosition};

    int Reward = 1;

    while(Reward<=8) {
      for (int i = 0; i < 8; i++) {
        
        for (int r = 0; r <= i; r++) {
          System.out.println(positions[0]);
        }
        
        System.out.println(positions[8]);

        for (int m = 0; m < 9 - i; m++) {
          System.out.println(positions[0]);
        }
        
        Thread.sleep(200);

        System.out.print("\033[H\033[2J");
        System.out.flush();
      }
    
      for (int i = 0; i < 8; i++) {
        for (int m = 0; m <= 8; m++) {
          System.out.println(positions[0]);
        }
        System.out.println(positions[8-i]);
        
        System.out.println(positions[0]);

        Thread.sleep(200);

        System.out.print("\033[H\033[2J");
        System.out.flush();        
      }

      for (int i = 1; i < 8; i++) {

        for (int m = 0; m < 9 - i; m++) {
          System.out.println(positions[0]);
        }
        
        System.out.println(positions[1]);

        for (int r = 0; r <= i; r++) {
          System.out.println(positions[0]);
        }


        Thread.sleep(200);

        System.out.print("\033[H\033[2J");
        System.out.flush();
      }

      for (int i = 8; i < 16; i++) {
        
        System.out.println(positions[0]);
        System.out.println(positions[i-8]);

        for (int m = 0; m <= 8; m++) {
          System.out.println(positions[0]);
        }
        
        Thread.sleep(200);

        System.out.print("\033[H\033[2J");
        System.out.flush();        
      }

      Reward++;
    }
  }
}
