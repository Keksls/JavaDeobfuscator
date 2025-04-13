/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bNw
 */
public class bnw_0
implements ajh_1 {
    public static final String a = "mustDisplay";
    public static final String b = "currentPact";
    public static final String d = "pendingPact";
    public static final String e = "pendingPactTimer";
    public static final String f = "altars";
    public static final String g = "hasAltars";
    private fhD h;
    private fhD i;
    private byte j;
    private final Map<Long, bnu_0> k = new HashMap<Long, bnu_0>();
    private final Runnable l = () -> {
        this.j = (byte)(this.j - 1);
        fis_1.a().a((ajf_1)this, e);
        if (this.j <= 0) {
            this.i = null;
            fis_1.a().a((ajf_1)this, d);
        }
    };

    @Override
    public String[] d() {
        return new String[]{a, b, d, e, f, g};
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (a.equals(string)) {
            return this.h != null && this.h != fhD.a || this.i != null && this.i != fhD.a;
        }
        if (b.equals(string)) {
            return this.h != null && this.h != fhD.a ? this.b(this.h) : null;
        }
        if (d.equals(string)) {
            return this.i != null && this.i != fhD.a ? this.b(this.i) : null;
        }
        if (e.equals(string)) {
            return this.j;
        }
        if (f.equals(string)) {
            return this.k.values();
        }
        if (g.equals(string)) {
            return this.k.size() > 0;
        }
        return null;
    }

    private String b(fhD fhD2) {
        return bae.h().a("pvp." + fhD2.name().toLowerCase() + ".title", new Object[0]);
    }

    private void e() {
        this.h = bhh_1.a(end_0.h).map(emy_02 -> (fhz)emy_02).map(fhz::a).orElse(fhD.a);
        fis_1.a().a((ajf_1)this, a, b);
    }

    private void f() {
        bhh_1.a(end_0.h).ifPresent(emy_02 -> {
            this.i = ((fhz)emy_02).b();
            this.j = this.i != null ? this.i.b() : (byte)0;
        });
        fis_1.a().a((ajf_1)this, a, d, e);
    }

    public void a(fhD fhD2) {
        if (this.h == null) {
            this.e();
        }
        if (this.h != fhD.a && fhD2 != fhD.a) {
            this.a();
            return;
        }
        if (fhD2 == fhD.a) {
            this.a();
            return;
        }
        this.h = fhD.a;
        this.i = fhD2;
        this.j = fhD2.b();
        ado_1.a().a(this.l, 1000L, this.j);
        fis_1.a().a((ajf_1)this, a, b, e, e);
    }

    public void a(fhB fhB2, String string) {
        bnu_0 bnu_02 = new bnu_0(string, fhB2);
        this.k.put(fhB2.a(), bnu_02);
        bnu_02.a();
        fis_1.a().a((ajf_1)this, f, g);
    }

    public void a(bnu_0 bnu_02) {
        this.k.remove(bnu_02.b());
        fis_1.a().a((ajf_1)this, f, g);
    }

    public void a() {
        this.e();
        this.f();
        fis_1.a().a((ajf_1)this, this.d());
    }

    public void b() {
        ado_1.a().b(this.l);
    }

    public byte c() {
        return this.j;
    }

    public void a(byte by) {
        this.j = by;
        ado_1.a().b(this.l);
        ado_1.a().a(this.l, 1000L, this.j);
    }
}

