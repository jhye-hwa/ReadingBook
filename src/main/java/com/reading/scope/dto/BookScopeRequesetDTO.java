package com.reading.scope.dto;

import com.reading.scope.domain.BookScope;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BookScopeRequesetDTO {
    private String member_id;
    private double scope;
    private String isbn;

    public BookScope toEntity() {
        return BookScope.builder()
                .member_id("hyehwa")
                .scope(scope)
                .isbn(isbn)
                .build();
    }
}
