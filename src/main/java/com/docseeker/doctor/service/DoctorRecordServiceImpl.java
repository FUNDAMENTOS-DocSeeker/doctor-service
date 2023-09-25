package com.docseeker.doctor.service;

import com.docseeker.doctor.domain.model.entity.DoctorRecord;
import com.docseeker.doctor.domain.persistance.DoctorRecordRepository;
import com.docseeker.doctor.domain.service.DoctorRecordService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public class DoctorRecordServiceImpl implements DoctorRecordService {

    private DoctorRecordRepository doctorRecordRepository;

    public DoctorRecordServiceImpl(DoctorRecordRepository doctorRecordRepository) {
        this.doctorRecordRepository = doctorRecordRepository;
    }

    @Transactional(readOnly = true)
    @Override
    public List<DoctorRecord> getAll() {
        return doctorRecordRepository.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public Optional<DoctorRecord> getById(Integer id) {
        return doctorRecordRepository.findById(id);
    }

    @Transactional
    @Override
    public DoctorRecord save(DoctorRecord doctorRecord) {
        return doctorRecordRepository.save(doctorRecord);
    }

    @Transactional
    @Override
    public DoctorRecord update(DoctorRecord doctorRecord) {
        return doctorRecordRepository.save(doctorRecord);
    }

    @Override
    public boolean deleteById(Integer id) {
        if (doctorRecordRepository.existsById(id)) {
            doctorRecordRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
