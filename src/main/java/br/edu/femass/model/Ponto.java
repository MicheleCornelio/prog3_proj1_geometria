package br.edu.femass.model;

public class Ponto {
    private Double x;
    private Double y;

    public Double getX() {
        return this.x;
    }

    public Double getY() {
        return this.y;
    }

    public Ponto() {
        this.x=0.0;
        this.y=0D;
    }

    public Ponto (Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    public String getLocalizacao() {
        if (this.x > 0 && this.y > 0){
            return "1º Quadrante";
        }
        if ((this.x < 0) && (this.y > 0)){
            return "2º Quadrante";
        }
        if (this.x < 0 && this.y < 0){
            return "3º Quadrante";
        }
        if (this.x > 0 && this.y < 0){
            return "4º Quadrante";
        }
        if (this.x == 0 && this.y == 0){
            return "Origem";
        }
        if (this.x == 0 && this.y != 0){
            return "Eixo Y";
        }
        if (this.y == 0 && this.x != 0){
            return "Eixo X";
        }
        return null;
    }

    public Double getDistancia (Ponto p) {

        return Math.sqrt(
                (Math.pow ((p.getX() - this.x), 2)) +
                  (Math.pow ((p.getY() - this.y), 2))
        );
    }

    @Override
    public String toString(){
        return "(" + this.x.toString() + ", " + this.y.toString() + ")";
    }

    @Override
    public boolean equals (Object object){
        Ponto p = (Ponto) object;

        if (p.getX().equals(this.x) && p.getY().equals(this.y)) return true;

        return false;
    }
}
