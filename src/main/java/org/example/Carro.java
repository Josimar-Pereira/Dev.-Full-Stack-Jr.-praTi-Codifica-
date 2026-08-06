package org.example;

public class Carro implements MeioTransporte {
    private static final double VELOCIDADE_MEDIA = 60.0;

    @Override
    public double calcularTempo(double distancia) {
        validarDistancia(distancia);
        return distancia / VELOCIDADE_MEDIA;
    }

    private void validarDistancia(double distancia) {
        if (distancia <= 0) {
            throw new IllegalArgumentException("A distância deve ser maior que zero");
        }
    }
}
