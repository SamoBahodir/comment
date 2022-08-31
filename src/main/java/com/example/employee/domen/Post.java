package com.example.employee.domen;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@Entity
@NoArgsConstructor
@Table(name = "post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int postId;
    @Column(name = "post_title", length = 100, nullable = false)
    private String title;
    @Column(length = 1000)
    private String content;
    private String imageName;
    private Date addedDate;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category cotegory;
    @ManyToOne
    private User user;
    @OneToMany(mappedBy = "post",cascade = CascadeType.ALL)
    private Set<Comment> commentSet = new HashSet<>();
}
