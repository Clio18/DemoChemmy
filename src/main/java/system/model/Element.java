package system.model;

import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.*;

@Entity
public class Element {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "symbol_el")
    private String symbol_el;
    @Column(name = "name_el")
    private String name_el;
    @Column(name = "origin_el")
    private String origin_el;
    @Column(name = "number_el")
    private int number_el;
    @Column(name = "atomic_mass")
    private String atomic_mass;
    @Column(name = "density_el")
    private String density_el;
    @Column(name = "melting_el")
    private String melting_el;
    @Column(name = "bolling_el")
    private String bolling_el;
    @Column(name = "year_el")
    private String year_el;
    @Column(name = "discover_el")
    private String discover_el;

    public Element() {
    }

    public Element(Integer id, String symbol_el, String name_el, String origin_el, int number_el, String atomic_mass, String density_el, String melting_el, String bolling_el, String year_el, String discover_el) {
        this.id=id;
        this.symbol_el = symbol_el;
        this.name_el = name_el;
        this.origin_el = origin_el;
        this.number_el = number_el;
        this.atomic_mass = atomic_mass;
        this.density_el = density_el;
        this.melting_el = melting_el;
        this.bolling_el = bolling_el;
        this.year_el = year_el;
        this.discover_el = discover_el;
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSymbol_el() {
        return symbol_el;
    }

    public void setSymbol_el(String symbol_el) {
        this.symbol_el = symbol_el;
    }

    public String getName_el() {
        return name_el;
    }

    public void setName_el(String name_el) {
        this.name_el = name_el;
    }

    public String getOrigin_el() {
        return origin_el;
    }

    public void setOrigin_el(String origin_el) {
        this.origin_el = origin_el;
    }

    public int getNumber_el() {
        return number_el;
    }

    public void setNumber_el(int number_el) {
        this.number_el = number_el;
    }

    public String getAtomic_mass() {
        return atomic_mass;
    }

    public void setAtomic_mass(String atomic_mass) {
        this.atomic_mass = atomic_mass;
    }

    public String getDensity_el() {
        return density_el;
    }

    public void setDensity_el(String density_el) {
        this.density_el = density_el;
    }

    public String getMelting_el() {
        return melting_el;
    }

    public void setMelting_el(String melting_el) {
        this.melting_el = melting_el;
    }

    public String getBolling_el() {
        return bolling_el;
    }

    public void setBolling_el(String bolling_el) {
        this.bolling_el = bolling_el;
    }

    public String getYear_el() {
        return year_el;
    }

    public void setYear_el(String year_el) {
        this.year_el = year_el;
    }

    public String getDiscover_el() {
        return discover_el;
    }

    public void setDiscover_el(String discover_el) {
        this.discover_el = discover_el;
    }

    @Override
    public String toString() {
        return "Element{" +
                "id=" + id +
                ", symbol_el='" + symbol_el + '\'' +
                ", name_el='" + name_el + '\'' +
                ", origin_el='" + origin_el + '\'' +
                ", number_el=" + number_el +
                ", atomic_mass='" + atomic_mass + '\'' +
                ", density_el='" + density_el + '\'' +
                ", melting_el='" + melting_el + '\'' +
                ", bolling_el='" + bolling_el + '\'' +
                ", year_el='" + year_el + '\'' +
                ", discover_el='" + discover_el + '\'' +
                '}';
    }
}
