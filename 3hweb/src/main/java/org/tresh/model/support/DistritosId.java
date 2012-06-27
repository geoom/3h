package org.tresh.model.support;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
*
* @author solriver
*/
@Embeddable
public class DistritosId implements java.io.Serializable {

 
	private static final long serialVersionUID = 1L;
	@Column(name = "CCDI", nullable = false, length = 2)
    private String ccdi;
    @Column(name = "CCPP", nullable = false, length = 2)
    private String ccpp;
    @Column(name = "CCDD", nullable = false, length = 2)
    private String ccdd;

    public DistritosId() {
    }

    public DistritosId(String ccdi, String ccpp, String ccdd) {
        this.ccdi = ccdi;
        this.ccpp = ccpp;
        this.ccdd = ccdd;
    }

    public String getCcdi() {
        return this.ccdi;
    }

    public void setCcdi(String ccdi) {
        this.ccdi = ccdi;
    }

    public String getCcpp() {
        return this.ccpp;
    }

    public void setCcpp(String ccpp) {
        this.ccpp = ccpp;
    }

    public String getCcdd() {
        return this.ccdd;
    }

    public void setCcdd(String ccdd) {
        this.ccdd = ccdd;
    }

    @Override
    public boolean equals(Object other) {
        if ((this == other)) {
            return true;
        }
        if ((other == null)) {
            return false;
        }
        if (!(other instanceof DistritosId)) {
            return false;
        }
        DistritosId castOther = (DistritosId) other;

        return ((this.getCcdi() == castOther.getCcdi()) || (this.getCcdi() != null && castOther.getCcdi() != null && this.getCcdi().equals(castOther.getCcdi())))
                && ((this.getCcpp() == castOther.getCcpp()) || (this.getCcpp() != null && castOther.getCcpp() != null && this.getCcpp().equals(castOther.getCcpp())))
                && ((this.getCcdd() == castOther.getCcdd()) || (this.getCcdd() != null && castOther.getCcdd() != null && this.getCcdd().equals(castOther.getCcdd())));
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 37 * result + (getCcdi() == null ? 0 : this.getCcdi().hashCode());
        result = 37 * result + (getCcpp() == null ? 0 : this.getCcpp().hashCode());
        result = 37 * result + (getCcdd() == null ? 0 : this.getCcdd().hashCode());
        return result;
    }
}
