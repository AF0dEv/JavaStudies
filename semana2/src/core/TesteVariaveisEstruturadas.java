package core;

/**
 *
 * @author afons
 */
public class TesteVariaveisEstruturadas {

    public static void main(String[] args) {

        // VARIAVEIS
        String[] arrayPessoas = new String[5];
        int[] arraySalarios = new int[5];
        boolean[] pagamentosSalarioe = new boolean[5];
        int salario1 = 15000;
        int salario2 = 7000;
        int salario3 = 20199;
        String adimn = "MalokasOP";
        Integer tamanhoNome = TamanhoNome(adimn);

        // INICIALIZAÇÃO ARRAYS
        // PESSOAS
        arrayPessoas[0] = adimn;
        arrayPessoas[1] = "Afonso";
        arrayPessoas[2] = "ControlaDor";
        arrayPessoas[3] = "CatetoPitagoriano";
        arrayPessoas[4] = "PossasInundas";

        // SALÁRIOS
        arraySalarios[0] = salario1;
        arraySalarios[1] = salario2;
        arraySalarios[2] = salario3;
        arraySalarios[3] = 634435;
        arraySalarios[4] = 1032;

        // SOUTS
        double mediaSalarial = MediaSalarial(arraySalarios);
        System.out.println("Media: " + mediaSalarial);
        System.out.println("Maior: " + MaxSalario(arraySalarios));
        System.out.println("Menor: " + MinSalario(arraySalarios));
        System.out.println("Tamanho Nome: " + tamanhoNome);
        System.out.println("Uau ! Quem diria que 20X da Media Salarial da Empresa è Maior que o Tamanho do Nome -.- \nValor Maior: " + tnMAIORms(tamanhoNome, mediaSalarial));
        BomDiaFuncionários(arrayPessoas);
    }

    // FUNÇÕES
    public static double MediaSalarial(int[] arraySalarios) {
        int total = arraySalarios[0];
        for (int i = 1; i < arraySalarios.length; i++) {
            total = total + arraySalarios[i];
        }
        return (double) total / 5.0;
    }

    public static int MaxSalario(int[] arraySalarios) {
        int maior = arraySalarios[0];
        for (int i = 0; i < arraySalarios.length; i++) {
            if (maior <= arraySalarios[i]) {
                maior = arraySalarios[i];
            }
        }
        return maior;
    }

    public static int MinSalario(int[] arraySalarios) {
        int menor = arraySalarios[0];
        for (int i = 0; i < arraySalarios.length; i++) {
            if (menor >= arraySalarios[i]) {
                menor = arraySalarios[i];
            }
        }
        return menor;
    }

    public static int TamanhoNome(String admin) {
        return admin.length();
    }

    public static double tnMAIORms(Integer tamanhoNome, double mediaSalarial) {
        return Math.max((mediaSalarial * 20.0), (double) tamanhoNome);
    }

    public static void BomDiaFuncionários(String[] arrayPessoas) {
        for (int i = 0; i < arrayPessoas.length; i++) {
            System.out.println("Bom Dia " + arrayPessoas[i]);
        }
    }
}
