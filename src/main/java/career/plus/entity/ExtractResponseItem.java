package career.plus.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

//每一个keyword放在一个extraction里
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExtractResponseItem {
    // Extractresponseitem对应一个文章对应的所有response 但是我们只需要extractions
    // 一个文章可能有很多key words 所以要用一个list
    // we do not need fields like "eternal_id", "error"..
    public List<Extraction> extractions;
}
