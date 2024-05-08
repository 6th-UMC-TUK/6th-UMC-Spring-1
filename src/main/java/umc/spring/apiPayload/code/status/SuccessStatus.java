package umc.spring.apiPayload.code.status;

public enum SuccessStatus {
    _OK("200", "OK"),
    _CREATED("201", "Created"),
    _ACCEPTED("202", "Accepted"),
    _NO_CONTENT("204", "No Content"),
    _RESET_CONTENT("205", "Reset Content"),
    _PARTIAL_CONTENT("206", "Partial Content");

    private final String code;
    private final String message;

    SuccessStatus(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
