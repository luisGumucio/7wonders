/*
 * Copyright (c) Fundacion Jala. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */
package org.fundacionjala.sevenwonders.core;

import org.fundacionjala.sevenwonders.core.effect.Effect;

import java.util.List;

/**
 * Created Vania Catorceno on 6/2/2016.
 */
public class Building extends Card {
    private int playersNeeded;
    private int age;
    private String name;
    private BuildingType buildingType;

    public Building(List<Requirement> requirements, List<Effect> effects, int playersNeeded,
            int age, String name, BuildingType buildingType) {
        super(requirements, effects);
        this.playersNeeded = playersNeeded;
        this.age = age;
        this.name = name;
        this.buildingType = buildingType;
    }

    public int getPlayersNeeded() {
        return playersNeeded;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public BuildingType getBuildingType() {
        return buildingType;
    }

    public void setName(String name) {
        this.name = name;
    }
}
