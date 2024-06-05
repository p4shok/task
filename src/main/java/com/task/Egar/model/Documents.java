package com.task.Egar.model;
import lombok.*;

import java.time.*;

@Data
@Builder
public class Documents {
    @NonNull
    private String name;
    @NonNull
    private String id;
    private LocalDate date;
}
