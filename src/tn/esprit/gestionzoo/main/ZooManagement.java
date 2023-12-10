package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {
    public static void main(String[] args) {

        // Instruction 1 :
            /*
                int nbrCages = 20;
                String zooName = "my zoo";
                System.out.println(zooName+" comporte "+nbrCages+" cages");
            */

        // Instruction 2 :
            /*
            Scanner sc = new Scanner(System.in);
            System.out.println("entre le nombre de cages");
            int nbrCages = sc.nextInt();
            System.out.println("entre le nom du zoo");
            String zooName = sc.next();
            */

        // Instruction 3 :
            // System.out.println(zooName+" comporte "+nbrCages+" cages");

        // Instruction 5 :
           //  Animal lion = new Animal();
            /*
            lion.family = "cats";

             lion.name = "simba";
            lion.age = 20;
            lion.isMammal = true;
            */

           //Zoo myZoo = new Zoo();
            /*
            myZoo.name = "belvider";
            myZoo.city = "tunisie";
            myZoo.nbrCages = 30;
            System.out.println(myZoo.animals.length);
            */
        // Instruction 6 : creation de constructeur parametre
        // Instruction 7 :
      //  Animal lion = new Animal("cats","simba",10,true);
      //  Zoo myZoo = new Zoo("belveder","tunisie",40);
        // Instruction 8 :
        // myZoo.displayZoo();
       // System.out.println(myZoo.toString());
     //   System.out.println(myZoo);
        // Instruction 9 :
       // System.out.println(lion);

        // Instruction 10 :
        Animal tiger = new Animal("cats","bagira",8,true);
        Animal loup = new Animal("loup","akira",8,true);
    //    myZoo.addAnimal(loup);
      //  myZoo.addAnimal(tiger);


        // Instrction 11 :

     //   myZoo.displayAnimals();
     //  int x= myZoo.searchAnimal(lion);
      //  System.out.println(x);

        // Instruction 13 :
      //  myZoo.removeAnimal(loup);

        // Instruction 15 :
        Zoo myZoo = new Zoo("belveder","tunisie");
       boolean isFull= myZoo.isZooFull();
       System.out.println(isFull);
        // Instruction 16 :
        Zoo z1 = new Zoo("savana","france");
        System.out.println(Zoo.comparerZoo(myZoo,z1));

        // Instruction 18 et 19 : encapsulation au niveau de classe Zoo et Animal

        // Instruction 20 : creation des classes
        // Instruction 21 :
        Aquatic ac = new Aquatic();
        Terrestrial tr = new Terrestrial();
        Dolphin dp = new Dolphin();
        Penguin pn = new Penguin();

        // Instruction 22 :


        Aquatic aquatic = new Aquatic("Fish", "Sardine", 2, true, "Sea");
        Terrestrial terrestrial = new Terrestrial("Panda", "Narla", 4, true, 2);
        Dolphin dolphin = new Dolphin("Delphinidae", "Flipper", 5, true, "Ocean", 14.5f);
        Penguin penguin = new Penguin("Spheniscidae", "Skipper", 3, true, "Ocean", 25.3f);

        // Instruction 23 :
        System.out.println(aquatic);
        System.out.println(terrestrial);
        System.out.println(dolphin);
        System.out.println(penguin);

        // Instruction 24 :
        aquatic.swim();
        dolphin.swim();
        penguin.swim();



        // Instruction 26 :

        Dolphin d = new Dolphin();
        d.setSwimmingSpeed(24.5f);
        Dolphin d1 = new Dolphin();
        d1.setSwimmingSpeed(21.8f);
        Dolphin d2 = new Dolphin();
        d2.setSwimmingSpeed(20.3f);
        Dolphin d3 = new Dolphin();
        d3.setSwimmingSpeed(22.6f);

        myZoo.addAquaticAnimal(d);
        myZoo.addAquaticAnimal(d1);
        myZoo.addAquaticAnimal(d2);
        myZoo.addAquaticAnimal(d3);
        Penguin p = new Penguin();
        p.setSwimmingDepth(24.6f);
        Penguin p1 = new Penguin();
        p1.setSwimmingDepth(29.6f);
        Penguin p2 = new Penguin();
        p2.setSwimmingDepth(219.6f);
        Penguin p3 = new Penguin();
        p3.setSwimmingDepth(2.6f);
        myZoo.addAquaticAnimal(p);
        myZoo.addAquaticAnimal(p1);
        myZoo.addAquaticAnimal(p2);
        myZoo.addAquaticAnimal(p3);

        // Instruction 27 :
        for (int i = 0; i < myZoo.getNbrAquatics(); i++) {
            Aquatic[] aquatics = myZoo.getAquaticAnimals();
            aquatics[i].swim();
        }


      // Instruction 29 et 30 :
        myZoo.displayNumberOfAquaticsByType();

        System.out.println(myZoo.maxPenguinSwimmingDepth());

        // Instruction 32 33 34:
        try {

         myZoo.addAnimal(new Animal("cats","fahd",5,true));
         myZoo.displayAnimals();
        }catch (ZooFullException e){
         System.out.println(e.getMessage());
        }
        catch (InvalidAgeException e){
         System.out.println(e.getMessage());
        }


        // Instruction 35,36,37,38
     Aquatic aquatic1 = new Aquatic("Fish", "Sardine", 2, true, "Sea");
     Terrestrial terrestrial1 = new Terrestrial("Panda", "Narla", 4, true, 2);
     Penguin penguin1 = new Penguin("Spheniscidae", "Skipper", 3, true, "Ocean", 25.3f);

     aquatic1.eatMeat(Food.MEAT);
     terrestrial1.eatPlantAndMeet(Food.BOTH);
     penguin1.eatMeat(Food.MEAT);

    }
}