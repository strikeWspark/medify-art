package com.dryfire.medify_art.Repositories;

import com.dryfire.medify_art.Models.WhatsNew;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface WhatsNewRepository extends JpaRepository<WhatsNew,Long> {
}
