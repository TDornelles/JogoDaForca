public class Testes {

    public static void main(String[] args) {

        //testes classe Tracinhos

        //teste equals
        System.out.println("Teste equals de Tracinhos");
        try{
            Tracinhos tNull = null;
            Tracinhos t1 = new Tracinhos(11);
            Tracinhos t2 = new Tracinhos(19);
            Tracinhos tReceiver = t1;

            /*if(tNull.equals(t1))
                System.out.println("Null Caller tratado corretamente");
            else System.err.println("Null caller tratado incorretamente");*/

            if(t1.equals(t1))
                System.out.println("Self Call tratado corretamente");

            if(!t1.equals(t2))
                System.out.println("Instancias diferentes tratadas corretamente");
            else System.err.println("Instancias diferentes tratadas incorretamente");


        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        //teste hashcode

        //teste construtor
        System.out.print("Teste construtor de Tracinhos: ");
        try{

            int qtd = 10;
            char result[] = new char[qtd];
            Tracinhos t1 = new Tracinhos(qtd);

            for(int i = 0; i < qtd; i++) {
                result[i] += '_';
            }

            if (!t1.equals(result))
                System.out.println("Construtor funcionando corretamente");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        //testes classe Palavra

        //testes classe ControladorDeLetrasJaDigitadas

        //testes classe ControladorDeErros
    }
}
