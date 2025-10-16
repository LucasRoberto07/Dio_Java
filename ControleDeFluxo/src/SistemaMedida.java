public class SistemaMedida {
    public static void main(String[] args) {
        String sigla = "M";

        /* 
        if (sigla == "P"){
            System.err.println("Pequeno");
        }else if(sigla == "M"){
            System.err.println("Medio");
        }else if (sigla == "G"){
            System.err.println("Grande");
        }else{
            System.err.println("Indefinido");
        }
        */

        switch (sigla) {
            case "P":{
                System.err.println("Pequeno");
                break;
            }
            case "M":{
                System.err.println("Medio");
                break;
            }
            case "G":{
                System.err.println("Grande");
                break;
            }
            default:
                System.err.println("Indefinido");
        }

    }
}
