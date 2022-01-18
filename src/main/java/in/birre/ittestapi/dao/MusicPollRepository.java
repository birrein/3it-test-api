package in.birre.ittestapi.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.birre.ittestapi.model.MusicPoll;

public interface MusicPollRepository extends JpaRepository<MusicPoll, Integer> {
    List<MusicPoll> findByEmail(String email);
}
