/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.lro.implementation;

import com.microsoft.azure.v2.AzureEnvironment;
import com.microsoft.azure.v2.AzureProxy;
import com.microsoft.azure.v2.AzureServiceClient;
import com.microsoft.rest.v2.credentials.ServiceClientCredentials;
import com.microsoft.rest.v2.http.HttpPipeline;
import io.reactivex.annotations.NonNull;

/**
 * Initializes a new instance of the AutoRestLongRunningOperationTestServiceImpl type.
 */
public final class AutoRestLongRunningOperationTestServiceImpl extends AzureServiceClient {
    /**
     * Gets or sets the preferred language for the response.
     */
    private String acceptLanguage;

    /**
     * Gets Gets or sets the preferred language for the response.
     *
     * @return the acceptLanguage value.
     */
    public String acceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * Sets Gets or sets the preferred language for the response.
     *
     * @param acceptLanguage the acceptLanguage value.
     * @return the service client itself.
     */
    public AutoRestLongRunningOperationTestServiceImpl withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /**
     * Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30.
     */
    private int longRunningOperationRetryTimeout;

    /**
     * Gets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    public int longRunningOperationRetryTimeout() {
        return this.longRunningOperationRetryTimeout;
    }

    /**
     * Sets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     * @return the service client itself.
     */
    public AutoRestLongRunningOperationTestServiceImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
        this.longRunningOperationRetryTimeout = longRunningOperationRetryTimeout;
        return this;
    }

    /**
     * When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     */
    private boolean generateClientRequestId;

    /**
     * Gets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @return the generateClientRequestId value.
     */
    public boolean generateClientRequestId() {
        return this.generateClientRequestId;
    }

    /**
     * Sets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @param generateClientRequestId the generateClientRequestId value.
     * @return the service client itself.
     */
    public AutoRestLongRunningOperationTestServiceImpl withGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
    }

    /**
     * The LROsInner object to access its operations.
     */
    private LROsInner lROs;

    /**
     * Gets the LROsInner object to access its operations.
     *
     * @return the LROsInner object.
     */
    public LROsInner lROs() {
        return this.lROs;
    }

    /**
     * The LRORetrysInner object to access its operations.
     */
    private LRORetrysInner lRORetrys;

    /**
     * Gets the LRORetrysInner object to access its operations.
     *
     * @return the LRORetrysInner object.
     */
    public LRORetrysInner lRORetrys() {
        return this.lRORetrys;
    }

    /**
     * The LROSADsInner object to access its operations.
     */
    private LROSADsInner lROSADs;

    /**
     * Gets the LROSADsInner object to access its operations.
     *
     * @return the LROSADsInner object.
     */
    public LROSADsInner lROSADs() {
        return this.lROSADs;
    }

    /**
     * The LROsCustomHeadersInner object to access its operations.
     */
    private LROsCustomHeadersInner lROsCustomHeaders;

    /**
     * Gets the LROsCustomHeadersInner object to access its operations.
     *
     * @return the LROsCustomHeadersInner object.
     */
    public LROsCustomHeadersInner lROsCustomHeaders() {
        return this.lROsCustomHeaders;
    }

    /**
     * Initializes an instance of AutoRestLongRunningOperationTestService client.
     *
     * @param credentials the management credentials for Azure.
     */
    public AutoRestLongRunningOperationTestServiceImpl(@NonNull ServiceClientCredentials credentials) {
        this(AzureProxy.createDefaultPipeline(AutoRestLongRunningOperationTestServiceImpl.class, credentials));
    }

    /**
     * Initializes an instance of AutoRestLongRunningOperationTestService client.
     *
     * @param credentials the management credentials for Azure.
     * @param azureEnvironment The environment that requests will target.
     */
    public AutoRestLongRunningOperationTestServiceImpl(@NonNull ServiceClientCredentials credentials, @NonNull AzureEnvironment azureEnvironment) {
        this(AzureProxy.createDefaultPipeline(AutoRestLongRunningOperationTestServiceImpl.class, credentials), azureEnvironment);
    }

    /**
     * Initializes an instance of AutoRestLongRunningOperationTestService client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     */
    public AutoRestLongRunningOperationTestServiceImpl(@NonNull HttpPipeline httpPipeline) {
        this(httpPipeline, null);
    }

    /**
     * Initializes an instance of AutoRestLongRunningOperationTestService client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param azureEnvironment The environment that requests will target.
     */
    public AutoRestLongRunningOperationTestServiceImpl(@NonNull HttpPipeline httpPipeline, @NonNull AzureEnvironment azureEnvironment) {
        super(httpPipeline, azureEnvironment);
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.lROs = new LROsInner(this);
        this.lRORetrys = new LRORetrysInner(this);
        this.lROSADs = new LROSADsInner(this);
        this.lROsCustomHeaders = new LROsCustomHeadersInner(this);
    }
}
