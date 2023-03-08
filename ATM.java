ATM TRANSACTION
Code:
package com.Trasaction;
import java.util.Scanner;
public class AtmTransaction {
static int bal =15000;
public static void main(String[] args) {
Scanner sc =new Scanner(System.in);
int amt;
if(pinverify(sc))
{
System.out.println("Pin verified");
while(true)
{
System.out.println("1.Balance\n2.Deposit\n3.Withdraw\n4.Exit"
System.out.println("Enter Your Choice: ");
switch(Integer.parseInt(sc.nextLine()))
{
case 1:
System.out.println("Available Bal: "+bal);
break;
case 2:
System.out.println("Enter Amount To be Deposited: ");
amt = Integer.parseInt(sc.nextLine());
if(amt%100==0)
{
bal+=amt; //bal = bal +amt;
System.out.println("Available Bal: "+bal);
}
else
{
System.out.println("Invalid Amount Format");
}
break;
case 3:
System.out.println("Enter Amount To be Withdrawn: ");
amt = Integer.parseInt(sc.nextLine());
if(amt%100==0)
{
if(amt<bal)
{
bal-=amt;
System.out.println("Available Bal: "+bal);
}
else
System.out.println("Insufficient Balance");
}
else
{
System.out.println("Invalid Amount Format");
}
break;
case 4:
sc.close();
System.out.println("Thanks For using Services\nVisit Again!!"
System.exit(0);
default:
System.out.println("Invalid Selection");
}
}
}
else
{
sc.close();
System.out.println("Reach nearest Branch to change Pin");
System.exit(0);
}
}
static boolean pinverify(Scanner sc)
{
int pinchances=3;
while(true)
{
System.out.println("Enter Pin No: ");
int pin = Integer.parseInt(sc.nextLine());
switch(pin)
{
case 1111:
case 3333:
case 2222:
return true;
default:
System.out.println("Invalid Pin");
System.out.println("Chances Left: "+--pinchances);
}
if(pinchances==0)
return false;
}
}
}
