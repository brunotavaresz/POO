package testepratico;

public class CarSpace extends CampingSpace {

    public CarSpace(String localizacao, int[] dimensoes, double precodia) {
        super(localizacao, dimensoes, precodia);
        setAluguer(3 * 30);
    }
    
}
