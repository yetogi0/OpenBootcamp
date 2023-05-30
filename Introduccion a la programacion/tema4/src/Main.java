// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        var numeroIf = 0;

        //SENTENCIA IF

        if(numeroIf>0){
            System.out.println("el numero es positivo");
        } else if (numeroIf<0) {
            System.out.println("el numero es positivo");
        }else{
            System.out.println("el numero es 0");
        }

       // SENTENCIA WHILE

        var numeroWhile = 0;

        while(numeroWhile<3){
            System.out.println("el numero es "+ numeroWhile);
            numeroWhile++;
        }

        // SENTENCIA DO WHILE

        var numeroDoWhile = 2;

        do {
            System.out.println("el numero es "+ numeroDoWhile);
            numeroDoWhile++;
        }while(numeroDoWhile<3);



        // SENTENCIA FOR

        for ( int numeroFor = 0; numeroFor <=3; numeroFor++ ){
            System.out.println(numeroFor);
        }

        // SENTENCIA SWITCH

        var estacion = "primavera";

        switch(estacion){
            case "primavera":
                System.out.println("estamos en primavera");
                break;
            case "verano":
                System.out.println("estamos en verano");
                break;
            case "otoño":
                System.out.println("estamos en otoño");
                break;
            case "invierno":
                System.out.println("estamos en invierno");
                break;
            default:
            {
                System.out.println("no es una estacion");
            }

        }
    }
}