/*
 * Copyright (c) Fundacion Jala. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */
package org.fundacionjala.sevenwonders.core;

import org.fundacionjala.sevenwonders.core.effect.Effect;

import java.util.List;

/**
 * Created by Vania Catorceno on 5/20/2016.
 */
public class Card {

    private List<Requirement> requirements;
    private List<Effect> effects;

    public Card(List<Requirement> requirements, List<Effect> effects) {
        this.requirements = requirements;
        this.effects = effects;
    }

    /**
     * get the list of Requirements for build a Stage
     *
     * @return List
     */
    public List<Requirement> getRequirements() {
        return requirements;
    }

    /**
     * get the list of effects of Stage when is built
     *
     * @return List
     */
    public List<Effect> getEffects() {
        return effects;
    }


}
