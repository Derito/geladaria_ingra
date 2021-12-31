package com.helder.pro.geladariaingra.util;

import java.io.Serializable;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ControllerUtil implements Serializable{

	private static final long serialVersionUID = 1L;

	public ResponseEntity<?> returnObjectOrNotFound(Object object) {
		return object != null ? new ResponseEntity<>(object, HttpStatus.OK)
				: new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
	}
	public ResponseEntity<?> returnObjectOrNotFound(List<?> lista) {
		return lista == null || lista.isEmpty() ? new ResponseEntity<>(HttpStatus.NOT_FOUND)
				: new ResponseEntity<>(lista,HttpStatus.OK);
	}

}
