import java.util.Scanner;
public class Grade {
public static void main(String args[]) {
int marks[] = new int[6];
float total = 0 , avg = 0;
Scanner scanner = new Scanner(System.in);
for(int i=0;i<6;i++)
{
System.out.println("Enter marks of subject " + (i+1) + ":" );
marks[i] = scanner.nextInt();
total+=marks[i];
}
scanner.close();
avg = total/6;
System.out.println("The grade of the student is: ");
if(avg>=85)
{
System.out.println("A+");
}
else if(avg>=60 && avg<85)
{
Systemou.println("B");
}
else if(avg>=40 && avg<60)
{
System.out.println("C");
}
else
{
System.out.println("D");
}
}
}
