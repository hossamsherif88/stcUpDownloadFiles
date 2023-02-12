package com.hossam.updownfiles.entity;

import javax.persistence.*;

@Entity
@Table(name = "ITEM")
public class ITEM {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "type")
    private String type;
    @Column(name = "permission_group_id")
    private long permissionGrpId;
    @Column(name = "Parent_id")
    private long parentId;
    @ManyToOne(fetch = FetchType.LAZY)// default fetch type for ManyToOne: EAGER
    @JoinColumn(name = "permission_group_id",nullable = false,insertable = false, updatable = false) // foreign key in ITEM
    private PermissionGroup permissionGroup;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPermissionGrpId() {
        return permissionGrpId;
    }

    public void setPermissionGrpId(long permission_group_id) {
        this.permissionGrpId = permission_group_id;
    }

    public long getParentId() {
        return parentId;
    }

    public void setParentId(long parentId) {
        this.parentId = parentId;
    }
}
