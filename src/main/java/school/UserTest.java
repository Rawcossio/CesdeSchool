package school;

public class UserTest {
    public static void main(String[] args) {
        User user=new User();
        Student student=new Student();

        user.setUserId(1);
       // student.id=1;
        System.out.println(user.getUserId());

        System.out.println(user.getUserName());

    }
}
