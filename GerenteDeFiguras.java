public class GerenteDeFiguras {
    private int tipo; // 1 -Triangulo, 2 - retangulo
    private FiguraGeometrica figura;
    Retangulo retangulogerente = new Retangulo();
    Triangulo triangulogerente = new Triangulo();


    public void teste(){
        System.out.println("Veraqui: " + retangulogerente.getAltura());  
    }
    public double calculaAreaToral(FiguraGeometrica f){
        return f.calculaArea();
    }


    public FiguraGeometrica getFigura() {
        return figura;
    }
    public void setFigura(FiguraGeometrica figura) {
        this.figura = figura;
    }
    public Integer getTipo() {
        return tipo;
    }
    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }
    

}
