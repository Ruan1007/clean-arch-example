package com.cleanarchexample.api.controllers;

import com.cleanarchexample.application.models.requests.ProdutoRequest;
import com.cleanarchexample.application.usecases.ProdutoUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.websocket.server.PathParam;

@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping("/produtos")
public class ProdutoController {

    private final ProdutoUseCase produtoUseCase;

    @GetMapping("/{id_produto}")
    public ResponseEntity<Object> getProdutoById(@PathParam("id_produto") Long id) {
        var response = produtoUseCase.getProdutoById(id);
        return ResponseEntity.ok(response);
    }

    @GetMapping
    public ResponseEntity<Object> getAll() {
        var response = produtoUseCase.getAll();
        return ResponseEntity.ok(response);
    }

    @PostMapping
    public ResponseEntity<Object> create(@Valid @RequestBody ProdutoRequest request) {
        var response = produtoUseCase.create(request);
        return ResponseEntity.ok(response);
    }
}
