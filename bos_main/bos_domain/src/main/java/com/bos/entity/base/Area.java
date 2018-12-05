package com.bos.entity.base;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "T_AREA")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Area implements Serializable {

    private static final long serialVersionUID = -1917034137615141172L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", columnDefinition = "区域Id")
    private Integer areaId;

    @Column(name = "AREACODE", columnDefinition = "区域编码")
    private String areaCode;

    @Column(name = "PROVINCE", columnDefinition = "省")
    private String province;

    @Column(name = "CITY", columnDefinition = "市")
    private String city;

    @Column(name = "DISTRICT", columnDefinition = "区（县）")
    private String district;

    @Column(name = "POSTCODE", columnDefinition = "邮政编码")
    private String postCode;

    @Column(name = "CITYCODE", columnDefinition = "城市编码")
    private String cityCode;

    @Column(name = "SHORTCODE", columnDefinition = "区域简码")
    private String shortCode;

    @OneToMany(targetEntity = SubArea.class, fetch = FetchType.EAGER, mappedBy = "area",cascade = CascadeType.PERSIST)
    private List<SubArea> subAreaList;
}
