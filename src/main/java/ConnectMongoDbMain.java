import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class ConnectMongoDbMain {

    private final static String DATABASE_NAME="userdb";
    private final static String HOST_NAME="localhost";
    private final static int PORT=27017;

    public static void main(String[] args) {
        MongoClient mongoClient=MongoDbConnection.getConnection("localhost",27017);
        MongoDatabase mongoDatabase=MongoDbConnection.getDatabase("userdb",mongoClient);
        System.out.println("Database created if not exist");
        mongoDatabase.createCollection("userDetail");
        System.out.println("Collection created");
        mongoDatabase.getCollection("userDetail").insertOne(
                new Document().append("Name","John").append("City","London").append("Roll Number",21)
        );
        System.out.println("Document Inserted");
    }

}
