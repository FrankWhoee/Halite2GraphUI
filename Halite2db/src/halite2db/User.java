package halite2db;

import java.awt.Color;

public class User {
    
    private String id;
    private String name;
    private Color colour;
    
    public User(String id, String name, Color colour){
        this.id = id;
        this.name = name;
        this.colour = colour;
    }
    
    public void setId(String id){
        this.id = id;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    
    public Color getColor(){
        return colour;
    }
    
}
