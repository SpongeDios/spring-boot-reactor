package com.hector.springboot.client.app.services;

import com.hector.springboot.client.app.models.Producto;
import org.springframework.http.codec.multipart.FilePart;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProductoService {

    Flux<Producto> findAll();
    Mono<Producto> findById(String id);
    Mono<Producto> save(Producto producto);
    Mono<Producto> update(Producto producto, String id);
    Mono<Void> delete(String id);
    Mono<Producto> upload(FilePart filePart, String id);

}
