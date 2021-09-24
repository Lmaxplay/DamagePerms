package lmaxplay.damageperms;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class OnEvents implements Listener {
    @EventHandler
    public void onDamageTaken(EntityDamageEvent event) {
        if(event.getEntity() instanceof Player) {
            Player player = (Player) event.getEntity();
            if(player.hasPermission("damageperms.damage.all")) {
                EntityDamageEvent.DamageCause cause = event.getCause();
                if( cause == EntityDamageEvent.DamageCause.CONTACT) {
                    if (!player.hasPermission("damageperms.damage.contact")) {
                        event.setCancelled(true);
                    }
                } else if ( cause == EntityDamageEvent.DamageCause.CRAMMING) {
                    if (!player.hasPermission("damageperms.damage.cramming")) {
                        event.setCancelled(true);
                    }
                } else if ( cause == EntityDamageEvent.DamageCause.CUSTOM) {
                    if (!player.hasPermission("damageperms.damage.custom")) {
                        event.setCancelled(true);
                    }
                } else if ( cause == EntityDamageEvent.DamageCause.BLOCK_EXPLOSION) {
                    if (!player.hasPermission("damageperms.damage.explosion.block")) {
                        event.setCancelled(true);
                    }
                } else if ( cause == EntityDamageEvent.DamageCause.ENTITY_EXPLOSION) {
                    if (!player.hasPermission("damageperms.damage.explosion.entity")) {
                        event.setCancelled(true);
                    }
                } else if ( cause == EntityDamageEvent.DamageCause.DRAGON_BREATH) {
                    if (!player.hasPermission("damageperms.damage.dragonbreath")) {
                        event.setCancelled(true);
                    }
                } else if ( cause == EntityDamageEvent.DamageCause.DROWNING) {
                    if (!player.hasPermission("damageperms.damage.drowning")) {
                        event.setCancelled(true);
                    }
                } else if ( cause == EntityDamageEvent.DamageCause.DRYOUT) {
                    if (!player.hasPermission("damageperms.damage.dryout")) {
                        event.setCancelled(true);
                    }
                } else if ( cause == EntityDamageEvent.DamageCause.ENTITY_ATTACK) {
                    if (!player.hasPermission("damageperms.damage.attack")) {
                        event.setCancelled(true);
                    }
                } else if ( cause == EntityDamageEvent.DamageCause.ENTITY_SWEEP_ATTACK) {
                    if (!player.hasPermission("damageperms.damage.attack.sweep")) {
                        event.setCancelled(true);
                    }
                } else if ( cause == EntityDamageEvent.DamageCause.FALL) {
                    if (!player.hasPermission("damageperms.damage.fall")) {
                        event.setCancelled(true);
                    }
                } else if ( cause == EntityDamageEvent.DamageCause.FIRE) {
                    if (!player.hasPermission("damageperms.damage.fire")) {
                        event.setCancelled(true);
                    }
                } else if ( cause == EntityDamageEvent.DamageCause.FIRE_TICK) {
                    if (!player.hasPermission("damageperms.damage.fire.tick")) {
                        event.setCancelled(true);
                    }
                } else if ( cause == EntityDamageEvent.DamageCause.FALLING_BLOCK) {
                    if (!player.hasPermission("damageperms.damage.fallingblock")) {
                        event.setCancelled(true);
                    }
                } else if ( cause == EntityDamageEvent.DamageCause.FLY_INTO_WALL) {
                    if (!player.hasPermission("damageperms.damage.wall")) {
                        event.setCancelled(true);
                    }
                } else if ( cause == EntityDamageEvent.DamageCause.FREEZE) {
                    if (!player.hasPermission("damageperms.damage.freezing")) {
                        event.setCancelled(true);
                    }
                } else if ( cause == EntityDamageEvent.DamageCause.HOT_FLOOR) {
                    if (!player.hasPermission("damageperms.damage.hotfloor")) {
                        event.setCancelled(true);
                    }
                } else if ( cause == EntityDamageEvent.DamageCause.LAVA) {
                    if (!player.hasPermission("damageperms.damage.lava")) {
                        event.setCancelled(true);
                    }
                } else if ( cause == EntityDamageEvent.DamageCause.LIGHTNING) {
                    if (!player.hasPermission("damageperms.damage.lightning")) {
                        event.setCancelled(true);
                    }
                } else if ( cause == EntityDamageEvent.DamageCause.MAGIC) {
                    if (!player.hasPermission("damageperms.damage.magic")) {
                        event.setCancelled(true);
                    }
                } else if ( cause == EntityDamageEvent.DamageCause.MELTING) {
                    if (!player.hasPermission("damageperms.damage.melting")) {
                        event.setCancelled(true);
                    }
                } else if ( cause == EntityDamageEvent.DamageCause.POISON) {
                    if (!player.hasPermission("damageperms.damage.poison")) {
                        event.setCancelled(true);
                    }
                } else if ( cause == EntityDamageEvent.DamageCause.PROJECTILE) {
                    if (!player.hasPermission("damageperms.damage.projectile")) {
                        event.setCancelled(true);
                    }
                } else if ( cause == EntityDamageEvent.DamageCause.STARVATION) {
                    if (!player.hasPermission("damageperms.damage.starvation")) {
                        event.setCancelled(true);
                    }
                } else if ( cause == EntityDamageEvent.DamageCause.SUFFOCATION) {
                    if (!player.hasPermission("damageperms.damage.suffocation")) {
                        event.setCancelled(true);
                    }
                } else if ( cause == EntityDamageEvent.DamageCause.SUICIDE) {
                    if (!player.hasPermission("damageperms.damage.suicide")) {
                        event.setCancelled(true);
                    }
                } else if ( cause == EntityDamageEvent.DamageCause.THORNS) {
                    if (!player.hasPermission("damageperms.damage.thorns")) {
                        event.setCancelled(true);
                    }
                } else if ( cause == EntityDamageEvent.DamageCause.VOID) {
                    if (!player.hasPermission("damageperms.damage.void")) {
                        event.setCancelled(true);
                    }
                } else if ( cause == EntityDamageEvent.DamageCause.WITHER) {
                    if (!player.hasPermission("damageperms.damage.wither")) {
                        event.setCancelled(true);
                    }
                }
            }
            }
        }
    }
