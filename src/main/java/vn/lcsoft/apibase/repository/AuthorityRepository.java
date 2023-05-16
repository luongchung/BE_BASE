package vn.lcsoft.apibase.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.lcsoft.apibase.domain.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
