package career.plus.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ExtractRequestBody {
    public List<String> data;

    @JsonProperty("max_keywords")
    public int maxKeywords; // 如果这里是max_keywords也不需要去match

    public ExtractRequestBody(List<String> data, int maxKeywords) {
        this.data = data;
        this.maxKeywords = maxKeywords;
    }


}
