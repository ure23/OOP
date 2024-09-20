public class Dog {
    string name; 
    boolean isMale;
    int numPuppies;
    String puppies[] = new String[4];

    public void setName(String dogName){
        name = dogName;
    
    }
    public String showName(){
        return name;
    }
    public String bark(){
        return "woof! woof!";
    }
    public void setNumber(int numOfPuppies){
        numPuppies = numOfPuppies;
    }
    public int showNumber(){
        return numPuppies;
    }
    public void setPuppies(String[]puppiesSet){
        puppies = puppiesSet;
    }
    public String[] showPuppies(){
        return puppies;
    }
}
