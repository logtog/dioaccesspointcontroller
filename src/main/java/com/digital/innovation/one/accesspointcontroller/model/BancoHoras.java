package com.digital.innovation.one.accesspointcontroller.model;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class BancoHoras {

  @EqualsAndHashCode
  @Embeddable
  @Getter
  @Setter
  public class BancoHorasId implements Serializable{
    private long idBancoHoras;
    private long idMovimentacao;
    private long idUsuario;
  }

  @EmbeddedId
  private BancoHorasId bancoHorasId;
  private LocalDateTime dataTrabalhada;
  private BigDecimal quantidadeHoras;
  private BigDecimal saldoHoras;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
    BancoHoras that = (BancoHoras) o;

    return Objects.equals(bancoHorasId, that.bancoHorasId);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(bancoHorasId);
  }
}