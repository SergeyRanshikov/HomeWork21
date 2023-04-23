public class Hogwarts {
    private  String name;
    private  int thePowerOfSorcery;
    private  int apparition;

    public Hogwarts(String name, int thePowerOfSorcery, int apparition) {
        this.name = name;
        this.thePowerOfSorcery = thePowerOfSorcery;
        this.apparition = apparition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getThePowerOfSorcery() {
        return thePowerOfSorcery;
    }

    public void setThePowerOfSorcery(int thePowerOfSorcery) {
        this.thePowerOfSorcery = thePowerOfSorcery;
    }

    public int getApparition() {
        return apparition;
    }

    public void setApparition(int apparition) {
        this.apparition = apparition;
    }


    @Override
    public String toString() {
        return "Hogwarts{" +
                "name='" + name + '\'' +
                ", thePowerOfSorcery=" + thePowerOfSorcery +
                ", apparition=" + apparition +
                '}';
    }
}
