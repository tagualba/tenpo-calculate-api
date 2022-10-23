package com.tenpo.calculate.api.controllers;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.tenpo.calculate.api.exceptions.ValidationException;
import com.tenpo.calculate.api.models.dtos.HistoryResponseDto;
import com.tenpo.calculate.api.services.AuditHistoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping(value = "/tenpo/history")
@RestController
public class HistoryController {
    private static final Logger log = LoggerFactory.getLogger(HistoryController.class);
    @Autowired
    private AuditHistoryService historyService;

    @GetMapping
    public HistoryResponseDto getHistory(@RequestParam(required = false) String operation, @RequestParam(required = false) Integer page)
            throws ValidationException, JsonProcessingException {
        return historyService.getHistory(operation, page);
    }
}
