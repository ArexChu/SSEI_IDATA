package com.ecust.equsys.domain;

import java.util.Arrays;
import java.util.Map;

/**
 * Created by ares on 16-6-4.
 */
public class DataStore {
        private String[] string;
        private Map<String, boolean[]> map;//是否选中的标志

        public DataStore() {
        }

        public DataStore(String[] string, Map<String, boolean[]> map) {
            this.string = string;
            this.map = map;
        }

        public Map<String, boolean[]> getMap() {
            return map;
        }

        public String[] getString() {
            return string;
        }

        public void setMap(Map<String, boolean[]> map) {
            this.map = map;
        }

        public void setString(String[] string) {
            this.string = string;
        }

        @Override
        public String toString() {
            return "DataStore{" +
                    "map=" + map +
                    ", string=" + Arrays.toString(string) +
                    '}';
        }
}

