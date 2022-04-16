package compass;

public class Main {

    public static void main(String[] args) {
        // задание 1
        String FirstName = " Ivanov ";
        String middleName = " Ivan ";
        String lastName = " Ivanovich ";
        String fullName = FirstName + middleName + lastName;
        System.out.println("FIO sotrydnika" + fullName);

        // задание 2
        String fullNameUp = fullName.toUpperCase();
        System.out.println("dannie sotrydnika" + fullNameUp);

        // задание 3
        String fullName1 = " Ivanov Semen Semenovich";
        String fullNameAp = fullName1.replace('e', 'u');
        System.out.println("dannie sotrydnika" + fullNameAp);
    }
}
