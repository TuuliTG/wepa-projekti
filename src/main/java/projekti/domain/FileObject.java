/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekti.domain;

/**
 *
 * @author tgtuuli
 */
import projekti.domain.User;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
@AllArgsConstructor
@Data
@NoArgsConstructor
public class FileObject extends AbstractPersistable<Long>{
    
    private String name;
    private String mediaType;
    private Long fileSize;
    @ManyToOne
    private User user;
    
    
    @Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] content;

}
