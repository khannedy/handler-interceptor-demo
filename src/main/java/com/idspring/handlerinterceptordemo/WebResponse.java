package com.idspring.handlerinterceptordemo;

import lombok.Builder;
import lombok.Data;

/**
 * @author Eko Kurniawan Khannedy
 * @since 15/10/17
 */
@Data
@Builder
public class WebResponse {

    private String name;

    private String description;

}
