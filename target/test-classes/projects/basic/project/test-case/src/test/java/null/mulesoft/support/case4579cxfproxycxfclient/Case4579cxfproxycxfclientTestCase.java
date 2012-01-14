/*
 * Generated by the Mule project wizard. http://mule.mulesoft.org
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package ${packageInPathFormat}.mulesoft.support.test-case;

import java.io.InputStream;

import org.mule.api.MuleMessage;
import org.mule.api.client.MuleClient;
import org.mule.tck.FunctionalTestCase;
import org.mule.transport.NullPayload;
import org.mule.util.IOUtils;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class Case4579cxfproxycxfclientTestCase extends FunctionalTestCase
{
    protected String getConfigResources()
    {
        return "test-case-functional-test-config.xml";
    }

    @Test
    public void test-case() throws Exception
    {
        MuleClient client = muleContext.getClient();
        InputStream inputStream = IOUtils.getResourceAsStream("test.xml", getClass());
        MuleMessage result = client.send("http://localhost:8989/services/synergy-bus", IOUtils.toString(inputStream), null);
//      MuleMessage result = client.send("vm://in", IOUtils.toString(inputStream), null);

        assertNotNull(result);
        assertNull(result.getExceptionPayload());
        assertFalse(result.getPayload() instanceof NullPayload);

        //TODO Assert the correct data has been received
//        assertEquals("some data Received", result.getPayloadAsString());
    }
}
