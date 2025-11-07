package com;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("mousebuttonremapper")
public interface MouseButtonRemapperConfig extends Config
{
    @ConfigItem(
            keyName = "enabled",
            name = "Enable remapping",
            description = "Toggles all key-to-mouse remaps on or off.",
            position = 0
    )
    default boolean enabled()
    {
        return true;
    }

    @ConfigItem(
            keyName = "keyForMouse4",
            name = "Key for Mouse Button 4",
            description = "Keyboard key to simulate Mouse Button 4 click.",
            position = 1
    )
    default String keyForMouse4()
    {
        return "SPACE";
    }

    @ConfigItem(
            keyName = "keyForMouse5",
            name = "Key for Mouse Button 5",
            description = "Keyboard key to simulate Mouse Button 5 click.",
            position = 2
    )
    default String keyForMouse5()
    {
        return "ESC";
    }
}
