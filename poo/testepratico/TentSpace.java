package testepratico;

public class TentSpace extends CampingSpace {

    public TentSpace(String localizacao, int[] dimensoes, double precodia) {
        super(localizacao, dimensoes, precodia);
        setAluguer(10);
    }
    
}
