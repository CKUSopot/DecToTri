import java.util.Scanner;
/**
 * 3. Wzorując się na przykładzie 2 napisz program DecToTri, który będzie konwertował
 * liczbę dziesiętną na zapis trójkowy, użyj wielowariantowej instrukcji if().
 */
public class DecToTri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę dziesiętną dodatnią: ");
        int liczbaD = scanner.nextInt();
        int liczba = liczbaD;
        String wynik = "";
        while (liczba != 0){
            if(liczba % 3 == 0){
                wynik = "0" + wynik;
            }else if (liczba % 3 == 1){
                wynik = "1" + wynik;
            }else{
                wynik = "2" + wynik;
            }
            liczba = liczba / 3;
        }
        System.out.printf("liczba des. %d to zapis trójkowy %s", liczbaD, wynik);
    }

}