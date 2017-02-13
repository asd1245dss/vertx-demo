package com.wpg.demo.vertx;

import io.vertx.core.Vertx;

/**
 * @author ChangWei Li
 * @version 2017-02-13 08:15
 */
public class HelloVertX {

    public static void main(String[] args) {
        Vertx.vertx().createHttpServer().requestHandler(req ->
                req.response()
                        .putHeader("Server", "VertX-3.3")
                        .end("Hello VertX")
        ).listen(8282);
    }

}
