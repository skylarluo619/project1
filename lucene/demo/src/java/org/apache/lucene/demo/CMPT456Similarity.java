package org.apache.lucene.demo;
import org.apache.lucene.search.similarities.ClassicSimilarity;
import java.lang.Math;

public class CMPT456Similarity extends ClassicSimilarity {
    @Override
    public float tf(float frequency) {
        float tmp = (float)(1.00+frequency);
        float result = (float)(Math.sqrt(tmp));
        return result;
    }

    @Override
    public float idf(long doc_frequency, long doc_count) {
        float tmp = (float)((doc_count+2)/(doc_frequency));
        float result = (float)(Math.log(tmp)+1);
        return result;
    }
}