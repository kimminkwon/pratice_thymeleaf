package org.zerock.boot5.domain;

import lombok.*;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
public class MemberVO {
    private int mno;
    private String mid;
    private String mpw;
    private String mname;
    private Timestamp regdate;
}
