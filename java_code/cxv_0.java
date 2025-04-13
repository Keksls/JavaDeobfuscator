/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cXV
 */
public class cxv_0
implements ahr_1 {
    public static final cxv_0 a = new cxv_0();
    private akx_2 b;
    private String c;
    private akr_2[] d;
    private boolean e = true;
    private String f;
    private final csz_0 g = new csz_0("scenario.endKinematic");
    private final ans_1 h = new cXW(this);

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            fis_1.a().a("displayButton", this.g);
            fpm_0.b().a(this.h);
            fpm_0.b().a("displayButtonDialog", cfi_0.a("displayButtonDialog"), 139280L, (short)10000);
            fpm_0.b().a("wakfu.displayButton", cgd_0.class);
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            fpm_0.b().b(this.h);
            if (fpm_0.b().q("displayButtonDialog")) {
                fpm_0.b().o("displayButtonDialog");
            }
            fis_1.a().a("displayButton");
            fpm_0.b().e("wakfu.displayButton");
        }
    }

    @Override
    public boolean a(adt_1 adt_12) {
        return true;
    }

    @Override
    public long a_() {
        return 0L;
    }

    public void a(@Nullable String string) {
        this.f = string;
    }

    public String a() {
        return this.f;
    }

    @Override
    public void a(long l) {
    }

    public void b(@NotNull String string) {
        this.g.a(string);
    }

    public void a(akx_2 akx_22) {
        this.b = akx_22;
    }

    public void c(String string) {
        this.c = string;
    }

    public void a(boolean bl) {
        this.e = bl;
    }

    public boolean c() {
        return this.e;
    }

    public void d() {
        this.b.a(this.c, this.d, new akq_1[0]);
        azu_0.j().b(this);
    }

    public void a(akr_2[] akr_2Array) {
        this.d = akr_2Array;
    }
}

