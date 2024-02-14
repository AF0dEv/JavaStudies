package variaveis;

/**
 *
 * @author afons
 */
public class TreinoBaseVariaveis {

    public static void main(String[] args) {
        int idade = 23;
        int salario = 0;

        if (idade > 18) {
            System.out.println("MAIOR IDADE");
            System.out.println("Passaram " + AnosPassados(idade).toString() + " anos.");
        } else {
            System.out.println("NÃO MAIOR IDADE");
            System.out.println("Falta " + IdadeSobra(idade).toString() + " anos.");
        }

        int i = 3;

        int j = 12;

        if (i > j) {

            double t = 0;

            t = i + 3;

        } else {

            double t = 0;

            t = j + 3;
            System.out.println(t
                    + "");
        }

    }

    public static Integer IdadeSobra(int idade) {
        return 18 - idade;
    }

    public static Integer AnosPassados(int idade) {
        return idade - 18;
    }
}
