package Lecture_4_access;

public class a {
    private int num;
    int[] arr;
    String name;

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    //Shortcut for creating constructor, getter&setter in intellij is ⌘N (macOS) / Alt+Insert (Windows/Linux).
    public a(int num, int[] arr, String name) {
        this.num = num;
        this.arr = arr;
        this.name = name;
    }
}
//Access Control:
//
//How a member can be accessed is determined by the access modifier attached to its declaration.
//Usually, you will want to restrict access to the data members of a class—allowing access only through methods.
//Also, there will be times when you will want to define methods that are private to a class.
//
//Java’s access modifiers are public, private, and protected. Java also defines a default access level.
//protected applies only when inheritance is involved.
//
//When no access modifier is used, then by default the member of a class is public within its own package,
//but cannot be accessed out of its package.
//
//            │ Class │ Package │ Subclass │ Subclass │ World
//            │       │         │(same pkg)│(diff pkg)│(diff pkg & not subclass)
//────────────┼───────┼─────────┼──────────┼──────────┼──────────────────────────
//public      │   +   │    +    │    +     │     +    │   +
//────────────┼───────┼─────────┼──────────┼──────────┼──────────────────────────
//protected   │   +   │    +    │    +     │     +    │
//────────────┼───────┼─────────┼──────────┼──────────┼──────────────────────────
//no modifier │   +   │    +    │    +     │          │
//────────────┼───────┼─────────┼──────────┼──────────┼──────────────────────────
//private     │   +   │         │          │          │
//
//+ : accessible
//blank : not accessible


