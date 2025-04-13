/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.text.DecimalFormat;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

public class bHN
extends exx_2
implements ajf_1 {
    public static final String a = "packType";
    public static final String b = "price";
    public static final String d = "formatedPrice";
    public static final String e = "item";
    public static final String f = "packList";
    public static final String g = "durationList";
    public static final String h = "duration";
    public static final String i = "protectorTaxFactor";
    public static final String[] j = new String[]{"packType", "price", "formatedPrice", "item", "packList", "duration", "durationList", "protectorTaxFactor"};
    private final ArrayList<bhq_0> o = new ArrayList();
    private final ArrayList<bho_0> p = new ArrayList();
    @NotNull
    protected feu_0 k = feu_0.a;

    @Override
    public boolean j() {
        return true;
    }

    @Override
    public String[] d() {
        return j;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            if (this.o.isEmpty()) {
                this.k();
            }
            int n = this.o.size();
            for (int k = 0; k < n; ++k) {
                bhq_0 bhq_02 = this.o.get(k);
                if (bhq_02.b() != this.q()) continue;
                return bhq_02;
            }
            return null;
        }
        if (string.equals(h)) {
            if (this.p.isEmpty()) {
                this.l();
            }
            int n = this.p.size();
            for (int k = 0; k < n; ++k) {
                bho_0 bho_02 = this.p.get(k);
                if (bho_02.b() != this.k) continue;
                return bho_02;
            }
            return null;
        }
        if (string.equals(b)) {
            return this.p() == 0L ? "" : bae.h().a(this.p());
        }
        if (string.equals(d)) {
            return DecimalFormat.getIntegerInstance().format(this.p());
        }
        if (string.equals(e)) {
            return this.h();
        }
        if (string.equals(f)) {
            if (this.o.isEmpty()) {
                this.k();
            }
            return this.o;
        }
        if (string.equals(g)) {
            if (this.p.isEmpty()) {
                this.l();
            }
            return this.p;
        }
        if (i.equals(string)) {
            long l = fje_0.a.a(azu_0.j().k(), fjb_0.a, 100L);
            azf_2 azf_22 = l < 20L ? azf_2.k : (l < 40L ? azf_2.x : azf_2.i);
            ani_2 ani_22 = new ani_2();
            ani_22.a(azf_22).a(l).j();
            return bae.h().a("desc.taxFactor", ani_22.toString());
        }
        return this.h() == null ? null : this.h().b(string);
    }

    @Override
    public short e() {
        if (this.h() == null) {
            return -1;
        }
        return super.e();
    }

    @NotNull
    public feu_0 c() {
        return this.k;
    }

    public void k() {
        this.o.clear();
        for (fev_0 fev_02 : fev_0.values()) {
            if (fev_02.f > this.e()) continue;
            this.o.add(new bhq_0(fev_02, true, fev_02 == this.n));
        }
    }

    public void l() {
        this.p.clear();
        for (feu_0 feu_02 : feu_0.values()) {
            this.p.add(new bho_0(feu_02, feu_02 == this.k));
        }
    }

    @Override
    public void a(String string, Object object) {
        int n;
        if (string.equalsIgnoreCase(b) && (n = cfq_0.parseStringNumber(object.toString())) != -1) {
            this.a(n);
        }
    }

    @Override
    public void b(String string, Object object) {
    }

    @Override
    public void c(String string, Object object) {
    }

    @Override
    public boolean a_(String string) {
        return string.equalsIgnoreCase(b);
    }

    @Override
    public void a(long l) {
        super.a(l);
        fis_1.a().a((ajf_1)this, b, d);
    }

    @Override
    public void a(fev_0 fev_02) {
        super.a(fev_02);
        for (bhq_0 bhq_02 : this.o) {
            bhq_02.a(bhq_02.b() == fev_02);
        }
        fis_1.a().a((ajf_1)this, a);
    }

    public void a(@NotNull feu_0 feu_02) {
        this.k = feu_02;
        for (bho_0 bho_02 : this.p) {
            bho_02.a(bho_02.b() == feu_02);
        }
        fis_1.a().a((ajf_1)this, h);
    }

    @Override
    public void a(short s2) {
        super.a(s2);
        fis_1.a().a((ajf_1)this, "quantity");
    }

    @Override
    public ts_0 i() {
        bHN bHN2 = new bHN();
        bHN2.l = this.l;
        bHN2.n = this.n;
        bHN2.m = this.m;
        bHN2.k = this.k;
        return bHN2;
    }

    @Override
    public boolean a(wf_2 wf_22) {
        this.l = eyo_1.g().a(wf_22.a);
        if (this.l != null) {
            this.a(wf_22.c);
            fev_0 fev_02 = fev_0.a(wf_22.b);
            if (fev_02 != null) {
                this.a(fev_02);
                return true;
            }
            c.error((Object)("Impossible de trouver le pack \u00e0 " + wf_22.b + " items"));
            return false;
        }
        return false;
    }

    @Override
    public boolean b(wf_2 wf_22) {
        wf_22.c = Hw.e(this.p());
        wf_22.b = this.q().f;
        this.l.a(wf_22.a);
        return true;
    }

    public String m() {
        if (this.h() == null) {
            return "<undefined>";
        }
        return this.h().N();
    }

    public String n() {
        if (this.h() == null) {
            return "";
        }
        return this.h().O();
    }

    public int o() {
        if (this.h() == null) {
            return 0;
        }
        return this.e() / this.q().f;
    }

    @Override
    public /* synthetic */ boolean b(Object object) {
        return this.a((wf_2)object);
    }

    @Override
    public /* synthetic */ boolean a(Object object) {
        return this.b((wf_2)object);
    }
}

