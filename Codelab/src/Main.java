//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        String inputNama, inputLahir;
        String kelamin = null;
        char inputKelamin;

        Scanner input = new Scanner(System.in);
        System.out.print("Nama: ");
        inputNama = input.nextLine();
        System.out.print("Jenis Kelamin (L/P): ");
        inputKelamin = input.next().charAt(0);
        System.out.print("Tanggal Lahir (yyyy-mm-dd): ");
        inputLahir = input.next();

        LocalDate hariIni = LocalDate.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate kelahiran = LocalDate.parse(inputLahir, format);

        Period umur = Period.between(kelahiran, hariIni);
        if (inputKelamin == 'P' ) {
            kelamin = "Perempuan";
        }else if (inputKelamin == 'L') {
            kelamin = "Laki-laki";
        }

        System.out.println("Nama: " + inputNama);
        System.out.println("Jenis Kelamin: " + kelamin);
        System.out.println("Umur: " + umur.getYears() + " tahun " + umur.getMonths() + " bulan.");

    }
}