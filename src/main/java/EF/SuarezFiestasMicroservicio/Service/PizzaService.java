package EF.SuarezFiestasMicroservicio.Service;

import java.util.List;

import EF.SuarezFiestasMicroservicio.Model.Pizza;

public interface PizzaService {
	
      List<Pizza> listar();
      Pizza ObtenerId(Integer id);	
      void guardar(Pizza pizza);
      void eliminar(Integer id);
      void actualizar(Pizza pizza);	
      void asignarClienteaPizza();

}
