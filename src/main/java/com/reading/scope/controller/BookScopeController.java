package com.reading.scope.controller;

import com.reading.scope.service.BookScopeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@Controller
@RequestMapping("/scope")
public class BookScopeController {

    @Autowired
    private BookScopeService bookScopeService;

}
