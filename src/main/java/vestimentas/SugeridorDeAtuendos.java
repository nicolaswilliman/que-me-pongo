package vestimentas;

import services.IClimaService;

public class SugeridorDeAtuendos {
  private IClimaService climaService;

  public SugeridorDeAtuendos(IClimaService climaService) {
    this.climaService = climaService;
  }

  // public Atuendo sugerirAtuendo(String ubicacion, Armario armario) {

  //   // no llego a hacerlo en codigo, pero aca en base a la ubicacion, deberia hacer un filter sobre el armario en base a las condiciones climaticas.
  // }
}
