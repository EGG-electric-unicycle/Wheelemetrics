package com.github.gadgetfactory.wheelemetrics.protocol.resolver;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author esaj
 */
public class GotwayProtocolResolverTest
{
    private GotwayProtocolResolver resolver;

    @Before
    public void setUp()
    {
        resolver = new GotwayProtocolResolver();
    }

    @Test
    public void testMatching()
    {
        byte[] perfectMatchData =  new byte[]{(byte)0x04, (byte)0x18, (byte)0x5A, (byte)0x5A, (byte)0x5A, (byte)0x5A, (byte)0x55, (byte)0xAA, (byte)0x19, (byte)0xA7, (byte)0xFF, (byte)0xFF, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x01, (byte)0xFF, (byte)0xE0, (byte)0xF8, (byte)0xBD, (byte)0x00, (byte)0x01, (byte)0xFF, (byte)0xF8, (byte)0x00, (byte)0x18, (byte)0x5A, (byte)0x5A, (byte)0x5A, (byte)0x5A, (byte)0x55, (byte)0xAA, (byte)0x00, (byte)0x09, (byte)0x1A, (byte)0x9D, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00};
        Assert.assertEquals(1.0D, resolver.match(perfectMatchData), 0.000001D);
    }
}