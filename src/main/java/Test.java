import java.util.LinkedList;

class Test {
    public static void main(String[] args) {
        LinkedList<User> users = new LinkedList<>();
        for (int i = 0; i < 10000; i++) {
            users.add(new User(Integer.toString(i)));
        }
        System.out.println("b");
    }
    static class User {
        String name;
        User(String name) {
            this.name = name;

        }

    }}
