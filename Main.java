public class Main
{
    public static void main(String[] args) {
    Parent parentObj = new Parent();
        parentObj.parentMethod();  
        Child childObj = new Child();
        childObj.childMethod();   
        childObj.parentMethod();   
    }
}
