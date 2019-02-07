public class Calculate {


    final String Plus = "+";
    final String Minus = "-";
    final String Dziel = "/";
    final String Mnoz = "*";


    int operator(int a,int b,String operacja){

        int result = 0;

        switch(operacja) {
            case Plus:
                result = a + b;
                break;
            case Minus:
                result = a - b;
                break;
            case Dziel:
                result = a / b;
                break;
            case Mnoz:
                result = a * b;
                break;
            default:
                System.out.println("Nieprawidłowa operacja");
        }

        return result;

    }



}

    }



}