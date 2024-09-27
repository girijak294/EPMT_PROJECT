
class StreamsResponse {
    private String responseBody;
    private int statusCode;
    private String responseType;

    // Constructor
    public StreamsResponse(String responseBody, int statusCode, String responseType) {
        this.responseBody = responseBody;
        this.statusCode = statusCode;
        this.responseType = responseType;
    }

    // Getters and Setters (optional)
    public String getResponseBody() {
        return responseBody;
    }

    public void setResponseBody(String responseBody) {
        this.responseBody = responseBody;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getResponseType() {
        return responseType;
    }

    public void setResponseType(String responseType) {
        this.responseType = responseType;
    }

    // toString() to print the response details
    @Override
    public String toString() {
        return "Response{responseBody='" + responseBody + "', statusCode=" + statusCode + ", responseType='" + responseType + "'}";
    }
}
