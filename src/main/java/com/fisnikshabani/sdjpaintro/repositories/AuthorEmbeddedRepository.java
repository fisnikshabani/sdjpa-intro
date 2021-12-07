package com.fisnikshabani.sdjpaintro.repositories;

import com.fisnikshabani.sdjpaintro.domain.AuthorComposite;
import com.fisnikshabani.sdjpaintro.domain.AuthorEmbedded;
import com.fisnikshabani.sdjpaintro.domain.NameId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorEmbeddedRepository extends JpaRepository<AuthorEmbedded, NameId> {
}
