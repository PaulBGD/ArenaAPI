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

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import me.ultimate.ArenaAPI.ArenaEvents.ArenaListener;
import me.ultimate.ArenaAPI.ArenaEvents.ArenaListener.ArenaEvent;
import me.ultimate.ArenaAPI.Objects.Arena;

import org.bukkit.event.Event;
import org.bukkit.plugin.Plugin;

/**
 * The Class ArenaEventHandler used to manage events.
 */
public class ArenaEventHandler {
    
    /** The list of all listeners, and the arena they listen to */
    private HashMap<ArenaListener, Arena> listeners = new HashMap<ArenaListener, Arena>();
    
    /** The list of all events */
    
    /**
     * Adds the arena listener.
     * 
     * @param arena the arena
     * @param l the l
     * @param p the p
     */
    public void addArenaListener(Arena arena, ArenaListener l, Plugin p) {
        if (listeners.containsValue(arena) && listeners.containsKey(l))
            return;
        listeners.put(l, arena);
    }
    
    /**
     * Call event.
     * 
     * @param arena the arena
     * @param event the event
     */
    public void callEvent(Arena arena, Event event) {
        for (Map.Entry<ArenaListener, Arena> entry : listeners.entrySet()) {
            if (entry.getValue().equals(arena)) {
                for (Method m : entry.getKey().getClass().getMethods()) {
                    if (m.isAnnotationPresent(ArenaEvent.class) && m.getParameterTypes().length == 1) {
                        for (Class<?> c : m.getParameterTypes()) {
                            if (c.equals(event.getClass())) {
                                try {
                                    m.invoke(entry.getKey(), event);
                                } catch (Exception e1) {
                                    e1.printStackTrace();
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
}
