/*
 * Decompiled with CFR 0.152.
 */
public abstract class adg
extends Enum<adg> {
    public static final /* enum */ adg a = new adh();
    public static final /* enum */ adg b = new adi();
    public static final /* enum */ adg c = new adj();
    public static final /* enum */ adg d = new adk_0();
    private static final /* synthetic */ adg[] e;

    public static adg[] values() {
        return (adg[])e.clone();
    }

    public static adg valueOf(String string) {
        return Enum.valueOf(adg.class, string);
    }

    abstract boolean a();

    abstract boolean b();

    static {
        e = new adg[]{a, b, c, d};
    }
}

