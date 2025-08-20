package rubish;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WordRepository extends JpaRepository<WordData, String> {
    boolean existsWordDataByWord(String word);
    List<WordData> findWordDataByWord(String word);
}
