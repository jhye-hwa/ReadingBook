package com.reading.report.dto;

import com.reading.report.domain.BookReport;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class BookReportResponseDTO {
    private int mybook_id;
    private String review;
    private String impression;
    private String lifeContent;

    public BookReportResponseDTO(BookReport bookReport) {
        this.mybook_id = bookReport.getMybook_id();
        this.review = bookReport.getReview();
        this.impression = bookReport.getImpression();
        this.lifeContent = bookReport.getLifeContent();
    }
}
