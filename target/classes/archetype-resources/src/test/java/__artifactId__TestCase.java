#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/*
 * Generated by the Mule project wizard. http://mule.mulesoft.org
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package ${packageInPathFormat};

import org.mule.api.MuleMessage;
import org.mule.api.client.MuleClient;
import org.mule.tck.junit4.FunctionalTestCase;
import org.mule.transport.NullPayload;


import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class ${artifactId}TestCase extends FunctionalTestCase
{
    protected String getConfigResources()
    {
        return "functional-test-config.xml";
    }

    @Test
    public void ${artifactId}() throws Exception
    {
        MuleClient client = muleContext.getClient();
        MuleMessage result = client.send("vm://in", "some data", null);

        assertNotNull(result);
        assertNull(result.getExceptionPayload());
        assertFalse(result.getPayload() instanceof NullPayload);

        //TODO Assert the correct data has been received
        assertEquals("some data Received", result.getPayloadAsString());
    }
}
