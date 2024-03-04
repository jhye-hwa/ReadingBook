package com.reading.report.controller;

import com.reading.report.dto.BookReportRequesetDTO;
import com.reading.report.dto.BookReportResponseDTO;
import com.reading.report.service.BookReportService;
import com.reading.scope.dto.BookScopeRequesetDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/report")
public class BookReportController {

    private final BookReportService bookReportService;

    @GetMapping("/register")
    public String getRegister(Model model) {
        model.addAttribute("regRequesetDTO", new BookReportResponseDTO());
        return "report/reportRegister";
    }

    @PostMapping("/register")
    public String postRegister(@ModelAttribute("regRequesetDTO") BookReportRequesetDTO bookReportRequesetDTO, BookScopeRequesetDTO bookScopeRequesetDTO) throws Exception {
        bookReportService.insertRegister(bookReportRequesetDTO, bookScopeRequesetDTO);
        return "report/reportRegister";
    }
}



