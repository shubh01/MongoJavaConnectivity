import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

/** MongoDb connection class*/
public class MongoDbConnection {

    public static MongoClient getConnection(String hostName, int port){
        return new MongoClient(hostName,port);
    }

    public static MongoDatabase getDatabase(String databaseName, MongoClient mongoClient){
        return mongoClient.getDatabase(databaseName);
    }
}
