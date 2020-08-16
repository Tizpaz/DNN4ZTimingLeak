import java.math.BigInteger;
import java.util.Random;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class B_L_3 {
    public static int N;
    public static int f0, f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15;
    public static Random rand;
    public static void main(String[] args) throws InterruptedException {

        if (args.length > 0) {
          int secret = Integer.parseInt(args[0]);
          N = Integer.parseInt(args[1]);
          int counter = 0;
          long dur = 0;
          while(counter < 10) {
              long startTime = System.nanoTime();
              if (secret <= 10) {
                   f0();
              }
              else if (secret <= 15) {
                   f1();
              }
              else if (secret <= 20){
                   f2();
              }
              else if (secret <= 30){
                  f3();
              }
              else if (secret <= 35) {
                  f4();
              }
              else if (secret <= 40){
                  f5();
              }
              else if (secret <= 45){
                  f6();
              }
              else if (secret <= 50){
                  f7();
              }
              else if (secret <= 60) {
                  f8();
              }
              else if (secret <= 65) {
                  f9();
              }
              else if (secret <= 70){
                  f10();
              }
              else if (secret <= 75){
                  f11();
              }
              else if (secret <= 80) {
                  f12();
              }
              else if (secret <= 85){
                  f13();
              }
              else if (secret <= 95){
                  f14();
              }
              else{
                  f15();
              }
              long endTime = System.nanoTime();
              long elapsedTime = endTime - startTime;
              double duration = (double)elapsedTime;
              dur = dur + (long) duration;
              counter++;
            }
            dur /= 10;
            FileWriter pw;
            try
            {
                File file = new File("B_L_3_time.csv");
                if (!file.exists()) {
                    file.createNewFile();
                }
                pw = new FileWriter(file.getAbsoluteFile(), true);
                pw.append(String.valueOf(N)+','+String.valueOf(f0)+','+String.valueOf(f1)+','+String.valueOf(f2)+','+String.valueOf(f3)+','+String.valueOf(f4)+','+String.valueOf(f5)+','+String.valueOf(f6)+','+String.valueOf(f7)+','+String.valueOf(f8)+','+String.valueOf(f9)+','+String.valueOf(f10)+','+String.valueOf(f11)+','+String.valueOf(f12)+','+String.valueOf(f13)+','+String.valueOf(f14)+','+String.valueOf(f15)+','+String.valueOf(dur));
                pw.append('\n');
                pw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    private static void f0() throws InterruptedException {
        f0 = 1;
    }
    private static void f1() throws InterruptedException {
        f1 = 1;
        for(int i = 0; i < N;i++){
            Thread.sleep(1);
        }
    }
    private static void f2() throws InterruptedException {
        f2 = 1;
        for(int i = 0; i < N;i++){
            Thread.sleep(2);
        }
    }
    private static void f3() throws InterruptedException {
        f3 = 1;
        for(int i = 0; i < N;i++){
            Thread.sleep(3);
        }
    }
    private static void f4() throws InterruptedException {
        f4 = 1;
        for(int i = 0; i < N;i++){
            Thread.sleep(4);
        }
    }
    private static void f5() throws InterruptedException {
        f5 = 1;
        for(int i = 0; i < N;i++){
            Thread.sleep(5);
        }
    }
    private static void f6() throws InterruptedException {
        f6 = 1;
        for(int i = 0; i < N;i++){
            Thread.sleep(6);
        }
    }
    private static void f7() throws InterruptedException {
        f7 = 1;
        for(int i = 0; i < N;i++){
            Thread.sleep(7);
        }
    }
    private static void f8() throws InterruptedException {
        f8 = 1;
        for(int i = 0; i < N;i++){
            Thread.sleep(8);
        }
    }
    private static void f9() throws InterruptedException {
        f9 = 1;
        for(int i = 0; i < N;i++){
            Thread.sleep(9);
        }
    }
    private static void f10() throws InterruptedException {
        f10 = 1;
        for(int i = 0; i < N;i++){
            Thread.sleep(10);
        }
    }
    private static void f11() throws InterruptedException {
        f11 = 1;
        for(int i = 0; i < N;i++){
            Thread.sleep(11);
        }
    }
    private static void f12() throws InterruptedException {
        f12 = 1;
        for(int i = 0; i < N;i++){
            Thread.sleep(12);
        }
    }
    private static void f13() throws InterruptedException {
        f13 = 1;
        for(int i = 0; i < N;i++){
            Thread.sleep(13);
        }
    }
    private static void f14() throws InterruptedException {
        f14 = 1;
        for(int i = 0; i < N;i++){
            Thread.sleep(14);
        }
    }
    private static void f15() throws InterruptedException {
        f15 = 1;
        for(int i = 0; i < N;i++){
            Thread.sleep(15);
        }
    }
}