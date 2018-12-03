package com.bos.entity.base;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "T_SUB_AREA")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class SubArea implements Serializable {

    private static final long serialVersionUID = 5815047174920508759L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", columnDefinition = "分区Id")
    private Integer subAreaId;

    @Column(name = "START_NUM", columnDefinition = "分区起始号")
    private String subAreaStartNumber;

    @Column(name = "END_NUM", columnDefinition = "分区终止号")
    private String subAreaEndNumber;

    @Column(name = "KEY_WORDS", columnDefinition = "分区关键字")
    private String subAreaKeyWords;

    @Column(name = "ASSIST_KEY_WORDS", columnDefinition = "分区辅助关键字")
    private String subAreaAssistKeyWords;

    @JoinColumn(name = "AREA_ID", columnDefinition = "所属区域")
    @ManyToOne(targetEntity = Area.class, fetch = FetchType.LAZY, optional = false, cascade = CascadeType.PERSIST)
    private Area area;

    @JoinColumn(name = "FIXEDAREA", columnDefinition = "所属定区")
    @ManyToOne(targetEntity = FixedArea.class, fetch = FetchType.LAZY, optional = false, cascade = CascadeType.PERSIST)
    private FixedArea fixedArea;
}
