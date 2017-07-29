package br.com.hometrader.example;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "exampleEntity")
public class ExampleEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@GenericGenerator(name = "increment", strategy = "increment")
	private Long id;

	@Column(nullable = true)
	private String name;
}
