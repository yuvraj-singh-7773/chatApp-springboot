package com.example.chatAPP.controller;

import com.example.chatAPP.dto.ChatMessageDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class ChatController {

    private final SimpMessagingTemplate messagingTemplate;

    @MessageMapping("/chat")
    public void sendMessage(ChatMessageDTO message) {

        String roomId = message.getRoomId();

        messagingTemplate.convertAndSend(
                "/topic/room/" + roomId,
                message
        );
    }
}
