import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    private static User[] users=null;

    public static  void main(String[] args){
                /*
        开始读文件
         */
        File file=new File("C:\\Users\\dell\\IdeaProjects\\comshop\\src\\users.xlsx");
        ReadExcel readExcel=new ReadExcel();//创建对象
        User Users[]=readExcel.readExcel(file);

        System.out.println("请输入用户名: ");

        Scanner sc=new Scanner(System.in);
        String username=sc.next();

        System.out.println("请输入密码:");
        String password=sc.next();

        for(User user:users){
            if(username.equals(user.getUsername())&&password.equals(user.getPassword())){
                System.out.println("登录成功");
            }
        }
    }
}
