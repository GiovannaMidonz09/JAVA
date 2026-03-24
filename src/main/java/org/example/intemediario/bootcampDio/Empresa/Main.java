package org.example.intemediario.bootcampDio.Empresa;

public class Main {
    public static void main(String[] args) {
        printEmployee(new Manager());
        printEmployee(new Salesman());
    }

    public static void printEmployee(Employee employee){
        switch (employee){
            case Manager manager -> {
                System.out.println("===========MANEGER===========");
                manager.setCode("84");
                manager.setName("Fernando");
                manager.setLogin("Nando12");
                manager.setPassword("85771");
                manager.setSalary(2482);
                manager.setComission(854);

                System.out.println("NOME :" + manager.getName());
                System.out.println("CODE :" + manager.getCode());
                System.out.println("LOGIN :" + manager.getLogin());
                System.out.println("PASSWORD :" + manager.getPassword());
                System.out.println("SALARIO :" + manager.getSalary());
                System.out.println("COMISSÃO :" + manager.getComission());
                System.out.println("======================");
            }
            case Salesman salesman ->{
                System.out.println("===========SALAMEN===========");
                salesman.setCode("84");
                salesman.setName("NOME: Fernando");
                salesman.setSalary(2482);

                System.out.println("NOME :" + salesman.getName());
                System.out.println("CODE :" + salesman.getCode());
                System.out.println("SALARIO :" + salesman.getSalary());
                System.out.println("======================");


            }


        }
    }
}
