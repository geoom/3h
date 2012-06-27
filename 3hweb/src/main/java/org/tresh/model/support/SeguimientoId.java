package org.tresh.model.support;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author solriver
 */
@Embeddable
public class SeguimientoId implements java.io.Serializable {


	private static final long serialVersionUID = 1L;
	@Column(name = "cons_idconsumidor3h", nullable = false)
    private int idConsumidor;
    @Column(name = "prov_idproveedor3h", nullable = false)
    private int idProveedor;

    public SeguimientoId() {
    }

    public SeguimientoId(int consIdconsumidor3h, int provIdproveedor3h) {
        this.idConsumidor = consIdconsumidor3h;
        this.idProveedor = provIdproveedor3h;
    }

    @Override
    public boolean equals(Object other) {
        if ((this == other)) {
            return true;
        }
        if ((other == null)) {
            return false;
        }
        if (!(other instanceof SeguimientoId)) {
            return false;
        }
        SeguimientoId castOther = (SeguimientoId) other;

        return (this.getIdConsumidor() == castOther.getIdConsumidor())
                && (this.getIdProveedor() == castOther.getIdProveedor());
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 37 * result + this.getIdConsumidor();
        result = 37 * result + this.getIdProveedor();
        return result;
    }

    public int getIdConsumidor() {
        return idConsumidor;
    }

    public void setIdConsumidor(int idConsumidor) {
        this.idConsumidor = idConsumidor;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }
}
