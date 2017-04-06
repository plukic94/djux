package seminarski;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Encrypt {
    static String IV = "AAAAAAAAAAAAAAAA";
    static String encryptionKey = "3123456yxcabcdef";
    
  public static byte[] encrypt(Path path) throws Exception {
    Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding", "SunJCE");
    SecretKeySpec key = new SecretKeySpec(encryptionKey.getBytes("UTF-8"), "AES");
    cipher.init(Cipher.ENCRYPT_MODE, key,new IvParameterSpec(IV.getBytes("UTF-8")));
    byte[] byte_array = Files.readAllBytes(path);
    int i = byte_array.length % 16;
    byte[] krajni = new byte[byte_array.length + 16 - i];
    System.arraycopy(byte_array, 0, krajni, 0, byte_array.length);
    byte[] return_value = cipher.doFinal(krajni);
    Files.write(Paths.get("crypted_"+ path), return_value, StandardOpenOption.CREATE_NEW);//Reši exception file već postoji
    return return_value;
  }
  public static void decrypt(byte[] cipherText) throws Exception{
    Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding", "SunJCE");
    SecretKeySpec key = new SecretKeySpec(encryptionKey.getBytes("UTF-8"), "AES");
    cipher.init(Cipher.DECRYPT_MODE, key,new IvParameterSpec(IV.getBytes("UTF-8")));
    int i = cipherText.length % 16;
    byte[] krajni = new byte[cipherText.length + 16 - i];
    System.arraycopy(cipherText, 0, krajni, 0, cipherText.length);
    byte[] return_value = cipher.doFinal(krajni);
    Files.write(Paths.get("c:/Users/Petar/Desktop/decrypted.txt"), cipher.doFinal(cipherText), StandardOpenOption.CREATE_NEW);
  }
}
