/*
 * Arena API
 *
 * Created by Ultimate 
 *
 * The MIT License (MIT)
 * 
 * Copyright (c) 2013 Burn Games
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package me.ultimate.ArenaAPI.Objects;

import java.util.HashMap;

/**
 * The Class ArenaSettings, which determines an Arena's Settings
 */
public class ArenaSettings {
    
    /** The settings. */
    private ArenaSetting settings = new ArenaSetting();
    
    /**
     * Sets the specific setting.
     * 
     * @param s the setting
     * @param setting the value
     */
    public void set(AS s, boolean setting) {
        settings.set(s, setting);
    }
    
    /**
     * Gets the specific setting.
     * 
     * @param s the setting
     * @return the setting value
     */
    public boolean getSetting(AS s) {
        return settings.get(s);
    }
    
    /**
     * The Class ArenaSetting.
     */
    public class ArenaSetting {
        
        /** The sets. */
        private HashMap<AS, Boolean> sets = new HashMap<AS, Boolean>();
        
        /**
         * Instantiates a new arena setting.
         */
        public ArenaSetting() {
            for (AS as : AS.values())
                sets.put(as, as.getDefault());
        }
        
        /**
         * Gets the specific setting.
         * 
         * @param as the setting
         * @return true, if successful
         */
        public boolean get(AS as) {
            if (sets.containsKey(as))
                return sets.get(as);
            return false;
        }
        
        /**
         * Sets the.
         * 
         * @param as the arena setting
         * @param v the value
         */
        public void set(AS as, boolean v) {
            if (sets.containsKey(as)) {
                sets.remove(as);
                sets.put(as, v);
                return;
            }
            sets.put(as, v);
        }
    }
    
    /**
     * The Enum ArenaSetting
     */
    public enum AS {
        
        /** The pvp setting. */
        PVP(true),
        /** The block destroy setting. */
        BLOCK_DESTROY(false),
        /** The block placing setting. */
        BLOCK_PLACE(false),
        /** The walking out setting. */
        WALK_OUT(false),
        /** The creeper explosion setting. */
        CREEPER_EXPLOSION(false),
        /** The other types of explosions setting. */
        OTHER_EXPLOSION(false),
        /** The painting breaking setting. */
        PAINTING_BREAK(false);
        
        /** The default. */
        private boolean d = false;
        
        /**
         * Instantiates a new ArenaSetting.
         * 
         * @param d the d
         */
        private AS(boolean d) {
            this.d = d;
        }
        
        /**
         * Gets the default arena setting.
         * 
         * @return the default
         */
        public boolean getDefault() {
            return d;
        }
    }
}
