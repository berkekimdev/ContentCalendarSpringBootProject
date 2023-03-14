package dev.berkekim.contentcalendar.repository;

import dev.berkekim.contentcalendar.model.Content;
import dev.berkekim.contentcalendar.model.Status;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ContentRepository extends ListCrudRepository<Content,Integer> {

   List<Content> findAllByContentType(String type);

   @Query("""
      SELECT * FROM Content
      where status = :status
""")
   List<Content> listByStatus(@Param("status") Status status);


}
