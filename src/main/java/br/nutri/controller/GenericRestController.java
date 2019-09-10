package br.nutri.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.server.ResponseStatusException;

import br.nutri.helper.PageMapper;
import br.nutri.model.dto.PageResponse;
import br.nutri.utils.PropertyUtils;
import io.swagger.annotations.ApiOperation;

public abstract class GenericRestController<T, ID> {

	private List<String> ignoredProps = Arrays.asList("id", "version", "createdAt", "updatedAt", "status");

	protected void addIgnore(String... props) {
		ignoredProps.addAll(Arrays.asList(props));
	}

	public abstract JpaRepository<T, ID> getRepository();

	@GetMapping
	@ApiOperation(value = "Lista paginada Itens")
	public PageResponse<T> find(br.nutri.model.dto.PageRequest pageRequest) {
		Page<T> page = getRepository().findAll(PageMapper.toPageable(pageRequest));

		return PageMapper.fromPage(page);
	}

	@GetMapping("/{id}")
	@ApiOperation(value = "Retorna item com o id especificado")
	public T findById(@PathVariable("id") ID id) {
		return getRepository().findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
	}

	@PostMapping
	@ApiOperation(value = "Cria um novo item")
	public T create(@RequestBody T body) {
		getRepository().save(body);

		return body;
	}

//	@PatchMapping("/{id}")
//	@ApiOperation(value = "Atualiza o item com o id especificado")
//	public T update(@PathVariable("id") ID id, @RequestBody T body) {
//		T entity = getRepository().findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
//
//		BeanUtils.copyProperties(body, entity,
//				PropertyUtils.getNullPropertyNames(body, ignoredProps.toArray(String[]::new)));
//
//		getRepository().saveAndFlush(entity);
//
//		return entity;
//	}
}