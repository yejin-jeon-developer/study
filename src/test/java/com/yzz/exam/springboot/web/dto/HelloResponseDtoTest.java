package com.yzz.exam.springboot.web.dto;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
/* gradle 4 버전 필요. 5 버전부터 설정 바뀌어서 컴파일 안됨. */
public class HelloResponseDtoTest {
    @Test
    public void 롬복_기능_테스트() {
        //given
        String name = "test";
        int amount = 1000;

        //when
        HelloResponseDto dto = new HelloResponseDto(name, amount);

        //then
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);

    }
}
