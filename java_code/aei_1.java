/*
 * Decompiled with CFR 0.152.
 */
import java.awt.event.KeyEvent;

/*
 * Renamed from aEi
 */
public interface aei_1 {
    default public boolean a(KeyEvent keyEvent) {
        return false;
    }

    default public boolean b(KeyEvent keyEvent) {
        return false;
    }

    default public boolean c(KeyEvent keyEvent) {
        return false;
    }

    default public boolean f(KeyEvent keyEvent) {
        return (keyEvent.getModifiersEx() & 0x80) == 128;
    }

    default public boolean g(KeyEvent keyEvent) {
        return (keyEvent.getModifiersEx() & 0x40) == 64;
    }

    default public boolean h(KeyEvent keyEvent) {
        return (keyEvent.getModifiersEx() & 0x200) == 512;
    }
}

