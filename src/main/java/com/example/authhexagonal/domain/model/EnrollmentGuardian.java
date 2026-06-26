package com.example.authhexagonal.domain.model;

public record EnrollmentGuardian(
        Long id,
        String run,
        String name,
        String lastName,
        String birthDate,
        String address,
        String phone,
        String email,
        String education,
        String relation,
        boolean authorizedPickup
) {
}
