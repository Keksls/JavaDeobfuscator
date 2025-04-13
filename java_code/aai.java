/*
 * Decompiled with CFR 0.152.
 */
public abstract class aai
extends Enum<aai> {
    public static final /* enum */ aai a = new aaj();
    public static final /* enum */ aai b = new aak();
    public static final /* enum */ aai c = new aal();
    private static final /* synthetic */ aai[] d;

    public static aai[] values() {
        return (aai[])d.clone();
    }

    public static aai valueOf(String string) {
        return Enum.valueOf(aai.class, string);
    }

    public abstract Float a(Number var1);

    static {
        d = new aai[]{a, b, c};
    }
}

