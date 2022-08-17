package EF.SuarezFiestasMicroservicio.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import EF.SuarezFiestasMicroservicio.Model.Pizza;



@Repository
public interface PizzaRepository extends JpaRepository<Pizza, Integer>{

}
