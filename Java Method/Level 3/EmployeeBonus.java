import java.util.Random;
public class EmployeeBonus {
    public static double[][] generateData(){
        Random r=new Random();
        double[][] data=new double[10][2];
        for(int i=0;i<10;i++){
            data[i][0]=10000+r.nextInt(90000);
            data[i][1]=r.nextInt(11);
        }
        return data;
    }
    public static double[][] calculateBonus(double[][] data){
        double[][] result=new double[10][3];
        for(int i=0;i<10;i++){
            double salary=data[i][0];
            double years=data[i][1];
            double bonus=(years>5)?salary*0.05:salary*0.02;
            result[i][0]=salary+bonus;
            result[i][1]=bonus;
            result[i][2]=salary;
        }
        return result;
    }
    public static void main(String[] args){
        double[][] data=generateData();
        double[][] result=calculateBonus(data);
        double sumOld=0,sumNew=0,sumBonus=0;
        System.out.println("OldSalary\tYears\tNewSalary\tBonus");
        for(int i=0;i<10;i++){
            sumOld+=result[i][2];
            sumNew+=result[i][0];
            sumBonus+=result[i][1];
            System.out.println(result[i][2]+"\t"+data[i][1]+"\t"+result[i][0]+"\t"+result[i][1]);
        }
        System.out.println("Total Old Salary: "+sumOld);
        System.out.println("Total New Salary: "+sumNew);
        System.out.println("Total Bonus: "+sumBonus);
    }
}
