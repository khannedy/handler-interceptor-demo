package com.idspring.handlerinterceptordemo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Eko Kurniawan Khannedy
 * @since 15/10/17
 */
@RestController
public class DemoController {

    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public WebResponse demo() {
        return WebResponse.builder()
                .name("Demo")
                .description("Demoooooooo")
                .build();
    }

}
