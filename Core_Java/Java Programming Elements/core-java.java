// import java.util.Scanner;

// public class Level1Programs {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int birthYear = 2000;
//         int currentYear = 2024;
//         int age = currentYear - birthYear;
//         System.out.println("Harry's age in 2024 is " + age);

//         int maths = 94, physics = 95, chemistry = 96;
//         double avgPCM = (maths + physics + chemistry) / 3.0;
//         System.out.println("Sam’s average mark in PCM is " + avgPCM);

//         double km1 = 10.8;
//         double miles1 = km1 / 1.6;
//         System.out.println("The distance " + km1 + " km in miles is " + miles1);

//         double cp = 129, sp = 191;
//         double profit = sp - cp;
//         double profitPercent = (profit / cp) * 100;
//         System.out.println("The Cost Price is INR " + cp + " and Selling Price is INR " + sp +
//                 "\nThe Profit is INR " + profit + " and the Profit Percentage is " + profitPercent);

//         int pens = 14, students = 3;
//         int pensPerStudent = pens / students;
//         int remainingPens = pens % students;
//         System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens);

//         double fee = 125000;
//         double discountPercent = 10;
//         double discount = fee * discountPercent / 100;
//         double finalFee = fee - discount;
//         System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);

//         double radiusKm = 6378;
//         double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);
//         double radiusMiles = radiusKm / 1.6;
//         double volumeMiles3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);
//         System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 + " and cubic miles is " + volumeMiles3);

//         System.out.print("Enter distance in km: ");
//         double km2 = sc.nextDouble();
//         double miles2 = km2 / 1.6;
//         System.out.println("The total miles is " + miles2 + " mile for the given " + km2 + " km");

//         System.out.print("Enter student fee: ");
//         double fee2 = sc.nextDouble();
//         System.out.print("Enter discount percent: ");
//         double discountPercent2 = sc.nextDouble();
//         double discount2 = fee2 * discountPercent2 / 100;
//         double finalFee2 = fee2 - discount2;
//         System.out.println("The discount amount is INR " + discount2 + " and final discounted fee is INR " + finalFee2);

//         System.out.print("Enter height in cm: ");
//         double heightCm = sc.nextDouble();
//         double totalInches = heightCm / 2.54;
//         double feet = (int) (totalInches / 12);
//         double inches = totalInches % 12;
//         System.out.println("Your Height in cm is " + heightCm + " while in feet is " + feet + " and inches is " + inches);

//         System.out.print("Enter first number: ");
//         double number1 = sc.nextDouble();
//         System.out.print("Enter second number: ");
//         double number2 = sc.nextDouble();
//         double add = number1 + number2;
//         double sub = number1 - number2;
//         double mul = number1 * number2;
//         double div = number1 / number2;
//         System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + number1 + " and " + number2 + " is " + add + ", " + sub + ", " + mul + ", and " + div);

//         System.out.print("Enter base: ");
//         double base = sc.nextDouble();
//         System.out.print("Enter height: ");
//         double height = sc.nextDouble();
//         double areaCm = 0.5 * base * height;
//         double areaIn = areaCm / (2.54 * 2.54);
//         System.out.println("The Area of the triangle in sq in is " + areaIn + " and sq cm is " + areaCm);

//         System.out.print("Enter perimeter: ");
//         double perimeter = sc.nextDouble();
//         double side = perimeter / 4;
//         System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);

//         System.out.print("Enter distance in feet: ");
//         double distanceFeet = sc.nextDouble();
//         double distanceYards = distanceFeet / 3;
//         double distanceMiles = distanceYards / 1760;
//         System.out.println("The distance in yards is " + distanceYards + " while the distance in miles is " + distanceMiles);

//         System.out.print("Enter unit price: ");
//         double unitPrice = sc.nextDouble();
//         System.out.print("Enter quantity: ");
//         int quantity = sc.nextInt();
//         double totalPrice = unitPrice * quantity;
//         System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and unit price is INR " + unitPrice);

//         System.out.print("Enter number of students: ");
//         int n = sc.nextInt();
//         int handshakes = (n * (n - 1)) / 2;
//         System.out.println("The number of possible handshakes is " + handshakes);

//         sc.close();
//     }
// }
