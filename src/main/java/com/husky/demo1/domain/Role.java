package com.husky.demo1.domain;

import com.infinitus.husky.domain.BaseDomain;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="sys_role")
public class Role extends BaseDomain {

private static final long serialVersionUID = 1L;

@Getter
@Setter
@Id
@GeneratedValue
private int id;

@Getter
@Setter
private String roleName ;

}
