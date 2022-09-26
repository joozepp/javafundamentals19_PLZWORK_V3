package examples.objects;

public class objectExample {
    public String name;
    public int a;

    //non-parameterized constructor or Normal constructor
    public objectExample() {
        System.out.println("Constructing objectExample");
        name = "Joosep Podelsky";
        a = 6;
    }

    //parametirized Constructor
    public objectExample(int age, String name) {
        System.out.println(age);
        System.out.println(name);
    }


}
