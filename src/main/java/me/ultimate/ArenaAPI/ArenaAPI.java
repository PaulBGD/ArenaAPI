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
package me.ultimate.ArenaAPI;

import java.util.ArrayList;
import java.util.List;

import me.ultimate.ArenaAPI.Objects.Arena;

/**
 * The Main API Class.
 * Through this class you should be able to access most of the stuff you will need.
 */
public class ArenaAPI {
    
    /** The list of all arenas. */
    private static List<Arena> arenas = new ArrayList<Arena>();
    
    /**
     * Gets a list of all arenas.
     *
     * @return the arenas
     */
    public static List<Arena> getArenas() {
        return arenas;
    }
    
    /**
     * Register a new arena.
     *
     * @param arena the arena
     */
    public static void registerArena(Arena arena) {
        if (arenas.contains(arena))
            arenas.remove(arena);
        arenas.add(arena);
    }
    
}