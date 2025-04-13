/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from atT
 */
public class att_1
extends RuntimeException
implements alc_2 {
    private static final String a = "ALL";
    private static final String b = "animation-missing";
    private final String c;
    private final String d;

    att_1(String string, String string2, String string3) {
        super(string);
        this.c = string2;
        this.d = string3;
    }

    att_1(String string) {
        this.c = string;
        this.d = a;
    }

    public String a() {
        return this.c;
    }

    public String b() {
        return this.d;
    }

    @Override
    public String[] c() {
        return new String[]{b, this.c, this.d};
    }
}

