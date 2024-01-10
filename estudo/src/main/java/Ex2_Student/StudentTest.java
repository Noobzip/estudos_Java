package Ex2_Student;

public class StudentTest {

    public static void main(String[] args) {
        Student account1 = new Student("Tata", 80.99);
        Student account2 = new Student("Luizin", 100.00);

        System.out.printf("%s's ficou com nota: %s%n",
                account1.getName(), account1.getLetterGrade());
        System.out.printf("%s's ficou com nota: %s%n",
                account2.getName(), account2.getLetterGrade());
    }
}
