package com.r2g.spingsegurityjwt.repository;

import com.r2g.spingsegurityjwt.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {
    Optional<Usuario> findOneByEmail(String email);
}
