import java.lang.Math;

class WrapperClasses {
    byte pByte;
    short pShort;
    int pInt;
    long pLong;
    float pFloat;
    double pDouble;
    char pChar;
    boolean pBoolean;

    Byte wByte;
    Short wShort;
    Integer wInteger;
    Long wLong;
    Double wDouble;
    Character wChar;
    Boolean wBoolean;

    public static void main(String[] args) {
        WrapperClasses wrapper = new WrapperClasses();
        wrapper.pBoolean = true;
        //minimo e maximo tipos primitivos

        wrapper.pByte = 127;
        wrapper.pByte = -127;

        wrapper.pShort = -32768;
        wrapper.pShort = 32767;

        //utilizado precedencia para evitar truncate
        wrapper.pInt = (int)(Math.pow(2, 31) - 1);
        wrapper.pInt = (int) Math.pow(-2, 31);

        wrapper.pLong = (long)(Math.pow(2, 63) - 1);
        wrapper.pLong = (long) Math.pow(2, 63);

        //float armazena até 32 bits
        wrapper.pFloat = Float.MAX_VALUE;
        wrapper.pFloat = Float.MIN_VALUE;

        //double tem a maior precisão em relação a float
        wrapper.pDouble = Double.MAX_VALUE;
        wrapper.pDouble = Double.MIN_VALUE;

        //CHAR aemazena um caracter utilizando 16 bits
        wrapper.pChar = 'J';

        //		System.out.println();

    }

}