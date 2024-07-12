class Student
{
    int rollno;
    String name;
    int marks;
}
class Demo{
    public static void main(String[] args)
    {
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Abc";
        s1.marks =50;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Def";
        s2.marks =67;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "virat";
        s3.marks =97;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        //System.out.println(s1);
        // for(int i=0;i<students.length;i++)
        // {
        //     System.out.println(students[i]);
        //     System.out.println(students[i].name+" : "+students[i].rollno+" marks : "+students[i].marks);
        // }
        for(Student stud : students)
        {
             System.out.println(stud.name+" : "+stud.rollno+" marks : "+stud.marks);
        }
    }
}