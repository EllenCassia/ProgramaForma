import java.util.Scanner;

public class ProgramaForma {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("raio: ");
        int raio= leitor.nextInt();
        System.out.println("base: ");
        int base = leitor.nextInt();
        System.out.println("altura: ");
        int altura = leitor.nextInt();

        FormaGeometrica circulo = new Circulo(raio);
        FormaGeometrica retangulo = new Retangulo(base,altura);
        int r= circulo.comparacao(retangulo);

        switch (r){
            case 1:
                System.out.println("Circulo é maior que Retangulo");
                break;
            case -1:
                System.out.println("Retangulo é maior que Circulo");
                break;
            case 0:
                System.out.println("Ambas formas são iguais");
        }
    }
}
