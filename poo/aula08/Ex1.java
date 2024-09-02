package aula08;


public class Ex1 {
    public static void main(String[] args) {
        aluguer empresa = new aluguer("Company", "3450-056", "a@gmail.com");
        motociclo m = new motociclo("88-XD-88", "Kawasaki", "GT4", 200, "desportivo");
        m.trajeto(50000);
        automovel al = new automovel("77-Dx-45", "Citroen", "C1", 400, 11, 100);
        al.trajeto(2000);
        pesadomercadorias pm = new pesadomercadorias("66-HH-66", "Renault", "Modelo", 150, 12, 3000, 2000);
        pm.trajeto(50);
        pesadopassageiros pp = new pesadopassageiros("55-CC-55", "BMW", "Serie5", 100, 13, 2000, 40);
        pp.trajeto(40000);

        empresa.addVeiculo(m);
        empresa.addVeiculo(al);
        empresa.addVeiculo(pp);
        empresa.addVeiculo(pm);

        for (Veiculo veiculo : empresa.getVeiculosList()) {
            System.out.println(veiculo);
            System.out.println("________________________________________");
            System.out.println();
        }

        double max = 0;
        for (Veiculo veiculo : empresa.getVeiculosList()) {
            if (veiculo.distanciaTotal() > max) {
                max = veiculo.distanciaTotal();
            }
        }

        for (Veiculo veiculo : empresa.getVeiculosList()) {
            if (veiculo.distanciaTotal() == max) {
                System.out.println("O veículo com mais km percorridos foi " + veiculo.getMarca() + " " + veiculo.getModelo()+ " com "  + veiculo.distanciaTotal() + " km");
                System.out.println(veiculo);
                System.out.println();
            }
        }
    }
}

