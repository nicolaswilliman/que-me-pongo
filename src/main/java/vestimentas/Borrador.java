package vestimentas;

import java.awt.Color;

public class Borrador {

  private TipoDePrenda tipo;
  private Material material;
  private Color colorPrimario;
  private Color colorSecundario;
  private Trama trama;

  public Borrador(TipoDePrenda tipoDePrenda) {
    tipo = tipoDePrenda;
  }

  public void especificarMaterial(Material material) {
    this.material = material;
  }

  public void especificarColorPrimario(Color color) {
    this.colorPrimario = color;
  }

  public void especificarColorSecundario(Color color) {
    this.colorSecundario = color;
  }

  public void especificarTrama(Trama trama) {
    if (trama != null) {
      this.trama = trama;
    } else {
      this.trama = Trama.LISA;
    }
  }

  public Prenda crearPrendar() {
    return new Prenda(tipo, material, colorPrimario, colorSecundario, trama);
  }
}
