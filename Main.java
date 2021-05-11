public class Main {
    public static void main(String[] args) {

        InstructorManager instructorManager = new InstructorManager();
        StudentManager studentManager = new StudentManager();
        UserManager userManager = new UserManager();

        Student student1 = new Student(3156, "murat küçük", "159357");
        Instructor instructor1 = new Instructor(123,"Engin Demiroğ", "bişeyi");


        studentManager.remove(student1);
        userManager.add(student1);
        instructorManager.addHomework(instructor1);

    }
}
