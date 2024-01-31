class Student {
    int roll;
    int mark;
    String name;
}

public class ArrayOfObject {
    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.roll = 4 ;
        s1.mark = 89 ;
        s1.name = "Tejas";

        Student s2 = new Student();
        s2.roll = 3;
        s2.mark = 58;
        s2.name = "Kishor";

        Student s3 = new Student();
        s3.roll = 5;
        s3.mark = 74;
        s3.name = "Raj";

        Student studs[] = new Student[3];
        studs[0]=s1;
        studs[1]=s2; 
        studs[2]=s3; 

        // for (int i = 0; i < studs.length; i++) {
        //     System.out.println("Roll No: "+ studs[i].roll+"\n"+"Name: "+studs[i].name+"\n");
        // }

        //Advance loop
        for(Student Students: studs){
            System.out.print("\nRoll No: "+ Students.roll+"\n"+"Name: "+Students.name+"\n");
        }
    }
}