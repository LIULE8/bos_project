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
public class FixedArea implements Serializable {

    private static final long serialVersionUID = -2550214236561732327L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", columnDefinition = "定区Id")
    private Integer fixedAreaId;

    @Column(name = "FIXED_AREA_NAME", columnDefinition = "定区名称")
    private String fixedAreaName;

    @Column(name = "TELEPHONE", columnDefinition = "定区快递员联系电话")
    private String fixedAreaTelephone;

    @JoinColumn(name = "FIXED_AREA_LEADER", columnDefinition = "定区快递员")
    @ManyToOne(targetEntity = Courier.class, fetch = FetchType.LAZY, optional = false, cascade = CascadeType.PERSIST)
    private Courier fixedAreaLeader;

    @OneToMany(targetEntity = SubArea.class, fetch = FetchType.LAZY, mappedBy = "fixedArea",cascade = CascadeType.PERSIST)
    private List<SubArea> subAreaList;
}
