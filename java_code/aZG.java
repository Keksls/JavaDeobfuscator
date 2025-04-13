/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.net.URL;
import org.jetbrains.annotations.NotNull;

public final class aZG
extends anx_1 {
    private static final aZG w = new aZG();

    public static aZG e() {
        return w;
    }

    @Override
    public boolean b(any_1 any_12) {
        if (any_12.a() != null) {
            Object object = any_12.a();
            if (any_12.m() != null) {
                object = (String)object + any_12.m();
            }
            aVn.d().a((String)object, false);
            return true;
        }
        if (any_12.i() != null) {
            any_12.i().a();
            return true;
        }
        return false;
    }

    @NotNull
    public static String f() {
        return String.format("%s/shortcuts.xml", System.getProperty("preferenceStorePath"));
    }

    @NotNull
    public static String g() {
        return String.format("file:%s", aZG.f());
    }

    @NotNull
    public static URL h() {
        return new URL(aZG.g());
    }
}

