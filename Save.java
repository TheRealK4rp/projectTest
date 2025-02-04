

public class Save implements java.io.Serializable{
    int copy;
    String name;

    Save(int c, String n){
        copy = c;
        name = n;
    }

    public int getCopy(){ return copy;}
    public String getName(){ return name;}
}