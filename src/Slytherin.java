public class Slytherin extends Hogwarts{
    //    ученикам Слизерина присущи хитрость, решительность, амбициозность, находчивость и жажда власти
//    Slytherin students are cunning, decisive, ambitious, resourceful and lust for power
    private int cunning;
    private int decisive;
    private int ambitious;
    private int resourceful;
    private int lustForPower;

    public Slytherin(String name, int thePowerOfSorcery, int apparition, int cunning, int decisive, int ambitious, int resourceful, int lustForPower) {
        super(name, thePowerOfSorcery, apparition);
        this.cunning = cunning;
        this.decisive = decisive;
        this.ambitious = ambitious;
        this.resourceful = resourceful;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDecisive() {
        return decisive;
    }

    public void setDecisive(int decisive) {
        this.decisive = decisive;
    }

    public int getAmbitious() {
        return ambitious;
    }

    public void setAmbitious(int ambitious) {
        this.ambitious = ambitious;
    }

    public int getResourceful() {
        return resourceful;
    }

    public void setResourceful(int resourceful) {
        this.resourceful = resourceful;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }
    public void sumScoreStudentGryffindor(){

    }

}
