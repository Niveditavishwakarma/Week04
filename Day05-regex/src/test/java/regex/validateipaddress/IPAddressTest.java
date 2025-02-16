package regex.validateipaddress;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IPAddressTest {
    @Test
    public void testValidIP() {
        assertTrue(IPAddress.isValidIP("192.168.0.1"));
        assertTrue(IPAddress.isValidIP("0.0.0.0"));
        assertTrue(IPAddress.isValidIP("255.255.255.255"));
        assertTrue(IPAddress.isValidIP("10.0.0.1"));
    }

    @Test
    public void testInvalidIP() {
        assertFalse(IPAddress.isValidIP("256.256.256.256"));
        assertFalse(IPAddress.isValidIP("192.168.01.355"));
        assertFalse(IPAddress.isValidIP("123.456.789.0"));
        assertFalse(IPAddress.isValidIP("abc.def.ghi.jkl"));
        assertFalse(IPAddress.isValidIP("192.168.0"));
    }
}