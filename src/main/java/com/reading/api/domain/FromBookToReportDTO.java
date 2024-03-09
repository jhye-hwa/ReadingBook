package com.reading.api.domain;

import lombok.Getter;

@Getter
public class FromBookToReportDTO {

    private String title;
    private String author;
    private String isbn;
    private String image;

    @Override
    public String toString() {
        return "FromBookToReportDTO{" +
                "title='" + title + '\'' +
                ", image='" + image + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
