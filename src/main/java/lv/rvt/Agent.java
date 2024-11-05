package lv.rvt;

public class Agent {
    String last ="Bond";
    String name="James";
    Agent(String name, String last){
        this.last =last;
        this.name=name;
    }
    
    public String toString(){
        return "My name is "+last+", "+name+" "+last;
    }

}
