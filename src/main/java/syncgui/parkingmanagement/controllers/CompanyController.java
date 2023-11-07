package syncgui.parkingmanagement.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import syncgui.parkingmanagement.dto.CompanyDto;
import syncgui.parkingmanagement.services.CompanyService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    CompanyService service;

    @GetMapping
    public List<CompanyDto> findAll() {
        return service.findAll();
    }

    @GetMapping(value = "/{id}")
    public CompanyDto findById(@PathVariable UUID id) {
        return service.findById(id);
    }

    @PostMapping
    public CompanyDto create(@RequestBody CompanyDto companyDto) {
        return service.create(companyDto);
    }

    @PutMapping
    public CompanyDto update(@RequestBody CompanyDto companyDto) {
        return service.update(companyDto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable UUID id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
