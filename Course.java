package java101;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;

    Course(String name,String code,String prefix,Teacher teacher){
        this.name =name;
        this.code =code;
        this.prefix =prefix;
        int note = 0;

    }
    void addTeacher(Teacher teacher){
        this.teacher =teacher;
        printTeacherInfo();
    }
    void printTeacherInfo(){
        this.teacher.print();
    }


}
