/*
 * Decompiled with CFR 0.152.
 */
public class aUY
implements ajh_1 {
    public static final String a = "name";
    public static final String b = "pipeInternalName";
    public static final String d = "descSentence";
    public static final String e = "displayable";
    public static final String f = "colorString";
    public static final String g = "command";
    public static final String[] h = new String[]{"name", "pipeInternalName", "descSentence", "displayable", "colorString", "command"};
    private final aUn i;
    private final aUW j;
    private String k;
    private aud_0 l;
    private boolean m = true;
    private String n;

    public aUY(aUn aUn2, String string, aud_0 aud_02, auv_0 auv_02) {
        this.i = aUn2;
        this.k = string;
        if (auv_02 != null) {
            this.j = auv_02.a();
            if (this.j.a() != null) {
                this.k = this.k + " " + this.j.a();
            }
            this.n = auv_02.b();
        } else {
            this.j = null;
        }
        this.l = aud_02;
    }

    public aUW a() {
        return this.j;
    }

    public aUn b() {
        return this.i;
    }

    public String c() {
        return this.k;
    }

    public aud_0 e() {
        return this.l;
    }

    public void a(aud_0 aud_02) {
        this.l = aud_02;
    }

    public String f() {
        return this.n;
    }

    public int g() {
        return this.i.a().b();
    }

    @Override
    public String[] d() {
        return h;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.k;
        }
        if (string.equals(b)) {
            return this.b().c();
        }
        if (string.equals(d)) {
            return this.k;
        }
        if (string.equals(e)) {
            return true;
        }
        if (string.equals(f)) {
            azj_2 azj_22 = this.i.d();
            return azj_22.q() + "," + azj_22.r() + "," + azj_22.s();
        }
        if (string.equals(g)) {
            return this.n;
        }
        return null;
    }

    public boolean h() {
        return this.m;
    }

    public aUY a(boolean bl) {
        this.m = bl;
        ajg_1.a().a((ajf_1)this, h);
        return this;
    }

    public boolean equals(Object object) {
        if (!(object instanceof aUY)) {
            return false;
        }
        aUY aUY2 = (aUY)object;
        return this.l == aUY2.e() && (this.n == null || this.n.equals(aUY2.f()));
    }

    public boolean i() {
        return this.l != aud_0.a && ((bvx_0)ans_0.D().h()).b(this.i.h());
    }

    public aUW j() {
        if (this.i.h() == null) {
            return this.j;
        }
        if (this.i.a().l()) {
            return aUe.a(bah_0.d());
        }
        if (this.i.a().m()) {
            return aUe.b(bah_0.d());
        }
        return null;
    }
}

