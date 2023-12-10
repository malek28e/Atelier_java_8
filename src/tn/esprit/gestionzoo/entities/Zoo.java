package tn.esprit.gestionzoo.entities;

public class Zoo {
   private Animal[] animals ;
   private String name,city;
    static final int  nbrCages = 25;
   private int nbrAnimal;
  private Aquatic[] aquaticAnimals;
    private int nbrAquatics;

    public Zoo() {
    }

    public Zoo(String name, String city) {
        animals = new Animal[nbrCages];
        aquaticAnimals = new Aquatic[10];
        this.name = name;
        this.city = city;

    }

    public void setAquaticAnimals(Aquatic[] aquaticAnimals) {
        this.aquaticAnimals = aquaticAnimals;
    }

    public void setNbrAquatics(int nbrAquatics) {
        this.nbrAquatics = nbrAquatics;
    }

    public Aquatic[] getAquaticAnimals() {
        return aquaticAnimals;
    }

    public int getNbrAquatics() {
        return nbrAquatics;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getNbrAnimal() {
        return nbrAnimal;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public void setName(String name) {
        if(name.isBlank())
            System.out.println("il faut que chaque zoo obtient un nom");
      else  this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setNbrAnimal(int nbrAnimal) {
        this.nbrAnimal = nbrAnimal;
    }

    void displayZoo(){
        System.out.println("le nom de la zoo est : "+name+"\n city : "
                +city+" \n nombre de cages : "+nbrCages);
    }

   public void addAnimal(Animal animal) throws ZooFullException,InvalidAgeException{
        if(nbrCages>nbrAnimal){
            if(animal.getAge()>=0){
            animals[nbrAnimal]=animal;
            nbrAnimal++;
            System.out.println("animal ajouter");}
            else {
                throw new InvalidAgeException("age ne peut pas etre négative");
            }
        }else {
            throw new ZooFullException("zoo est plein");
        }
    }



  public  void displayAnimals(){
        System.out.println("les animaux exist dans le zoo "+name);
        for (int i=0;i<nbrAnimal;i++){
            System.out.println(animals[i]);
            i++;
        }
    }


    int searchAnimal(Animal animal) {
        for (int i = 0; i < nbrAnimal; i++) {
            if (animal.getName() == animals[i].getName()) //animals[i].name.equals(animal.name)
                return i;

        }
        return -1;
    }

 public   boolean removeAnimal(Animal animal) {
        int indexAnimal = searchAnimal(animal);
        if (indexAnimal == -1)
            return false;
        for (int i = indexAnimal; i < nbrAnimal; i++) {
            animals[i] = animals[i + 1];
            animals[nbrAnimal] = null;
            this.nbrAnimal--;
        }
        System.out.println("suppression avec succes");
        return true;

    }

   public boolean isZooFull(){
        return nbrAnimal==nbrCages;
    }

 public  static Zoo comparerZoo(Zoo z1,Zoo z2){
       if(z1.nbrAnimal> z2.nbrAnimal)
           return z1;
       return z2;

    }

    public void addAquaticAnimal(Aquatic aquatic) {
        aquaticAnimals[nbrAquatics] = aquatic;
        nbrAquatics++;
    }

    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0f;
        for (int i = 0; i < nbrAquatics; i++) {
            if (aquaticAnimals[i] instanceof Penguin penguin) {
                if (maxDepth < penguin.getSwimmingDepth())
                    maxDepth = penguin.getSwimmingDepth();
            }
        }
        return maxDepth;
    }

    public void displayNumberOfAquaticsByType() {
        int nbrPenguins = 0;
        int nbrDolphins = 0;
        for (int i = 0; i < nbrAquatics; i++) {
            if (aquaticAnimals[i] instanceof Dolphin) {
                nbrDolphins++;
            }
            if (aquaticAnimals[i] instanceof Penguin) {
                nbrPenguins++;
            }
        }
        System.out.println("Le Zoo " + name + " contient " + nbrDolphins + " dauphins et " + nbrPenguins + " pingouins");
    }

    @Override
    public String toString() {
        return "le nom de la zoo est : "+name+"\n city : "
                +city+" \n nombre de cages : "+nbrCages ;
    }
}
