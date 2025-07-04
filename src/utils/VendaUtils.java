package utils;

import DTO.ItensVendidosDTO;
import java.util.List;

public class VendaUtils {
    public static double calcularTotalVendas(List<ItensVendidosDTO> itens) {
        double total = 0.0;
        if (itens != null) {
            for (ItensVendidosDTO item : itens) {
                if (item != null) {
                    total += item.getSubtotalVenda();
                }
            }
        }
        return total;
    }
}
