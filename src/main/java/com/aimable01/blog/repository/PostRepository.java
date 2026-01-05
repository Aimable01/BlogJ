package com.aimable01.blog.repository;

import com.aimable01.blog.entity.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, String> {
    Page<Post> findAllByOrderByCreatedAtAsc(Pageable pageable);

    @Query("SELECT p FROM Post p WHERE P.author.id = :authorId " +
            "ORDER BY p.createdAt DESC ")
    Page<Post> findByAuthorId(String authorId, Pageable pageable);
}
