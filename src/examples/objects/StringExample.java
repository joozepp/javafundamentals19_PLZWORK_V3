package examples.objects;

public class StringExample {
    public static void main(String[] args) {
        String firstName = "Joosep ";
        String lastName = "Podelsky";
        String fullName = firstName + lastName; //option1
        System.out.println(fullName);

        fullName = firstName.concat(lastName); //option 2

        String age = "My age is " + 4355124;
        String iLiveIn = " and I live in Tallinn";

        System.out.println(age);
        System.out.println("My name is " + fullName + " "+ age + iLiveIn);


        String ageStringFormatted = String.format("My age is : %d. I live in %s. My name is: %s", 4355124,iLiveIn,fullName);
        System.out.println(ageStringFormatted);

            //APPEND automatically joins to the same variable.
        StringBuilder str1 = new StringBuilder("Thomson");
        StringBuilder str2 = str1.append(" the puzzycat");
        System.out.println(str2);
        System.out.println(str1);

            //CONCAT                  // need to assign to the variable additionally
        String var1 = "Jeremy";
        var1.concat("yellow");  // ei joini kuna pole assigned value, peaks olema var1 = ja ss see line
        String var2 = " the fooken mouse";
        System.out.println(var1);
        System.out.println(var2);

        //Equality
        // ==    // this will compare memory references and the values  // VASTUS ALATI TRUE OR FALSE
        //string.equals() // this will only compare the values

        String s1 = "bazookaman44";   //STRING POOL PARTY
        String s2 = "bazookaman44";   //STRING POOL PARTY
        String s3 = new String("bazookaman44");  // HEAP HEAP
        String s4 = new String("bazookaman44");  // HEAP HEAP
        System.out.println(s1 == s3); // FALSE FALSE
        System.out.println(s1.equals(s3)); // TRUE TRUE;
        System.out.println(s3 == s4);  //

    }
}
