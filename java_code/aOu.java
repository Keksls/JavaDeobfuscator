/*
 * Decompiled with CFR 0.152.
 */
public final class aOu
implements aOt {
    private final String g;
    private final String h;
    private final String i;
    private final String j;
    private final String k;
    private final String l;
    private final UL m;

    public aOu(UL uL, int n) {
        this.m = uL;
        this.g = String.format("AnimCourse-Mnt%d", n);
        this.h = String.format("AnimMarche-Mnt%d", n);
        this.i = String.format("AnimCourse-Debut-Mnt%d", n);
        this.j = String.format("AnimCourse-Fin-Mnt%d", n);
        this.k = String.format("AnimRelique-Saut-Mnt%d", n);
        this.l = String.format("AnimStatique-Mnt%s", n);
    }

    @Override
    public String a() {
        return this.g;
    }

    @Override
    public String b() {
        return this.h;
    }

    @Override
    public String c() {
        return this.i;
    }

    @Override
    public String d() {
        return this.j;
    }

    @Override
    public String e() {
        return this.l;
    }

    @Override
    public String f() {
        return this.k;
    }

    @Override
    public UL g() {
        return this.m;
    }
}

