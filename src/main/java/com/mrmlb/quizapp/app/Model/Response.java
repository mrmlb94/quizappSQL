package com.mrmlb.quizapp.app.Model;

public class Response {
    private Integer id;
    private String response;

    // Constructor (RequiredArgsConstructor)
    public Response(Integer id, String response) {
        this.id = id;
        this.response = response;
    }

    // Getters (Data)
    public Integer getId() {
        return id;
    }

    public String getResponse() {
        return response;
    }

    // Setters (Data)
    public void setId(Integer id) {
        this.id = id;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    // toString() (Data)
    @Override
    public String toString() {
        return "Response{" +
                "id=" + id +
                ", response='" + response + '\'' +
                '}';
    }
}
