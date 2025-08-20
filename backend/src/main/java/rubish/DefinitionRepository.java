package rubish;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface DefinitionRepository extends JpaRepository<DefinitionData,Integer> {
    //DefinitionData save(DefinitionData definitionData);
    List<DefinitionData> getDefinitionByWord(String word);
    void deleteDefinitionByWord(String word);
    DefinitionData getDefinitionDataByWordAndDefinition_id(String word, String definition_id);


}
