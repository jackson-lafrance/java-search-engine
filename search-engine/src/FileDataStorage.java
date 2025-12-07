
import java.io.*;

// file-based implementation of DataStorage interface
public class FileDataStorage implements DataStorage {

    private final String baseDirectory;

    public FileDataStorage(String baseDirectory) {
        this.baseDirectory = baseDirectory;
    }

    // writes an object to a file
    public void writeObject(Object obj, String filename) throws IOException {
        File file = new File(baseDirectory, filename);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(obj);
        }
    }

    // reads an object from a file
    public <T> T readObject(String filename) throws IOException, ClassNotFoundException {
        File file = new File(baseDirectory, filename);
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            return (T) ois.readObject();
        }
    }

    // clears all stored data
    public void clearStorage() {
        File dir = new File(baseDirectory);

        if (dir.exists() && dir.isDirectory()) {
            try {
                File[] files = dir.listFiles();
                if (files != null) {
                    for (File file : files) {
                        file.delete();
                    }
                }
                dir.delete();
            } catch (Exception e) {
                // Ignore exceptions during cleanup
            }
        }

        if (!dir.exists()) {
            dir.mkdirs();
        }
    }
}
