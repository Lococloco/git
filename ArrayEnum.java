
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
enum Command{ADD,LIST,AVG,QUIT,INVALID,SUM,STD}
public class ArrayEnum {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int[] values =new int[100];
        int index = 0;
        while(true){
            final Command command = getCommand(scanner);
            if (command == Command.QUIT){
                System.out.println("Bye!");
                break;
            }
            switch(command){
                case ADD:
                    final int newValue = getValue(scanner);
                    values[index]=newValue;
                    index++;
                    break;
                case LIST:
                    printList(values, index);
                    System.out.printf("");
                    break;
                case AVG:
                    System.out.printf("%.2f%n", getAvg(values, index));
                    break;
                case SUM:
                    System.out.printf("%d%n", getSum(values, index));
                    break;
                case STD:
                    System.out.printf("%.2f%n", getStd(values, index));
                    break;
                case INVALID:
                    System.out.println("Invalid Command");
                    break;
            }
        }


        }
    public static Command getCommand(java.util.Scanner a){
        String x = a.next();
        Command com;
        try{
            com = Command.valueOf(x.toUpperCase());
        }
        catch (IllegalArgumentException e){com = Command.INVALID;}

        return com;
    }
    public static int getValue(java.util.Scanner a){
        int x = a.nextInt();
        return x;
    }
    public static float getAvg(int[] a, int index){
        int s = 0;
        for (int i=0;i<index; i++){
            s = s+a[i];
        }
        float x =s/index ;
        return x;
    }
    public static float getStd(int[] a, int index){
        float x = getAvg(a,index);
        int s2 = 0;
        for (int i=0;i<index; i++){
            s2 = s2+(a[i]*a[i]);
        }
        float f = (x*x)-s2/index;
        if (f<0){
            f = -f;
            double d = Math.sqrt(f);
            f = (float)d;
        }
        else{
            double d = Math.sqrt(f);
            f = (float)d;
        }
        return f;
    }
    public static int getSum(int[] a, int index){
        int s = 0;
        for (int i=0;i<index; i++){
            s = s+a[i];
        }
        return s;
    }
    public static void printList(int[] a, int index){
        for (int i=0;i<index;i++){
            System.out.printf("%s ",a[i]);
        }
        System.out.printf("");
    }

}
