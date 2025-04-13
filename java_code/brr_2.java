/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Optional;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bRr
 */
public class brr_2
implements ajh_1,
fwo {
    public static final String a = "title";
    public static final String b = "guideElements";
    public static final String d = "icon";
    public static final String e = "illustration";
    public static final String f = "description";
    public static final String g = "pageNumber";
    public static final String h = "hasPreviousPage";
    public static final String i = "hasNextPage";
    public static final String j = "unread";
    public static final String k = "selected";
    public static final String l = "adminGuideInfo";
    public static final String m = "hasManyPages";
    public static final String[] n = new String[]{"title", "guideElements", "illustration", "description", "pageNumber", "hasPreviousPage", "hasNextPage", "unread", "selected", "adminGuideInfo", "hasManyPages"};
    public static final String[] o = new String[]{"illustration", "description", "pageNumber", "hasPreviousPage", "hasNextPage"};
    private final brm_2 p;
    private int q;
    private boolean r;
    private boolean s;

    public brr_2(@NotNull brm_2 brm_22) {
        this.p = brm_22;
        this.q = 0;
    }

    @Override
    public String[] d() {
        return n;
    }

    @Override
    @Nullable
    public Object b(String string) {
        switch (string) {
            case "title": {
                return this.k();
            }
            case "illustration": {
                String string2 = this.p.g().get(this.q).c();
                return Cz.f(string2) ? null : azs_0.a().x(string2);
            }
            case "icon": {
                Optional<brn_2> optional = brp_2.a().a(this.p.c());
                return optional.filter(brn_22 -> brn_22.c() > 0).map(brn_22 -> azs_0.a().x(brn_22.c())).orElse(null);
            }
            case "description": {
                return bae.h().a(156, (long)this.p.g().get(this.q).a(), new Object[0]);
            }
            case "pageNumber": {
                return this.q + 1 + " / " + this.p.g().size();
            }
            case "hasPreviousPage": {
                return this.b();
            }
            case "hasNextPage": {
                return this.a();
            }
            case "unread": {
                return this.r;
            }
            case "selected": {
                return this.s;
            }
            case "hasManyPages": {
                return this.p.g().size() > 1;
            }
            case "adminGuideInfo": {
                return "Admin :\nGuide id=" + this.p.a() + "\nCategory id=" + this.p.c() + " (" + bae.h().a(154, (long)this.p.c(), new Object[0]) + ")";
            }
        }
        return null;
    }

    public boolean a() {
        return this.q < this.p.g().size() - 1;
    }

    public boolean b() {
        return this.q > 0;
    }

    public void a(boolean bl) {
        this.r = bl;
        fis_1.a().a((ajf_1)this, j);
    }

    public boolean c() {
        return this.r;
    }

    public void b(boolean bl) {
        this.s = bl;
        fis_1.a().a((ajf_1)this, k);
    }

    public boolean e() {
        return this.s;
    }

    public void f() {
        if (this.q >= this.p.g().size()) {
            return;
        }
        ++this.q;
        fis_1.a().a((ajf_1)this, o);
    }

    public void g() {
        if (this.q <= 0) {
            return;
        }
        --this.q;
        fis_1.a().a((ajf_1)this, o);
    }

    @NotNull
    private String k() {
        return bae.h().a(155, (long)this.p.a(), new Object[0]);
    }

    public int h() {
        return this.p.b();
    }

    public int i() {
        return this.p.a();
    }

    public int j() {
        return this.p.c();
    }

    @Override
    public String getFilterableStringValue() {
        return this.k();
    }
}

