package com.htd.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@NoArgsConstructor
@Getter @Setter
@Entity
public class Memory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String content;
    private Scope scope;
    private String picture;

    @ManyToOne
    private User writer;

    public Memory(Long id, String title, String content, Scope scope, String picture, User writer) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.scope = scope;
        this.picture = picture;
        this.writer = writer;
    }
}