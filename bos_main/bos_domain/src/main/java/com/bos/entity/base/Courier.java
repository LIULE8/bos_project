package com.bos.entity.base;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "T_COURIER")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Courier implements Serializable {

    private static final long serialVersionUID = -2873357508933457767L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", columnDefinition = "快递员Id")
    private Integer courierId;

    @Column(name = "COURIER_NUM", columnDefinition = "快递员编号")
    private String courierNumber;

    @Column(name = "NAME", columnDefinition = "快递员姓名")
    private String courierName;

    @Column(name = "TELEPHONE", columnDefinition = "快递员联系电话")
    private String courierTelephone;

    @Column(name = "PDA", columnDefinition = "快递员PDA号码")
    private String pdaNumber;

    @Column(name = "CHECK_PWD", columnDefinition = "查台号码")
    private String checkPassword;

    @Column(name = "COMPANY", columnDefinition = "快递员所属单位")
    private String company;

    @JoinColumn(name = "STANDARD", columnDefinition = "收派标准")
    @ManyToOne(targetEntity = Standard.class, fetch = FetchType.LAZY, optional = false)
    private Standard standard;

    @OneToMany(targetEntity = Courier.class, fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    private List<FixedArea> fixedAreaList;
}
