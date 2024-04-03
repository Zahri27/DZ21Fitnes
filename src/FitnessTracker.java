
public class FitnessTracker {
    private String firstName;
    private String lastName;
    private int birthDay;
    private int birthMonth;
    private int birthYear;
    private String email;
    private String phoneNumber;
    private int weight;
    private String bloodPressure;
    private int stepsPerDay;
    private int age;


    public FitnessTracker(String firstName, String lastName, int birthDay, int birthMonth, int birthYear,
                          String email, String phoneNumber, int weight, String bloodPressure, int stepsPerDay) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.weight = weight;
        this.bloodPressure = bloodPressure;
        this.stepsPerDay = stepsPerDay;

        this.age = 2020 - birthYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


    public int getAge() {
        return age;
    }


    public void printAccountInfo() {
        System.out.println("Имя: " + firstName);
        System.out.println("Фамилия: " + lastName);
        System.out.println("Дата рождения: " + birthDay + "." + birthMonth + "." + birthYear);
        System.out.println("Email: " + email);
        System.out.println("Телефон: " + phoneNumber);
        System.out.println("Вес: " + weight);
        System.out.println("Давление: " + bloodPressure);
        System.out.println("Пройденных за день шагов: " + stepsPerDay);
        System.out.println("Возраст: " + age);
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public void setStepsPerDay(int stepsPerDay) {
        this.stepsPerDay = stepsPerDay;
    }
}

