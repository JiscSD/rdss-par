package org.parcore.domain;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * PAR API
 * <p>
 * FileFormats
 * <p>
 * Domain model for a list of FileFormat Core entity objects, as returned by the API
 * <p>
 * OpenAPI spec version: 1.0.0
 * <p>
 * This class is based on code auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 */
@SuppressWarnings("unused")
@ApiModel(description = "A list of file formats")
public class FileFormats {
    @SerializedName("fileFormats")
    private List<FileFormat> fileFormats = null;

    public void addFileFormatsItem(FileFormat fileFormatsItem) {
        if (this.fileFormats == null) {
            this.fileFormats = new ArrayList<>();
        }
        this.fileFormats.add(fileFormatsItem);
    }

    /**
     * Get fileFormats
     *
     * @return fileFormats
     **/
    @ApiModelProperty(value = "")
    public List<FileFormat> getFileFormats() {
        if (fileFormats == null) {
            fileFormats = new ArrayList<>();
        }
        return fileFormats;
    }

    public void setFileFormats(List<FileFormat> fileFormats) {
        this.fileFormats = fileFormats;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FileFormats fileFormats = (FileFormats) o;
        return Objects.equals(this.fileFormats, fileFormats.fileFormats);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileFormats);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FileFormats {\n");

        sb.append("    fileFormats: ").append(toIndentedString(fileFormats)).append("\n");
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