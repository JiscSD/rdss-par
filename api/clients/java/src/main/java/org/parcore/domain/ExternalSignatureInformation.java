package org.parcore.domain;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

/**
 * PAR API
 * <p>
 * ExternalSignatureInformation
 * <p>
 * Domain model for the ExternalSignatureInformation object (part of the FileFormat Core Entity)
 * <p>
 * OpenAPI spec version: 1.0.0
 * <p>
 * This class is based on code auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 */
public class ExternalSignatureInformation {
    @SerializedName("externalSignatureId")
    private String externalSignatureId = null;

    @SerializedName("externalSignatureIdNamespace")
    private String externalSignatureIdNamespace = null;

    @SerializedName("signature")
    private String signature = null;

    @SerializedName("signatureType")
    private String signatureType = null;

    public ExternalSignatureInformation externalSignatureId(String externalSignatureId) {
        this.externalSignatureId = externalSignatureId;
        return this;
    }

    /**
     * Get externalSignatureId
     *
     * @return externalSignatureId
     **/
    @ApiModelProperty(value = "")
    public String getExternalSignatureId() {
        return externalSignatureId;
    }

    public void setExternalSignatureId(String externalSignatureId) {
        this.externalSignatureId = externalSignatureId;
    }

    public ExternalSignatureInformation externalSignatureIdNamespace(String externalSignatureIdNamespace) {
        this.externalSignatureIdNamespace = externalSignatureIdNamespace;
        return this;
    }

    /**
     * Get externalSignatureIdNamespace
     *
     * @return externalSignatureIdNamespace
     **/
    @ApiModelProperty(value = "")
    public String getExternalSignatureIdNamespace() {
        return externalSignatureIdNamespace;
    }

    public void setExternalSignatureIdNamespace(String externalSignatureIdNamespace) {
        this.externalSignatureIdNamespace = externalSignatureIdNamespace;
    }

    public ExternalSignatureInformation signature(String signature) {
        this.signature = signature;
        return this;
    }

    /**
     * Get signature
     *
     * @return signature
     **/
    @ApiModelProperty(value = "")
    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public ExternalSignatureInformation signatureType(String signatureType) {
        this.signatureType = signatureType;
        return this;
    }

    /**
     * Get signatureType
     *
     * @return signatureType
     **/
    @ApiModelProperty(value = "")
    public String getSignatureType() {
        return signatureType;
    }

    public void setSignatureType(String signatureType) {
        this.signatureType = signatureType;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExternalSignatureInformation externalSignatureInformation = (ExternalSignatureInformation) o;
        return Objects.equals(this.externalSignatureId, externalSignatureInformation.externalSignatureId) &&
                Objects.equals(this.externalSignatureIdNamespace, externalSignatureInformation.externalSignatureIdNamespace) &&
                Objects.equals(this.signature, externalSignatureInformation.signature) &&
                Objects.equals(this.signatureType, externalSignatureInformation.signatureType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(externalSignatureId, externalSignatureIdNamespace, signature, signatureType);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExternalSignatureInformation {\n");

        sb.append("    externalSignatureId: ").append(toIndentedString(externalSignatureId)).append("\n");
        sb.append("    externalSignatureIdNamespace: ").append(toIndentedString(externalSignatureIdNamespace)).append("\n");
        sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
        sb.append("    signatureType: ").append(toIndentedString(signatureType)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

