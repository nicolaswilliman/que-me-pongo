package vestimentas;

import java.util.ArrayList;
import java.util.List;

public class Armario {
  private List<Prenda> prendas;

  public Armario() {
    this.prendas = new ArrayList<Prenda>();
  }

  public void agregarPrenda(Prenda prenda) {
    prendas.add(prenda);
  }

  public void removerPrenda(Prenda prenda) {
    prendas.remove(prenda);
  }

  public List<Prenda> getPrendas() {
    return prendas;
  }
}
