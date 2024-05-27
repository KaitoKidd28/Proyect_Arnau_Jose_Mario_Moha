CREATE TABLE Planet_stats (
    planet_id NUMBER PRIMARY KEY,
    name VARCHAR(100),
    resurce_metal_amount NUMBER,
    resource_deuterion_amount NUMBER,
    technology_defense_level NUMBER,
    technology_attack_level NUMBER,
    battles_counter NUMBER,
    missile_launcher_remaining NUMBER,
    ion_cannon_remaining NUMBER,
    plasma_canon_remaining NUMBER,
    light_hunter_remaining NUMBER,
    heavy_hunter_remaining NUMBER,
    battleship_remaining NUMBER,
    armored_dhip_remaining NUMBER
);

CREATE TABLE Battle_stats (
    planet_id NUMBER,
    num_battle NUMBER,
    resource_metal_acquired NUMBER,
    resource_deuterium_acquired NUMBER,
    PRIMARY KEY (planet_id, num_battle),
    FOREIGN KEY (planet_id) REFERENCES planet_stats(planet_id)
 );
 
CREATE TABLE Battle_log (
    planet_id NUMBER,
    num_battle NUMBER,
    num_line NUMBER,
    log_entry NUMBER,
    PRIMARY KEY (planet_id, num_battle, num_line),
    FOREIGN KEY (planet_id, num_battle) REFERENCES Battle_stats(planet_id, num_battle)
);

CREATE TABLE Planet_battle_defense (
    planet_id NUMBER,
    num_battle NUMBER,
    missile_launcher_built NUMBER,
    missile_launcher_destroyed NUMBER,
    ion_cannon_built NUMBER,
    plasma_cannon_built NUMBER,
    PRIMARY KEY (planet_id, num_battle),
    FOREIGN KEY (planet_id, num_battle) REFERENCES Battle_stats(planet_id, num_battle)
);

CREATE TABLE Planet_battle_army (
    planet_id NUMBER,
    num_battle NUMBER,
    light_hunter_built NUMBER,
    light_hunter_destroyed NUMBER,
    heavy_hunter_built NUMBER,
    heavy_hunter_destroyed NUMBER,
    battleship_built NUMBER,
    battleship_destroyed NUMBER,
    armored_ship_built NUMBER,
    armored_ship_destroyed NUMBER,
    PRIMARY KEY (planet_id, num_battle),
    FOREIGN KEY (planet_id) REFERENCES Battle_stats(planet_id),
    FOREIGN KEY (num_battle) REFERENCES Battle_stats(num_battle)
);

CREATE TABLE Enemy_army (
    PRIMARY KEY (planet_id, num_battle), 
    planet_id NUMBER,
    num_battle NUMBER,
    light_hunter_threat NUMBER,
    light_hunter_destroyed NUMBER,
    heavy_hunter_threat NUMBER,
    heavy_hunter_destroyed NUMBER,
    battleship_threat NUMBER,
    battleship_destroyed NUMBER,
    armored_ship_threat NUMBER,
    armored_ship_destroyed NUMBER
);
