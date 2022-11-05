package grupodot.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import grupodot.backend.util.Palindromo;

@RestController
@RequestMapping(value="/palindromo")
public class PalindromoController {
    
    @GetMapping("/{cadena}")
    public String palindromo(@PathVariable String cadena){
        return Palindromo.esPalindromo(cadena);
    }
}
