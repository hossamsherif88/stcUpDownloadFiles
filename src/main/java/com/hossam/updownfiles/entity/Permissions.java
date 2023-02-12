package com.hossam.updownfiles.entity;

import javax.persistence.*;

@Entity
@Table(name = "PERMISSIONS")
public class Permissions {
    @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id")
    private long id;
    @Column(name = "user_email")
    private String userEmail;
    @Column(name = "permission_level")
    private String permissionLevel;
    @Column(name = "group_id")
    private long groupId;
    @ManyToOne(fetch = FetchType.LAZY)// default fetch type for ManyToOne: EAGER
    @JoinColumn(name = "group_id",nullable = false,insertable = false, updatable = false) // foreign key in PERMISSIONS
    private PermissionGroup permissionGroup;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getPermissionLevel() {
        return permissionLevel;
    }

    public void setPermissionLevel(String permissionLevel) {
        this.permissionLevel = permissionLevel;
    }

    public long getGroupId() {
        return groupId;
    }

    public void setGroupId(long groupId) {
        this.groupId = groupId;
    }
}
