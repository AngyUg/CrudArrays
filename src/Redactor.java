public class Redactor {
    public String[] create(String[] arr, String value) {
        for (int i = 0; i == 0; i++) {
            if (arr[i] == null) {
                arr[i] = value;
                return arr;
            }
        }
        return arr;
    }

    public void read(String[] arr) {
        for (String s : arr) {
            System.out.print(s + ", ");

        }
    }

    public void read(String[] arr, int index) {
        if (index > arr.length - 1) {
            System.out.println("NO SUCH INDEX!");
        } else {
            System.out.println("Value: " + arr[index]);
        }
    }

    public String[] update(String[] arr, int index, String value) {
        for (int i = 0; i < arr.length; i++) {

            if (index > arr.length) {
                System.out.println("NO SUCH INDEX!");
            } else {
                arr[index] = arr[i]; {
                    System.out.println(" updated index  arr[" + index+"]");
                }
            }
        }
        return arr;
    }

    public String[] delete(String[] arr, int index, String value) {
        for (int i = 0; i < arr.length; i++) {

            if (index > arr.length - 1) {
                System.out.println("NO SUCH INDEX!");
            } else {
                arr[index] = null;{
                    System.out.println(" deleted index  arr["+ index+"]");
                }
            }
        }
        return arr;
    }

}