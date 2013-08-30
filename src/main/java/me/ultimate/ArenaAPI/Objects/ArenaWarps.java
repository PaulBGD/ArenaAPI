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

import org.bukkit.Location;

/**
 * The Class ArenaWarps, used to manage a Arena's Warps
 */
public class ArenaWarps {
    
    /** The warps. */
    private HashMap<WarpType, Location> warps = new HashMap<WarpType, Location>();
    
    /**
     * Instantiates a new arena warps.
     */
    public ArenaWarps() {
        for (WarpType type : WarpType.values())
            warps.put(type, null);
    }
    
    /**
     * Sets the warp.
     * 
     * @param type the Warp Type
     * @param l the location
     * @return the arena warps
     */
    public ArenaWarps setWarp(WarpType type, Location l) {
        if (warps.containsKey(type))
            warps.remove(type);
        warps.put(type, l);
        return this;
    }
    
    /**
     * Gets the specific warp.
     * 
     * @param type the WarpType
     * @return the warp location
     */
    public Location getWarp(WarpType type) {
        return warps.get(type);
    }
    
    /**
     * The Enum WarpType.
     */
    public enum WarpType {
        
        /** The spawn warp. */
        SPAWN,
        /** The spectating warp. */
        SPECTATE,
        /** The winning warp. */
        WIN,
        /** The lobby warp. */
        LOBBY,
        /** The losing warp. */
        LOSE
    }
}
