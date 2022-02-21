/**
 * @author yelallioui
 *
 */

public class EncodageParDefaut {
    public static void main(String[] args) throws java.io.IOException {
        
        String encodage = System.getProperty("file.encoding");
        System.out.println("Encodage par défaut : " + encodage);

        String proverbe = "Qui s\u00E8me le vent, r\u00E9colte la temp\u00EAte" ; 

        String proverbeEncode= new String ( proverbe.getBytes(), encodage );
        System.out.println("Proverbe : " + proverbeEncode );
    }
}
