package cr.microservicios.commons.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ClienteRequest {

	@JsonProperty("codeID")
	private String codeId;

	@JsonProperty("documentIdType")
	private String documentIdType;

	@JsonProperty("documentIdNumber")
	private String documentIdNumber;

	public String getCodeId() {
		return codeId;
	}

	public void setCodeId(String codeId) {
		this.codeId = codeId;
	}

	public String getDocumentIdType() {
		return documentIdType;
	}

	public void setDocumentIdType(String documentIdType) {
		this.documentIdType = documentIdType;
	}

	public String getDocumentIdNumber() {
		return documentIdNumber;
	}

	public void setDocumentIdNumber(String documentIdNumber) {
		this.documentIdNumber = documentIdNumber;
	}

}
