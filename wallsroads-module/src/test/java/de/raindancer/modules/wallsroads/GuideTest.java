package de.raindancer.modules.wallsroads;

import de.raindancer.core.ui.help.HelpLint;
import de.raindancer.modules.api.ModuleCommand;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.assertj.core.api.Assertions.assertThat;

class GuideTest {

    @Test
    void theGuideIsComplete() {
        assertThat(HelpLint.of(Path.of("src/main/resources/rains-help"))
                .module("wallsroads")
                .settings(WallsRoadsSettings.class, WallsRoadsSettings.DEFAULTS)
                .commands(new WallsRoadsModule().commands().stream().map(ModuleCommand::name).toList())
                .problems()).isEmpty();
    }
}
