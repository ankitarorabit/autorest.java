/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodyformdata;

import com.microsoft.rest.v2.RestResponse;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import fixtures.bodyformdata.models.ErrorException;
import io.reactivex.Flowable;
import io.reactivex.Maybe;
import io.reactivex.Single;
import java.nio.ByteBuffer;

/**
 * An instance of this class provides access to all the operations defined in
 * Formdatas.
 */
public interface Formdatas {
    /**
     * Upload file.
     *
     * @param fileContent File to upload.
     * @param fileName File name to upload. Name has to be spelled exactly as written here.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Flowable&lt;ByteBuffer&gt; object if successful.
     */
    Flowable<ByteBuffer> uploadFile(Flowable<ByteBuffer> fileContent, String fileName);

    /**
     * Upload file.
     *
     * @param fileContent File to upload.
     * @param fileName File name to upload. Name has to be spelled exactly as written here.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Flowable&lt;ByteBuffer&gt;&gt;} object.
     */
    ServiceFuture<Flowable<ByteBuffer>> uploadFileAsync(Flowable<ByteBuffer> fileContent, String fileName, ServiceCallback<Flowable<ByteBuffer>> serviceCallback);

    /**
     * Upload file.
     *
     * @param fileContent File to upload.
     * @param fileName File name to upload. Name has to be spelled exactly as written here.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Single&lt;RestResponse&lt;Void, Flowable&lt;ByteBuffer&gt;&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Flowable<ByteBuffer>>> uploadFileWithRestResponseAsync(Flowable<ByteBuffer> fileContent, String fileName);

    /**
     * Upload file.
     *
     * @param fileContent File to upload.
     * @param fileName File name to upload. Name has to be spelled exactly as written here.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Maybe&lt;Flowable&lt;ByteBuffer&gt;&gt;} object if successful.
     */
    Maybe<Flowable<ByteBuffer>> uploadFileAsync(Flowable<ByteBuffer> fileContent, String fileName);

    /**
     * Upload file.
     *
     * @param fileContent File to upload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Flowable&lt;ByteBuffer&gt; object if successful.
     */
    Flowable<ByteBuffer> uploadFileViaBody(Flowable<ByteBuffer> fileContent);

    /**
     * Upload file.
     *
     * @param fileContent File to upload.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Flowable&lt;ByteBuffer&gt;&gt;} object.
     */
    ServiceFuture<Flowable<ByteBuffer>> uploadFileViaBodyAsync(Flowable<ByteBuffer> fileContent, ServiceCallback<Flowable<ByteBuffer>> serviceCallback);

    /**
     * Upload file.
     *
     * @param fileContent File to upload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Single&lt;RestResponse&lt;Void, Flowable&lt;ByteBuffer&gt;&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Flowable<ByteBuffer>>> uploadFileViaBodyWithRestResponseAsync(Flowable<ByteBuffer> fileContent);

    /**
     * Upload file.
     *
     * @param fileContent File to upload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Maybe&lt;Flowable&lt;ByteBuffer&gt;&gt;} object if successful.
     */
    Maybe<Flowable<ByteBuffer>> uploadFileViaBodyAsync(Flowable<ByteBuffer> fileContent);
}
