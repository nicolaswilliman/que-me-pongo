package services;

import java.util.Map;

public class ClimaService implements IClimaService {

  private AccuWeatherAPI api;

  public ClimaService(AccuWeatherAPI api) {
    this.api = api;
  }

  public Map<String, Object> getClima(String ubicacion) {
    return api.getWeather(ubicacion).get(0);
  }
}
