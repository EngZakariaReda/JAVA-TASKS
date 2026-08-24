public class Main {
    public static void main(String[] args) {

        String firstName = "zeko";
        String secondName = null;

        try {
            String result = convertToUpperCase(secondName);
            System.out.println(result);

        } catch (NullPointerException e) {
            System.out.println("The string is null!");
//            System.out.println(e.getMessage());
        } finally {
            System.out.println("End");
        }
    }

    public static String convertToUpperCase(String name){
        return name.toUpperCase();
    }

}