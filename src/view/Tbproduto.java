/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author ADM
 */
@Entity
@Table(name = "tbproduto", catalog = "bancodedados_projetopratico", schema = "")
@NamedQueries({
    @NamedQuery(name = "Tbproduto.findAll", query = "SELECT t FROM Tbproduto t"),
    @NamedQuery(name = "Tbproduto.findByCodProduto", query = "SELECT t FROM Tbproduto t WHERE t.codProduto = :codProduto"),
    @NamedQuery(name = "Tbproduto.findByDescricaoProduto", query = "SELECT t FROM Tbproduto t WHERE t.descricaoProduto = :descricaoProduto"),
    @NamedQuery(name = "Tbproduto.findByCategoriaProduto", query = "SELECT t FROM Tbproduto t WHERE t.categoriaProduto = :categoriaProduto"),
    @NamedQuery(name = "Tbproduto.findByValorProduto", query = "SELECT t FROM Tbproduto t WHERE t.valorProduto = :valorProduto"),
    @NamedQuery(name = "Tbproduto.findByEstoqueProduto", query = "SELECT t FROM Tbproduto t WHERE t.estoqueProduto = :estoqueProduto")})
public class Tbproduto implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "cod_produto")
    private Integer codProduto;
    @Basic(optional = false)
    @Column(name = "descricao_produto")
    private String descricaoProduto;
    @Basic(optional = false)
    @Column(name = "categoria_produto")
    private String categoriaProduto;
    @Basic(optional = false)
    @Column(name = "valor_produto")
    private String valorProduto;
    @Basic(optional = false)
    @Column(name = "estoque_produto")
    private int estoqueProduto;

    public Tbproduto() {
    }

    public Tbproduto(Integer codProduto) {
        this.codProduto = codProduto;
    }

    public Tbproduto(Integer codProduto, String descricaoProduto, String categoriaProduto, String valorProduto, int estoqueProduto) {
        this.codProduto = codProduto;
        this.descricaoProduto = descricaoProduto;
        this.categoriaProduto = categoriaProduto;
        this.valorProduto = valorProduto;
        this.estoqueProduto = estoqueProduto;
    }

    public Integer getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(Integer codProduto) {
        Integer oldCodProduto = this.codProduto;
        this.codProduto = codProduto;
        changeSupport.firePropertyChange("codProduto", oldCodProduto, codProduto);
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        String oldDescricaoProduto = this.descricaoProduto;
        this.descricaoProduto = descricaoProduto;
        changeSupport.firePropertyChange("descricaoProduto", oldDescricaoProduto, descricaoProduto);
    }

    public String getCategoriaProduto() {
        return categoriaProduto;
    }

    public void setCategoriaProduto(String categoriaProduto) {
        String oldCategoriaProduto = this.categoriaProduto;
        this.categoriaProduto = categoriaProduto;
        changeSupport.firePropertyChange("categoriaProduto", oldCategoriaProduto, categoriaProduto);
    }

    public String getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(String valorProduto) {
        String oldValorProduto = this.valorProduto;
        this.valorProduto = valorProduto;
        changeSupport.firePropertyChange("valorProduto", oldValorProduto, valorProduto);
    }

    public int getEstoqueProduto() {
        return estoqueProduto;
    }

    public void setEstoqueProduto(int estoqueProduto) {
        int oldEstoqueProduto = this.estoqueProduto;
        this.estoqueProduto = estoqueProduto;
        changeSupport.firePropertyChange("estoqueProduto", oldEstoqueProduto, estoqueProduto);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codProduto != null ? codProduto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tbproduto)) {
            return false;
        }
        Tbproduto other = (Tbproduto) object;
        if ((this.codProduto == null && other.codProduto != null) || (this.codProduto != null && !this.codProduto.equals(other.codProduto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "view.Tbproduto[ codProduto=" + codProduto + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
