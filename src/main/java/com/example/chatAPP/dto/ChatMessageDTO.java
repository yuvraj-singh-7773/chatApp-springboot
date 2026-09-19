package com.example.chatAPP.dto;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Slf4j
@Data
@Builder
@AllArgsConstructor

public class ChatMessageDTO {
    private String roomId;
    private String name;
    private String message;
}
