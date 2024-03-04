package com.reading.scope.domain;

import com.reading.common.BaseEntity;
import com.reading.report.domain.BookReport;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@NoArgsConstructor
public class BookScope extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String member_id;

    // 별점
    @Column
    private double scope;

    // 책 ISBN
    @Column
    private String isbn;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="reportId")
    private BookReport bookReport;

    @Builder
    public BookScope(String member_id, double scope, String isbn) {
        this.member_id = member_id;
        this.scope = scope;
        this.isbn = isbn;
    }

    public void addBookReport(BookReport bookReport) {
        this.bookReport = bookReport;
    }
}
