public class Cuadrado {
    private double lado;
    public Cuadrado(double lado) {
        this.lado = lado;
    }

    /**
    * Método que calcula y devuelve el área de un cuadrado como el
    * cuadrado de su lado
    * @return Área de un cuadrado
    */
    double calcularArea() {
        return lado*lado;
    }

    /**
    * Método que calcula y devuelve el perímetro de un cuadrado como
    * cuatro veces su lado
    * @return Perímetro de un cuadrado
    */
    double calcularPerímetro() {
        return (4*lado);
    }
}
