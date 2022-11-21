package ua.edu.ucu.controllers;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.edu.ucu.Items.Flower;
import ua.edu.ucu.Items.FlowerColor;

@Repository
public interface FlowerRepository extends JpaRepository<Flower, Integer> {

}
