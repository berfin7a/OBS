package java101;
public class Teacher {
    String name;
    String mpno;
    String branch;


    Teacher(String name,String branch,String mpno){
        this.name = name;
        this.branch = branch;
        this.mpno = mpno;
    }
    void print(){
        System.out.println("adı : " + this.name);
        System.out.println("bölümü : " + this.branch);
        System.out.println("telefonu : " + this.mpno);
    }

}
