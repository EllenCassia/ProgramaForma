public class Circulo extends FormaGeometrica{
    private int raio;

    Circulo(int r){
        raio = r;
    }
    public int comparacao(Object objeto) {
        if(objeto instanceof FormaGeometrica){
            FormaGeometrica obj = (FormaGeometrica)objeto;
            if(calcularArea() > obj.calcularArea())
                return 1;
            else if (calcularArea() < obj.calcularArea())
                return -1;
        }
        return 0;
    }

    public int calcularArea() {
        return (int)(Math.PI * raio * raio);
    }
    public int calcularPerimetro() {
        return (int)(2 * Math.PI * raio);
    }
}
