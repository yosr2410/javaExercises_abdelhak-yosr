package fr.abdelhak.myApi.Controller;

public class AnimalRequest {
    private String name;
    private String type;
    private int weight;
    public AnimalRequest(String name, String type, int weight) {
        this.name = name;
        this.type = type;
        this.weight = weight;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

}
