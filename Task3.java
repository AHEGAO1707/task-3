import java.util.Scanner;
public class Task3 {
    public static void Number1()
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число:");
        int n1 = in.nextInt();

        System.out.println("Введите второе число");
        int n2 = in.nextInt();

        n1=n1+n2;
        n2=n1-n2;
        n1=n1-n2;

        System.out.println(n1);

        System.out.println(n2);
    }
    public static void Number2()
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число:");
        int n1 = in.nextInt();

        System.out.println("Введите второе число");
        int n2 = in.nextInt();

        System.out.println("Введите третье число");
        int n3 = in.nextInt();

        if (n1==n2 & n2==n3 & n1==n3)
        System.out.println("NO");
        if(n1 != n2 | n1 != n3 | n2 != n3)
        {
            if ((n1 >= n2 & n1 > n3) | (n1 > n2 & n1 >= n3 ))
            {
            if (n2 < n3)
                System.out.println(n3);
            if (n2 > n3)
                System.out.println(n2);
            if (n2 == n3)
                System.out.println(n1);
            }
            if (n2 > n1 & n2 >= n3)
            {
            if (n1 > n3)
                System.out.println(n1);
            if (n1 < n3)
                System.out.println(n3);
            if (n1 == n3)
                System.out.println(n2);
            }
            if (n3 > n1 & n3 > n2)
            {
            if (n1 > n2)
                System.out.println(n1);
            if (n1 < n2)
                System.out.println(n2);
            if (n1 == n2)
                System.out.println(n3);
            }
        }
    }
    public static void Number3()
    {
    Scanner in = new Scanner(System.in);

    float L=0;

          System.out.println("Введите число:");
    float n = in.nextFloat();

          if (n>1)
    L=n-1;

          if (n<0)
    L=-n;

          System.out.println(L);
    }
    public static void Number5()
    {
        Scanner in = new Scanner(System.in);

        float D;
        double x1;
        double x2;

        System.out.println("Введите a:");
        float a = in.nextFloat();

        System.out.println("Введите b");
        float b = in.nextFloat();

        System.out.println("Введите c");
        float c = in.nextFloat();

        D=b*b-4*a*c;

        while (D<=0)
        {
            System.out.println("Ошибка. Введите новые значения");

            System.out.println("Введите a:");
            a = in.nextFloat();

            System.out.println("Введите b");
            b = in.nextFloat();

            System.out.println("Введите c");
            c = in.nextFloat();

            D=b*b-4*a*c;
        }
           x1=(-b+Math.sqrt(D))/2*a;
           x2=(-b-Math.sqrt(D))/2*a;

        System.out.println(x1);
        System.out.println(x2);

    }
    public static void Number4()
    {
        Scanner in = new Scanner(System.in);

        float SA;

        System.out.println("Введите первое число:");
        int n1 = in.nextInt();

        System.out.println("Введите второе число");
        int n2 = in.nextInt();

        System.out.println("Введите третье число");
        int n3 = in.nextInt();

        SA=(n1+n2+n3)/3;

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(SA);


    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер задачи:");
        int n = in.nextInt();
        while (n > 0 & n < 6)
        {
        if (n==1)
        {
            System.out.println("Задача 1");
            Number1();
        }
        if (n==2)
        {
            System.out.println("Задача 2");
            Number2();
        }
        if (n==3)
        {
            System.out.println("Задача 3");
            Number3();
        }
        if (n==4)
        {
            System.out.println("Задача 4");
            Number4();
        }
        if (n==5)
        {
            System.out.println("Задача 5");
            Number5();
        }
        System.out.println("Введите номер задачи:");
        n = in.nextInt();
        }
    }
}
