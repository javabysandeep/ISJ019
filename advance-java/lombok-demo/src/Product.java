import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Product {
    private int id;
    private String name;
    private double price;
    private String mfYear;

}
