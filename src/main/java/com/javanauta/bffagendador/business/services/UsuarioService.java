package com.javanauta.bffagendador.business.services;


import com.javanauta.bffagendador.business.dto.in.EnderecoDTORequest;
import com.javanauta.bffagendador.business.dto.in.LoginDTORequest;
import com.javanauta.bffagendador.business.dto.in.TelefoneDTORequest;
import com.javanauta.bffagendador.business.dto.in.UsuarioDTORequest;
import com.javanauta.bffagendador.business.dto.out.EnderecoDTOResponse;
import com.javanauta.bffagendador.business.dto.out.TelefoneDTOResponse;
import com.javanauta.bffagendador.business.dto.out.UsuarioDTOResponse;
import com.javanauta.bffagendador.business.dto.out.ViaCepDTOResponse;
import com.javanauta.bffagendador.infrastructure.client.UsuarioClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioClient client;

    public UsuarioDTOResponse salvaUsuario(UsuarioDTORequest usuarioDTO) {
        return client.salvarUsuario(usuarioDTO);
    }

    public String loginUsuario(LoginDTORequest dto) {
        return client.login(dto);
    }

    public UsuarioDTOResponse buscaUsuarioPorEmail(String email, String token) {
        return client.buscaUsuarioPorEmail(email, token);
    }

    public void deleteUsuarioPorEmail(String email, String token) {
        client.deletarUsuarioPorEmail(email, token);
    }

    public UsuarioDTOResponse atualizaDadosUsuario(String token, UsuarioDTORequest dto) {
        return client.atualizaDadoUsuario(dto, token);
    }

    public EnderecoDTOResponse atualizaEndereco(Long id, EnderecoDTORequest dto, String token) {
        return client.ataualizaEndereco(dto, id, token);
    }

    public TelefoneDTOResponse atualizaTelefone(Long idTelefone, TelefoneDTORequest dto, String token) {
        return client.atualizaTelefone(dto, idTelefone, token);
    }

    public EnderecoDTOResponse cadastraEndereco(String token, EnderecoDTORequest dto) {
        return client.cadastraEndereco(dto, token);
    }

    public TelefoneDTOResponse cadastraTelefone(String token, TelefoneDTORequest dto) {
        return client.cadastraTelefone(dto, token);
    }

    public ViaCepDTOResponse buscarEnderecoPorCep(String cep){
        return client.buscarDadosCep(cep);
    }
}
