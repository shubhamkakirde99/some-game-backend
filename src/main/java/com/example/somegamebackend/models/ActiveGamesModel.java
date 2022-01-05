package com.example.somegamebackend.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "active_games")
public class ActiveGamesModel {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "description")
    private String description;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "game_creator_id", referencedColumnName = "id")
    private UserModel gameCreatorId;

    @Column(name = "creation_time")
    private Date creationTime;
}
