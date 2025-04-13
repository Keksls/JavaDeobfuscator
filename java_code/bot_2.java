/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 *  gnu.trove.set.hash.TIntHashSet
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.procedure.TObjectProcedure;
import gnu.trove.set.hash.TIntHashSet;
import java.nio.ByteBuffer;
import java.util.Optional;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from boT
 */
public class bot_2
implements bos_2 {
    @Nullable
    private erg_1 a;
    private long b;
    private String c = "";
    private float d;
    private bxu_1 e;

    @Override
    public long d() {
        return this.a != null ? this.a.a() : this.b;
    }

    @Override
    @Nullable
    public erl_1 a(long l) {
        if (this.a == null) {
            return null;
        }
        return this.a.a(l);
    }

    @Override
    public ern_1 c(long l) {
        return this.a != null ? this.a.c(l) : null;
    }

    @Override
    public long c() {
        return this.a != null ? this.a.b() : 0L;
    }

    @Override
    public void b(long l) {
        this.b = l;
    }

    @Override
    public void a(String string) {
        this.c = string;
    }

    @Override
    public TIntHashSet e() {
        if (this.a == null) {
            return new TIntHashSet();
        }
        bou_2 bou_22 = new bou_2();
        this.a.c(bou_22);
        return bou_22.a();
    }

    @Nullable
    public erg_1 f() {
        return this.a;
    }

    public void a(erg_1 erg_12) {
        this.a = erg_12;
    }

    @Override
    public String a() {
        return this.a != null ? this.a.e() : this.c;
    }

    @Override
    public long b() {
        return this.a != null ? this.a.f() : 0L;
    }

    @Override
    public short g() {
        return this.a != null ? this.a.i() : (short)0;
    }

    public int h() {
        return this.a != null ? this.a.j() : 0;
    }

    public void a(long l, byte ... byArray) {
        bmr_1 bmr_12 = (bmr_1)euw_2.a.d(l);
        if (bmr_12 == null) {
            return;
        }
        bmr_1 bmr_13 = azu_0.j().k();
        long l2 = euv_2.a.b(bmr_13.U_());
        if (euu_2.a() && l2 != 0L && l2 != l) {
            return;
        }
        erg_1 erg_12 = this.a;
        if (this.a != null) {
            this.a.c((TObjectProcedure<erh_1>)((TObjectProcedure)erh_12 -> {
                if (erh_12.d()) {
                    this.e.b((erh_1)erh_12);
                }
                return true;
            }));
        }
        byp_2.a().x();
        byk_2.a.b();
        if (byArray != null) {
            ebe_0 ebe_02;
            if (this.a == null) {
                this.a = new eqq_0();
                this.e = new bxu_1(this.a);
                this.a.a(this.e);
            }
            eQw.a(ByteBuffer.wrap(byArray), this.a);
            Optional optional = bhh_1.a(end_0.b);
            if (optional.isPresent() && (ebe_02 = (ebe_0)optional.get()).a() == bmr_13.a_()) {
                ebe_02.a(this.a.e());
                ebe_02.c(this.a.a());
            }
        }
        if (this.a != null) {
            byk_2.a.a();
            if (l2 == bmr_13.a_() || l2 == 0L) {
                byp_2.a().b();
            }
            if (erg_12 == null && this.a.h() != null && !this.a.h().isEmpty()) {
                byp_2.a().k();
            }
        } else if (erg_12 != null) {
            if (azu_0.j().c(cZu.a())) {
                azu_0.j().b(cZu.a());
            }
            if (azu_0.j().c(ddi_0.d()) && ddi_0.d().e() instanceof bql_1) {
                azu_0.j().b(ddi_0.d());
            }
        }
        fis_1.a().a((ajf_1)bmr_12, "hasGuild");
        fis_1.a().a((ajf_1)bmr_13, "hasGuild");
        cZJ.a.a(true);
    }

    public void a(float f2) {
        this.d = f2;
    }

    public float i() {
        return this.d;
    }

    @Override
    public void j() {
        this.a = null;
        this.e = null;
        this.b = 0L;
    }

    public String toString() {
        return "GuildLocalInformationHandler{m_guild=" + this.a + "}";
    }
}

