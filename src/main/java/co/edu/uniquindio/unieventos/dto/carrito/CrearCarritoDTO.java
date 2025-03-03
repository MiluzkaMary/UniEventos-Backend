package co.edu.uniquindio.unieventos.dto.carrito;

import co.edu.uniquindio.unieventos.model.vo.Localidad;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import org.bson.types.ObjectId;

import java.time.LocalDateTime;
import java.util.List;

public record CrearCarritoDTO(
        @NotBlank ObjectId idCuenta,
        LocalDateTime fecha,
        @NotEmpty List<DetalleCarritoDTO> items
) {
}
