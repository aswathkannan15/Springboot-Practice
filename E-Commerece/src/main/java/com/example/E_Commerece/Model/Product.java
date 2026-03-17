
package com.example.E_Commerece.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
        import lombok.*;

        import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;              // ❗ NOT int

    private String name;
    private String description;
    private String brand;

    private BigDecimal price;        // ❗ NOT double / int
    private String category;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate releaseDate;   // ❗ Correct date type

    private Boolean available;       // ❗ NOT boolean
    private Integer stockQuantity;   // ❗ NOT int

    private String imageName;
    private String imageType;

    @Lob
    @Column(columnDefinition = "LONGBLOB")
    private byte[] imageData;
}