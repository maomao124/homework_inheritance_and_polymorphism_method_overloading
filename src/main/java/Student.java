/**
 * Project name(项目名称)：作业_继承和多态之方法重载
 * Package(包名): PACKAGE_NAME
 * Class(类名): Student
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/27
 * Time(创建时间)： 10:18
 * Version(版本): 1.0
 * Description(描述)： 无
 */

/**
 * 任务：使用重载方法为 Student 类创建三个构造方法。
 * 类名为：Student
 */

public class Student
{
    private String name;  // 学生的姓名
    private String num;  // 学生的学号信息
    private double grades;  // 学生的成绩
    // 请在下面的Begin-End之间按照注释中给出的提示编写正确的代码
    /********** Begin **********/
    // 创建一个有参构造函数，携带一个学生姓名的参数
    public Student(String name)
    {
        this.name = name;
    }

    // 创建一个有参构造函数，携带学生姓名和学生学号信息的参数

    public Student(String name, String num)
    {
        this.name = name;
        this.num = num;
    }


    // 创建一个有参构造函数，携带学生姓名、学生学号和学生成绩信息的参数

    public Student(String name, String num, double grades)
    {
        this.name = name;
        this.num = num;
        this.grades = grades;
    }

    /********** End **********/
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getNum()
    {
        return num;
    }

    public void setNum(String num)
    {
        this.num = num;
    }

    public double getGrades()
    {
        return grades;
    }

    public void setGrades(double grades)
    {
        this.grades = grades;
    }

    @Override
    public String toString()
    {
        return "Student{" +
                "name='" + name + '\'' +
                ", num='" + num + '\'' +
                ", grades=" + grades +
                '}';
    }

    public static void main(String[] args)
    {
        Student s1=new Student("zhangsan");
        Student s2=new Student("lisi","0035");
        Student s3=new Student("wangwu","0056",82.0);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
