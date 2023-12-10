package tn.esprit.gestionzoo.entities;

public sealed class Animal permits Aquatic,Terrestrial {
  private   String family,name;
   private int age;
  private   boolean isMammal;


    public Animal() {
    }

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if(age<0)
            System.out.println("age doit etre suppereir a zero");
        else  this.age = age;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }

    public String getFamily() {
        return family;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isMammal() {
        return isMammal;
    }

    void displayAnnimal(){
        System.out.println("la family de ce animal est : "+family+
                "\n name : " +name+
                " \n age : "+age+
                "\n est ce que mammal : "+isMammal);
    }

    @Override
    public String toString() {
        return "la family de ce animal est : "+family+
                "\n name : " +name+
                " \n age : "+age+
                "\n est ce que mammal : "+isMammal ;
    }
}
