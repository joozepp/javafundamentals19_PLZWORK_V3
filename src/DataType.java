/**
 * Examples of Primitive datatype
 *
 * @author Joozepp
 */
public class DataType {
    //Primitive Data types
    // Numbers
    int a = 1;
    byte byteNumber = 120;
    long longNumber = 545454681351L; //
    short shortNumber = -32000;
    float decimalNumber = 2.4545453483645237485374684684f; //
    double doubleNumber = 3.456d; //

    // Character
    char alpha = 'F';  // singular ' , single characters only.

    //True/False
    boolean hadLunch = true; // had lunch?
    boolean isHoliday = false;

    /* Multi-line
    comment
     */

    int i; // 0

    float x; // 0.00f

    char animal; // ''

    boolean isClassTomorrow;  // false


    //Non-primitive data types
    String word = "I'm a developer";

    Character random = 'u';

    Integer number = 5;

    Float numberSecond = 2.45F;

    Integer randomNumber;  // null

    // Multi-declaration
    int numberOne, numberTwo, numberThree;   // saab mitu tükki kohe ära deklareerida

    String fruit = "apple", vegetable = "pumpkin", cities;


    // Scope of class variables
    private static String CAR = "Toyota";           // ainult siin classis toimib.
    // static on unchangeable value
    // kui lisada "static final" siis see on täiesti muutumatu.
    public static String FOOD = "Cake";             // toimib ka mujal.


    public static void main(String[] args) {    //BLOKI ALGUS
        int k = 0;
        Integer y = null;


        System.out.println(k);
        System.out.println(y);


        String _color = "black"; //variabledel on reeglid millega alustada tohib _, $ ja ei tohi alustada numbriga

        int $hexaNumber = 0x2A;     // kui on 2 sõna siis hea oleks suuretähega panna need naguNäiteksNii

        float exam12_mark = 100.10f;

        String className = "sda";

        int a = 100;
        int b = 0;

        int c = a + b;

        System.out.println(CAR);
        System.out.println(FOOD);
    }                               // BLOKI LÕPP. asjad toimivad siin sees ainult. LINE 53





}
