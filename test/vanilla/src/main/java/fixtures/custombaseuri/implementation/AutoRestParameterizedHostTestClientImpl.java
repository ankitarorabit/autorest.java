/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.custombaseuri.implementation;

import com.microsoft.rest.v2.RestProxy;
import com.microsoft.rest.v2.ServiceClient;
import com.microsoft.rest.v2.http.HttpPipeline;
import fixtures.custombaseuri.AutoRestParameterizedHostTestClient;
import fixtures.custombaseuri.Paths;

/**
 * Initializes a new instance of the AutoRestParameterizedHostTestClient type.
 */
public class AutoRestParameterizedHostTestClientImpl extends ServiceClient implements AutoRestParameterizedHostTestClient {
    /**
     * A string value that is used as a global part of the parameterized host.
     */
    private String host;

    /**
     * Gets A string value that is used as a global part of the parameterized host.
     *
     * @return the host value.
     */
    public String host() {
        return this.host;
    }

    /**
     * Sets A string value that is used as a global part of the parameterized host.
     *
     * @param host the host value.
     * @return the service client itself
     */
    public AutoRestParameterizedHostTestClientImpl withHost(String host) {
        this.host = host;
        return this;
    }

    /**
     * The Paths object to access its operations.
     */
    private Paths paths;

    /**
     * Gets the Paths object to access its operations.
     *
     * @return the Paths object.
     */
    public Paths paths() {
        return this.paths;
    }

    /**
     * Initializes an instance of AutoRestParameterizedHostTestClient client.
     */
    public AutoRestParameterizedHostTestClientImpl() {
        this(RestProxy.createDefaultPipeline());
    }

    /**
     * Initializes an instance of AutoRestParameterizedHostTestClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     */
    public AutoRestParameterizedHostTestClientImpl(HttpPipeline httpPipeline) {
        super(httpPipeline);
        this.host = "host";
        this.paths = new PathsImpl(this);
    }
}
