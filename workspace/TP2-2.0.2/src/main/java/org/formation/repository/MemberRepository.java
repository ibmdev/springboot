package org.formation.repository;

import java.util.List;

import org.formation.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * Repository for Member data implemented using Spring Data JPA.
 * 
 * @author David THIBAU
 */
/**
 * @author dthibau
 *
 */
public interface MemberRepository extends JpaRepository<Member, Long> {

	
	/**
	 * Tous les membres ayant un email particulier.
	 * @param email
	 * @return
	 */
	public List<Member> findByEmail(String email);

	/**
	 * Find Members whose owner name contains the specified string
	 * 
	 * @param partialName
	 *            Any alphabetic string.
	 * @return The list of matching Members - always non-null, but may be
	 *         empty.
	 */
	public List<Member> findByNomContainingIgnoreCase(String partialNom);
	


	/**
	 * Return a Member via its email and password
	 * @param email
	 * @param password
	 * @return
	 */
	public Member findByEmailAndPassword(String email, String password);


	

}
