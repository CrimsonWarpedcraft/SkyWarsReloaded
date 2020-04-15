package com.dumptruckman.bukkit.configuration.json;

import org.bukkit.configuration.file.FileConfigurationOptions;
import org.jetbrains.annotations.NotNull;


public class JsonConfigurationOptions
        extends FileConfigurationOptions {
    protected JsonConfigurationOptions(@NotNull JsonConfiguration configuration) {
        super(configuration);
    }

    public JsonConfiguration configuration() {
        return (JsonConfiguration) super.configuration();
    }

    public JsonConfigurationOptions copyDefaults(boolean value) {
        super.copyDefaults(value);
        return this;
    }

    public JsonConfigurationOptions pathSeparator(char value) {
        super.pathSeparator(value);
        return this;
    }

    public JsonConfigurationOptions header(String value) {
        super.header(value);
        return this;
    }

    public JsonConfigurationOptions copyHeader(boolean value) {
        super.copyHeader(value);
        return this;
    }
}