package pl.sda;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

@Getter @Setter
public class Message {

    @Value("#{'Tekst'}")
    private String text;

    @Value("#{1 == 1}")
    private boolean isExamPass;
}
