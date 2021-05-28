package com.fral.extreme.algorithms;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Exercise3 {

    public interface IMetric {

        String getName();
        double getValue();

    }

    static class Metric implements IMetric {
        private String name;
        private double value;

        public Metric(String name, double value) {
            this.name = name;
            this.value = value;
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public double getValue() {
            return value;
        }
    }


    /**
     Implements a Java equivalent to:
     SELECT
     name,
     SUM(value) as value
     FROM metrics
     GROUP BY name;

     Keep O(n)
     */
    public static Collection<IMetric> groupMetrics(Collection<IMetric> metrics) {

        Map<String, IMetric> metricsMap = new HashMap<>();
        for(IMetric metric : metrics) {
            if(metricsMap.containsKey(metric.getName())) {
                double amountValue = metricsMap.get(metric.getName()).getValue() + metric.getValue();
                metricsMap.put(metric.getName(), new Metric(metric.getName(), amountValue));
            } else {
                metricsMap.put(metric.getName(), metric);
            }
        }

        return metricsMap.values();
    }
}
