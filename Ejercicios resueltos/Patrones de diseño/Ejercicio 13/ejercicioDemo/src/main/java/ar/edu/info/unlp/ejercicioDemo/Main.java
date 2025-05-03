package ar.edu.info.unlp.ejercicioDemo;

public class Main {
public static void main(String[] args) {
        
        // Crear el director y builders para cada tipo de sándwich
        SandwichBuilder vegetarianoBuilder = new SandwichVegetariano();
        SandwichBuilder veganoBuilder = new SandwichVegano();
        SandwichBuilder sinTACCBuilder = new SandwichSinTACC();
        SandwichBuilder clasicoBuilder = new SandwichClasico();

        // Crear el sandwich SubteWay con cada builder
        SubteWay subteWay = new SubteWay(vegetarianoBuilder);
        Sandwich vegetariano = subteWay.construirSandwich();
        System.out.println("Sándwich Vegetariano: " + vegetariano);
        System.out.println("Precio Vegetariano: " + vegetariano.calcularPrecio());

        // Crear el sandwich SubteWay con el builder de sándwich vegano
        subteWay = new SubteWay(veganoBuilder);
        Sandwich vegano = subteWay.construirSandwich();
        System.out.println("Sándwich Vegano: " + vegano);
        System.out.println("Precio Vegano: " + vegano.calcularPrecio());

        // Crear el sandwich SubteWay con el builder de sándwich Sin TACC
        subteWay = new SubteWay(sinTACCBuilder);
        Sandwich sinTACC = subteWay.construirSandwich();
        System.out.println("Sándwich Sin TACC: " + sinTACC);
        System.out.println("Precio Sin TACC: " + sinTACC.calcularPrecio());

        // Crear el sandwich SubteWay con el builder de sándwich Clásico
        subteWay = new SubteWay(clasicoBuilder);
        Sandwich clasico = subteWay.construirSandwich();
        System.out.println("Sándwich Clásico: " + clasico);
        System.out.println("Precio Clásico: " + clasico.calcularPrecio());
    }
}
