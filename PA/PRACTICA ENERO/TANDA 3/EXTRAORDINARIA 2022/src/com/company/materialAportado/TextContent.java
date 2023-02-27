package com.company.materialAportado;

public abstract class TextContent {
   
    // AÑADIR TODO LO QUE CONSIDERE NECESARIO
	
    public void transform(FakeAlgorithm algorithm) {
        switch (algorithm) {
            case TO_CAPITAL -> {
                this.content = algorithm.toCapital(this.content);
                break;
            }
            case ONLY_WORDS_BY_C -> {
                this.content = algorithm.applyOnlyWordsByC(this.content);
                break;
            }
            case MORE_FREQUENT_WORDS -> {
                this.content = algorithm.applyMoreFrequentWordsAlgorithm(this.content,15);
                break;
            }
        }
}
