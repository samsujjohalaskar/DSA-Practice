// class Student {
//     String name;
//     int age;

//     public void getInfo() {
//         System.out.println("The name of this Student is " + this.name);
//         System.out.println("The age of this Student is " + this.age);
//     }
//  }

//  public class OOPS {
//     public static void main(String args[]) {
//         Student s1 = new Student();
//         s1.name = "Amit";
//         s1.age = 24;
//         s1.getInfo();

//         Student s2 = new Student(); 
//         s2.name = "Sam";
//         s2.age = 22;
//         s2.getInfo();
//     }
//  }
/////////////////////////////////////////

//  class Pen {
//     String color;

//     public void printColor() {
//         System.out.println("The color of Pen is " + this.color);
//     }
//  }

//  public class OOPS {
//     public static void main(String args[]) {
//         Pen p1 = new Pen();
//         p1.color = "blue";

//         Pen p2 = new Pen();
//         p2.color = "black";

//         Pen p3 = new Pen();
//         p3.color = "red";

//         p1.printColor();
//         p2.printColor();
//         p3.printColor();
//     }
//  }

///////////////////////////////

// class Hostel{
//     String color;
//     int room;
//     String type;

//     public void hostelInfo(String color){
//         System.out.println(this.color);
//     }

//     public void hostelInfo(int room){
//         System.out.println(room);
//     }

//     public void hostelInfo(String color,int room){
//         System.out.println(this.color);
//         System.out.println(this.room);
//     }

//     public void hostelInfo(String type,String color){
//         System.out.println(type+" "+color);
//     }
//     Hostel(Hostel h2){ 
//     this.color=h2.color;
//     this.room=h2.room;
//     this.type=h2.type;
//     }
//     Hostel(){

//     }
// }

// public class OOPS {
//     public static void main(String[] args) {
//         Hostel h1=new Hostel();
//         h1.color="Blue";
//         h1.room=19;
//         h1.type="Boys";
//         h1.hostelInfo("Blue",18);

//         Hostel h2=new Hostel(h1);
//         h2.hostelInfo("Black","Boys");
//         // Hostel h2=new Hostel();
//     }
// }
////////////////////////////////////////////////

abstract class Animal {
    abstract void Walk();
}

class Horse extends Animal {
    public void Walk() {
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal {
    public void Walk() {
        System.out.println("Walks on 2 legs");
    }
}

public class OOPS {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.Walk();
        // Animal anm = new Animal();
        // anm.Walk();
    }
}