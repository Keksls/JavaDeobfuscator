/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bRq
 */
public class brq_1
implements ajh_1,
bHp {
    public static final String a = "title";
    public static final String b = "icon";
    public static final String d = "guides";
    public static final String e = "collapsed";
    public static final String f = "unread";
    public static final String[] g = new String[]{"title", "icon", "guides", "collapsed", "unread"};
    private final brn_2 h;
    private final List<brr_2> i = new ArrayList<brr_2>();
    private boolean j;

    public brq_1(@NotNull brn_2 brn_22) {
        this.h = brn_22;
        this.j = true;
    }

    @Override
    public String[] d() {
        return g;
    }

    @Override
    @Nullable
    public Object b(String string) {
        switch (string) {
            case "title": {
                return bae.h().a(154, (long)this.h.a(), new Object[0]);
            }
            case "icon": {
                return this.h.c() > 0 ? azs_0.a().x(this.h.c()) : null;
            }
            case "guides": {
                return this.i;
            }
            case "collapsed": {
                return this.j;
            }
            case "unread": {
                return this.h();
            }
        }
        return null;
    }

    public boolean a(brr_2 brr_22) {
        return this.i.add(brr_22);
    }

    public int b() {
        return this.h.b();
    }

    public void e() {
        if (this.i.isEmpty()) {
            return;
        }
        this.i.sort(Comparator.comparingInt(brr_2::h));
    }

    public List<brr_2> f() {
        return Collections.unmodifiableList(this.i);
    }

    @Override
    public boolean a() {
        return this.j;
    }

    @Override
    public void a(boolean bl) {
        this.j = bl;
        fis_1.a().a((ajf_1)this, e);
    }

    private boolean h() {
        for (brr_2 brr_22 : this.i) {
            if (!brr_22.c()) continue;
            return true;
        }
        return false;
    }

    public int g() {
        return this.h.a();
    }
}

