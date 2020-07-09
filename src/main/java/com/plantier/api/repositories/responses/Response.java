package com.plantier.api.repositories.responses;

import java.util.ArrayList;
import java.util.List;

// o tipo T significa que a classe é genérica, ou seja, ela pode ser uma resposta de qualquer coisa.
public class Response<T> {

	private T data;
	private List<String> errors;
	
	public Response() {
	}
	
	public T getData() {
		return data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
	
	public List<String> getErrors() {
		if(this.errors == null) {
			this.errors = new ArrayList<String>();
		}
		return errors;
	}
}
