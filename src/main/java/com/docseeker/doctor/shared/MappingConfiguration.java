package com.docseeker.doctor.shared;

import org.springframework.context.annotation.Bean;

public class MappingConfiguration {
    @Bean
    public EnhancedModelMapper modelMapper() {
        return new EnhancedModelMapper();
    }
}
