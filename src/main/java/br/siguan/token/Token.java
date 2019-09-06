package br.siguan.token;

import java.security.Key;
import java.util.Date;

import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.siguan.model.enuns.TipoUsuario;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class Token {
    public static String criarToken(int id, TipoUsuario tipoUsuario){
        SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS384;
 
        //We will sign our JWT with our ApiKey secret
        byte[] apiKeySecretBytes = DatatypeConverter.parseBase64Binary("35tdsxz");
        Key signingKey = new SecretKeySpec(apiKeySecretBytes, signatureAlgorithm.getJcaName());
 
        //Let's set the JWT Claims
        JwtBuilder builder = Jwts.builder()
                .claim("usuario", id)
                .claim("tipo", tipoUsuario)
                .claim("create", new Date())
                .signWith(signatureAlgorithm, signingKey);
        //Token completo e compactado
        String compact = builder.compact();

        return compact;
    }
    
    public static String tokenAlterarSenha(int id, int alteracoes){
        Date limite = new Date(new Date().getTime() + ((3600*1000)*24));
        
        SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS384;
 
        //We will sign our JWT with our ApiKey secret
        byte[] apiKeySecretBytes = DatatypeConverter.parseBase64Binary("27ert5fgaw");
        Key signingKey = new SecretKeySpec(apiKeySecretBytes, signatureAlgorithm.getJcaName());
        
        //Let's set the JWT Claims
        JwtBuilder builder = Jwts.builder()
                .claim("usuario", id)
                .claim("alteracoes", alteracoes)
                .claim("validade", limite)
                .signWith(signatureAlgorithm, signingKey);
        //Token completo e compactado
        String compact = builder.compact();

        return compact;
    }
    
    public static Claims camposAlterarSenha(String token){
        Claims claims = Jwts.parser()
                .setSigningKey(DatatypeConverter.parseBase64Binary("27ert5fgaw"))
                .parseClaimsJws(token).getBody();
        
        return claims;
    }
    
    public static Claims campos(String token){
        //Obtenção dos Claims do token
        Claims claims = Jwts.parser()
                .setSigningKey(DatatypeConverter.parseBase64Binary("35tdsxz"))
                .parseClaimsJws(token).getBody();
        
        return claims;
    }
}

