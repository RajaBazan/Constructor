package hello.com;
class MymainEmployee{
    private int id;
    private String name;
    public MymainEmployee(String myname, int myid){
        name = myname;
        id = myid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
public class Lec_42_Constructor {
    public static void main(String[] args) {
    MymainEmployee name = new MymainEmployee("Raja Bazan", 12);
    name.getId();
    name.getName();
        System.out.println(name.getName());
        System.out.println(name.getId());
        MymainEmployee name1 = new MymainEmployee("Rohail", 2);
        name1.getName();
        name1.getId();
        System.out.println(name1.getId());
        System.out.println(name1.getName());
    }
}
