package utils;

import DAO.ItensVendidosDAO;
import DTO.ItensVendidosDTO;
import java.util.List;

public class TotalVendasApp {
    public static void main(String[] args) throws ClassNotFoundException {
        ItensVendidosDAO dao = new ItensVendidosDAO();
        List<ItensVendidosDTO> itens = dao.listarTodos();
        double total = VendaUtils.calcularTotalVendas(itens);
        System.out.println("Total de vendas: " + total);
    }
}
