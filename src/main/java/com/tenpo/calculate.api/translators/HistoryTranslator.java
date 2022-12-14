package com.tenpo.calculate.api.translators;

import com.tenpo.calculate.api.models.domain.AuditHistory;
import com.tenpo.calculate.api.models.dtos.HistoryResponseDto;
import com.tenpo.calculate.api.models.persistence.AuditHistoryPersistence;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class HistoryTranslator {

    public HistoryResponseDto getResponseDto(Page<AuditHistoryPersistence> reponse, Integer page){
        if(reponse.getTotalElements() > 0) {
            List<AuditHistory> history = reponse.stream().map(r -> AuditHistory.builder()
                    .id(r.getId())
                    .operation(r.getOperation())
                    .request(r.getRequest())
                    .response(r.getResponse())
                    .build()
            ).collect(Collectors.toList());

            return HistoryResponseDto.builder()
                    .history(history)
                    .page(page)
                    .totalPages(reponse.getTotalPages())
                    .build();
        }

        return HistoryResponseDto.builder()
                .history(new ArrayList<>())
                .page(page)
                .totalPages(reponse.getTotalPages())
                .build();
    }

}
