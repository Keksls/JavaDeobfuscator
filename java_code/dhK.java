/*
 * Decompiled with CFR 0.152.
 */
import java.awt.event.KeyEvent;

public class dhK
extends dfc {
    private final KeyEvent b;

    dhK(int n, KeyEvent keyEvent) {
        this.b = keyEvent;
        this.a_(n);
    }

    public static void a(KeyEvent keyEvent) {
        dhK.a((short)17127, keyEvent);
    }

    public static void b(KeyEvent keyEvent) {
        dhK.a((short)19672, keyEvent);
    }

    private static void a(short s2, KeyEvent keyEvent) {
        dhK dhK2 = new dhK((int)s2, keyEvent);
        assert (dhK2.a() == s2);
        add_2.b().a(dhK2);
    }

    public KeyEvent k() {
        return this.b;
    }
}

