package parkir;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author User
 */
public class parkir2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);

            System.out.print("Masukkan jam datang : ");
            int InHour = Integer.parseInt(sc.next());
            System.out.print("Masukkan menit datang : ");
            int InMinute = Integer.parseInt(sc.next());
            System.out.print("Masukkan jam pulang : ");
            int OutHour = Integer.parseInt(sc.next());
            System.out.print("Masukkan menit pulang : ");
            int OutMinute = Integer.parseInt(sc.next());

            int InHinM;
            if (InHour > OutHour) {
                InHinM = (InHour - OutHour) * 60;
            } else {
                InHinM = (OutHour - InHour) * 60;
            }

            int InMAll;
            if (InMinute > OutMinute) {
                InMAll = (InMinute - OutMinute);
            } else {
                InMAll = (OutMinute - InMinute);
            }
            int MinTotal = (InHinM + InMAll);
            int ExMin = MinTotal % 60;
            int TheH = (MinTotal - ExMin) / 60;
            int CeilH = TheH;
            if (ExMin > 0) {
                CeilH = TheH + 1;
                    }
            int Price = ((CeilH - 2) * 1000) + 3000;

            if (InHinM < 60) {
               System.out.println("Lama parkir : " + InMAll);
               System.out.println("Biaya parkir : 3000");
            } else if (InHinM <= 120 && InHinM >= 60) {
	       System.out.println("Lama parkir : " + TheH + " jam " + InMAll + " menit");
               System.out.println("Biaya parkir : 3000");
            } else if (InHinM > 120) {
               System.out.println("Lama parkir : " + TheH + " jam " + InMAll + " menit");
               System.out.println("Biaya parkir : " + Price);
            }
    }
}