package com.reading.report.dto;

import com.reading.report.domain.BookReport;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BookReportRequesetDTO {
    private int mybook_id;
    private String review;
    private String impression;
    private String lifeContent;

    public BookReport toEntity() {
        return BookReport.builder()
                .mybook_id(mybook_id)
                .review(review)
                .impression(impression)
                .lifeContent(lifeContent)
                .build();
    }
}
