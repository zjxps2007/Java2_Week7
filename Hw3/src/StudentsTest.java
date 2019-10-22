public class StudentsTest {
    public static void main(String[] args) {
        TeacherList f1 =new TeacherList();
        f1.append(new Teacher(123,"Joo0",40));
        f1.append(new Teacher(234,"Joo1",41));
        f1.append(new Teacher(345,"Joo2",42));
        f1.append(new Teacher(456,"Joo3",43));
        Students c = new Students();

        Stu s = new Stu(783,"Hank",98);
        s.setAdvisor(f1.getByName("Joo0"));
        c.append(s);

        s = new Stu(678,"Mike",78);
        s.setAdvisor(f1.getByName("Joo0"));
        c.append(s);

        s = new Stu(678,"Joseph",83);
        s.setAdvisor(f1.getByName("Joo1"));
        c.append(s);

        s = new Stu(678,"Susan",96);
        s.setAdvisor(f1.getByName("Joo2"));
        c.append(s);

        s = new Stu(710,"Flora",64);
        s.setAdvisor(f1.getByName("Joo2"));
        c.append(s);

        s = new Stu(690,"Cathy",95);
        s.setAdvisor(f1.getByName("Joo3"));
        c.append(s);

        System.out.println("1등한 학생의 정보");
        c.sortByScore();
        c.StudentsAt(0).println();
        System.out.println("상위 세 명의 지도교수 평균 나이 \n" +
            (c.StudentsAt(0).getAdvisor().getAge() +
                    c.StudentsAt(1).getAdvisor().getAge() +
                    c.StudentsAt(2).getAdvisor().getAge())/3.0);
    }
}
