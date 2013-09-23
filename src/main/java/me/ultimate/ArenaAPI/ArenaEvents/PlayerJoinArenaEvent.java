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
package me.ultimate.ArenaAPI.ArenaEvents;

import me.ultimate.ArenaAPI.Objects.Arena;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

// TODO: Auto-generated Javadoc
/**
 * The Class PlayerJoinArenaEvent, called when a player joins an Arena
 */
public class PlayerJoinArenaEvent extends Event implements Cancellable {
    
    /** The Constant handlers. */
    private static final HandlerList handlers = new HandlerList();
    
    /** The player. */
    private Player player;
    
    private Arena arena;
    
    /** If cancelled. */
    private boolean cancelled;
    
    /* (non-Javadoc)
     * @see org.bukkit.event.Event#getHandlers()
     */
    @Override
    public HandlerList getHandlers() {
        return handlers;
    }
    
    public PlayerJoinArenaEvent(Player player, Arena arena) {
        this.player = player;
        this.arena = arena;
    }
    
    /**
     * Gets the player.
     *
     * @return the player
     */
    public Player getPlayer() {
        return this.player;
    }
    
    public Arena getArena(){
        return this.arena;
    }
    
    /* (non-Javadoc)
     * @see org.bukkit.event.Cancellable#isCancelled()
     */
    @Override
    public boolean isCancelled() {
        return this.cancelled;
    }
    
    /* (non-Javadoc)
     * @see org.bukkit.event.Cancellable#setCancelled(boolean)
     */
    @Override
    public void setCancelled(boolean cancel) {
        this.cancelled = cancel;
    }
    
}
