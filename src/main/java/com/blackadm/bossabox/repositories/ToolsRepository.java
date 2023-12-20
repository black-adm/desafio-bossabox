package com.blackadm.bossabox.repositories;

import com.blackadm.bossabox.entities.Tools;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ToolsRepository extends JpaRepository<Tools, Long> {

    public List<Tools> findByTags(String tags);
}
