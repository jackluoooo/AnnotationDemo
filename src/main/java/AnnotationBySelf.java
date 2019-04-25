import java.util.Date;

@Test02(beanId = 1,className = "com.luo")
public class AnnotationBySelf {
//    @SuppressWarnings("static-acess")//警告
//    @Deprecated
    public static void add() {
        return  ;
    }

    /**
     * jdk 注解
     *
     */


    public static void main(String[] args) {
      add();
    }

    /**
     * 自定义注解
     */


}
