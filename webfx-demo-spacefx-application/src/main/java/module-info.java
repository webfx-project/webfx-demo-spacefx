// File managed by WebFX (DO NOT EDIT MANUALLY)

module webfx.demo.spacefx.application {

    // Direct dependencies modules
    requires java.base;
    requires javafx.base;
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.media;
    requires webfx.platform.client.storage;
    requires webfx.platform.shared.resource;
    requires webfx.platform.shared.scheduler;
    requires webfx.platform.shared.shutdown;
    requires webfx.platform.shared.util;

    // Exported packages
    exports eu.hansolo.spacefx;

    // Resources packages
    opens eu.hansolo.spacefx;

    // Provided services
    provides javafx.application.Application with eu.hansolo.spacefx.SpaceFX;

}