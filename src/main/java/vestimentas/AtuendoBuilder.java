package vestimentas;

import java.util.ArrayList;
import java.util.List;

public class AtuendoBuilder {
  private Prenda prendaSuperior;
  private Prenda prendaInferior;
  private Prenda calzado;
  private List<Prenda> accesorios;

  public AtuendoBuilder() {
    this.accesorios = new ArrayList<Prenda>();
  }

  public void setPrendaSuperior(Prenda prendaSuperior) {
    // validate
    this.prendaSuperior = prendaSuperior;
  }

  public void setPrendaInferior(Prenda prendaInferior) {
    // validate
    this.prendaInferior = prendaInferior;
  }

  public void setCalzado(Prenda calzado) {
    // validate
    this.calzado = calzado;
  }

  public void agregarAccesorio(Prenda accesorio){
    // validate
    this.accesorios.add(accesorio);
  }

  public void removerAccesorio(Prenda accesorio) {
    // validate
    this.accesorios.remove(accesorio);
  }

  public Atuendo crearAtuendo() {
    return new Atuendo(prendaSuperior, prendaInferior, calzado, accesorios);
  }
}
