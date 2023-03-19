public class Rombo {
    private double diagonalMayor;
    private double diagonalMenor;
    private double lado;
    
    public Rombo(double diagonalMayor, double diagonalMenor, double lado) {
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
        this.lado = lado;
    }
    
    /**
    * Método que calcula y devuelve el área de un rombo como el producto de
    * sus diagonales dividido por 2
    * @return Área de un rombo
    */
    public double calcularArea() {
        return (diagonalMayor * diagonalMenor) / 2;
    }
    
    /**
    * Método que calcula y devuelve el perímetro de un rombo como la suma
    * de sus cuatro lados
    * @return Perímetro de un rombo
    */
    public double calcularPerimetro() {
        return 4 * lado;
    }
}
