package com.reading.scope.service;

import com.reading.scope.dto.BookScopeRequesetDTO;
import com.reading.scope.repository.BookScopeRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
@Transactional
public class BookScopeService {
    private final BookScopeRepository bookScopeRepository;

    public void insertScope(BookScopeRequesetDTO bookScopeRequesetDTO) throws Exception {
        bookScopeRepository.save(bookScopeRequesetDTO.toEntity());
    }
}
