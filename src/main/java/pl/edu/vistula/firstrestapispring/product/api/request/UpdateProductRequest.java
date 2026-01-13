package pl.edu.vistula.firstrestapispring.product.api.request;

public class UpdateProductRequest {

    private String name;

    public UpdateProductRequest() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
