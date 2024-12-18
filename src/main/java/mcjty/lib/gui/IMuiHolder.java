package mcjty.lib.gui;

import com.cleanroommc.modularui.api.IGuiHolder;
import com.cleanroommc.modularui.factory.PosGuiData;
import com.cleanroommc.modularui.screen.ModularPanel;
import com.cleanroommc.modularui.value.sync.PanelSyncManager;

public interface IMuiHolder extends IGuiHolder<PosGuiData> {

    default boolean useMui() {
        return false;
    }

    default ModularPanel buildUI(PosGuiData posGuiData, PanelSyncManager var2) {
        return null;
    }
}
