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
@Table(name = "tbcliente", catalog = "bancodedados_projetopratico", schema = "")
@NamedQueries({
    @NamedQuery(name = "Tbcliente.findAll", query = "SELECT t FROM Tbcliente t"),
    @NamedQuery(name = "Tbcliente.findByIdcliente", query = "SELECT t FROM Tbcliente t WHERE t.idcliente = :idcliente"),
    @NamedQuery(name = "Tbcliente.findByNomeCliente", query = "SELECT t FROM Tbcliente t WHERE t.nomeCliente = :nomeCliente"),
    @NamedQuery(name = "Tbcliente.findByEmailCliente", query = "SELECT t FROM Tbcliente t WHERE t.emailCliente = :emailCliente"),
    @NamedQuery(name = "Tbcliente.findByTelefoneCliente", query = "SELECT t FROM Tbcliente t WHERE t.telefoneCliente = :telefoneCliente"),
    @NamedQuery(name = "Tbcliente.findBySenhaCliente", query = "SELECT t FROM Tbcliente t WHERE t.senhaCliente = :senhaCliente"),
    @NamedQuery(name = "Tbcliente.findByCpfCliente", query = "SELECT t FROM Tbcliente t WHERE t.cpfCliente = :cpfCliente"),
    @NamedQuery(name = "Tbcliente.findByCepCliente", query = "SELECT t FROM Tbcliente t WHERE t.cepCliente = :cepCliente"),
    @NamedQuery(name = "Tbcliente.findByCidadeCliente", query = "SELECT t FROM Tbcliente t WHERE t.cidadeCliente = :cidadeCliente"),
    @NamedQuery(name = "Tbcliente.findByEstadoCliente", query = "SELECT t FROM Tbcliente t WHERE t.estadoCliente = :estadoCliente"),
    @NamedQuery(name = "Tbcliente.findByBairroCliente", query = "SELECT t FROM Tbcliente t WHERE t.bairroCliente = :bairroCliente"),
    @NamedQuery(name = "Tbcliente.findByRuaCliente", query = "SELECT t FROM Tbcliente t WHERE t.ruaCliente = :ruaCliente"),
    @NamedQuery(name = "Tbcliente.findByNumeroCliente", query = "SELECT t FROM Tbcliente t WHERE t.numeroCliente = :numeroCliente"),
    @NamedQuery(name = "Tbcliente.findByCep2Cliente", query = "SELECT t FROM Tbcliente t WHERE t.cep2Cliente = :cep2Cliente"),
    @NamedQuery(name = "Tbcliente.findByCidade2Cliente", query = "SELECT t FROM Tbcliente t WHERE t.cidade2Cliente = :cidade2Cliente"),
    @NamedQuery(name = "Tbcliente.findByEstado2Cliente", query = "SELECT t FROM Tbcliente t WHERE t.estado2Cliente = :estado2Cliente"),
    @NamedQuery(name = "Tbcliente.findByBairro2Cliente", query = "SELECT t FROM Tbcliente t WHERE t.bairro2Cliente = :bairro2Cliente"),
    @NamedQuery(name = "Tbcliente.findByRua2Cliente", query = "SELECT t FROM Tbcliente t WHERE t.rua2Cliente = :rua2Cliente"),
    @NamedQuery(name = "Tbcliente.findByNumero2Cliente", query = "SELECT t FROM Tbcliente t WHERE t.numero2Cliente = :numero2Cliente")})
public class Tbcliente implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idcliente")
    private String idcliente;
    @Basic(optional = false)
    @Column(name = "nome_cliente")
    private String nomeCliente;
    @Basic(optional = false)
    @Column(name = "email_cliente")
    private String emailCliente;
    @Basic(optional = false)
    @Column(name = "telefone_cliente")
    private String telefoneCliente;
    @Basic(optional = false)
    @Column(name = "senha_cliente")
    private String senhaCliente;
    @Basic(optional = false)
    @Column(name = "cpf_cliente")
    private String cpfCliente;
    @Basic(optional = false)
    @Column(name = "cep_cliente")
    private String cepCliente;
    @Basic(optional = false)
    @Column(name = "cidade_cliente")
    private String cidadeCliente;
    @Basic(optional = false)
    @Column(name = "estado_cliente")
    private String estadoCliente;
    @Basic(optional = false)
    @Column(name = "bairro_cliente")
    private String bairroCliente;
    @Basic(optional = false)
    @Column(name = "rua_cliente")
    private String ruaCliente;
    @Basic(optional = false)
    @Column(name = "numero_cliente")
    private String numeroCliente;
    @Column(name = "cep2_cliente")
    private String cep2Cliente;
    @Column(name = "cidade2_cliente")
    private String cidade2Cliente;
    @Column(name = "estado2_cliente")
    private String estado2Cliente;
    @Column(name = "bairro2_cliente")
    private String bairro2Cliente;
    @Column(name = "rua2_cliente")
    private String rua2Cliente;
    @Column(name = "numero2_cliente")
    private String numero2Cliente;

    public Tbcliente() {
    }

    public Tbcliente(String idcliente) {
        this.idcliente = idcliente;
    }

    public Tbcliente(String idcliente, String nomeCliente, String emailCliente, String telefoneCliente, String senhaCliente, String cpfCliente, String cepCliente, String cidadeCliente, String estadoCliente, String bairroCliente, String ruaCliente, String numeroCliente) {
        this.idcliente = idcliente;
        this.nomeCliente = nomeCliente;
        this.emailCliente = emailCliente;
        this.telefoneCliente = telefoneCliente;
        this.senhaCliente = senhaCliente;
        this.cpfCliente = cpfCliente;
        this.cepCliente = cepCliente;
        this.cidadeCliente = cidadeCliente;
        this.estadoCliente = estadoCliente;
        this.bairroCliente = bairroCliente;
        this.ruaCliente = ruaCliente;
        this.numeroCliente = numeroCliente;
    }

    public String getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(String idcliente) {
        String oldIdcliente = this.idcliente;
        this.idcliente = idcliente;
        changeSupport.firePropertyChange("idcliente", oldIdcliente, idcliente);
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        String oldNomeCliente = this.nomeCliente;
        this.nomeCliente = nomeCliente;
        changeSupport.firePropertyChange("nomeCliente", oldNomeCliente, nomeCliente);
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        String oldEmailCliente = this.emailCliente;
        this.emailCliente = emailCliente;
        changeSupport.firePropertyChange("emailCliente", oldEmailCliente, emailCliente);
    }

    public String getTelefoneCliente() {
        return telefoneCliente;
    }

    public void setTelefoneCliente(String telefoneCliente) {
        String oldTelefoneCliente = this.telefoneCliente;
        this.telefoneCliente = telefoneCliente;
        changeSupport.firePropertyChange("telefoneCliente", oldTelefoneCliente, telefoneCliente);
    }

    public String getSenhaCliente() {
        return senhaCliente;
    }

    public void setSenhaCliente(String senhaCliente) {
        String oldSenhaCliente = this.senhaCliente;
        this.senhaCliente = senhaCliente;
        changeSupport.firePropertyChange("senhaCliente", oldSenhaCliente, senhaCliente);
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        String oldCpfCliente = this.cpfCliente;
        this.cpfCliente = cpfCliente;
        changeSupport.firePropertyChange("cpfCliente", oldCpfCliente, cpfCliente);
    }

    public String getCepCliente() {
        return cepCliente;
    }

    public void setCepCliente(String cepCliente) {
        String oldCepCliente = this.cepCliente;
        this.cepCliente = cepCliente;
        changeSupport.firePropertyChange("cepCliente", oldCepCliente, cepCliente);
    }

    public String getCidadeCliente() {
        return cidadeCliente;
    }

    public void setCidadeCliente(String cidadeCliente) {
        String oldCidadeCliente = this.cidadeCliente;
        this.cidadeCliente = cidadeCliente;
        changeSupport.firePropertyChange("cidadeCliente", oldCidadeCliente, cidadeCliente);
    }

    public String getEstadoCliente() {
        return estadoCliente;
    }

    public void setEstadoCliente(String estadoCliente) {
        String oldEstadoCliente = this.estadoCliente;
        this.estadoCliente = estadoCliente;
        changeSupport.firePropertyChange("estadoCliente", oldEstadoCliente, estadoCliente);
    }

    public String getBairroCliente() {
        return bairroCliente;
    }

    public void setBairroCliente(String bairroCliente) {
        String oldBairroCliente = this.bairroCliente;
        this.bairroCliente = bairroCliente;
        changeSupport.firePropertyChange("bairroCliente", oldBairroCliente, bairroCliente);
    }

    public String getRuaCliente() {
        return ruaCliente;
    }

    public void setRuaCliente(String ruaCliente) {
        String oldRuaCliente = this.ruaCliente;
        this.ruaCliente = ruaCliente;
        changeSupport.firePropertyChange("ruaCliente", oldRuaCliente, ruaCliente);
    }

    public String getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(String numeroCliente) {
        String oldNumeroCliente = this.numeroCliente;
        this.numeroCliente = numeroCliente;
        changeSupport.firePropertyChange("numeroCliente", oldNumeroCliente, numeroCliente);
    }

    public String getCep2Cliente() {
        return cep2Cliente;
    }

    public void setCep2Cliente(String cep2Cliente) {
        String oldCep2Cliente = this.cep2Cliente;
        this.cep2Cliente = cep2Cliente;
        changeSupport.firePropertyChange("cep2Cliente", oldCep2Cliente, cep2Cliente);
    }

    public String getCidade2Cliente() {
        return cidade2Cliente;
    }

    public void setCidade2Cliente(String cidade2Cliente) {
        String oldCidade2Cliente = this.cidade2Cliente;
        this.cidade2Cliente = cidade2Cliente;
        changeSupport.firePropertyChange("cidade2Cliente", oldCidade2Cliente, cidade2Cliente);
    }

    public String getEstado2Cliente() {
        return estado2Cliente;
    }

    public void setEstado2Cliente(String estado2Cliente) {
        String oldEstado2Cliente = this.estado2Cliente;
        this.estado2Cliente = estado2Cliente;
        changeSupport.firePropertyChange("estado2Cliente", oldEstado2Cliente, estado2Cliente);
    }

    public String getBairro2Cliente() {
        return bairro2Cliente;
    }

    public void setBairro2Cliente(String bairro2Cliente) {
        String oldBairro2Cliente = this.bairro2Cliente;
        this.bairro2Cliente = bairro2Cliente;
        changeSupport.firePropertyChange("bairro2Cliente", oldBairro2Cliente, bairro2Cliente);
    }

    public String getRua2Cliente() {
        return rua2Cliente;
    }

    public void setRua2Cliente(String rua2Cliente) {
        String oldRua2Cliente = this.rua2Cliente;
        this.rua2Cliente = rua2Cliente;
        changeSupport.firePropertyChange("rua2Cliente", oldRua2Cliente, rua2Cliente);
    }

    public String getNumero2Cliente() {
        return numero2Cliente;
    }

    public void setNumero2Cliente(String numero2Cliente) {
        String oldNumero2Cliente = this.numero2Cliente;
        this.numero2Cliente = numero2Cliente;
        changeSupport.firePropertyChange("numero2Cliente", oldNumero2Cliente, numero2Cliente);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcliente != null ? idcliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tbcliente)) {
            return false;
        }
        Tbcliente other = (Tbcliente) object;
        if ((this.idcliente == null && other.idcliente != null) || (this.idcliente != null && !this.idcliente.equals(other.idcliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "view.Tbcliente[ idcliente=" + idcliente + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
