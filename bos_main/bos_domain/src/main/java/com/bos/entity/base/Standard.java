package com.bos.entity.base;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "T_STANDARD")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Standard implements Serializable {

    private static final long serialVersionUID = -8313505256877558177L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", columnDefinition = "收派标准Id")
    private Integer standardId;

    @Column(name = "NAME", columnDefinition = "收派标准名称")
    private String standardName;

    @Column(name = "MIN_WEIGHT", columnDefinition = "收派标准最小重量")
    private Double minWeight;

    @Column(name = "MAX_WEIGHT", columnDefinition = "收派标准最大重量")
    private Double maxWeight;

    @Column(name = "MIN_LENGTH", columnDefinition = "收派标准最小长度")
    private Double minLength;

    @Column(name = "MAX_LENGTH", columnDefinition = "收派标准最大长度")
    private Double maxLength;

    @OneToMany(targetEntity = Courier.class, fetch = FetchType.LAZY, mappedBy = "standard")
    private List<Courier> courierList;

}
