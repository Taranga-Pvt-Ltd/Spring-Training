package com.emudhra.login.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "role")
public class Login {
    private Long id;
    private String name;
    private Set<Register> users;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToMany(mappedBy = "roles")
    public Set<Register> getUsers() {
        return users;
    }

    public void setUsers(Set<Register> users) {
        this.users = users;
    }
}
