package com.plantier.api.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class SenhaUtils {

	/**
	 * Gera um hash utilizando o BCrypt
	 * 
	 * @param senha
	 * @return
	 */
	public static String gerarCrypt(String senha) {
		if (senha == null) {
			return senha;
		}
		BCryptPasswordEncoder bCryptEncode = new BCryptPasswordEncoder();
		return bCryptEncode.encode(senha);
	}
	
	/**
	 * Verifica se a senha é válida
	 * 
	 * @param senha
	 * @param senhaEncoded
	 * @return boolean
	 */
	public static boolean senhaValida(String senha, String senhaEncoded) {
		BCryptPasswordEncoder bCryptEncode = new BCryptPasswordEncoder();
		return bCryptEncode.matches(senha, senhaEncoded);
	}
	
}
