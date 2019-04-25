
@interface  Table{
    String value();
}

@interface Property{
    String name();

    int length() default 0;
}

@Table(value = "l_student")
class Student{
    @Property(name = "student_id",length = 10)
    private String studentId;
    @Property(name = "student_name",length = 10)
    private String studentName;
    @Property(name = "student_age",length = 10)
    private String studentAge;
}


public class Test03 {
    public static void main(String[] args) throws Exception{
        Class.forName("Student");
    }
}
