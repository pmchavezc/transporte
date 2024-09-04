package com.transportes.transportes.serviceImpl;

import com.transportes.transportes.entity.SecurityUser;
import com.transportes.transportes.repository.RepositoryUser;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class ServiceUser implements UserDetailsService { // iba colocado UserDetailsService

    private RepositoryUser userRepository;

    @Override
    public UserDetails loadUserByUsername(String correo) throws UsernameNotFoundException {

        User user = userRepository.findByUsername(correo);

        if (user==null){
            throw new UsernameNotFoundException("Usuario no encontrado");
        } else {
            return new SecurityUser(user); // iba colocado new SecurityUser(user)
        }

    }
}
