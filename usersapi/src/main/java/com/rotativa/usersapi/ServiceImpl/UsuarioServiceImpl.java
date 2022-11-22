package com.rotativa.usersapi.ServiceImpl;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rotativa.usersapi.Entidades.Usuario;
import com.rotativa.usersapi.Repositories.UsuarioRepository;
import com.rotativa.usersapi.Services.UsuarioService;

/**
 * Service Implementation for managing {@link Usuario}.
 */
@Service
@Transactional
public class UsuarioServiceImpl implements UsuarioService {

    private final Logger log = LoggerFactory.getLogger(UsuarioServiceImpl.class);

    private final UsuarioRepository usuarioRepository;

    public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public Usuario save(Usuario usuario) {
        log.debug("Request to save Usuario : {}", usuario);
        return usuarioRepository.save(usuario);
    }

    @Override
    public Usuario update(Usuario usuario) {
        log.debug("Request to save Usuario : {}", usuario);
        return usuarioRepository.save(usuario);
    }

    @Override
    public Optional<Usuario> partialUpdate(Usuario usuario) {
        log.debug("Request to partially update Usuario : {}", usuario);

        return usuarioRepository
            .findById(usuario.getId())
            .map(existingUsuario -> {
                if (usuario.getCpf() != null) {
                    existingUsuario.setCpf(usuario.getCpf());
                }
                if (usuario.getNome() != null) {
                    existingUsuario.setNome(usuario.getNome());
                }
                if (usuario.getAcessibilidade() != null) {
                    existingUsuario.setAcessibilidade(usuario.getAcessibilidade());
                }
                if (usuario.getEmail() != null) {
                    existingUsuario.setEmail(usuario.getEmail());
                }
                if (usuario.getSenha() != null) {
                    existingUsuario.setSenha(usuario.getSenha());
                }
                if (usuario.getNascimento() != null) {
                    existingUsuario.setNascimento(usuario.getNascimento());
                }
                if (usuario.getTicket() != null) {
                    existingUsuario.setTicket(usuario.getTicket());
                }
                if (usuario.getEstado() != null) {
                    existingUsuario.setEstado(usuario.getEstado());
                }

                return existingUsuario;
            })
            .map(usuarioRepository::save);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Usuario> findAll() {
        log.debug("Request to get all Usuarios");
        return usuarioRepository.findAllWithEagerRelationships();
    }

    public Page<Usuario> findAllWithEagerRelationships(Pageable pageable) {
        return usuarioRepository.findAllWithEagerRelationships(pageable);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Usuario> findOne(Long id) {
        log.debug("Request to get Usuario : {}", id);
        return usuarioRepository.findOneWithEagerRelationships(id);
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete Usuario : {}", id);
        usuarioRepository.deleteById(id);
    }

    @Override
    public List<Usuario> getUsuario(String nome) {
        return usuarioRepository.getUsuarios(nome);
    }
}
