package org.parcore.api.client.endpoints;

import org.parcore.api.client.async.ApiCallback;
import org.parcore.api.client.utilities.ApiClient;
import org.parcore.api.client.utilities.ApiException;
import org.parcore.api.client.utilities.ApiResponse;
import org.parcore.api.client.utilities.Pair;
import org.parcore.api.client.utilities.ProgressRequestBody;
import org.parcore.api.client.utilities.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import org.parcore.domain.FileFormat;
import org.parcore.domain.FileFormats;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * PAR API
 * <p>
 * FileFormatsApiImpl
 * <p>
 * Client implementation for the File Formats PAR Core Entity endpoint
 * <p>
 * OpenAPI spec version: 1.0.0
 * <p>
 * This class is based on code auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 */
public class FileFormatsApiImpl implements FileFormatsApi {

    private ApiClient apiClient;

    //By default GET calls shouldn't require authentication
    private String[] localVarAuthNames = new String[]{};

    /**
     * Constructor using a specific client
     *
     * @param apiClient Client Object to use
     */
    public FileFormatsApiImpl(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Constructor to allow for the specification of authorization schemes to use for GET calls.
     *
     * @param apiClient Client
     * @param authNames List of authz schemes
     */
    public FileFormatsApiImpl(ApiClient apiClient, String[] authNames) {
        this(apiClient);
        this.localVarAuthNames = authNames;
    }

    /**
     * Build call for getFileFormats
     *
     * @param returnSubEntities       Specify if sub entities should be included in response. (optional)
     * @param modifiedAfter           Filter the file formats to return only the ones having a localLastModifiedDate value GREATER than the one passed in. Allowed datetime formats are YYYY-MM-DD\\&#39;T\\&#39;hh\\:mm\\:ssTZD and YYYY-MM-DD. In the second scenario, when the time is not provided, it will be assumed to be 00\\:00\\:00 UTC time. (optional)
     * @param modifiedBefore          Filter the file formats to return only the ones having a localLastModifiedDate value LOWER than the one passed in. Allowed datetime formats are YYYY-MM-DD\\&#39;T\\&#39;hh\\:mm\\:ssTZD and YYYY-MM-DD. In the second scenario, when the time is not provided, it will be assumed to be 00\\:00\\:00 UTC time (optional)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call fileFormatsGetCall(Boolean returnSubEntities, String modifiedAfter, String modifiedBefore, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

        // create path and map variables
        String localVarPath = "/fileFormats";

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();
        if (modifiedAfter != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("modifiedAfter", modifiedAfter));
        if (modifiedBefore != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("modifiedBefore", modifiedBefore));

        Map<String, String> localVarHeaderParams = new HashMap<>();
        if (returnSubEntities != null)
            localVarHeaderParams.put("ReturnSubEntities", apiClient.parameterToString(returnSubEntities));

        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
                "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
                "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(chain -> {
                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                return originalResponse.newBuilder()
                        .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                        .build();
            });
        }

        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, null, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call fileFormatsGetValidateBeforeCall(Boolean returnSubEntities, String modifiedAfter, String modifiedBefore, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        return fileFormatsGetCall(returnSubEntities, modifiedAfter, modifiedBefore, progressListener, progressRequestListener);
    }

    @Override
    public FileFormats getFileFormats(Boolean returnSubEntities, String modifiedAfter, String modifiedBefore) throws ApiException {
        ApiResponse<FileFormats> resp = getFileFormatsApiResponse(returnSubEntities, modifiedAfter, modifiedBefore);
        return resp.getData();
    }

    @Override
    public ApiResponse<FileFormats> getFileFormatsApiResponse(Boolean returnSubEntities, String modifiedAfter, String modifiedBefore) throws ApiException {
        com.squareup.okhttp.Call call = fileFormatsGetValidateBeforeCall(returnSubEntities, modifiedAfter, modifiedBefore, null, null);
        Type localVarReturnType = new TypeToken<FileFormats>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    @Override
    public void getFileFormatsAsync(Boolean returnSubEntities, String modifiedAfter, String modifiedBefore, final ApiCallback<FileFormats> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = callback::onDownloadProgress;
            progressRequestListener = callback::onUploadProgress;
        }

        com.squareup.okhttp.Call call = fileFormatsGetValidateBeforeCall(returnSubEntities, modifiedAfter, modifiedBefore, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FileFormats>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
    }

    /**
     * Build call for createFileFormat
     *
     * @param data                    (required)
     * @param returnSubEntities       Specify if sub entities should be included in response. (optional)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call fileFormatsPostCall(FileFormat data, Boolean returnSubEntities, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

        // create path and map variables
        String localVarPath = "/fileFormats";

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();

        Map<String, String> localVarHeaderParams = new HashMap<>();
        if (returnSubEntities != null)
            localVarHeaderParams.put("ReturnSubEntities", apiClient.parameterToString(returnSubEntities));

        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
                "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
                "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(chain -> {
                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                return originalResponse.newBuilder()
                        .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                        .build();
            });
        }

        String[] localVarAuthNames = new String[]{"authorization"};
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, data, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call fileFormatsPostValidateBeforeCall(FileFormat data, Boolean returnSubEntities, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'data' is set
        if (data == null) {
            throw new ApiException("Missing the required parameter 'data' when calling createFileFormat(Async)");
        }
        return fileFormatsPostCall(data, returnSubEntities, progressListener, progressRequestListener);
    }

    @Override
    public FileFormat createFileFormat(FileFormat data, Boolean returnSubEntities) throws ApiException {
        ApiResponse<FileFormat> resp = createFileFormatApiResponse(data, returnSubEntities);
        return resp.getData();
    }

    @Override
    public ApiResponse<FileFormat> createFileFormatApiResponse(FileFormat data, Boolean returnSubEntities) throws ApiException {
        com.squareup.okhttp.Call call = fileFormatsPostValidateBeforeCall(data, returnSubEntities, null, null);
        Type localVarReturnType = new TypeToken<FileFormat>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    @Override
    public void createFileFormatAsync(FileFormat data, Boolean returnSubEntities, final ApiCallback<FileFormat> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = callback::onDownloadProgress;
            progressRequestListener = callback::onUploadProgress;
        }

        com.squareup.okhttp.Call call = fileFormatsPostValidateBeforeCall(data, returnSubEntities, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FileFormat>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
    }

    /**
     * Build call for getFileFormatByPuid
     *
     * @param puid                    Unique identifier for the file format to retrieve. (required)
     * @param returnSubEntities       Specify if sub entities should be included in response. (optional)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call fileFormatsPuidGetCall(String puid, Boolean returnSubEntities, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

        //TODO: ID is not being escaped for URL encoding. This is because the "/" character is valid in IDs and was being escaped. This might need further thought
        // create path and map variables
        String localVarPath = "/fileFormats/{puid}"
                .replaceAll("\\{" + "puid" + "\\}", puid);

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();

        Map<String, String> localVarHeaderParams = new HashMap<>();
        if (returnSubEntities != null)
            localVarHeaderParams.put("ReturnSubEntities", apiClient.parameterToString(returnSubEntities));

        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
                "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
                "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(chain -> {
                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                return originalResponse.newBuilder()
                        .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                        .build();
            });
        }

        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, null, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call fileFormatsPuidGetValidateBeforeCall(String puid, Boolean returnSubEntities, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'puid' is set
        if (puid == null) {
            throw new ApiException("Missing the required parameter 'puid' when calling getFileFormatByPuid(Async)");
        }
        return fileFormatsPuidGetCall(puid, returnSubEntities, progressListener, progressRequestListener);
    }

    @Override
    public FileFormat getFileFormatByPuid(String puid, Boolean returnSubEntities) throws ApiException {
        ApiResponse<FileFormat> resp = getFileFormatByPuidApiResponse(puid, returnSubEntities);
        return resp.getData();
    }

    @Override
    public ApiResponse<FileFormat> getFileFormatByPuidApiResponse(String puid, Boolean returnSubEntities) throws ApiException {
        com.squareup.okhttp.Call call = fileFormatsPuidGetValidateBeforeCall(puid, returnSubEntities, null, null);
        Type localVarReturnType = new TypeToken<FileFormat>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    @Override
    public void getFileFormatByPuidAsync(String puid, Boolean returnSubEntities, final ApiCallback<FileFormat> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = callback::onDownloadProgress;
            progressRequestListener = callback::onUploadProgress;
        }

        com.squareup.okhttp.Call call = fileFormatsPuidGetValidateBeforeCall(puid, returnSubEntities, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FileFormat>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
    }

    /**
     * Build call for updateFileFormat
     *
     * @param puid                    Unique identifier for the file format to update (required)
     * @param data                    (required)
     * @param returnSubEntities       Specify if sub entities should be included in response. (optional)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call fileFormatsPuidPutCall(String puid, FileFormat data, Boolean returnSubEntities, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

        // create path and map variables
        String localVarPath = "/fileFormats/{puid}"
                .replaceAll("\\{" + "puid" + "\\}", puid);

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();

        Map<String, String> localVarHeaderParams = new HashMap<>();
        if (returnSubEntities != null)
            localVarHeaderParams.put("ReturnSubEntities", apiClient.parameterToString(returnSubEntities));

        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
                "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
                "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(chain -> {
                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                return originalResponse.newBuilder()
                        .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                        .build();
            });
        }

        String[] localVarAuthNames = new String[]{"authorization"};
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, data, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call fileFormatsPuidPutValidateBeforeCall(String puid, FileFormat data, Boolean returnSubEntities, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'puid' is set
        if (puid == null) {
            throw new ApiException("Missing the required parameter 'puid' when calling updateFileFormat(Async)");
        }

        // verify the required parameter 'data' is set
        if (data == null) {
            throw new ApiException("Missing the required parameter 'data' when calling updateFileFormat(Async)");
        }

        return fileFormatsPuidPutCall(puid, data, returnSubEntities, progressListener, progressRequestListener);
    }

    @Override
    public FileFormat updateFileFormat(String puid, FileFormat data, Boolean returnSubEntities) throws ApiException {
        ApiResponse<FileFormat> resp = updateFileFormatApiResponse(puid, data, returnSubEntities);
        return resp.getData();
    }

    @Override
    public ApiResponse<FileFormat> updateFileFormatApiResponse(String puid, FileFormat data, Boolean returnSubEntities) throws ApiException {
        com.squareup.okhttp.Call call = fileFormatsPuidPutValidateBeforeCall(puid, data, returnSubEntities, null, null);
        Type localVarReturnType = new TypeToken<FileFormat>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    @Override
    public void updateFileFormatAsync(String puid, FileFormat data, Boolean returnSubEntities, final ApiCallback<FileFormat> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = callback::onDownloadProgress;
            progressRequestListener = callback::onUploadProgress;
        }

        com.squareup.okhttp.Call call = fileFormatsPuidPutValidateBeforeCall(puid, data, returnSubEntities, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FileFormat>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
    }
}
