package com.r2g.spingsegurityjwt.controller;

import com.r2g.spingsegurityjwt.model.Contacto;
import com.r2g.spingsegurityjwt.repository.ContactoRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("contactos")
@AllArgsConstructor
public class ContactoController {
    private final ContactoRepository contactoRepository;

    @GetMapping
    public List<Contacto> listContacto(){return contactoRepository.findAll();}
}
