package org.parcore.api.client.utilities;

import org.parcore.api.client.async.ApiCallback;

import java.lang.reflect.Type;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;

/**
 * PAR API
 * <p>
 * AbstractApiCallImpl
 * <p>
 * Abstract generic implementation of the API call process. This class has methods to set up GETs, PUTs and POSTs and
 * should be subclassed by endpoint specific classes. W and E should be the wrapper type (for list operations) and the
 * entity type (for get/update operations) respectively.
 * <p>
 * Synchronous and Asynchronous calls for all methods are provided
 * for here. See {@link org.parcore.api.client.endpoints.FileFormatsApiImpl} or {@link org.parcore.api.client.endpoints.PreservationActionTypesApiImpl}
 * for examples of how to sub-class this class.
 * <p>
 * OpenAPI spec version: 1.0.0
 * <p>
 * This class is based on code auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 */
public class AbstractApiCallImpl<W, E> {

    private ApiClient apiClient;
    private final String endpoint;
    private DateTimeFormatter lenientFormatter = DateTimeFormatter.ISO_DATE;
    private DateTimeFormatter strictFormatter = DateTimeFormatter.ISO_DATE_TIME;
    private final Class<W> wrapperType;
    private final Class<E> entityType;

    //by default GET operations should be unauthenticated
    protected String[] localVarAuthNames = new String[]{};

    // No client code can instantiate without an endpoint
    @SuppressWarnings("unused")
    private AbstractApiCallImpl() {
        endpoint = "";
        wrapperType = null;
        entityType = null;
    }

    /**
     * Public constructor takes an API client and the specific entity type endpoint, e.g. /fileFormats
     *
     * @param apiClient    Client
     * @param endpoint     Specific Entity endpoint
     * @param wrapperClass The class of the wrapper type object
     * @param entityClass  The class of the entity type object
     */
    public AbstractApiCallImpl(ApiClient apiClient, String endpoint, Class<W> wrapperClass, Class<E> entityClass) {
        this.apiClient = apiClient;
        this.endpoint = endpoint;
        this.entityType = entityClass;
        this.wrapperType = wrapperClass;
    }

    /**
     * Get a typed synchronous listing
     *
     * @param returnSubEntities Boolean to indicate whether sub-entities should be truncated
     * @param modifiedAfter     Filter for limiting the listing to entities modified after a given date
     * @param modifiedBefore    Filter for limiting the listing to entities modified before a given date
     * @param offset            The offset in the total list to retrieved paged data from
     * @param limit             The maximum number of entities to return
     * @param filterHeaders     Map of additional header parameters to use as filters
     * @return The ApiResponse
     * @throws ApiException on error
     */
    protected ApiResponse<W> getListing(Boolean returnSubEntities, String modifiedAfter, String modifiedBefore, Integer offset, Integer limit, Map<String, String> filterHeaders) throws ApiException {
        com.squareup.okhttp.Call call = getValidatedListingCall(returnSubEntities, modifiedAfter, modifiedBefore, offset, limit, filterHeaders, null, null);
        return apiClient.execute(call, wrapperType);
    }

    /**
     * Get a typed asynchronous listing
     *
     * @param returnSubEntities Boolean to indicate whether sub-entities should be truncated
     * @param modifiedAfter     Filter for limiting the listing to entities modified after a given date
     * @param modifiedBefore    Filter for limiting the listing to entities modified before a given date
     * @param filterHeaders     Map of additional header parameters to use as filters
     * @param callback          The interface to call back to
     * @throws ApiException on error
     */
    protected void getListingAsync(Boolean returnSubEntities, String modifiedAfter, String modifiedBefore, Map<String, String> filterHeaders, ApiCallback<W> callback) throws ApiException {
        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = callback::onDownloadProgress;
            progressRequestListener = callback::onUploadProgress;
        }

        com.squareup.okhttp.Call call = getValidatedListingCall(returnSubEntities, modifiedAfter, modifiedBefore, null, null, filterHeaders, progressListener, progressRequestListener);
        apiClient.executeAsync(call, wrapperType, callback);
    }

    /**
     * Get an individual entity by its id
     *
     * @param id                Id
     * @param returnSubEntities Boolean to indicate whether sub-entities should be truncated
     * @return The ApiResponse
     * @throws ApiException on error
     */
    protected ApiResponse<E> getEntity(String id, Boolean returnSubEntities) throws ApiException {
        com.squareup.okhttp.Call call = getValidatedByIdCall(id, returnSubEntities, null, null);
        return apiClient.execute(call, entityType);
    }

    /**
     * Get an entity asynchronously by its id
     *
     * @param id                Id
     * @param returnSubEntities Boolean to indicate whether sub-entities should be truncated
     * @param callback          The interface to call back to
     * @throws ApiException on error
     */
    protected void getEntityAsync(String id, Boolean returnSubEntities, ApiCallback<E> callback) throws ApiException {
        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = callback::onDownloadProgress;
            progressRequestListener = callback::onUploadProgress;
        }

        com.squareup.okhttp.Call call = getValidatedByIdCall(id, returnSubEntities, progressListener, progressRequestListener);
        apiClient.executeAsync(call, entityType, callback);
    }

    /**
     * Update an entity by its id
     *
     * @param id   Id
     * @param data The full entity to save
     * @return The updated entity wrapped in an ApiResponse
     * @throws ApiException on error
     */
    protected ApiResponse<E> updateEntity(String id, E data) throws ApiException {
        com.squareup.okhttp.Call call = getValidatedUpdateCall(id, data, null, null);
        return apiClient.execute(call, entityType);
    }

    /**
     * Update an entity asynchronously by its id
     *
     * @param id       Id
     * @param data     The full entity to save
     * @param callback The interface to call back to
     * @throws ApiException on error
     */
    protected void updateEntityAsync(String id, E data, ApiCallback<E> callback) throws ApiException {
        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = callback::onDownloadProgress;
            progressRequestListener = callback::onUploadProgress;
        }

        com.squareup.okhttp.Call call = getValidatedUpdateCall(id, data, progressListener, progressRequestListener);
        apiClient.executeAsync(call, entityType, callback);
    }

    /**
     * Create a new entity
     *
     * @param data The entity to save
     * @return The newly created entity
     * @throws ApiException on error
     */
    protected ApiResponse<E> createNewEntity(E data) throws ApiException {
        com.squareup.okhttp.Call call = getValidatedCreateCall(data, null, null);
        return apiClient.execute(call, entityType);
    }

    /**
     * Create a new entity asynchronously
     *
     * @param data     The entity to save
     * @param callback The interface to call back to
     * @throws ApiException on error
     */
    protected void createNewEntityAsync(E data, ApiCallback<E> callback) throws ApiException {
        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = callback::onDownloadProgress;
            progressRequestListener = callback::onUploadProgress;
        }

        com.squareup.okhttp.Call call = getValidatedCreateCall(data, progressListener, progressRequestListener);
        apiClient.executeAsync(call, entityType, callback);
    }

    /**
     * Validate that the supplied date parameter can be parsed as a date or date-time
     *
     * @param date         value
     * @param variableName name
     * @throws ApiException on validation error
     */
    private void validateDate(String date, String variableName) throws ApiException {
        if (date != null) {
            try {
                strictFormatter.parse(date);
            } catch (DateTimeParseException e) {
                try {
                    lenientFormatter.parse(date);
                } catch (DateTimeParseException e1) {
                    throw new ApiException(String.format("Could not parse supplied \"%s\" value (%s) as a valid date", variableName, date));
                }
            }
        }
    }

    /**
     * Build call for a get list operation
     *
     * @param returnSubEntities       Boolean to indicate with sub-entities should be truncated
     * @param modifiedAfter           Filter for limiting the listing to entities modified after a given date
     * @param modifiedBefore          Filter for limiting the listing to entities modified before a given date
     * @param offset                  The offset in the total list to retrieved paged data from
     * @param limit                   The maximum number of results to return
     * @param filters                 A map of other header parameters to filter the query
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call getListingCall(Boolean returnSubEntities, String modifiedAfter, String modifiedBefore, Integer offset, Integer limit, Map<String, String> filters, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();
        if (modifiedAfter != null) {
            localVarQueryParams.addAll(apiClient.parameterToPair("modifiedAfter", modifiedAfter));
        }
        if (modifiedBefore != null) {
            localVarQueryParams.addAll(apiClient.parameterToPair("modifiedBefore", modifiedBefore));
        }
        if (offset != null) {
            localVarQueryParams.addAll(apiClient.parameterToPair("offset", offset));
        }
        if (limit != null) {
            localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
        }

        Map<String, String> localVarHeaderParams = new HashMap<>();
        if (returnSubEntities != null) {
            localVarHeaderParams.put("ReturnSubEntities", apiClient.parameterToString(returnSubEntities));
        } else {
            localVarHeaderParams.put("ReturnSubEntities", "false");
        }

        localVarHeaderParams.putAll(filters);

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

        return apiClient.buildCall(endpoint, "GET", localVarQueryParams, localVarCollectionQueryParams, null, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    protected com.squareup.okhttp.Call getValidatedListingCall(Boolean returnSubEntities, String modifiedAfter, String modifiedBefore, Integer offset, Integer limit, Map<String, String> filters, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        validateDate(modifiedAfter, "modifiedAfter");
        validateDate(modifiedBefore, "modifiedBefore");
        return getListingCall(returnSubEntities, modifiedAfter, modifiedBefore, offset, limit, filters, progressListener, progressRequestListener);
    }


    /**
     * Build call for a get entity call
     *
     * @param id                      Unique identifier for the preservation action type to retrieve. (required)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call getByIdCall(String id, Boolean returnSubEntities, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

        //TODO: ID is not being escaped for URL encoding. This is because the "/" character is valid in IDs and was being escaped. This might need further thought
        String resourceUrl = endpoint + "/" + id;

        List<Pair> queryParams = new ArrayList<>();
        List<Pair> collectionQueryParams = new ArrayList<>();

        Map<String, String> headerParams = new HashMap<>();
        if (returnSubEntities != null) {
            headerParams.put("ReturnSubEntities", apiClient.parameterToString(returnSubEntities));
        } else {
            headerParams.put("ReturnSubEntities", "false");
        }

        Map<String, Object> formParams = new HashMap<>();

        final String[] acceptsHeader = {
                "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(acceptsHeader);
        if (localVarAccept != null) headerParams.put("Accept", localVarAccept);

        final String[] contentTypeHeader = {
                "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(contentTypeHeader);
        headerParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(chain -> {
                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                return originalResponse.newBuilder()
                        .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                        .build();
            });
        }

        return apiClient.buildCall(resourceUrl, "GET", queryParams, collectionQueryParams, null, headerParams, formParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    protected com.squareup.okhttp.Call getValidatedByIdCall(String id, Boolean returnSubEntities, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id'");
        }
        return getByIdCall(id, returnSubEntities, progressListener, progressRequestListener);
    }

    /**
     * Build call for an update entity call
     *
     * @param id                      Unique identifier for the existing preservation action type to update (required)
     * @param data                    (required)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call getUpdateCall(String id, E data, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

        //TODO: ID is not being escaped for URL encoding. This is because the "/" character is valid in IDs and was being escaped. This might need further thought
        // create path and map variables
        String localVarPath = endpoint + "/" + id;

        List<Pair> queryParams = new ArrayList<>();
        List<Pair> collectionQueryParams = new ArrayList<>();

        Map<String, String> headerParams = new HashMap<>();

        Map<String, Object> formParams = new HashMap<>();

        final String[] acceptsHeader = {
                "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(acceptsHeader);
        if (localVarAccept != null) headerParams.put("Accept", localVarAccept);

        final String[] contentTypeHeader = {
                "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(contentTypeHeader);
        headerParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(chain -> {
                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                return originalResponse.newBuilder()
                        .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                        .build();
            });
        }

        String[] localVarAuthNames = new String[]{"authorization"};
        return apiClient.buildCall(localVarPath, "PUT", queryParams, collectionQueryParams, data, headerParams, formParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    protected com.squareup.okhttp.Call getValidatedUpdateCall(String id, E data, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling update");
        }

        // verify the required parameter 'data' is set
        if (data == null) {
            throw new ApiException("Missing the required parameter 'data' when calling update");
        }
        return getUpdateCall(id, data, progressListener, progressRequestListener);
    }

    /**
     * Build call for createPreservationActionType
     *
     * @param data                    (required)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call getCreateCall(E data, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

        List<Pair> queryParams = new ArrayList<>();
        List<Pair> collectionQueryParams = new ArrayList<>();

        Map<String, String> headerParams = new HashMap<>();

        Map<String, Object> formParams = new HashMap<>();

        final String[] acceptsHeader = {
                "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(acceptsHeader);
        if (localVarAccept != null) headerParams.put("Accept", localVarAccept);

        final String[] contentTypeHeader = {
                "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(contentTypeHeader);
        headerParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(chain -> {
                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                return originalResponse.newBuilder()
                        .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                        .build();
            });
        }

        String[] localVarAuthNames = new String[]{"authorization"};
        return apiClient.buildCall(endpoint, "POST", queryParams, collectionQueryParams, data, headerParams, formParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    protected com.squareup.okhttp.Call getValidatedCreateCall(E data, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'data' is set
        if (data == null) {
            throw new ApiException("Missing the required parameter 'data' when calling createPreservationActionType(Async)");
        }
        return getCreateCall(data, progressListener, progressRequestListener);
    }

}