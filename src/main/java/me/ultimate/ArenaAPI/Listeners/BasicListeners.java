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
package me.ultimate.ArenaAPI.Listeners;

import me.ultimate.ArenaAPI.ArenaAPI;
import me.ultimate.ArenaAPI.Objects.Arena;
import me.ultimate.ArenaAPI.Objects.ArenaSettings.AS;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockBurnEvent;
import org.bukkit.event.block.BlockDamageEvent;
import org.bukkit.event.block.BlockDispenseEvent;
import org.bukkit.event.block.BlockFadeEvent;
import org.bukkit.event.block.BlockFormEvent;
import org.bukkit.event.block.BlockFromToEvent;
import org.bukkit.event.block.BlockGrowEvent;
import org.bukkit.event.block.BlockIgniteEvent;
import org.bukkit.event.block.BlockPhysicsEvent;
import org.bukkit.event.block.BlockPistonEvent;
import org.bukkit.event.block.BlockPistonExtendEvent;
import org.bukkit.event.block.BlockPistonRetractEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.block.BlockRedstoneEvent;
import org.bukkit.event.block.BlockSpreadEvent;
import org.bukkit.event.block.EntityBlockFormEvent;
import org.bukkit.event.block.LeavesDecayEvent;
import org.bukkit.event.block.NotePlayEvent;
import org.bukkit.event.block.SignChangeEvent;
import org.bukkit.event.enchantment.EnchantItemEvent;
import org.bukkit.event.enchantment.PrepareItemEnchantEvent;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.CreeperPowerEvent;
import org.bukkit.event.entity.EntityBreakDoorEvent;
import org.bukkit.event.entity.EntityChangeBlockEvent;
import org.bukkit.event.entity.EntityCombustByBlockEvent;
import org.bukkit.event.entity.EntityCombustByEntityEvent;
import org.bukkit.event.entity.EntityCombustEvent;
import org.bukkit.event.entity.EntityCreatePortalEvent;
import org.bukkit.event.entity.EntityDamageByBlockEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.event.entity.EntityInteractEvent;
import org.bukkit.event.entity.EntityPortalEnterEvent;
import org.bukkit.event.entity.EntityRegainHealthEvent;
import org.bukkit.event.entity.EntityShootBowEvent;
import org.bukkit.event.entity.EntityTameEvent;
import org.bukkit.event.entity.EntityTargetEvent;
import org.bukkit.event.entity.EntityTargetLivingEntityEvent;
import org.bukkit.event.entity.EntityTeleportEvent;
import org.bukkit.event.entity.ExpBottleEvent;
import org.bukkit.event.entity.ExplosionPrimeEvent;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.entity.ItemDespawnEvent;
import org.bukkit.event.entity.PigZapEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.entity.PotionSplashEvent;
import org.bukkit.event.entity.SheepDyeWoolEvent;
import org.bukkit.event.entity.SheepRegrowWoolEvent;
import org.bukkit.event.entity.SlimeSplitEvent;
import org.bukkit.event.hanging.HangingBreakByEntityEvent;
import org.bukkit.event.hanging.HangingBreakEvent;
import org.bukkit.event.hanging.HangingPlaceEvent;
import org.bukkit.event.inventory.BrewEvent;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.event.inventory.FurnaceBurnEvent;
import org.bukkit.event.inventory.FurnaceSmeltEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerAnimationEvent;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.event.player.PlayerBedLeaveEvent;
import org.bukkit.event.player.PlayerBucketEmptyEvent;
import org.bukkit.event.player.PlayerBucketEvent;
import org.bukkit.event.player.PlayerBucketFillEvent;
import org.bukkit.event.player.PlayerChannelEvent;
import org.bukkit.event.player.PlayerChatTabCompleteEvent;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerEggThrowEvent;
import org.bukkit.event.player.PlayerExpChangeEvent;
import org.bukkit.event.player.PlayerFishEvent;
import org.bukkit.event.player.PlayerGameModeChangeEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerItemBreakEvent;
import org.bukkit.event.player.PlayerItemHeldEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerKickEvent;
import org.bukkit.event.player.PlayerLevelChangeEvent;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.bukkit.event.player.PlayerPortalEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.player.PlayerRegisterChannelEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.event.player.PlayerShearEntityEvent;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.event.player.PlayerToggleFlightEvent;
import org.bukkit.event.player.PlayerToggleSneakEvent;
import org.bukkit.event.player.PlayerToggleSprintEvent;
import org.bukkit.event.player.PlayerUnregisterChannelEvent;
import org.bukkit.event.player.PlayerVelocityEvent;


/**
 * The Class BasicListeners, used to call custom Arena events.
 * No custom javadocs for the below, only generated.
 */
public class BasicListeners implements Listener {
    
    /**
     * On block burn.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onBlockBurn(BlockBurnEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getBlock())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On block damage.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onBlockDamage(BlockDamageEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getBlock())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On block burn.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onBlockBurn(BlockDispenseEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getBlock())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On block fae.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onBlockFae(BlockFadeEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getBlock())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On form burn.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onFormBurn(BlockFormEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getBlock())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On block from to.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onBlockFromTo(BlockFromToEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getBlock())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On block grow.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onBlockGrow(BlockGrowEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getBlock())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On block ignire.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onBlockIgnire(BlockIgniteEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getBlock())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On block physic.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onBlockPhysic(BlockPhysicsEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getBlock())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On block piston.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onBlockPiston(BlockPistonEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getBlock())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On block piston extend.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onBlockPistonExtend(BlockPistonExtendEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getBlock())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(BlockPistonRetractEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getBlock())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(BlockRedstoneEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getBlock())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(BlockSpreadEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getBlock())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(EntityBlockFormEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getBlock())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(LeavesDecayEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getBlock())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(NotePlayEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getBlock())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(SignChangeEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getBlock())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(EnchantItemEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getEnchantBlock())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(PrepareItemEnchantEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getEnchantBlock())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(CreatureSpawnEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getLocation())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(CreeperPowerEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getEntity().getLocation())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(EntityBreakDoorEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getBlock())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(EntityChangeBlockEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getBlock())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(EntityCombustByBlockEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getCombuster())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(EntityCombustByEntityEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getCombuster().getLocation())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(EntityCombustEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getEntity().getLocation())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(EntityCreatePortalEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getBlocks().get(0).getBlock())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(EntityDamageByBlockEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getDamager())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(EntityDamageByEntityEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getEntity().getLocation())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(EntityDamageEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getEntity().getLocation())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(EntityDeathEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getEntity().getLocation())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(EntityInteractEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getEntity().getLocation())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(EntityPortalEnterEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getLocation())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(EntityRegainHealthEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getEntity().getLocation())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(EntityShootBowEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getEntity().getLocation())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(EntityTameEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getEntity().getLocation())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(EntityTargetEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getEntity().getLocation())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(EntityTargetLivingEntityEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getEntity().getLocation())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(EntityTeleportEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getEntity().getLocation())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(ExpBottleEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getEntity().getLocation())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(ExplosionPrimeEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getEntity().getLocation())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(FoodLevelChangeEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getEntity().getLocation())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(ItemDespawnEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getEntity().getLocation())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(PigZapEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getEntity().getLocation())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(PlayerDeathEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getEntity().getLocation())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(PotionSplashEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getEntity().getLocation())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(SheepDyeWoolEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getEntity().getLocation())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(SheepRegrowWoolEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getEntity().getLocation())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(SlimeSplitEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getEntity().getLocation())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(BrewEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getBlock())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(CraftItemEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getWhoClicked().getLocation())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(FurnaceBurnEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getBlock())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(FurnaceSmeltEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getBlock())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(InventoryClickEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getWhoClicked().getLocation())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(InventoryCloseEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getPlayer().getLocation())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(InventoryOpenEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getPlayer().getLocation())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(HangingBreakByEntityEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getEntity().getLocation())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(HangingBreakEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getEntity().getLocation())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(HangingPlaceEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getBlock())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(AsyncPlayerChatEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getPlayer().getLocation())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(PlayerAnimationEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getPlayer().getLocation())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(PlayerBedEnterEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getPlayer().getLocation())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(PlayerBedLeaveEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getPlayer().getLocation())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(PlayerBucketEmptyEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getPlayer().getLocation())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(PlayerBucketEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getPlayer().getLocation())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(PlayerBucketFillEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getPlayer().getLocation())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(PlayerChannelEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getPlayer().getLocation())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(PlayerChatTabCompleteEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getPlayer().getLocation())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(PlayerCommandPreprocessEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getPlayer().getLocation())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(PlayerDropItemEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getPlayer().getLocation())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(PlayerEggThrowEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getPlayer().getLocation())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(PlayerExpChangeEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getPlayer().getLocation())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(PlayerFishEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getPlayer().getLocation())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(PlayerGameModeChangeEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getPlayer().getLocation())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(PlayerInteractEntityEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getPlayer().getLocation())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(PlayerInteractEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getPlayer().getLocation())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(PlayerItemBreakEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getPlayer().getLocation())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(PlayerItemHeldEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getPlayer().getLocation())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(PlayerJoinEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getPlayer().getLocation())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(PlayerKickEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getPlayer()))
                a.removePlayer(event.getPlayer());
            if (a.insideArena(event.getPlayer().getLocation())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(PlayerLevelChangeEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getPlayer().getLocation())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(PlayerLoginEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getPlayer().getLocation())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(PlayerMoveEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getPlayer().getLocation())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(PlayerPickupItemEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getPlayer().getLocation())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(PlayerPortalEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getPlayer().getLocation())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(PlayerQuitEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getPlayer()))
                a.removePlayer(event.getPlayer());
            if (a.insideArena(event.getPlayer().getLocation())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(PlayerRegisterChannelEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getPlayer().getLocation())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(PlayerRespawnEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getPlayer().getLocation())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(PlayerShearEntityEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getPlayer().getLocation())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(PlayerTeleportEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getPlayer().getLocation())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(PlayerToggleFlightEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getPlayer().getLocation())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(PlayerToggleSneakEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getPlayer().getLocation())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(PlayerToggleSprintEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getPlayer().getLocation())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(PlayerUnregisterChannelEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getPlayer().getLocation())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On arena event.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEvent(PlayerVelocityEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getPlayer().getLocation())) {
                ArenaAPI.getEventHandler().callEvent(a, event);
            }
        }
    }
    
    /**
     * On block break.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onBlockBreak(BlockBreakEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getBlock())) {
                if (a.getSettings().getSetting(AS.BLOCK_DESTROY)) {
                    event.setCancelled(true);
                } else {
                    ArenaAPI.getEventHandler().callEvent(a, event);
                }
            }
        }
    }
    
    /**
     * On block place.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onBlockPlace(BlockPlaceEvent event) {
        for (Arena a : ArenaAPI.getArenas()) {
            if (a.insideArena(event.getBlock())) {
                if (a.getSettings().getSetting(AS.BLOCK_PLACE)) {
                    event.setCancelled(true);
                } else {
                    ArenaAPI.getEventHandler().callEvent(a, event);
                }
            }
        }
    }
    
    /**
     * On entity explode.
     * 
     * @param event the event
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void onEntityExplode(EntityExplodeEvent event) {
        if (event.getEntityType().equals(EntityType.CREEPER)) {
            for (Arena a : ArenaAPI.getArenas()) {
                if (a.insideArena(event.getLocation())) {
                    if (a.getSettings().getSetting(AS.CREEPER_EXPLOSION)) {
                        event.setCancelled(true);
                    } else {
                        ArenaAPI.getEventHandler().callEvent(a, event);
                    }
                }
            }
        } else {
            for (Arena a : ArenaAPI.getArenas()) {
                if (a.insideArena(event.getLocation())) {
                    if (a.getSettings().getSetting(AS.OTHER_EXPLOSION)) {
                        event.setCancelled(true);
                    } else {
                        ArenaAPI.getEventHandler().callEvent(a, event);
                    }
                }
            }
        }
    }
}
