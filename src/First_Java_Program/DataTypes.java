package First_Java_Program;

public class DataTypes {
    public static void main(String[] args) {

        //Primitive data types - Primitive data type are those data types which is not breakable.

        // Example-
        // 1. int - stores the numeric digits ( 54 ),
        // 2. char - stores the characters ( "A" ),
        // 3. float - stores floating point numbers ( 98.454f ),
        // 4. double - stores the larger decimal numbers ( 54545.454848),
        // 5. long - stores the numeric digits which is not able to stored in int ( 56654646462951956565l ),
        // 6. boolean - stores values as true or false .
        // 7. byte
        // 8. short

        int num = 5;
        System.out.println(num + " is an integer datatype");

        char c = 'A';
        System.out.println(c + " is a char datatype");

        float f = 12.4f;
        System.out.println(f + " is a float datatype");


        double d = 12.45545554;
        System.out.println(d + " is a double datatype");

        long l = 1247565468899846519L;
        System.out.println(l + " is a long datatype");


        //NOTE: In float we used f and in long we used L at the end of the number, this is mandatory.
        //If we do not put f in the float then java will consider it as double and
        //If we do not put L in the long then java will consider it as int


        //Non-primitive datatypes - Datatype which can be further broken down.
        //Ex- String, Array, Object

        //NOTE: These are actually an object
    }
}


//Memory management of the different datatypes in Java.
