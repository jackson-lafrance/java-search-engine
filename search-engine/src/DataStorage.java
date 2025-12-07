import java.io.IOException;

// interface for data storage operations - allows different storage implementations
public interface DataStorage {
    void writeObject(Object obj, String filename) throws IOException;
    <T> T readObject(String filename) throws IOException, ClassNotFoundException;
    void clearStorage();
}

