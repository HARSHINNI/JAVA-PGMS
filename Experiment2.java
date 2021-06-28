import java.util.Scanner;
class Currency{
 public double EURO_INR(double EURO){
 return EURO * 80;
 }
 public double DOLLAR_INR(double DOLLAR){
 return DOLLAR * 66.89;
 }public double YEN_INR(double YEN){
 return YEN * 0.61;
 }
 public double INR_EURO(double INR){
 return INR * 0.013;
 }
 public double INR_DOLLAR(double DOLLAR){
 return DOLLAR * 0.015;
 }
 public double INR_YEN(double YEN){
 return YEN * 1.63; 
 }
 public void CurrencyConverter(){
 Scanner s = new Scanner(System.in);
 int Choice;
 double Money;
 do
 {
 System.out.println("+------------------------+");
 System.out.println("| Currency Converter |");
 System.out.println("+------------------------+");
 System.out.println("| 1. DOLLAR -> INR |");
 System.out.println("| 2. EURO -> INR |");
 System.out.println("| 3. YEN -> INR |");
 System.out.println("| 4. INR -> DOLLAR |");
 System.out.println("| 5. INR -> EURO |");
 System.out.println("| 6. INR -> YEN |");
 System.out.println("| 7. Exit |");
 System.out.println("+------------------------+");
 System.out.print("Enter Your Choice: ");
 Choice = s.nextInt();
 switch(Choice){
 case 1:
 {
 System.out.print("Enter the Amount in DOLLAR: ");
 Money = s.nextDouble();
 System.out.println(Money + "DOLLAR is Equal to "+ DOLLAR_INR(Money) +" INR");
 break;
 }
 case 2:
 {
 System.out.print("Enter the Amount in EURO: ");
 Money = s.nextDouble();
 System.out.println(Money + "Euro is Equal to "+ EURO_INR(Money) +" INR");
 break;
 }
 case 3:
 {
 System.out.print("Enter the Amount in YEN: ");
 Money = s.nextDouble();
 System.out.println(Money + "YEN is Equal to "+ YEN_INR(Money) +" INR");
 break;
 }
 case 4:
 {
 System.out.print("Enter the Amount in INR: ");
 Money = s.nextDouble();System.out.println(Money + "INR is Equal to "+ INR_DOLLAR(Money) +" DOLLAR");
 break;
 }
 case 5:
 {
 System.out.print("Enter the Amount in INR: ");
 Money = s.nextDouble();
 System.out.println(Money + "INR is Equal to "+ INR_EURO(Money) +" EURO");
 break;
 }
 case 6:
 {
 System.out.print("Enter the Amount in INR: ");
 Money = s.nextDouble();
 System.out.println(Money + "INR is Equal to "+ INR_YEN(Money) +" YEN");
 break;
 }
 }
 }while(Choice != 7);
 }
}
class Distances{
 public double METER_KILOMETER(double METER){
 return METER / 1000;
 }
 public double MILE_KILOMETER(double MILE){
 return MILE * 1.60934;
 }
 public double KILOMETER_METER(double KILOMETER){
 return KILOMETER * 1000;
 }
 public double KILOMETER_MILE(double KILOMETER){
 return KILOMETER / 1.60934;
 }
 public void DistanceConverter(){
 Scanner s = new Scanner(System.in);
 int Choice;
 double Distance;
 do
 {
 System.out.println("+------------------------+");
 System.out.println("| Distance Converter |");
 System.out.println("+------------------------+");
 System.out.println("| 1. METER -> KILOMETER |");
 System.out.println("| 2. MILES -> KILOMETER |");
 System.out.println("| 3. KILOMETER -> METER |");
 System.out.println("| 4. KILOMETER -> MILES |");
 System.out.println("| 5. Exit |");
 System.out.println("+------------------------+");
 System.out.print("Enter Your Choice: ");
 Choice = s.nextInt();
 switch(Choice){
 case 1:
 {
 System.out.print("Enter the Distance in METER: ");Distance = s.nextDouble();
 System.out.println(Distance + "METER is Equal to "+ METER_KILOMETER(Distance) +" KILOMETER");
 break;
 }
 case 2:
 {
 System.out.print("Enter the Distance in MILE: ");
 Distance = s.nextDouble();
 System.out.println(Distance + "MILE is Equal to "+ MILE_KILOMETER(Distance) +" KILOMETER");
 break;
 }
 case 3:
 {
 System.out.print("Enter the Distance in KILOMETER: ");
 Distance = s.nextDouble();
 System.out.println(Distance + "KILOMETER is Equal to "+ KILOMETER_METER(Distance) +" METER");
 break;
 }
 case 4:
 {
 System.out.print("Enter the Distance in KILOMETER: ");
 Distance = s.nextDouble();
 System.out.println(Distance + "KILOMETER is Equal to "+ KILOMETER_MILE(Distance) +" MILE");
 break;
 }
 }
 }while(Choice != 5);
 }
}
class Time{
 public double HOURS_MINUTES(double Hours){
 return Hours * 60;
 }
 public double HOURS_SECONDS(double Hours){
 return Hours * 60 * 60;
 }
 public double MINUTES_HOURS(double MINUTES){
 return MINUTES / 60;
 }
 public double SECONDS_HOURS(double SECONDS){
 return SECONDS / 60 / 60;
 }
 public void TimeConverter(){
 Scanner s = new Scanner(System.in);
 int Choice;
 double time;
 do
 {
 System.out.println("+------------------------+");
 System.out.println("| Time Converter |");
 System.out.println("+------------------------+");
 System.out.println("| 1. HOURS -> MINUTES |");
 System.out.println("| 2. HOURS -> SECONDS |");
 System.out.println("| 3. MINUTES -> HOURS |");
 System.out.println("| 4. SECONDS -> HOURS |");
 System.out.println("| 5. Exit |");
 System.out.println("+------------------------+");
 System.out.print("Enter Your Choice: ");
 Choice = s.nextInt();
 switch(Choice){
 case 1:
 {
 System.out.print("Enter the Time in HOURS: ");
 time = s.nextDouble();
 System.out.println(time + "HOURS is Equal to "+ HOURS_MINUTES(time) +" MINUTES");
 break;
 }
 case 2:
 {
 System.out.print("Enter the Time in HOURS: ");
 time = s.nextDouble();
 System.out.println(time + "HOURS is Equal to "+ HOURS_SECONDS(time) +" SECONDS");
 break;
 }
 case 3:
 {
 System.out.print("Enter the Time in MINUTES: ");
 time = s.nextDouble();
 System.out.println(time + "MINUTES is Equal to "+ MINUTES_HOURS(time) +" HOURS");
 break;
 }
 case 4:
 {
 System.out.print("Enter the Time in SECONDS: ");
 time = s.nextDouble();
 System.out.println(time + "SECONDS is Equal to "+ SECONDS_HOURS(time) +" HOURS");
 break;
 }
 }
 }while(Choice != 5);
 }
}
public class Experiment2{
 public static void main(String[] args){
 Scanner s = new Scanner(System.in);
 int Choice;
 do
 {
 System.out.println("+------------------------+");
 System.out.println("| Converters |");
 System.out.println("+------------------------+");
 System.out.println("| 1. Currency Converter |");System.out.println("| 2. Distance Converter |");
 System.out.println("| 3. Time Converter |");
 System.out.println("| 4. Exit |");
 System.out.println("+------------------------+");
 System.out.print("Enter Your Choice: ");
 Choice = s.nextInt();
 switch(Choice){
 case 1:
 {
 Currency C = new Currency();
 C.CurrencyConverter();
 break;
 }
 case 2:
 {
 Distances D = new Distances();
 D.DistanceConverter();
 break;
 }
 case 3:
 {
 Time T = new Time();
 T.TimeConverter();
 break;
 }
 }
 }while(Choice != 4);
 }
}