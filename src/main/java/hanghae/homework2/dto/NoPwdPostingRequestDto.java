package hanghae.homework2.dto;

import lombok.Getter;

@Getter
public class NoPwdPostingRequestDto {

    private String username;
    private String title;
    private String content;
    private String password;
}