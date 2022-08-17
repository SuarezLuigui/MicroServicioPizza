package EF.SuarezFiestasMicroservicio.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import EF.SuarezFiestasMicroservicio.Model.DetallePizza;



@Repository
public interface PizzaClienteRepository extends JpaRepository<DetallePizza, Integer> {

}
