/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from Ca
 */
public final class ca_0 {
    private ca_0() {
    }

    public static boolean a(@NotNull String string) {
        try {
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            StringSelection stringSelection = new StringSelection(string);
            clipboard.setContents(stringSelection, null);
            return true;
        }
        catch (IllegalStateException | SecurityException runtimeException) {
            return false;
        }
    }

    public static Optional<String> a() {
        try {
            Transferable transferable = Toolkit.getDefaultToolkit().getSystemClipboard().getContents(null);
            if (transferable == null || !transferable.isDataFlavorSupported(DataFlavor.stringFlavor)) {
                return Optional.empty();
            }
            String string = (String)transferable.getTransferData(DataFlavor.stringFlavor);
            return Optional.of(string);
        }
        catch (UnsupportedFlavorException | IOException | IllegalStateException exception) {
            return Optional.empty();
        }
    }
}

