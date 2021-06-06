package com.example.demo.controller;

import com.example.demo.exception.AdressbuchEntryNotFoundException;
import com.example.demo.model.AdressbuchEntry;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
public class AdressbuchController {
    private Map<Long, AdressbuchEntry> mockDatabase = new HashMap<>();

    @PostConstruct
    private void init() {
        mockDatabase.put(1L, new AdressbuchEntry(1L, "Tony Stark", "123456789"));
        mockDatabase.put(1L, new AdressbuchEntry(1L, "Thor Odinson", "987654321"));
    }

    @GetMapping("adressbuch/{name}")
    public ResponseEntity<List<AdressbuchEntry>> getAdressbuchEntry(@PathVariable(value = "name") String name) {
        List<AdressbuchEntry> result = mockDatabase.values().stream().filter(s -> s.getNameSurname().contains(name)).collect(Collectors.toList());
        if (CollectionUtils.isEmpty(result)) {
            throw new AdressbuchEntryNotFoundException();
        }
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
