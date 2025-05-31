package uap.bases;

public abstract class Donut {
    private String name;

    public Donut(){}

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public abstract void dislayInfo();
    
}