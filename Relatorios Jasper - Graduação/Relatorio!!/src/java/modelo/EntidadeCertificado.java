/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author Alunos
 */
@Entity
public class EntidadeCertificado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String descricao;
    private Double cargaHoraria;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataCertificado;
    
    @ManyToOne
    @JoinColumn
    private EntidadeAluno aluno;
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Date getDataCertificado() {
        return dataCertificado;
    }

    public void setDataCertificado(Date dataCertificado) {
        this.dataCertificado = dataCertificado;
    }

    public EntidadeAluno getAluno() {
        return aluno;
    }

    public void setAluno(EntidadeAluno aluno) {
        this.aluno = aluno;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EntidadeCertificado)) {
            return false;
        }
        EntidadeCertificado other = (EntidadeCertificado) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.EntidadeCertificado[ id=" + id + " ]";
    }
    
}
