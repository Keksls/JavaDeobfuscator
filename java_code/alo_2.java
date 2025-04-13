/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aLo
 */
public abstract class alo_2
extends RuntimeException
implements alc_2 {
    public static final String a = "lua-exec";
    private final String b;
    private final String c;

    alo_2(String string, String string2, String string3) {
        super(string3);
        this.b = string;
        this.c = string2;
    }

    @Override
    public String[] c() {
        return new String[]{a, this.b, this.c};
    }
}

