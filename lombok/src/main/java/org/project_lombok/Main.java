package org.project_lombok;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {

        // ApplicationContext t1 = new ClassPathXmlApplicationContext("Stringconfig.xml");

        Student s1 =new Student();

        s1.setAge(19);

        System.out.println(s1.getAge());



        System.out.println( s1.toString() );
    }
}
