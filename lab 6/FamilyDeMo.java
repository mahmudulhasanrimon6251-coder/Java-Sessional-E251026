public class FamilyDeMo {
 public static void main(String[] args) {
 Son s = new Son();
 s.company();
 s.car();
 s.bike();
 }
}
class Grandfather {
 void company() {
 System.out.println("Grandfather has a family company.");
 }
}
class Father extends Grandfather {
 void car() {
 System.out.println("Father owns a car.");
 }
}

class Son extends Father {
    void bike() {
        System.out.println("Son has a bike.");
    }
}