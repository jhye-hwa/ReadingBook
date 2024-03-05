package com.reading.report.service;

import com.reading.report.domain.BookReport;
import com.reading.report.dto.BookReportRequesetDTO;
import com.reading.report.repository.BookReportRepository;
import com.reading.scope.domain.BookScope;
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
public class BookReportService {

    private final BookReportRepository bookReportRepository;
    private final BookScopeRepository bookScopeRepository;

    public void insertRegister(BookReportRequesetDTO bookReportRequesetDTO, BookScopeRequesetDTO bookScopeRequesetDTO) throws Exception {
        BookReport bookReport = bookReportRepository.save(bookReportRequesetDTO.toEntity());
        BookScope bookScope = bookScopeRequesetDTO.toEntity();
        bookScope.addBookReport(bookReport);
        bookScopeRepository.save(bookScope);
    }
}
