/*
 * Decompiled with CFR 0.152.
 */
public class dfc
extends anw_1 {
    public dfc() {
        super(azu_0.j());
    }

    public dfc(short s2) {
        super(azu_0.j());
        this.a_(s2);
    }

    public dfc(short s2, Object object) {
        super(azu_0.j());
        this.a_(s2);
        this.a(object);
    }

    public static void d(short s2) {
        add_2.b().a(new dfc(s2));
    }

    public static void a(short s2, Object object) {
        dfc dfc2 = new dfc(s2);
        dfc2.a(object);
        add_2.b().a(dfc2);
    }
}

