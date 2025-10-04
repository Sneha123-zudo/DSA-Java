public class encap{
    private String name;

    public void setName(String s){
        name = s;
    }
    public String getNmae(){
        return name;
    }
    public static void main(String[] args) {
        String s = "Sneha";
        encap obj = new encap();
        obj.setName(s);
        System.out.println(obj.getNmae());
    }
}