public class Course {
    int id;
    String courseName;
    String detail;
    String teacherName;
    public  Course(){
        //System.out.println("merhaba");
    }
    public Course(int id, String courseName, String detail, String teacherName){
        this.id =id;
        this.courseName = courseName;
        this.detail =detail;
        this.teacherName= teacherName;

    }
}
