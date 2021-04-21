package vestimentas;

import java.awt.Color;

public class Prenda {
  private TipoDePrenda tipo;
  private Material material;
  private Color colorPrimario;
  private Color colorSecundario;

  public void setColorSecundario(Color colorSecundario) {
    this.colorSecundario = colorSecundario;
  }

  public Prenda(TipoDePrenda tipo,
                Material material,
                Color colorPrimario) {
    this.tipo = tipo;
    this.material = material;
    this.colorPrimario = colorPrimario;
  }
}
