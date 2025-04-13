/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.log4j.Logger;

public class bsh
implements ajh_1 {
    protected static final Logger a = Logger.getLogger(bsh.class);
    public static final String b = "speakerIconUrl";
    public static final String d = "speakerName";
    public static final String e = "currentText";
    public static final String f = "currentChoices";
    public static final String[] g = new String[]{"speakerIconUrl", "speakerName", "currentText", "currentChoices"};
    private Sd j;
    private final eee_0 k;
    private final long l;
    private final String m;
    private final String n;
    private ArrayList<bsg> o;
    private String[] p;
    private static final int q = 800;
    public static final int h = -2;
    public static final int i = -1;
    private int r = 0;
    private boolean s = false;

    public bsh(Sd sd, eee_0 eee_02, long l, String string, String string2) {
        this.k = eee_02;
        this.l = l;
        this.m = string;
        this.n = string2;
        this.a(sd);
    }

    @Override
    public String[] d() {
        return g;
    }

    @Override
    public Object b(String string) {
        if (string.equals(b)) {
            return azs_0.a().v(this.a());
        }
        if (string.equals(d)) {
            if (this.j.d().isPresent()) {
                return bae.h().a(this.j.d().get(), new Object[0]);
            }
            switch (this.k) {
                case c: {
                    blx_1 blx_12 = bmf_2.a().c(this.l);
                    return blx_12 == null ? null : blx_12.dp();
                }
                case b: {
                    bMn bMn2 = (bMn)bMs.a.e((int)this.l);
                    return bMn2 == null ? null : bMn2.d();
                }
                case a: {
                    return null;
                }
            }
        } else {
            if (string.equals(e)) {
                return this.p == null ? "" : this.p[this.r] + (this.f() ? "" : " [...]");
            }
            if (string.equals(f)) {
                return this.j();
            }
        }
        return null;
    }

    public String a() {
        if (this.j != null && this.j.e().isPresent()) {
            return this.j.e().get();
        }
        return this.m;
    }

    public String b() {
        if (this.j != null && this.j.e().isPresent()) {
            return this.j.e().get();
        }
        return this.n;
    }

    private ArrayList<bsg> j() {
        if (this.o != null) {
            return this.o;
        }
        this.o = new ArrayList();
        if (!this.f()) {
            this.o.add(new bsg(-2, bsf.a));
            this.s = true;
            return this.o;
        }
        if (this.j.a() == 0) {
            this.s = true;
            this.o.add(new bsg(-1, bsf.a));
            return this.o;
        }
        this.s = false;
        Iterator<Se> iterator = this.j.b();
        while (iterator.hasNext()) {
            Se se = iterator.next();
            if (!se.a(azu_0.j().k(), this.k())) continue;
            this.o.add(new bsg(se.b(), bsf.a(se.c())));
        }
        return this.o;
    }

    private Sg k() {
        switch (this.k) {
            case c: {
                return (bmv_1)bmf_2.a().c(this.l);
            }
            case b: {
                return bMs.a.e((int)this.l);
            }
        }
        return null;
    }

    public void a(Sd sd) {
        this.j = sd;
        this.o = null;
        this.r = 0;
        String string = bae.h().a(75, (long)this.j.c(), new Object[0]);
        ArrayList<String> arrayList = new ArrayList<String>();
        while (string.length() > 800) {
            String string2 = string.substring(0, 800);
            int n = string2.lastIndexOf(" ");
            arrayList.add(string.substring(0, n));
            string = string.substring(n + 1);
        }
        arrayList.add(string);
        this.p = new String[arrayList.size()];
        for (int k = 0; k < this.p.length; ++k) {
            this.p[k] = (String)arrayList.get(k);
        }
        fis_1.a().a((ajf_1)this, g);
    }

    public int c() {
        return this.j.c();
    }

    public ArrayList<bsg> e() {
        return this.o;
    }

    public boolean f() {
        return this.r == this.p.length - 1;
    }

    public void g() {
        ++this.r;
        if (this.f()) {
            this.o = null;
        }
        fis_1.a().a((ajf_1)this, e, f);
    }

    public boolean h() {
        return this.s;
    }

    public void i() {
        this.p = null;
        fis_1.a().a((ajf_1)this, e);
    }
}

