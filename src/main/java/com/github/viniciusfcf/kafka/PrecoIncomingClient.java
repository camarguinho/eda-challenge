package com.github.viniciusfcf.kafka;

import io.smallrye.reactive.messaging.annotations.Merge;
import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.eclipse.microprofile.reactive.messaging.Outgoing;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PrecoIncomingClient {

    @Incoming("preco-gerado-to-cluster")
    @Merge
//    @Outgoing("preco-gerado-in-memory")
    public Double precoGerado(Double preco) {
        System.out.println("CLIENT --> precoGerado() " + preco);
        return preco + 10;
    }

}
