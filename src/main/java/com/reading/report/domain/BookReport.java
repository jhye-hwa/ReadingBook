package com.reading.report.domain;

import com.reading.common.BaseEntity;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class BookReport extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private int mybook_id;

    // 줄거리
    @Column
    private String review;

    // 느낀점
    @Column
    private String impression;

    // 삶의 적용
    @Column
    private String lifeContent;

    @Builder
    public BookReport(int mybook_id, String review, String impression, String lifeContent) {
        this.mybook_id = mybook_id;
        this.review = review;
        this.impression = impression;
        this.lifeContent = lifeContent;
    }
}
