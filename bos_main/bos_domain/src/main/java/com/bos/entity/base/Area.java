package com.bos.entity.base;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "t_area")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Area implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", columnDefinition = "区域id")
    private Integer areaId;

    @Column(name = "AREACODE", columnDefinition = "区域编码")
    private Integer areaCode;

    @Column(name = "PROVINCE", columnDefinition = "省份")
    private Integer province;

}
