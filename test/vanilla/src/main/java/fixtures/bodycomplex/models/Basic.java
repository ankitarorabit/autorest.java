/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodycomplex.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Basic model.
 */
public class Basic {
    /**
     * Basic Id.
     */
    @JsonProperty(value = "id")
    private Integer id;

    /**
     * Name property with a very long description that does not fit on a single
     * line and a line break.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Possible values include: 'cyan', 'Magenta', 'YELLOW', 'blacK'.
     */
    @JsonProperty(value = "color")
    private CMYKColors color;

    /**
     * Get basic Id.
     *
     * @return the id value
     */
    public Integer id() {
        return this.id;
    }

    /**
     * Set basic Id.
     *
     * @param id the id value to set
     * @return the Basic object itself.
     */
    public Basic withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Get name property with a very long description that does not fit on a single line and a line break.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name property with a very long description that does not fit on a single line and a line break.
     *
     * @param name the name value to set
     * @return the Basic object itself.
     */
    public Basic withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get possible values include: 'cyan', 'Magenta', 'YELLOW', 'blacK'.
     *
     * @return the color value
     */
    public CMYKColors color() {
        return this.color;
    }

    /**
     * Set possible values include: 'cyan', 'Magenta', 'YELLOW', 'blacK'.
     *
     * @param color the color value to set
     * @return the Basic object itself.
     */
    public Basic withColor(CMYKColors color) {
        this.color = color;
        return this;
    }

}