package vestimentas;

public class Uniforme {
  private Prenda prendaSuperior;
  private Prenda prendaInferior;
  private Prenda calzado;

  private Uniforme(Prenda prendaSuperior, Prenda prendaInferior, Prenda calzado) {
    this.prendaSuperior = prendaSuperior;
    this.prendaInferior = prendaInferior;
    this.calzado = calzado;
  }

  public static Uniforme fabricarUniforme(Sastre sastre) {
    return new Uniforme(sastre.fabricarParteSuperior(), sastre.fabricarParteInferior(), sastre.fabricarCalzado());
  }
}
