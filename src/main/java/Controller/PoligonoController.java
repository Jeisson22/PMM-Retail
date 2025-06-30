package Controller;

import Model.TipoPoligono;
import Service.PoligonoService;

public class PoligonoController {

    private final PoligonoService poligonoService;

    public PoligonoController(PoligonoService poligonoService) {
        this.poligonoService = poligonoService;
    }


    public String obtenerArea(String tipo) {
        try {
            TipoPoligono tipoPoligono = TipoPoligono.valueOf(tipo.toUpperCase());
            double area = poligonoService.calcularArea(tipoPoligono);
            return "Área del " + tipoPoligono.name().toLowerCase() + " = " + area;
        } catch (IllegalArgumentException e) {
            return "❌ Tipo de polígono no válido. Usa: triangulo, cuadrado o rectangulo.";
        }
    }
}


