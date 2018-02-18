package ru.itpark.app.repositories;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import ru.itpark.app.models.News;

import java.util.List;

public interface NewsRepository extends JpaRepository<News, Long> {
    List<News> findTop3ByTitleLikeOrderByNewsDateTimeDesc(String title);
}
