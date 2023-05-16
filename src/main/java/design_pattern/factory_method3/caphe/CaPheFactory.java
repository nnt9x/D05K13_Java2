package design_pattern.factory_method3.caphe;

public class CaPheFactory {
    private CaPheFactory() {
    }

    public static CaPhe getCaPhe(CaPheType caPheType) {
        switch (caPheType) {
            case LATTE:
                // return Latte.getInstance();
                return new Latte("Hat rang", 10, 20, 100);
            case DEN_DA:
                return new DenDa("Hat rang", 10, 10, 10);
            case ESPRESSO:
                return new Espresso("Hat rang", 10, 10, 10);
        }
        return null;
    }
}
