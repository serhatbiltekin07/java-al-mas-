//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Course course1 = new Course(1, "Java", "Java and React", "Engin Demiroğ");
        Course course2 = new Course(2, "C#", "backand","serhat biltekin");
        Course course3 = new Course(3, "React", "frontend", "Kurtuluş");

        Course[] courses ={course1, course2, course3};
        for (Course course : courses){
            System.out.println(course.courseName);
        }
        System.out.println("************************************************************************************");

        Teacher teacher1 = new Teacher(1, "Engin");
        Teacher teacher2 = new Teacher(2, "Biltekin");

        System.out.println("Eğitmenler");
        Teacher[] teachers = {teacher1, teacher2};
        for (Teacher teacher : teachers){
            System.out.println(teacher.id +":"+ teacher.name);
        }

        CourseManager courseManager = new CourseManager();
        courseManager.addToCourse(course1);
        courseManager.addToCourse(course2);
        courseManager.addToCourse(course3);






    }
}