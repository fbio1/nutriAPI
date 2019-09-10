package br.siguan.helper;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.siguan.model.dto.PageRequest;
import br.siguan.model.dto.PageResponse;

public class PageMapper {

	public static <T> PageResponse<T> fromPage(Page<T> page) {
		PageResponse<T> response = new PageResponse<>();

		response.setContent(page.getContent());
		response.setCurrentPage(page.getPageable().getPageNumber() + 1);
		response.setPageSize(page.getContent().size());
		response.setTotalElements(page.getTotalElements());
		response.setTotalPages(page.getTotalPages());

		return response;
	}

	public static Pageable toPageable(PageRequest request) {
		return org.springframework.data.domain.PageRequest.of(request.getPage() - 1, request.getPageSize());
	}
}
