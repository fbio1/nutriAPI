package com.api.core.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.server.ResponseStatusException;

import com.api.core.model.Model;

public abstract class GenericArchivableRestController<T extends Model, ID> extends GenericRestController<T, ID> {

	@PatchMapping("/{id}/enable")
	public T enable(@PathVariable("id") ID id) {
		T entity = getRepository().findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));

		entity.setActive(true);

		getRepository().save(entity);

		return entity;
	}

	@PatchMapping("/{id}/archive")
	public T archive(@PathVariable("id") ID id) {
		T entity = getRepository().findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));

		entity.setActive(true);

		getRepository().save(entity);

		return entity;
	}
}