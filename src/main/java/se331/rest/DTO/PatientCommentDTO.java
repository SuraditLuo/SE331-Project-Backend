package se331.rest.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PatientCommentDTO {
    Long id;
    String content;
    DoctorCommentDTO commentBy;
}
