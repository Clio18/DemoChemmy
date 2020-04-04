package system.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import system.model.Element;


public interface ElRepository extends JpaRepository<Element, Integer> {

}
