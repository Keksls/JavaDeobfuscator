/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;

public final class aiI {
    private static final int a = 0;
    private static final byte b = -1;

    public static void a(aiG aiG2) {
        aiG2.a(0, (short)-1);
    }

    public static boolean b(aiG aiG2) {
        return aiG2.ar() == -1;
    }

    public static void a(aiG aiG2, DisplayedScreenElement displayedScreenElement) {
        if (displayedScreenElement == null) {
            aiI.a(aiG2);
        } else {
            aiG2.a(displayedScreenElement.aq(), displayedScreenElement.ar());
        }
    }
}

