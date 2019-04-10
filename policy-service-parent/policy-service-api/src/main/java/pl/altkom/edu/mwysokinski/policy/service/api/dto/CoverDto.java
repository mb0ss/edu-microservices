package pl.altkom.edu.mwysokinski.policy.service.api.dto;

import lombok.Data;

import java.util.LinkedList;
import java.util.List;

@Data
public class CoverDto {

    private String coverCode;
    private List<ServiceDto> serviceDtos = new LinkedList<>();

}
