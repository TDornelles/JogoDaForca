public class ControladorDeLetrasJaDigitadas implements Cloneable
{
    private String letrasJaDigitadas;

    public ControladorDeLetrasJaDigitadas ()
    {
        // torna this.letrasJaDigitadas igual ao String vazio
        this.letrasJaDigitadas = "";
    }

    public boolean isJaDigitada (char letra) {
        // percorrer o String this.letrasJaDigitadas e verificar se ele
        // possui a letra fornecida, retornando true em caso afirmativo
        // ou false em caso negativo
        for (byte i = 0; i < this.letrasJaDigitadas.length(); i++) {
            if (letra == this.letrasJaDigitadas.charAt(i)) return true;
        }
        return false;
    }

    public void registre (char letra) throws Exception
    {
        // verifica se a letra fornecida ja foi digitada (pode usar
        // o m�todo this.isJaDigitada, para isso), lancando uma exce��o
        // em caso afirmativo.
        // concatena a letra fornecida a this.letrasJaDigitadas.
        if (this.isJaDigitada(letra)) throw new Exception("Letra repetida");
        this.letrasJaDigitadas += letra;
    }

    @Override
    public String toString ()
    {
        // retorna um String com TODAS as letras presentes em
        // this.letrasJaDigitadas separadas por v�rgula (,).
        if (this.letrasJaDigitadas.equals("")) return ("Nenhuma letra digitada por enquanto");

        String ret = "";
        for(byte i = 0; i < this.letrasJaDigitadas.length() - 1; i++){
            ret += this.letrasJaDigitadas.charAt(i) + ",";
        }
        ret += this.letrasJaDigitadas.charAt(this.letrasJaDigitadas.length() - 1);
        return ret;
    }

    public boolean equals (Object obj)
    {
        // verificar se this e obj s�o iguais
        if (this == obj) return true;

        if (obj == null) return false;

        if (this.getClass() != obj.getClass()) return false;

        ControladorDeLetrasJaDigitadas control = (ControladorDeLetrasJaDigitadas) obj;

        if(!this.letrasJaDigitadas.equals(control.letrasJaDigitadas)) return false;

        return true;
    }

    public int hashCode ()
    {
        // calcular e retornar o hashcode de this
        int ret = 444;

        ret = ret*7 + Integer.valueOf(this.letrasJaDigitadas).hashCode();

        if (ret < 0) ret = -ret;

        return ret;
    }

    public ControladorDeLetrasJaDigitadas(
            ControladorDeLetrasJaDigitadas controladorDeLetrasJaDigitadas)
            throws Exception // construtor de c�pia
    {
        // copiar c.letrasJaDigitadas em this.letrasJaDigitadas
        if (controladorDeLetrasJaDigitadas == null) throw new Exception("Modelo ausente");
        this.letrasJaDigitadas = controladorDeLetrasJaDigitadas.letrasJaDigitadas;
    }

    public Object clone ()
    {
        // criar uma c�pia do this com o construtor de c�pia e retornar
        ControladorDeLetrasJaDigitadas ret = null;

        try {
            ret = new ControladorDeLetrasJaDigitadas(this);
        } catch (Exception e) {}

        return ret;
    }
}