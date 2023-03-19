public class Trapecio {
    private double baseMayor;
    private double baseMenor;
    private double altura;
    private double lado1;
    private double lado2;
    
    public Trapecio(double baseMayor, double baseMenor, double altura, double lado1, double lado2) {
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    /**
    * Método que calcula y devuelve el área de un trapecio como el producto de
    * la suma de sus bases por la altura dividido por 2
    * @return Área de un trapecio
    */
    public double calcularArea() {
        return (baseMayor + baseMenor) * altura / 2;
    }
    
    /**
    * Método que calcula y devuelve el perímetro de un trapecio como la suma
    * de sus cuatro lados
    * @return Perímetro de un trapecio
    */
    public double calcularPerimetro() {
        return baseMayor + baseMenor + lado1 + lado2;
    }
}
