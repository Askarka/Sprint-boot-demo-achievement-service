package ru.itis.springbootdemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itis.springbootdemo.models.Goal;

public interface GoalsRepository extends JpaRepository<Goal, Long> {
}
