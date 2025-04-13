/*
 * Decompiled with CFR 0.152.
 */
public abstract class cec
extends Enum<cec> {
    public static final /* enum */ cec a = new ced(679);
    private final int b;
    private static final /* synthetic */ cec[] c;

    public static cec[] values() {
        return (cec[])c.clone();
    }

    public static cec valueOf(String string) {
        return Enum.valueOf(cec.class, string);
    }

    cec(int n2) {
        this.b = n2;
    }

    public abstract ceg a();

    public int b() {
        return this.b;
    }

    static {
        c = new cec[]{a};
    }
}

