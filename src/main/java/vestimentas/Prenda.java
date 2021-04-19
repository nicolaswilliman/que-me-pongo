package vestimentas;

import java.awt.*;

public class Prenda {
  private CategoriaDePrenda categoria;
  private TipoDePrenda tipo;
  private Material material;
  private Color colorPrimario;
  private Color colorSecundario;

  public Prenda(CategoriaDePrenda categoria,
                TipoDePrenda tipo,
                Material material,
                Color colorPrimario) {
    this.categoria = categoria;
    this.tipo = tipo;
    this.material = material;
    this.colorPrimario = colorPrimario;
  }
}
