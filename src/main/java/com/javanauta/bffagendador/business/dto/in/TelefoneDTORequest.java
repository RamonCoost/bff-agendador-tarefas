package com.javanauta.bffagendador.business.dto.in;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class TelefoneDTORequest {


    private String numero;
    private String ddd;
}
