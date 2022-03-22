package ru.itis.springbootdemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itis.springbootdemo.models.Achievement;

public interface AchievementsRepository extends JpaRepository<Achievement, Long> {
}
