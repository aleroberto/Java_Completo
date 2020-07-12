import java.lang.Math;

class WrapperClasses {
    Byte wByte;
    Short wShort;
    Integer wInteger;
    Long wLong;
    Double wDouble;
    Character wChar;
    Boolean wBoolean;

    public static void main(String[] args) {
        WrapperClasses wrapperClass = new WrapperClasses();
        TiposPrimitivos tiposPrimitivos = new TiposPrimitivos();

        tiposPrimitivos.pBoolean = true;
        //minimo e maximo tipos primitivos
        tiposPrimitivos.pByte = 127;
        tiposPrimitivos.pByte = -127;

        tiposPrimitivos.pShort = -32768;
        tiposPrimitivos.pShort = 32767;

        tiposPrimitivos.pInt = (int)(Math.pow(2, 31) - 1); //utilizado precedencia para evitar truncate
        tiposPrimitivos.pInt = (int) Math.pow(-2, 31);

        tiposPrimitivos.pLong = (long)(Math.pow(2, 63) - 1);
        tiposPrimitivos.pLong = (long) Math.pow(2, 63);

        //float armazena até 32 bits
        tiposPrimitivos.pFloat = Float.MAX_VALUE;
        tiposPrimitivos.pFloat = Float.MIN_VALUE;

        //double tem a maior precisão em relação a float
        tiposPrimitivos.pDouble = Double.MAX_VALUE;
        tiposPrimitivos.pDouble = Double.MIN_VALUE;

        //CHAR aemazena um caracter utilizando 16 bits
        tiposPrimitivos.pChar = 'J';

        //Autoboxing
        Byte wByte = new Byte(tiposPrimitivos.pByte);
        Short wShort = new Short(tiposPrimitivos.pShort);
        Integer wInteger = new Integer(tiposPrimitivos.pInt);
        Long wLong = new Long(tiposPrimitivos.pLong);
        Float wFloat = new Float(tiposPrimitivos.pFloat);
        Double wDouble = new Double(tiposPrimitivos.pDouble);
        Character wCharacter = new Character(tiposPrimitivos.pChar);

        //Getting the primitive value
        byte n_Byte = wByte;
        int n_Int = wInteger;

        //datatypeValue()
        int z_Int = wInteger.intValue();
        System.out.println(z_Int);
    }
}

class TiposPrimitivos {
    byte pByte;
    short pShort;
    int pInt;
    long pLong;
    float pFloat;
    double pDouble;
    char pChar;
    boolean pBoolean;

    public TiposPrimitivos() {
    }
}

