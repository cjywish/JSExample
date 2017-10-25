import java.net.*;

public class AddressTests {
/* test update 1 */
/* local update 1 */
<<<<<<< HEAD
/* lcoal update 2 */
=======
  /* remote update2 */
>>>>>>> dbef51f2b19c50b7c05c303d00f488b48861cef1
  public static int getVersion(InetAddress ia) {
    byte[] address = ia.getAddress();
    if (address.length == 4) return 4;
    else if (address.length == 16) return 6;
    else return -1;
  }
}
