package web.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
public class ServiceResponse<T> {

    private String status;
    private T data;

    public ServiceResponse(){}

    public ServiceResponse(String status, T data) {
        this.status = status;
        this.data = data;
    }
}