package org.parcore.api.client.endpoints;

import org.parcore.api.client.async.ApiCallback;
import org.parcore.api.client.utilities.AbstractApiCallImpl;
import org.parcore.api.client.utilities.ApiClient;
import org.parcore.api.client.utilities.ApiException;
import org.parcore.api.client.utilities.ApiResponse;
import org.parcore.domain.ParProperties;
import org.parcore.domain.ParProperty;

import java.util.Collections;

/**
 * PAR API
 * <p>
 * ParPropertiesApiImpl
 * <p>
 * Client implementation for the PAR Properties PAR Core Entity endpoint
 * <p>
 * OpenAPI spec version: 1.0.0
 * <p>
 * This class is based on code auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 */
@SuppressWarnings({"unused", "WeakerAccess"})
public class ParPropertiesApiImpl extends AbstractApiCallImpl<ParProperties, ParProperty> implements ParPropertiesApi {

    /**
     * Default Constructor
     *
     * @param apiClient Configured client
     */
    public ParPropertiesApiImpl(ApiClient apiClient) {
        super(apiClient, "/par-properties", ParProperties.class, ParProperty.class);
    }

    /**
     * Constructor allowing for authenticated GETs
     *
     * @param apiClient Configured client
     * @param authNames Authentication/Authorization schema to use
     */
    public ParPropertiesApiImpl(ApiClient apiClient, String[] authNames) {
        this(apiClient);
        this.localVarAuthNames = authNames;
    }

    @Override
    public ParProperties getAllProperties() throws ApiException {
        return getListingApiResponse(null, null, null, null).getData();
    }

    @Override
    public ParProperties getPagedListOfProperties(Integer offset, Integer limit) throws ApiException {
        return getListingApiResponse(null, null, offset, limit).getData();
    }

    @Override
    public ParProperties getPagedListofPropertiesByModifiedDate(String modifiedAfter, String modifiedBefore, Integer offset, Integer limit) throws ApiException {
        return getListingApiResponse(modifiedAfter, modifiedBefore, offset, limit).getData();
    }

    @Override
    public ParProperties getPropertiesByModifiedDate(String modifiedAfter, String modifiedBefore) throws ApiException {
        return getListingApiResponse(modifiedAfter, modifiedBefore, null, null).getData();
    }

    @Override
    public void getPropertiesAsync(String modifiedAfter, String modifiedBefore, final ApiCallback<ParProperties> callback) throws ApiException {
        getListingAsync(null, modifiedAfter, modifiedBefore, Collections.emptyMap(), callback);
    }

    @Override
    public ParProperty getPropertyById(String id) throws ApiException {
        return getEntity(id, null).getData();
    }

    @Override
    public void getPropertyByIdAsync(String id, ApiCallback<ParProperty> callback) throws ApiException {
        getEntityAsync(id, null, callback);
    }

    @Override
    public ParProperty updateProperty(String id, ParProperty data) throws ApiException {
        return updateEntity(id, data).getData();
    }

    @Override
    public void updatePropertyAsync(String id, ParProperty data, ApiCallback<ParProperty> callback) throws ApiException {
        updateEntityAsync(id, data, callback);
    }

    @Override
    public ParProperty createProperty(ParProperty data) throws ApiException {
        return createNewEntity(data).getData();
    }

    @Override
    public void createPropertyAsync(ParProperty data, ApiCallback<ParProperty> callback) throws ApiException {
        createNewEntityAsync(data, callback);
    }


    // --- Internal methods that call down to the AbstractClass

    private ApiResponse<ParProperties> getListingApiResponse(String modifiedAfter, String modifiedBefore, Integer offset, Integer limit) throws ApiException {
        return getListing(null, modifiedAfter, modifiedBefore, offset, limit, Collections.emptyMap());
    }

}
