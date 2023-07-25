package java101;

public class OBS {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("mahmut hoca","TRH", "555");
        Teacher t2 = new Teacher("graham bell","FZK","0000");
        Teacher t3 = new Teacher("külyutmaz", "BIO","111");

        Course tarih = new Course ("tarih","101","TRH",t1);
        tarih.addTeacher(t1);
        Course fizik = new Course ("Fizik", "102","FZK");
        fizik.addTeacher(t2);
        Course biyo = new Course("biyoloji","101","BIO");
        biyo.addTeacher(t3);

        Student s1 =new Student("inek şaban","123","4",tarih,fizik,biyo);
        s1.addBulkExamNote(100,78,50);
        s1.isPass();

        Student s2 =new Student("güdük necmi","124","4",tarih,fizik,biyo);
        s1.addBulkExamNote(50,30,70);
        s1.isPass();
    }

}
