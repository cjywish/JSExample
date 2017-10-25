import java.net.*;

public class AddressTests {
/* test update 1 */
/* local update 1 */
  public static int getVersion(InetAddress ia) {
    byte[] address = ia.getAddress();
    if (address.length == 4) return 4;
    else if (address.length == 16) return 6;
    else return -1;
  }
}
