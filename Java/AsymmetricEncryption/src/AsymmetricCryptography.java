import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.security.*;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

public class AsymmetricCryptography {
    private final Cipher cipher;

    AsymmetricCryptography() throws NoSuchPaddingException, NoSuchAlgorithmException {
        this.cipher = Cipher.getInstance("RSA");
    }

    public PrivateKey getPrivate(String fileName) throws IOException, NoSuchAlgorithmException, InvalidKeySpecException {
        byte[] keyBytes = Files.readAllBytes(new File(fileName).toPath());
        PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec(keyBytes);
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        return keyFactory.generatePrivate(spec);
    }

    public PublicKey getPublic(String fileName) throws IOException, NoSuchAlgorithmException, InvalidKeySpecException {
        byte[] keyBytes = Files.readAllBytes(new File(fileName).toPath());
        X509EncodedKeySpec spec = new X509EncodedKeySpec(keyBytes);
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        return keyFactory.generatePublic(spec);
    }

    public String encryptText(String msg, PublicKey key) throws InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        this.cipher.init(Cipher.ENCRYPT_MODE,key);
        return Base64.getEncoder().encodeToString(cipher.doFinal(msg.getBytes(StandardCharsets.UTF_8)));
    }

    public String decryptText(String msg, PrivateKey key) throws InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        this.cipher.init(Cipher.DECRYPT_MODE, key);
        return new String(cipher.doFinal(Base64.getDecoder().decode(msg)),StandardCharsets.UTF_8);
    }

    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, IOException, InvalidKeySpecException, IllegalBlockSizeException, BadPaddingException, InvalidKeyException {
        AsymmetricCryptography asymmetricCryptography = new AsymmetricCryptography();
        PublicKey publicKey = asymmetricCryptography.getPublic("KeyPair/publicKey");
        PrivateKey privateKey = asymmetricCryptography.getPrivate("KeyPair/privateKey");

        String msg = "Merhaba Dunya!";
        String encrypted = asymmetricCryptography.encryptText(msg,publicKey);
        String decrypted = asymmetricCryptography.decryptText(encrypted,privateKey);
        System.out.println("Original Message: " + msg + "\nEncrypted Message: " + encrypted + "\nDecrypted Message: " + decrypted);
    }
}
