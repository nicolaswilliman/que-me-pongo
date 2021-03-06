package vestimentas;

import java.util.List;

public class Atuendo {
  private Prenda prendaSuperior;
  private Prenda prendaInferior;
  private Prenda calzado;
  private List<Prenda> accesorios;

  public Atuendo(Prenda prendaSuperior, Prenda prendaInferior, Prenda calzado, List<Prenda> accesorios) {
    this.prendaSuperior = prendaSuperior;
    this.prendaInferior = prendaInferior;
    this.calzado = calzado;
    this.accesorios = accesorios;
  }

  public Prenda getPrendaSuperior() {
    return prendaSuperior;
  }

  public Prenda getPrendaInferior() {
    return prendaInferior;
  }

  public Prenda getCalzado() {
    return calzado;
  }

  public List<Prenda> getAccesorios() {
    return accesorios;
  }
}
