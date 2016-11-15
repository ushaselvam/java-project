import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class CustomerCounter {
public static void main(String args[]) throws IOException {
BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
int counter[][][];
int i = 0,year = Integer.parseInt(args[0]);
int month[]={31,28,31,30,31,30,31,31,30,31,30,31};
if(year % 4 == 0)
month[1] = 29;
else
month[1] = 28;
counter = new int[12][][];
while(i < 12) {
counter[i] = new int[month[i]][24];
i++;
}
for(i = 0;i < 12;i++) {
for(int j=0;j<month[i];j++) {
String str = bf.readLine();
String hour[] = str.split(" ");
for(int k = 0;k < 24;k++) {
counter[i][j][k] = Integer.parseInt(hour[k]);
}
}
}
int sum=0,average;
for(i = 0;i < 31;i++) {
for(int j = 0;j < 24;j++) {
sum=sum+counter[0][i][j];
}
}
average=sum/(24*31);
sum = 0;
System.out.println(" AVERAGE ON JANURAY MONTH "+average);
for(i = 0;i < 24;i++) {
sum=sum+counter[11][20][i];
}
average = sum/24;
System.out.println(" AVERAGE ON DECEMBER 21 "+average);
for(i = 0;i < 12;i++) {
sum = 0;
for(int j = 0; j < 24;j++) {
sum=sum+counter[i][6][j];
}
average=sum/24;
int k=i+1;
System.out.println(" AVERAGE ON MONTH "+k+" DAY 7 "+average);
}
int day=1;
for(i = 0;i < 12;i++) {
for(int j=0;j<month[i];j++) {
sum = 0;
for(int k = 9;k < 18;k++) {
sum=sum+counter[i][j][k];
}
average= sum/9;
System.out.println("AVERAGE ON DAY "+day+" "+average);
day++;
}
}
for(i = 0;i < 12;i++) {
sum=0;
for(int k = 7;k < 13;k++) {
sum=sum+counter[i][4][k];
sum=sum+counter[i][6][k];
sum=sum+counter[i][11][k];
sum=sum+counter[i][15][k];
sum=sum+counter[i][22][k];
}
for(int k = 15;k < 24;k++) {
sum=sum+counter[i][4][k];
sum=sum+counter[i][6][k];
sum=sum+counter[i][11][k];
sum=sum+counter[i][15][k];
sum=sum+counter[i][22][k];
}
average=sum/(5*14);
System.out.println("average on month "+(i+1)+"of 5th,7th,12th,16th & 23rd ofhour 8 to 12 and 16 to 24: "+average);
}
day=1;
for(i = 0;i < 31;i++) {
sum=0;
for(int j = 0;j < 24;j++) {
sum=sum+counter[6][i][j];
}
average = sum/24;
System.out.println("TOTAL & AVERAGE ON JULY DAY "+day+""+sum+"\t"+average);
day++;
}
int yearSum=0;
for(i = 0;i < 12;i++) {
sum=0;
for(int j=0;j<month[i];j++) {
for(int k = 0;k < 24;k++) {
sum=sum+counter[i][j][k];
yearSum=yearSum+counter[i][j][k];
}
}
average=sum/month[i];
System.out.println("TOTAL & AVERAGE OF MONTH "+(i+1)+""+sum+"\t"+average);
}
System.out.println("TOTAL AND AVERAGE OF YEAR "+yearSum+"\t"+(yearSum/365));
}
}
