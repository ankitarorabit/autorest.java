/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodyfile.implementation;

import com.microsoft.rest.v2.RestProxy;
import com.microsoft.rest.v2.ServiceClient;
import com.microsoft.rest.v2.http.HttpPipeline;
import fixtures.bodyfile.AutoRestSwaggerBATFileService;
import fixtures.bodyfile.Files;

/**
 * Initializes a new instance of the AutoRestSwaggerBATFileService type.
 */
public class AutoRestSwaggerBATFileServiceImpl extends ServiceClient implements AutoRestSwaggerBATFileService {
    /**
     * The Files object to access its operations.
     */
    private Files files;

    /**
     * Gets the Files object to access its operations.
     *
     * @return the Files object.
     */
    public Files files() {
        return this.files;
    }

    /**
     * Initializes an instance of AutoRestSwaggerBATFileService client.
     */
    public AutoRestSwaggerBATFileServiceImpl() {
        this(RestProxy.createDefaultPipeline());
    }

    /**
     * Initializes an instance of AutoRestSwaggerBATFileService client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     */
    public AutoRestSwaggerBATFileServiceImpl(HttpPipeline httpPipeline) {
        super(httpPipeline);
        this.files = new FilesImpl(this);
    }
}
