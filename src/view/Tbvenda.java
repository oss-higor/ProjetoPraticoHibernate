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
@Table(name = "tbvenda", catalog = "bancodedados_projetopratico", schema = "")
@NamedQueries({
    @NamedQuery(name = "Tbvenda.findAll", query = "SELECT t FROM Tbvenda t"),
    @NamedQuery(name = "Tbvenda.findByCodVenda", query = "SELECT t FROM Tbvenda t WHERE t.codVenda = :codVenda"),
    @NamedQuery(name = "Tbvenda.findByCpfCliente", query = "SELECT t FROM Tbvenda t WHERE t.cpfCliente = :cpfCliente"),
    @NamedQuery(name = "Tbvenda.findByDataVenda", query = "SELECT t FROM Tbvenda t WHERE t.dataVenda = :dataVenda"),
    @NamedQuery(name = "Tbvenda.findByStatusVenda", query = "SELECT t FROM Tbvenda t WHERE t.statusVenda = :statusVenda"),
    @NamedQuery(name = "Tbvenda.findByValorprodVenda", query = "SELECT t FROM Tbvenda t WHERE t.valorprodVenda = :valorprodVenda"),
    @NamedQuery(name = "Tbvenda.findByDescricaoVenda", query = "SELECT t FROM Tbvenda t WHERE t.descricaoVenda = :descricaoVenda"),
    @NamedQuery(name = "Tbvenda.findByQuantidadeVenda", query = "SELECT t FROM Tbvenda t WHERE t.quantidadeVenda = :quantidadeVenda"),
    @NamedQuery(name = "Tbvenda.findByValorTotal", query = "SELECT t FROM Tbvenda t WHERE t.valorTotal = :valorTotal"),
    @NamedQuery(name = "Tbvenda.findByCepVenda", query = "SELECT t FROM Tbvenda t WHERE t.cepVenda = :cepVenda"),
    @NamedQuery(name = "Tbvenda.findByEstadoVenda", query = "SELECT t FROM Tbvenda t WHERE t.estadoVenda = :estadoVenda"),
    @NamedQuery(name = "Tbvenda.findByCidadeVenda", query = "SELECT t FROM Tbvenda t WHERE t.cidadeVenda = :cidadeVenda"),
    @NamedQuery(name = "Tbvenda.findByBairroVenda", query = "SELECT t FROM Tbvenda t WHERE t.bairroVenda = :bairroVenda"),
    @NamedQuery(name = "Tbvenda.findByRuaVenda", query = "SELECT t FROM Tbvenda t WHERE t.ruaVenda = :ruaVenda"),
    @NamedQuery(name = "Tbvenda.findByNumeroVenda", query = "SELECT t FROM Tbvenda t WHERE t.numeroVenda = :numeroVenda")})
public class Tbvenda implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "cod_venda")
    private String codVenda;
    @Basic(optional = false)
    @Column(name = "cpf_cliente")
    private String cpfCliente;
    @Basic(optional = false)
    @Column(name = "data_venda")
    private String dataVenda;
    @Basic(optional = false)
    @Column(name = "status_venda")
    private String statusVenda;
    @Basic(optional = false)
    @Column(name = "valorprod_venda")
    private String valorprodVenda;
    @Basic(optional = false)
    @Column(name = "descricao_venda")
    private String descricaoVenda;
    @Basic(optional = false)
    @Column(name = "quantidade_venda")
    private String quantidadeVenda;
    @Basic(optional = false)
    @Column(name = "valor_total")
    private String valorTotal;
    @Basic(optional = false)
    @Column(name = "cep_venda")
    private String cepVenda;
    @Basic(optional = false)
    @Column(name = "estado_venda")
    private String estadoVenda;
    @Basic(optional = false)
    @Column(name = "cidade_venda")
    private String cidadeVenda;
    @Basic(optional = false)
    @Column(name = "bairro_venda")
    private String bairroVenda;
    @Basic(optional = false)
    @Column(name = "rua_venda")
    private String ruaVenda;
    @Basic(optional = false)
    @Column(name = "numero_venda")
    private String numeroVenda;

    public Tbvenda() {
    }

    public Tbvenda(String codVenda) {
        this.codVenda = codVenda;
    }

    public Tbvenda(String codVenda, String cpfCliente, String dataVenda, String statusVenda, String valorprodVenda, String descricaoVenda, String quantidadeVenda, String valorTotal, String cepVenda, String estadoVenda, String cidadeVenda, String bairroVenda, String ruaVenda, String numeroVenda) {
        this.codVenda = codVenda;
        this.cpfCliente = cpfCliente;
        this.dataVenda = dataVenda;
        this.statusVenda = statusVenda;
        this.valorprodVenda = valorprodVenda;
        this.descricaoVenda = descricaoVenda;
        this.quantidadeVenda = quantidadeVenda;
        this.valorTotal = valorTotal;
        this.cepVenda = cepVenda;
        this.estadoVenda = estadoVenda;
        this.cidadeVenda = cidadeVenda;
        this.bairroVenda = bairroVenda;
        this.ruaVenda = ruaVenda;
        this.numeroVenda = numeroVenda;
    }

    public String getCodVenda() {
        return codVenda;
    }

    public void setCodVenda(String codVenda) {
        String oldCodVenda = this.codVenda;
        this.codVenda = codVenda;
        changeSupport.firePropertyChange("codVenda", oldCodVenda, codVenda);
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        String oldCpfCliente = this.cpfCliente;
        this.cpfCliente = cpfCliente;
        changeSupport.firePropertyChange("cpfCliente", oldCpfCliente, cpfCliente);
    }

    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String dataVenda) {
        String oldDataVenda = this.dataVenda;
        this.dataVenda = dataVenda;
        changeSupport.firePropertyChange("dataVenda", oldDataVenda, dataVenda);
    }

    public String getStatusVenda() {
        return statusVenda;
    }

    public void setStatusVenda(String statusVenda) {
        String oldStatusVenda = this.statusVenda;
        this.statusVenda = statusVenda;
        changeSupport.firePropertyChange("statusVenda", oldStatusVenda, statusVenda);
    }

    public String getValorprodVenda() {
        return valorprodVenda;
    }

    public void setValorprodVenda(String valorprodVenda) {
        String oldValorprodVenda = this.valorprodVenda;
        this.valorprodVenda = valorprodVenda;
        changeSupport.firePropertyChange("valorprodVenda", oldValorprodVenda, valorprodVenda);
    }

    public String getDescricaoVenda() {
        return descricaoVenda;
    }

    public void setDescricaoVenda(String descricaoVenda) {
        String oldDescricaoVenda = this.descricaoVenda;
        this.descricaoVenda = descricaoVenda;
        changeSupport.firePropertyChange("descricaoVenda", oldDescricaoVenda, descricaoVenda);
    }

    public String getQuantidadeVenda() {
        return quantidadeVenda;
    }

    public void setQuantidadeVenda(String quantidadeVenda) {
        String oldQuantidadeVenda = this.quantidadeVenda;
        this.quantidadeVenda = quantidadeVenda;
        changeSupport.firePropertyChange("quantidadeVenda", oldQuantidadeVenda, quantidadeVenda);
    }

    public String getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(String valorTotal) {
        String oldValorTotal = this.valorTotal;
        this.valorTotal = valorTotal;
        changeSupport.firePropertyChange("valorTotal", oldValorTotal, valorTotal);
    }

    public String getCepVenda() {
        return cepVenda;
    }

    public void setCepVenda(String cepVenda) {
        String oldCepVenda = this.cepVenda;
        this.cepVenda = cepVenda;
        changeSupport.firePropertyChange("cepVenda", oldCepVenda, cepVenda);
    }

    public String getEstadoVenda() {
        return estadoVenda;
    }

    public void setEstadoVenda(String estadoVenda) {
        String oldEstadoVenda = this.estadoVenda;
        this.estadoVenda = estadoVenda;
        changeSupport.firePropertyChange("estadoVenda", oldEstadoVenda, estadoVenda);
    }

    public String getCidadeVenda() {
        return cidadeVenda;
    }

    public void setCidadeVenda(String cidadeVenda) {
        String oldCidadeVenda = this.cidadeVenda;
        this.cidadeVenda = cidadeVenda;
        changeSupport.firePropertyChange("cidadeVenda", oldCidadeVenda, cidadeVenda);
    }

    public String getBairroVenda() {
        return bairroVenda;
    }

    public void setBairroVenda(String bairroVenda) {
        String oldBairroVenda = this.bairroVenda;
        this.bairroVenda = bairroVenda;
        changeSupport.firePropertyChange("bairroVenda", oldBairroVenda, bairroVenda);
    }

    public String getRuaVenda() {
        return ruaVenda;
    }

    public void setRuaVenda(String ruaVenda) {
        String oldRuaVenda = this.ruaVenda;
        this.ruaVenda = ruaVenda;
        changeSupport.firePropertyChange("ruaVenda", oldRuaVenda, ruaVenda);
    }

    public String getNumeroVenda() {
        return numeroVenda;
    }

    public void setNumeroVenda(String numeroVenda) {
        String oldNumeroVenda = this.numeroVenda;
        this.numeroVenda = numeroVenda;
        changeSupport.firePropertyChange("numeroVenda", oldNumeroVenda, numeroVenda);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codVenda != null ? codVenda.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tbvenda)) {
            return false;
        }
        Tbvenda other = (Tbvenda) object;
        if ((this.codVenda == null && other.codVenda != null) || (this.codVenda != null && !this.codVenda.equals(other.codVenda))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "view.Tbvenda[ codVenda=" + codVenda + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
