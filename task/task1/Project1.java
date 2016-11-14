public class Project1{

public static void main(String args[]){

int empNumber[]={1001,1002,1003,1004,1005,1006,1007};

String empName[]={"Ashish","Sushma","Rahul","Chahat","Ranjan","Suman","Tanmay"};

String

joinDate[]={"01/04/2009","23/08/2012","12/11/2008","29/01/2013","16/07/2005","1/1/2000","12/06/

2006"};

char designationCode[]={'e','c','k','r','m','e','c'};

String department[]={"R&D","PM","Acct","Front Desk","Engg","Manufacturing","PM"};

int basic[]={20000,30000,10000,12000,50000,23000,29000};

int hra[]={8000,12000,8000,6000,20000,9000,12000};

int iT[]={3000,9000,1000,2000,20000,4400,10000};

int userInput=Integer.parseInt(args[0]);

int flag=0,i=0,dA=0,salary,index=0;

String designation="employee";

while(i < 7){

if(userInput==empNumber[i]){

flag=1;

index=i;

break;

}

i++;

}

if(flag == 0)

System.out.println("There is no employee with empid:"+userInput);

else{

switch(designationCode[index]){

case 'e':

dA=20000;

designation="Engineer";

break;

case 'c':

dA=32000;

designation="Consultant";

break;

case 'k':

dA=12000;

designation="Clerk";

break;

case 'r':

dA=15000;

designation="Receptionist";

break;

case 'm':

dA=40000;

designation="Manager";

break;

}

salary=basic[index]+hra[index]+dA-iT[index];

System.out.println("Emp No.\tEmp Name\tDepartment\tDesignation\tSalary");

System.out.println(empNumber[index]+"\t"+empName[index]+"\t\t"+department[index]+"\t\t"

+designation+"\t\t"+salary);

}

}

}
