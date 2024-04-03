import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        FitnessTracker user1 = createUser(scanner);
        FitnessTracker user2 = createUser(scanner);
        FitnessTracker user3 = createUser(scanner);


        System.out.println("Информация о пользователе 1:");
        user1.printAccountInfo();
        System.out.println();

        System.out.println("Информация о пользователе 2:");
        user2.printAccountInfo();
        System.out.println();

        System.out.println("Информация о пользователе 3:");
        user3.printAccountInfo();
        System.out.println();


        updateUserInfo(scanner, user1);
        updateUserInfo(scanner, user2);


        System.out.println("Новая информация о пользователе 1:");
        user1.printAccountInfo();
        System.out.println();

        System.out.println("Новая информация о пользователе 2:");
        user2.printAccountInfo();
        System.out.println();
    }


    public static FitnessTracker createUser(Scanner scanner) {
        System.out.println("Введите данные нового пользователя:");

        System.out.print("Имя: ");
        String firstName = scanner.nextLine();

        System.out.print("Фамилия: ");
        String lastName = scanner.nextLine();

        System.out.print("День рождения: ");
        int birthDay = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Месяц рождения: ");
        int birthMonth = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Год рождения: ");
        int birthYear = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("Телефон: ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Вес: ");
        int weight = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Давление (систолическое/диастолическое): ");
        String bloodPressure = scanner.nextLine();

        System.out.print("Пройденных за день шагов: ");
        int stepsPerDay = scanner.nextInt();
        scanner.nextLine();

        return new FitnessTracker(firstName, lastName, birthDay, birthMonth, birthYear,
                email, phoneNumber, weight, bloodPressure, stepsPerDay);
    }


    public static void updateUserInfo(Scanner scanner, FitnessTracker user) {
        System.out.println("Обновление информации о пользователе " + user.getFirstName() + ":");

        System.out.print("Фамилия: ");
        String lastName = scanner.nextLine();
        user.setLastName(lastName);

        System.out.print("Вес: ");
        int weight = scanner.nextInt();
        user.setWeight(weight);

        scanner.nextLine();

        System.out.print("Давление (систолическое/диастолическое): ");
        String bloodPressure = scanner.nextLine();
        user.setBloodPressure(bloodPressure);

        System.out.print("Пройденных за день шагов: ");
        int stepsPerDay = scanner.nextInt();
        user.setStepsPerDay(stepsPerDay);

        scanner.nextLine();
    }
}
