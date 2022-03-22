package ru.itis.springbootdemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itis.springbootdemo.models.Profile;

public interface ProfilesRepository extends JpaRepository<Profile, Long> {
}
