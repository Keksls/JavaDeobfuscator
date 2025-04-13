/*
 * Decompiled with CFR 0.152.
 */
public class bUP
implements ajh_1 {
    public static final String a = "titleText";
    public final String[] b = new String[]{"titleText"};
    private final bUO d;

    public bUP(bUO bUO2) {
        this.d = bUO2;
    }

    @Override
    public String[] d() {
        return new String[0];
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.d == null ? null : bae.h().a(this.d.b(), new Object[0]);
        }
        return null;
    }

    public bUO a() {
        return this.d;
    }

    public short b() {
        return this.d == null ? (short)-1 : this.d.a();
    }
}

