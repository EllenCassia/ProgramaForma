public class Retangulo extends FormaGeometrica{
    private int base;
    private int altura;

    Retangulo(int b, int a){
        base = b;
        altura = a;
    }
    public int comparacao(Object objeto) {
        if(objeto instanceof FormaGeometrica){
            FormaGeometrica obj = ( FormaGeometrica) objeto;

            if(calcularArea() > obj.calcularArea())
                return 1;
            else if (calcularArea() < obj.calcularArea())
                return -1;
        }
        return 0;
    }

    public int calcularArea() {
        return base * altura;
    }

    @Override
    public int calcularPerimetro() {
        return (base + altura) * 2;
    }
}
