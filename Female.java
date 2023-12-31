public class Female extends Human  {
    private int husband;
    private GenderType sex;

    public Female(String name,String surname, int birthYear, int birthMonth, int birthDay) {
        super(name,surname, birthYear, birthMonth, birthDay);
        this.sex = GenderType.female;
    }

    public Female(String name, String surname) {
        super(name,surname);
        this.sex = GenderType.female;
    }

    public Female() {
        this.sex = GenderType.female;
    }

    public String toString() {
        return super.toString() + ", женщина";
    }

    public void getMarried(Human husband) {
        super.getMarried(husband);
    }

    public int getHusband() {
        return husband;
    }

    public void setHusband(int husband) {
        this.husband = husband;
    }
     @Override
    public void setMother(int mother) {
       this.mother = mother;

    }

    @Override
    public void setFather(int father) {
       this.father = father;
  }

    
}

