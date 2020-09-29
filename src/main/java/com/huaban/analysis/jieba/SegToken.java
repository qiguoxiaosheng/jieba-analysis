package com.huaban.analysis.jieba;

public class SegToken {
    public String word;

    public int startOffset;

    public int endOffset;

    //add by xuming 20160607
    public String nature;

    public SegToken(String word, int startOffset, int endOffset) {
        this.word = word;
        this.startOffset = startOffset;
        this.endOffset = endOffset;
    }

    public SegToken(String word, int startOffset, int endOffset,String nature) {
        this.word = word;
        this.startOffset = startOffset;
        this.endOffset = endOffset;
        this.nature = nature;
    }

    @Override
    public String toString() {
        return "[" + word + ", " + startOffset + ", " + endOffset + "/" + nature + "]";
    }

}
