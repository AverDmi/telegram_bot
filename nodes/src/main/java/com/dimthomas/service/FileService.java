package com.dimthomas.service;

import com.dimthomas.entity.AppDocument;
import com.dimthomas.entity.AppPhoto;
import org.telegram.telegrambots.meta.api.objects.Message;

public interface FileService {
    AppDocument processDoc(Message telegramMessage);
    AppPhoto processPhoto(Message telegramMessage);
}
