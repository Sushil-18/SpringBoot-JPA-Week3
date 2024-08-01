package com.example.SpringBootDataJPA.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(
        name = "Product_Table" ,
        uniqueConstraints = {
                @UniqueConstraint(name = "sku_unique", columnNames = "sku")
        },
        indexes = {
                @Index(name = "Id_Index",columnList = "id")
        }
)
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String sku;

    private String title;

    private Integer price;

    private Integer quantity;
    @CreationTimestamp
    private LocalDateTime createdAt;
    @UpdateTimestamp
    private LocalDateTime updatedAt;


}
