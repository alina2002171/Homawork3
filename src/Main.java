import animal.Animal1;
import animal.Cat;
import animal.Cow;
import animal.Dog;

public class Main {
    public static void main(String[] args) {
//
//        Maximum maximum=new Maximum(10,20,30,new int[]{1,2,34});
//        maximum.max(maximum.getA(), maximum.getB());
//        maximum.max(maximum.getA(),maximum.getB(),maximum.getC());
//        maximum.max(maximum.getArray());
//
//        Cat cat=new Cat("Merri",21);
//        Cow cow=new Cow("Arti",90);
//        Dog dog=new Dog("Siba nu",34);
//        Animal1[]animals=new Animal1[]{cow,cat,dog};
//        for (int i = 0; i < animals.length; i++) {
//           if(animals[i] instanceof Cat){
//               animals[i].voice();
//           }
//           if(animals[i] instanceof Cow){
//               animals[i].voice();
//           }
//           if(animals[i] instanceof Dog){
//               animals[i].voice();
//           }
//
//        }

        Shark shark = new Shark();
        Shark[] sharks=new Shark[]{shark};


        Turtle turtle = new Turtle();
        Turtle[] turtles = new Turtle[]{turtle};

        Eagle eagle = new Eagle();
        Eagle[] eagles = new Eagle[]{eagle};
        Animal[] animals = new Animal[]{shark, turtle, eagle};
        for (int i = 0; i < animals.length; i++) {
            if( animals[i] instanceof Shark ){
                ((Shark) animals[i]).attack();
            }
            if(animals[i] instanceof Turtle){
                ((Turtle) animals[i]).swim();
            }
               if (animals[i] instanceof Eagle){
                   ((Eagle) animals[i]).fly();
               }
            }
        }
    }




