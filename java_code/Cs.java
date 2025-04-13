/*
 * Decompiled with CFR 0.152.
 */
abstract class Cs
extends Enum<Cs> {
    public static final /* enum */ Cs a = new Ct("name");
    public static final /* enum */ Cs b = new Cu("nationName");
    public static final /* enum */ Cs c = new Cv("breedName");
    public static final /* enum */ Cs d = new Cw("almanachName");
    public static final /* enum */ Cs e = new Cx("almanachDescription");
    public static final /* enum */ Cs f = new Cy("almanachMonth");
    private final String g;
    private static final /* synthetic */ Cs[] h;

    public static Cs[] values() {
        return (Cs[])h.clone();
    }

    public static Cs valueOf(String string) {
        return Enum.valueOf(Cs.class, string);
    }

    Cs(String string2) {
        this.g = string2;
    }

    public String a() {
        return this.g;
    }

    public abstract String b();

    public static Cs a(String string) {
        for (Cs cs : Cs.values()) {
            if (!cs.a().equals(string)) continue;
            return cs;
        }
        return null;
    }

    static {
        h = new Cs[]{a, b, c, d, e, f};
    }
}

