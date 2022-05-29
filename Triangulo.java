public class Triangulo extends FormaGeometrica{
    private int l1;
    private int l2;
    private int l3;

    public int comparacao(Object objeto) {
        if(objeto instanceof Triangulo){
            Triangulo obj = (Triangulo)objeto;

            if(calcularArea() > obj.calcularArea())
                return 1;
            else if (calcularArea() < obj.calcularArea())
                return -1;
        }
        return 0;
    }

    public int calcularArea() {
        int p = (calcularPerimetro()/2);
        return (int)(Math.sqrt(p * (p - l1) * (p - l2) * (p - l3)));
    }

    public int calcularPerimetro() {
        return l1 + l2 + l3;
    }
}
