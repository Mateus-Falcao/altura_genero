import java.util.Scanner;

public class  Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totaldehomens = 0;

        int totaldemulheres = 0;

        double sumAlturahomens = 0;

        double maiorH = Double.MIN_VALUE;

        double menorH= Double.MAX_VALUE;
        for (int i = 1; i <= 15; i++) {
            System.out.println("Pessoa " + i);
            System.out.print("Digite a altura: ");
            double altura = scanner.nextDouble();
            System.out.print("Digite o genero (M para masculino, F para feminino): ");
            char genero = scanner.next().charAt(0);
            if (genero == 'M' || genero == 'm') {
                totaldeHomens++;
                somaAH += h;
            } else if (genero == 'F' || genero == 'f') {
                totaldemulheres++;
            }
            if (altura > maiorH) {
                maiorH = altura;
            }
            if (altura < menorH) {
                menorH = altura;
            }
        }
        double mediaAlturaHomens = totalHomens > 0 ? somaAlturaHomens / totalHomens : 0;
        System.out.println("\nResultados:");
        System.out.println("Total dos homens: " + totalHomens);
        System.out.println("Total das mulheres: " + totalMulheres);
        System.out.println("Média H dos homens: " + mediaAlturaHomens + " metros");
        System.out.println("Maior H do grupo: " + maiorH + " metros");
        System.out.println("Menor H do grupo: " + menorH + " metros");
        scanner.close();
    }
}
