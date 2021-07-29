package com.generation.moc.models.dao;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.generation.moc.models.entity.Usuarios;

@Repository 
public interface IUsuariosDAO extends JpaRepository <Usuarios, Long> {
	public Usuarios findByUsername(String username);

}

