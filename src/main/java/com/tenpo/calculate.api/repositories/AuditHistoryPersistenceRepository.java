package com.tenpo.calculate.api.repositories;

import com.tenpo.calculate.api.models.persistence.AuditHistoryPersistence;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AuditHistoryPersistenceRepository extends JpaRepository<AuditHistoryPersistence, Long> {

    @Query("SELECT a FROM AuditHistoryPersistence a WHERE"
            + " :operation is null or a.operation = :operation ORDER BY id")
    Page<AuditHistoryPersistence> findAllOptionalOperationFilter(@Param("operation") String operation, PageRequest pageable);

}
