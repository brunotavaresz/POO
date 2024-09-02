package aula06;
import java.util.Scanner;

public class ex1_2 {

    public static void main(String[] args){

        int option;
        String nome;
        String telefone = "";
        String email = "";
        int f,day,month,year,dayi,monthi,yeari,tel;
        Contactos[] contactos= new Contactos[10]; //não sei porque dá erro
        int numcon=-1;
        int g =0,h=0,m=0,l=0,n=0;


        Scanner sc= new Scanner(System.in);

        do {
            System.out.println("Gestão de contactos:");
            System.out.println("1 - Inserir contacto");
            System.out.println("2 - Alterar contacto");
            System.out.println("3 - Apagar contacto");
            System.out.println("4 - Procurar contacto");
            System.out.println("5 - Listar contacto");
            System.out.println("0 - exit");
            System.out.println();
            System.out.print("Operation: ");
            option = sc.nextInt();

            switch(option){
                case 0:
                    System.out.println("Saindo...");
                    break;
                case 1:
                    System.out.println("Nome: ");
                    nome = sc.next();
                    
                    while (!telefone.matches("^9[0-9]{8}$")) {
                        System.out.print("Insira o número de telemóvel (9 dígitos começando por 9): ");
                        telefone = sc.next();
                        if (!telefone.matches("^9[0-9]{8}$")) {
                            System.out.println("Número de telemóvel inválido!");
                        }
                    }
                    System.out.println("Número de telemóvel válido: " + telefone);

                    while (!email.matches("^[\\w.-]+@[\\w.-]+\\.[\\w]{2,}$")) {
                        System.out.print("Insira o endereço de email: ");
                        email = sc.next();
                        if (!email.matches("^[\\w.-]+@[\\w.-]+\\.[\\w]{2,}$")) {
                            System.out.println("Endereço de email inválido!");
                        }
                    }
                    System.out.println("Endereço de email válido: " + email);
                    break;
                
                
                case 2:
                g=0;
                System.out.println("1 - Nome");
                System.out.println("2 - Numero");
                f = sc.nextInt();
            if(f==1){
                System.out.println("Nome-");
                nome = sc.next();
                for(int i=0;i<numcon;i++){
                    if (contactos[i]==null){
                        continue;
                    }
                    if (contactos[i].getnome().equals(nome)){
                        h=i;
                        System.out.println(contactos[i].getnome()+"   ID="+contactos[i].id+"   Numero="+contactos[i].telemovel+"   Email="+contactos[i].Email);
                        g++;
                    }

                }
                if (g>1){
                    System.out.println("Indruduza o id:");
                    
                    f = sc.nextInt();
                    for(int i=0;i<numcon;i++){
                        if (contactos[i]==null){
                            continue;
                        }
                        if (contactos[i].id==f){
                            System.out.println(contactos[i].getnome()+"   ID="+contactos[i].id+"   Numero="+contactos[i].telemovel+"   Email="+contactos[i].Email);
                            System.out.println("Indruduza nºtelemovel");
                            f = sc.nextInt();
                            contactos[i].setTelemovel(f);
                        }
    
                    }
                }
                else {
                    System.out.println("Indruduza nºtelemovel");
                            f = sc.nextInt();
                            contactos[h].setTelemovel(f);
                }
            }else{
                System.out.println("telemovel");
                tel = sc.nextInt();
                for(int i=0;i<numcon;i++){
                    if (contactos[i]==null){
                        continue;
                    }
                    if (contactos[i].getTelemovel()==tel){
                        h=i;
                        System.out.println(contactos[i].getnome()+"   ID="+contactos[i].id+"   Numero="+contactos[i].telemovel+"   Email="+contactos[i].Email);
                        g++;
                    }

                }
                if (g>1){
                    System.out.println("Indruduza o id:");
                    
                    f = sc.nextInt();
                    for(int i=0;i<numcon;i++){
                        if (contactos[i]==null){
                            continue;
                        }
                        if (contactos[i].id==f){
                            System.out.println(contactos[i].getnome()+"   ID="+contactos[i].id+"   Numero="+contactos[i].telemovel+"   Email="+contactos[i].Email);
                            System.out.println("Indruduza nºtelemovel");
                            f = sc.nextInt();
                            contactos[i].setTelemovel(f);
                        }
    
                    }
                }
                else {
                    System.out.println("Indruduza nºtelemovel");
                            f = sc.nextInt();
                            contactos[h].setTelemovel(f);
                }
            }
            
                break;
                    
                    break;
                case 3:
                    
                    break;
                case 4:

                g=0;

            
            System.out.println("1 - Nome");
            System.out.println("2 - Numero");
            f = sc.nextInt();
            if(f==1){
                System.out.println("Nome-");
                nome = sc.next();
                for(int i=0;i<numcon;i++){
                    if (contactos[i]==null){
                        continue;
                    }
                    if (contactos[i].getnome().equals(nome)){
                        h=i;
                        System.out.println(contactos[i].getnome()+"   ID="+contactos[i].id+"   Numero="+contactos[i].telemovel+"   Email="+contactos[i].Email);
                        g++;
                    }

                }
                if (g>1){
                    System.out.println("Indruduza o id ");
                    
                    f = sc.nextInt();
                    for(int i=0;i<numcon;i++){
                        if (contactos[i]==null){
                            continue;
                        }
                        if (contactos[i].id==f){
                            System.out.println(contactos[i].getnome()+"   ID="+contactos[i].id+"   Numero="+contactos[i].telemovel+"   Email="+contactos[i].Email);
                            
                        }
    
                    }
                }
                
            }else{
                System.out.println("telemovel");
                tel = sc.nextInt();
                for(int i=0;i<numcon;i++){
                    if (contactos[i]==null){
                        continue;
                    }
                    if (contactos[i].getTelemovel()==tel){
                        h=i;
                        System.out.println(contactos[i].getnome()+"   ID="+contactos[i].id+"   Numero="+contactos[i].telemovel+"   Email="+contactos[i].Email);
                        g++;
                    }

                }
                if (g>1){
                    System.out.println("Indruduza o id ");
                    
                    f = sc.nextInt();
                    for(int i=0;i<numcon;i++){
                        if (contactos[i]==null){
                            continue;
                        }
                        if (contactos[i].id==f){
                            System.out.println(contactos[i].getnome()+"   ID="+contactos[i].id+"   Numero="+contactos[i].telemovel+"   Email="+contactos[i].Email);
                            
                        }
    
                    }
                }
                
            }
                    
                    break;
                case 5:

                for (int i =0;i<numcon+1;i++){
                    if (contactos[i]==null){
                        continue;
                    }
                    if (contactos[i].getPessoa() instanceof Aluno){
                        System.out.println("    'Aluno'"+contactos[i].getPessoa().toString()+"   ID="+contactos[i].id+"   Numero="+contactos[i].telemovel+"   Email="+contactos[i].Email);
                        
                    }
                    if (contactos[i].getPessoa() instanceof Professor){
                        System.out.println("     'Professor'"+contactos[i].getPessoa().toString()+"   ID="+contactos[i].id+"   Numero="+contactos[i].telemovel+"   Email="+contactos[i].Email);
                    }
                }
                break;

                    break;
                default:
                    System.out.println("Not valid!");
                    break;

        }} while(option != 0);
    
    sc.close();
    }
    
}
