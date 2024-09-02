package testepratico;

public class CaravanSpace extends CampingSpace {

    public CaravanSpace(String localizacao, int[] dimensoes, double precodia) {
        super(localizacao, dimensoes, precodia);
        setAluguer(3 * 365);
    }
    
}
