package com.blackadm.bossabox.services;

import com.blackadm.bossabox.entities.Tools;
import com.blackadm.bossabox.repositories.ToolsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToolsService {

    @Autowired
    private ToolsRepository toolsRepository;


    public List<Tools> getAllTools() {
        return toolsRepository.findAll();
    }

}
