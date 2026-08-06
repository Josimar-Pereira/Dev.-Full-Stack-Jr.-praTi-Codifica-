package org.example;

public class APe implements MeioTransporte {
    private static final double VELOCIDADE_MEDIA = 5.0;

    @Override
    public double calcularTempo(double distancia) {
        if (distancia <= 0) {
            throw new IllegalArgumentException("A distância deve ser maior que zero");
        }
        return distancia / VELOCIDADE_MEDIA;
    }
}
