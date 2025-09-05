// import java.util.Scanner;

// public class Level2Programs {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // 1. Basic Calculator
//         double number1, number2;
//         System.out.print("Enter first number: ");
//         number1 = sc.nextDouble();
//         System.out.print("Enter second number: ");
//         number2 = sc.nextDouble();
//         double add = number1 + number2;
//         double sub = number1 - number2;
//         double mul = number1 * number2;
//         double div = number1 / number2;
//         System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers " + number1 + " and " + number2 + " is " + add + ", " + sub + ", " + mul + ", and " + div);

//         // 2. Area of Triangle in sq in and sq cm
//         System.out.print("Enter base in cm: ");
//         double base = sc.nextDouble();
//         System.out.print("Enter height in cm: ");
//         double height = sc.nextDouble();
//         double area_cm = 0.5 * base * height;
//         double area_in = area_cm / (2.54 * 2.54);
//         System.out.println("The Area of the triangle in sq in is " + area_in + " and sq cm is " + area_cm);

//         // 3. Side of Square from Perimeter
//         System.out.print("Enter perimeter of square: ");
//         double perimeter = sc.nextDouble();
//         double side = perimeter / 4;
//         System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);

//         // 4. Distance in Yards and Miles from Feet
//         System.out.print("Enter distance in feet: ");
//         double distanceFeet = sc.nextDouble();
//         double distanceYards = distanceFeet / 3;
//         double distanceMiles = distanceYards / 1760;
//         System.out.println("The distance in yards is " + distanceYards + " while the distance in miles is " + distanceMiles);

//         // 5. Total Price Calculation
//         System.out.print("Enter unit price: ");
//         double unitPrice = sc.nextDouble();
//         System.out.print("Enter quantity: ");
//         int quantity = sc.nextInt();
//         double totalPrice = unitPrice * quantity;
//         System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and unit price is INR " + unitPrice);

//         // 6. Quotient and Remainder
//         System.out.print("Enter first number: ");
//         int n1 = sc.nextInt();
//         System.out.print("Enter second number: ");
//         int n2 = sc.nextInt();
//         int quotient = n1 / n2;
//         int remainder = n1 % n2;
//         System.out.println("The Quotient is " + quotient + " and Reminder is " + remainder + " of two number " + n1 + " and " + n2);

//         // 7. IntOperation Program
//         System.out.print("Enter value of a: ");
//         int a = sc.nextInt();
//         System.out.print("Enter value of b: ");
//         int b = sc.nextInt();
//         System.out.print("Enter value of c: ");
//         int c = sc.nextInt();
//         int op1 = a + b * c;
//         int op2 = a * b + c;
//         int op3 = c + a / b;
//         int op4 = a % b + c;
//         System.out.println("The results of Int Operations are " + op1 + ", " + op2 + ", " + op3 + ", and " + op4);

//         // 8. DoubleOpt Program
//         System.out.print("Enter value of a: ");
//         double da = sc.nextDouble();
//         System.out.print("Enter value of b: ");
//         double db = sc.nextDouble();
//         System.out.print("Enter value of c: ");
//         double dc = sc.nextDouble();
//         double dop1 = da + db * dc;
//         double dop2 = da * db + dc;
//         double dop3 = dc + da / db;
//         double dop4 = da % db + dc;
//         System.out.println("The results of Double Operations are " + dop1 + ", " + dop2 + ", " + dop3 + ", and " + dop4);

//         sc.close();
//     }
// }
