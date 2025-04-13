/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eZC
 */
public enum ezc_0 {
    a,
    b,
    c,
    d,
    e;


    @Nullable
    public static ezc_0 a(ezc_0 ezc_02) {
        switch (ezc_02) {
            case e: {
                return d;
            }
            case d: {
                return e;
            }
            case b: {
                return c;
            }
            case c: {
                return b;
            }
        }
        return null;
    }

    public boolean a() {
        return this == a || this == b;
    }
}

