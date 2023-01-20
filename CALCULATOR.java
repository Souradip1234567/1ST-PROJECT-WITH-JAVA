import java.util.*;
class Calculator
{
public static void main()
{
    Scanner in =new Scanner(System.in);
    for(int i=1;i<=164;i++)
    System.out.print("*");
    System.out.println("*");
    System.out.println("                                                        NUMBER CONVERSATON CALCULATOR");
    System.out.println("                                                        FOR POSITIVE INTEGERS");
    for(int j=1;j<=164;j++)
    System.out.print("*");
    System.out.println("*");
    System.out.println("Enter 1 for decimal to binary conversaton");
    System.out.println("Enter 2 for decimal to octal conversaton");
    System.out.println("Enter 3 for decimal to hexadecimal conversaton");
    System.out.println("Enter 4 for binary to  decimal conversaton");
    System.out.println("Enter 5 for octal to   decimal conversaton");
    System.out.println("Enter 6 for hexadecimal to decimal conversation");
    int C;
    System.out.println("Enter your choice="); 
    C=in.nextInt();
    switch(C)
    {
    case 1:
    int d1;
    String s1=" ";
    System.out.println("enter the decimal number=");
        d1=in.nextInt();
    int r;
    System.out.println("the binary number is=");
    while(d1!=0)
    {
        r=d1%2;
        s1=r+s1;
        d1=d1/2;
    }
    System.out.println(s1);
    break;
    case 2:
    int d2;
     System.out.println("Enter the decimal number=");
     d2=in.nextInt();
     int r1;
     String s2=" "; 
     System.out.print("The octal number is=");
     while(d2!=0)
     {
         r1=d2%8;
         s2=r1+s2;
         d2=d2/8;
        }
        System.out.println(s2);
        break;
        case 3:
        int d3;
        System.out.println("Enter the decimal number=");
        d3=in.nextInt();
        int r2;
        String s=" ";
        
        System.out.println("The hexadecimal number=");
        while(d3!=0)
        {
            r2=d3%16;
            if(r2<10)
            s=r2+s;
             if(r2==10)
                s="A"+s;
                 if(r2==11)
                s="B"+s;
                if(r2==12)
                s="C"+s;
                if(r2==13)
                s="D"+s;
                if(r2==14)
                s="E"+s;
                if(r2==15)
                s="F"+s;
               d3=d3/16;
        }
            System.out.println(s);
        break;
    case 4:
    int b1;
    System.out.println("Enter the binary number=");
    b1=in.nextInt();
    int r3,c1=-1;
    double S=0;
    System.out.println("The binary number is=");
    while(b1!=0)
    {
        r=b1%10;
        c1++;
        if(r==1)
        S=S+Math.pow(2,c1);
        b1=b1/10;
    }
    System.out.println(S);
    break;
case 5:
int o2;
System.out.println("Enter the octal number=");
o2=in.nextInt();
int r4,c2=-1;
double s3=0;
System.out.println("The decimal number is=");
while(o2!=0)
{
    r4=o2%10;
    c2++;
    if(r4>0)
    
        s3=s3+(Math.pow(8,c2)*r4);
    o2=o2/10;
}
System.out.println(s3);
break;
case 6:
String t;
System.out.println("Enter the hexadecimal number=");
t=in.next();
String t1=" ";
int l=t.length();
char cc;
for(int j=0;j<l;j++)
{
    cc=t.charAt(j);
    t1=cc+t1;
}
    

char c;
double s7=0;
System.out.println("The decimal number is=");
for(int i=0;i<l;i++)
{
    c=t1.charAt(i);
    if(c=='1')
    s7=s7+(Math.pow(16,i)*1);
    if(c=='2')
    s7=s7+(Math.pow(16,i)*2);
    if(c=='3')
    s7=s7+(Math.pow(16,i)*3);
if(c=='4')
    s7=s7+(Math.pow(16,i)*4);
      if(c=='5')
    s7=s7+(Math.pow(16,i)*5);
    if(c=='6')
    s7=s7+(Math.pow(16,i)*6);
    if(c=='7')
    s7=s7+(Math.pow(16,i)*7);
    if(c=='8')
    s7=s7+(Math.pow(16,i)*8);
if(c=='9')
    s7=s7+(Math.pow(16,i)*9);
       if(c=='A')
    s7=s7+(Math.pow(16,i)*10);
    if(c=='B')
    s7=s7+(Math.pow(16,i)*11);
    if(c=='C')
    s7=s7+(Math.pow(16,i)*12);
  if(c=='D')
    s7=s7+(Math.pow(16,i)*13);
    if(c=='E')
    s7=s7+(Math.pow(16,i)*14);
    if(c=='F')
    s7=s7+(Math.pow(16,i)*15);
}
System.out.println(s7);
break;
default:
System.out.println("Wrong choice!! please input again");
}}}

            
                
                
        
        
     
     
    


