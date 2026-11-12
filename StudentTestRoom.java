import java.util.Scanner;

public class StudentTestRoom {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Hello. Write your name: ");
    String userName = scanner.nextLine();

    // Создаем объект, сразу передавая имя в конструктор класса Student
    Student firstStudent = new Student(userName);
    
    System.out.println("Ok " + firstStudent.name + ". How old are you?");
    System.out.print("Write here: ");
    
    // Используем int вместо String для сохранения числа
    int userAge = scanner.nextInt();
    firstStudent.age = userAge;

    System.out.println("Well. Have a good time of work.");
    
    scanner.close();
  }
}

