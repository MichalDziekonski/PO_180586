public class Course {
    private String name;  // Pole z nazwa nie moze byc statyczne musi byc oddielne dla kazdego obieku
    private static final int MAX_STUDENTS = 5;  // Maksymalna liczba studentow nie powinna byc latwa do zmiany bo ustala limit
    private static int numberOfCreatedCourses;  // Liczba musi byc wspulna dla kazdego obiektu pokazuje liczbe stworzonych obiekow

    public Course(String name) {
        if (numberOfCreatedCourses < MAX_STUDENTS) {
            numberOfCreatedCourses++;
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getNumberOfCreatedCourses() {
        return numberOfCreatedCourses;
    }
}
