package com.fisnikshabani.sdjpaintro.repositories;

import com.fisnikshabani.sdjpaintro.domain.AuthorComposite;
import com.fisnikshabani.sdjpaintro.domain.NameId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorCompositeRepository extends JpaRepository<AuthorComposite, NameId> {
}
