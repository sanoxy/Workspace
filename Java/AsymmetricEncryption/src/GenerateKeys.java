import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.*;

public class GenerateKeys {
    private final KeyPairGenerator keyGen;
    private PrivateKey privateKey;
    private PublicKey publicKey;

    GenerateKeys(int length) throws NoSuchAlgorithmException {
        this.keyGen = KeyPairGenerator.getInstance("RSA"); //Singleton
        this.keyGen.initialize(length);
    }

    public void createKeys(){
        KeyPair pair = this.keyGen.generateKeyPair();
        this.privateKey = pair.getPrivate();
        this.publicKey = pair.getPublic();
    }

    public PrivateKey getPrivateKey() {
        return privateKey;
    }

    public PublicKey getPublicKey() {
        return publicKey;
    }

    public void writeToFile(String path, byte[] key) throws IOException {
        File file = new File(path);
        file.getParentFile().mkdirs();

        FileOutputStream fos = new FileOutputStream(file);
        fos.write(key);
        fos.flush();
        fos.close();
    }

    public static void main(String[] args) throws NoSuchAlgorithmException, IOException {
        GenerateKeys generateKeys = new GenerateKeys(1024);
        generateKeys.createKeys();
        generateKeys.writeToFile("KeyPair/publicKey",generateKeys.getPublicKey().getEncoded());
        generateKeys.writeToFile("KeyPair/privateKey",generateKeys.getPrivateKey().getEncoded());
    }
}
