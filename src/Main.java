public class Main {
    public static void main(String[] args) {

        String value = "name";

        String [] arr = new String[10];

        Redactor redactor=new Redactor();
       arr = redactor.create(arr, value);
       redactor.read(arr);
       redactor.read(arr,1);
       redactor.update(arr,9,value);
       redactor.delete(arr,1,value);
    }
}
