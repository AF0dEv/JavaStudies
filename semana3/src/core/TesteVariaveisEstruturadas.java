/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import java.util.ArrayList;

/**
 *
 * @author afons
 */
public class TesteVariaveisEstruturadas {

    public static void main(String[] args) {
        ArrayList<Integer> salarios = new ArrayList<>();
        ArrayList<String> funcionarios = new ArrayList<>();
        Integer salarioPorPagar = 0;
        Integer nrFuncPagos = 0;
        salarios.add(1500);

        salarios.add(2000);

        salarios.add(2311);

        salarios.add(1500);

        salarios.add(100);

        funcionarios.add("Carlos");
        funcionarios.add("Rui");
        funcionarios.add("Pedro");
        funcionarios.add("Marrocos");
        funcionarios.add("Mukiul");

        ArrayList<Boolean> pagamentos = new ArrayList<>();
        pagamentos.add(true);
        pagamentos.add(false);
        pagamentos.add(false);
        pagamentos.add(true);
        pagamentos.add(true);

        for (int i = 0; i < pagamentos.size(); i++) {
            if (pagamentos.get(i) == false) {
                salarioPorPagar += salarios.get(i);
            }

        }

        for (int i = 0; i < pagamentos.size(); i++) {
            if (pagamentos.get(i) == true) {
                nrFuncPagos++;
            }
        }

        for (int i = 0; i < pagamentos.size(); i++) {
            if (pagamentos.get(i) == true) {
                System.out.println(funcionarios.get(i) + ": Pago");
            } else {
                System.out.println(funcionarios.get(i) + ": Não Pago");
            }
        }

        System.out.println("Total Salario a Receber: " + salarioPorPagar);
        System.out.println("Total Funcionarios Pagos: " + nrFuncPagos);
    }
}
