package aula06;

public class Conjunto {
    private int[] vetor;

    public Conjunto() {
        this.vetor = new int[0];
    }

    public int[] getVetor() {
        return vetor;
    }

    public boolean contains(int n) {
        for(int i = 0; i < vetor.length; i++) {
            if(n == vetor[i]) {
                return true;
            }
        }

        return false;
    }

    public void insert(int n) {
        if(this.contains(n)) {
            return;
        }

        int a = vetor.length + 1;
        int[] b = new int[a];

        for(int i=0; i<vetor.length; i++) {		
			b[i] = vetor[i];
		}
		
		b[a-1] = n;		
		
		vetor = b;
    }

    public void remove(int n) {
        if(!this.contains(n)) {
            return;
        }

		int a = vetor.length - 1;		
		int[] b = new int[a];			
		boolean removed = false;		
		
		for(int i  =0; i < vetor.length; i++) {
			if(vetor[i] == n) {
				removed = true;
				continue;
			}

			if(!removed) {
				b[i] = vetor[i];
			} else {
				b[i-1] = vetor[i];
			}
		}
		
		vetor = b; 
    }

    public void empty() {
		vetor = new int[0];
	}
	
	public int size() {
		return vetor.length;
	}

	public String toString() {
		String s = "";

		for(int n : vetor) {
			s += n + " ";
		}

		return s;
	}
	
	public Conjunto combine(Conjunto add) {
		Conjunto nca = new Conjunto();
		nca = this;
		
		for(int i = 0; i < add.size(); i++) {
			int n = add.getVetor()[i];
			if(!nca.contains(n)) {
				nca.insert(n);
			}
		}
		return nca;
	}
	
	public Conjunto subtract(Conjunto dif) {
		Conjunto nca = new Conjunto();
		nca = this;	
		
		for(int i = 0; i < dif.size(); i++) {
			int n = dif.getVetor()[i];
			if(nca.contains(n)) {
				nca.remove(n);
			}
		}
		return nca;
	}
	
	public Conjunto intersect(Conjunto inter) {
		Conjunto nca = new Conjunto();	
		
		for(int i = 0; i < inter.size(); i++) {
			int n = inter.getVetor()[i];
			if(this.contains(n)) {
				nca.insert(n);
			}
		}
		return nca;
	}
}
    

