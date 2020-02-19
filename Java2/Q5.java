class Student implements Cloneable{
    int rollno;
    String name;

    Student(int rollno,String name){
        this.rollno=rollno;
        this.name=name;
    }
    public Student(Student std){
        this.name = std.name;
        this.rollno = std.rollno;
    }

    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }

    public static void main(String[] args){
        try{
            Student s1=new Student(4079,"Nishant");

            Student s2=(Student)s1.clone();

            Student s3 = new Student(s1); //copy constructor

            System.out.println(s1.rollno+" "+s1.name);
            System.out.println(s2.rollno+" "+s2.name);
            System.out.println(s3.rollno+" "+s3.name);

        }catch(CloneNotSupportedException c){}

    }
}