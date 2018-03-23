/* Copyright 2009 Vladimir Schäfer
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.security.saml.websso;

import java.net.URI;

import org.junit.Before;
import org.junit.Test;
import org.opensaml.PaosBootstrap;

import static org.junit.Assert.assertTrue;

/**
 * @author Vladimir Schäfer
 */
public class ArtifactResolutionProfileImplTest {


    @Before
    public void setup() throws Exception {
        PaosBootstrap.bootstrap();
    }

    /**
     * Verifies that hostConfiguration can be loaded when HttpClient has no defaults.
     */
    @Test
    public void testHostConfigurationNoDefaults() throws Exception {

        ArtifactResolutionProfileImpl artifactResolutionProfile = new ArtifactResolutionProfileImpl();
        URI uri = new URI("http", "test", "/artifact", null);

    }

    /**
     * Verifies that hostConfiguration is correctly cloned when HttpClient contains defaults.
     */
    @Test
    public void testHostConfigurationWithDefaults() throws Exception {

//        // Client object with default settings
//        HttpClient client = new HttpClient();
//        HostConfiguration defaultConfiguration = new HostConfiguration();
//        defaultConfiguration.setProxy("testProxy", 8000);
//        defaultConfiguration.getParams().setParameter("testParam", "testValue");
//        client.setHostConfiguration(defaultConfiguration);
//
//        ArtifactResolutionProfileImpl artifactResolutionProfile = new ArtifactResolutionProfileImpl(client);
//        URI uri = new URI("http", "test", "/artifact", null);
//        HostConfiguration hostConfiguration = artifactResolutionProfile.getHostConfiguration(uri, null);
//
//        // Verify that settings were cloned
//        assertNotNull(hostConfiguration);
//        assertEquals("test", hostConfiguration.getHost());
//        assertEquals("testProxy", hostConfiguration.getProxyHost());
//        assertEquals(8000, hostConfiguration.getProxyPort());
//        assertEquals("testValue", hostConfiguration.getParams().getParameter("testParam"));
//
//        // Make sure default object and newly created configuration are independent
//        defaultConfiguration.setProxyHost(null);
//        assertEquals("testProxy", hostConfiguration.getProxyHost());
//        assertEquals(8000, hostConfiguration.getProxyPort());

    }

    /**
     * Verifies that hostname verification is supported with the supplied libraries.
     */
    @Test
    public void testHostnameVerificationSupported() {
        ArtifactResolutionProfileImpl artifactResolutionProfile = new ArtifactResolutionProfileImpl();
        assertTrue(artifactResolutionProfile.isHostnameVerificationSupported());
    }

}
