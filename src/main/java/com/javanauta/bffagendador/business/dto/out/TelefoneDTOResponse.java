package com.javanauta.bffagendador.business.dto.out;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class TelefoneDTOResponse {

    private long id;
    private String numero;
    private String ddd;
}
