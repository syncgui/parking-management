package syncgui.parkingmanagement.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import syncgui.parkingmanagement.dto.CompanyDto;
import syncgui.parkingmanagement.exceptions.RequiredObjectIsNullException;
import syncgui.parkingmanagement.exceptions.ResourceNotFoundException;
import syncgui.parkingmanagement.model.Company;
import syncgui.parkingmanagement.repositories.CompanyRepository;

import java.util.List;
import java.util.UUID;

import static syncgui.parkingmanagement.mapper.Mapper.parseListObject;
import static syncgui.parkingmanagement.mapper.Mapper.parseObject;

@Service
public class CompanyService {

    @Autowired
    CompanyRepository repository;

    public List<CompanyDto> findAll() {
        return parseListObject(repository.findAll(), CompanyDto.class);
    }

    public CompanyDto findById(UUID id) {
        return parseObject(repository.findById(id).orElseThrow(ResourceNotFoundException::new), CompanyDto.class);
    }

    public CompanyDto create(CompanyDto companyDto) {
        if (companyDto == null) throw new RequiredObjectIsNullException();
        Company company = parseObject(companyDto, Company.class);
        return parseObject(repository.save(company), CompanyDto.class);
    }

    public CompanyDto update(CompanyDto companyDto) {
        if (companyDto == null) throw new RequiredObjectIsNullException();
        Company company = parseObject(repository.findById(companyDto.getId()).orElseThrow(ResourceNotFoundException::new), Company.class);
        company.setName(companyDto.getName());
        company.setAddress(companyDto.getAddress());
        company.setPhoneNumber(companyDto.getPhoneNumber());
        company.setCarSpaces(companyDto.getCarSpaces());
        company.setMotorcycleSpaces(companyDto.getMotorcycleSpaces());
        return parseObject(repository.save(company), CompanyDto.class);
    }

    public void delete(UUID id) {
        Company company = repository.findById(id).orElseThrow(ResourceNotFoundException::new);
        repository.delete(company);
    }
}
