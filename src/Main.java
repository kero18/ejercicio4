public class Main {
    public static void  main(String[] args){

        int numeroif = 23;
        int numeroWhile = 0;
        int numeroDoWhile = -1;


        if (numeroif > 0) {
        System.out.println("es mayor que cero"); }

        if (numeroif == 0) {
        System.out.println("es igual a cero"); }

        if (numeroif < 0) {
        System.out.println("es menor que cero"); }


        while (numeroWhile < 3) {
            numeroWhile = numeroWhile + 1;
        System.out.println(numeroWhile);
        }

        do {System.out.println(numeroDoWhile);
        numeroDoWhile = numeroDoWhile + 1 ;
        }
        while (numeroDoWhile < 3) ;


        for(int numeroFor = 0; numeroFor <= 3 ; numeroFor++)
        {
            System.out.println(numeroFor);
        }
        var estacion = "verano";
        switch (estacion){
            case "verano":
                System.out.println("Es verano");
                break;
            case "otoño":
                System.out.println("Es otoño");
                break;
            case "invierno":
                System.out.println("Es invierno");
                break;
            case "primavera":
                System.out.println("Es primavera");
            default:
                System.out.println("No se en que estacion estamos");
        }



    }
}