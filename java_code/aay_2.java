/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aAY
 */
public class aay_2
extends RuntimeException
implements alc_2 {
    private static final String a = "unhandled-message";
    private final String b;
    private final String c;

    public aay_2(String string, String string2, String string3) {
        super(string);
        this.b = string2;
        this.c = string3;
    }

    @Override
    public String[] c() {
        return new String[]{a, this.b, this.c};
    }
}

