public sealed class Employee permits Salesman, Manager {
    private String name;

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
}
