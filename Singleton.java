// Singleton class
class DatabaseConnection {

    // 1. static variable to store the single instance
    private static DatabaseConnection instance;

    // 2. private constructor — prevents object creation using "new"
    private DatabaseConnection() {
        System.out.println("✅ Database Connection Object Created");
    }

    // 3. public method to return the same instance every time
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }
}


 class Main {
    public static void main(String[] args) {

        // Getting instance first time
        DatabaseConnection conn1 = DatabaseConnection.getInstance();

        // Getting instance second time
        DatabaseConnection conn2 = DatabaseConnection.getInstance();

        // Check if both objects are same
        System.out.println("conn1 hashcode: " + conn1.hashCode());
        System.out.println("conn2 hashcode: " + conn2.hashCode());

        if (conn1 == conn2) {
            System.out.println("✅ Both references point to the SAME object (Singleton Works!)");
        } else {
            System.out.println("Different objects created (Singleton Failed)");
        }
    }
}
