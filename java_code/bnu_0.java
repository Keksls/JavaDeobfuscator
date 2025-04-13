/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bNu
 */
public class bnu_0
implements ajh_1 {
    public static final String a = "altarWorld";
    public static final String b = "altarTimer";
    public static final String d = "altarPhase";
    private final String e;
    private final fhB f;
    private long g;
    private fha_0 h;

    public bnu_0(String string, fhB fhB2) {
        this.e = string;
        this.f = fhB2;
    }

    public void a() {
        this.h = this.f.b();
        fis_1.a().a((ajf_1)this, d);
        long l = 2L;
        switch (this.h) {
            case a: 
            case b: {
                ddp.a().d().a(this);
                break;
            }
            case c: 
            case d: 
            case e: {
                this.g = wc_0.p().a().g(this.f.d()).g();
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                ado_1.a().a(() -> {
                    fha_0 fha_02;
                    if (atomicBoolean.get()) {
                        return;
                    }
                    long l = wc_0.p().a().g(this.f.d()).g();
                    if (l == this.g) {
                        return;
                    }
                    this.g = l;
                    fis_1.a().a((ajf_1)this, b);
                    if (this.g > 0L) {
                        return;
                    }
                    switch (this.h) {
                        case c: {
                            fha_02 = fha_0.d;
                            break;
                        }
                        case d: {
                            fha_02 = fha_0.e;
                            break;
                        }
                        default: {
                            fha_02 = fha_0.b;
                        }
                    }
                    this.f.a(fha_02);
                    this.f.e();
                    this.a();
                    atomicBoolean.set(true);
                }, 500L, Hw.e(1L + this.g * 2L));
            }
        }
    }

    @Override
    public String[] d() {
        return new String[]{a, b, d};
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (a.equals(string)) {
            return this.e;
        }
        if (b.equals(string)) {
            return bae.h().a("remainingDurationSeconds", this.g);
        }
        if (d.equals(string)) {
            return bae.h().a("pvp.extraction.state." + this.h.name(), new Object[0]);
        }
        return null;
    }

    public long b() {
        return this.f.a();
    }
}

