package org.apache.lucene.demo;

import org.apache.lucene.search.similarities.ClassicSimilarity;

import java.lang.Math;


public class CMPT456Similarity extends ClassicSimilarity {
    @Override
    public float tf(float freq) {
        float res = (float) (Math.sqrt(1 + freq));
        return res;
    }

    @Override
    public float idf(long doc_Freq, long doc_Count) {
        float res = (float) (Math.log((doc_Count + 2) / (doc_Freq + 2)) + 1);
        return res;
    }
}