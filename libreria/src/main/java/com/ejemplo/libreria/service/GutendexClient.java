package com.ejemplo.libreria.service;

import com.ejemplo.libreria.model.Book;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class GutendexClient {

    private final RestTemplate restTemplate = new RestTemplate();
    private final String API_URL = "https://gutendex.com/books";

    public List<Book> searchBooks(String query) {
        String url = API_URL + "?search=" + query;
        ResponseEntity<GutendexResponse> response = restTemplate.getForEntity(url, GutendexResponse.class);
        return response.getBody().getResults();
    }

    // Define una clase para mapear la respuesta de la API
    private static class GutendexResponse {
        private List<Book> results;

        // Getters y Setters

        public List<Book> getResults() {
            return results;
        }

        public void setResults(List<Book> results) {
            this.results = results;
        }
    }
}
