package com.reading.scope.repository;

import com.reading.scope.domain.BookScope;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookScopeRepository extends JpaRepository<BookScope, Long> {
}
