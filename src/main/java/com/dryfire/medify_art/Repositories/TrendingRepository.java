package com.dryfire.medify_art.Repositories;

import com.dryfire.medify_art.Models.Trending;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrendingRepository extends JpaRepository<Trending,Long> {
}
