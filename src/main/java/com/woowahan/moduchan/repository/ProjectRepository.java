package com.woowahan.moduchan.repository;

import com.woowahan.moduchan.domain.category.Category;
import com.woowahan.moduchan.domain.project.Project;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
    public Page<Project> findAllByDeletedFalse(Pageable pageable);

    public Page<Project> findByCategoryAndDeletedFalse(Category category, Pageable pageable);
}
