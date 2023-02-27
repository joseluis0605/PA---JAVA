package com.company.materialAportado;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;
import static java.util.Comparator.comparingInt;

public enum FakeAlgorithm {
    TO_CAPITAL, ONLY_WORDS_BY_C, MORE_FREQUENT_WORDS;

    public String toCapital(String c) {
        return c.toUpperCase();
    }

    public String applyOnlyWordsByC(String c) {
        StringTokenizer st = new StringTokenizer(c, "");
        String result = "";
        String token = null;
        while (st.hasMoreTokens()) {
            token = st.nextToken();
            if (token.startsWith("c")) {
                result = result + token + " ";
            }
        }
        return result;
    }

    public String applyMoreFrequentWordsAlgorithm(String c, int numberOfFrequentWords) {
        ConcurrentMap<String, Integer> freqMap = asList(c.split("[\\s.]")).parallelStream().filter(s -> !s.isEmpty()).collect(Collectors.toConcurrentMap(w -> w.toLowerCase(), w -> 1, Integer::sum));
        //System.out.println(freqMap.toString());

        PriorityQueue<String> pq = new PriorityQueue<>(comparingInt(freqMap::get));
        for (String key : freqMap.keySet()) {
            pq.add(key);
        }
        String newContent = "";
        Iterator i = pq.iterator();
        // las 15 más frecuentes es con las que nos quedamos como contenido
        int count = 0;
        while (i.hasNext() && count < numberOfFrequentWords) {
            newContent = newContent + " " + i.next();
            count++;
        }

        return newContent;
    }
}
