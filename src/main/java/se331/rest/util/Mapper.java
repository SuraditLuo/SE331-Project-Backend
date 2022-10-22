package se331.rest.util;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import se331.rest.entity.*;
import se331.rest.security.entity.User;
import se331.rest.security.entity.UserDTO;

import java.util.List;
import java.util.stream.Collectors;


@Mapper(imports = Collectors.class)
public interface ProjectMapper {
    ProjectMapper INSTANCE = Mappers.getMapper(ProjectMapper.class);

    PatientDTO getPatientDto(Patient patient);

    UserDTO getUserDTO(User user);

    List<PatientDTO> getPatientDto(List<Patient> patients);

    DoctorDTO getDoctorDTO(Doctor organizer);

    List<DoctorDTO> getDoctorDTO(List<Doctor> organizers);

    @Mapping(target = "authorities", expression = "java(organizer.getUser().getAuthorities().stream().map(auth -> auth.getName().name()).collect(Collectors.toList()))")
    DoctorAuthDTO getDoctorAuthDTO(Doctor organizer);
}
