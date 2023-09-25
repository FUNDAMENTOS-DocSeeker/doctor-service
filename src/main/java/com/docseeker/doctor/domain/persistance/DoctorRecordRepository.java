package com.docseeker.doctor.domain.persistance;

import com.docseeker.doctor.domain.model.entity.DoctorRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRecordRepository extends JpaRepository<DoctorRecord, Integer> {
}
