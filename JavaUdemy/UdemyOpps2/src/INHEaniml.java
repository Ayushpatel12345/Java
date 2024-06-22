public class INHEaniml{
    private  String  type;
    private  String size;
    private  double weight;
    public INHEaniml(){ }
    public INHEaniml(String type,String size,double weight){
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void moves(String speed){
        System.out.println(type + " moves" + speed);
    }

    public void noise(){
        System.out.println(type + " make some kind of noise");
    }
}

