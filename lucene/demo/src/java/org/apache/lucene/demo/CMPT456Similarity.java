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
    public float idf(long docFreq, long docCount) {
        float res = (float) (Math.log((docCount + 2) / (docFreq + 2)) + 1);
        return res;
    }
}