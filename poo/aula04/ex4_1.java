package aula04;

public class ex4_1 {

    public static void main(String[] args) {
        circulo c = new circulo(new xy(2, 4), 5); //valores aleatórios
        retangulo r =new retangulo(10, 5); //valores aleatórios
        triangulo t =new triangulo(1, 2, 3); //valores aleatórios
        System.out.println(c.toString());
        System.out.println(r.toString());
        System.out.println(t.toString());

    }
    
}
