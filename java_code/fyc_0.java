/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fyC
 */
public class fyc_0 {
    private static final Logger a = Logger.getLogger(fyc_0.class);
    private static final fyc_0 b = new fyc_0();
    private fvE c;
    private final HashMap<fso, ArrayList<fvE>> d = new HashMap();
    private boolean e = false;
    private fvE f = null;

    private fyc_0() {
    }

    public void a(fvE fvE2) {
        fso fso2 = fvE2.getRootFocusParent();
        if (fso2 != null) {
            ArrayList<fvE> arrayList = this.d.get(fso2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.d.put(fso2, arrayList);
            }
            if (!arrayList.contains(fvE2)) {
                arrayList.add(fvE2);
            }
        }
    }

    public void b(fvE fvE2) {
        fso fso2;
        if (this.c == fvE2) {
            this.e();
        }
        if (this.c == fvE2) {
            this.c = null;
        }
        if (this.f == fvE2) {
            this.f = null;
        }
        if ((fso2 = fvE2.getRootFocusParent()) != null) {
            ArrayList<fvE> arrayList = this.d.get(fso2);
            this.a(fvE2, fso2, arrayList);
        } else {
            for (ArrayList<fvE> arrayList : this.d.values()) {
                this.a(fvE2, fso2, arrayList);
            }
        }
    }

    private void a(fvE fvE2, fso fso2, Collection<fvE> collection) {
        if (collection != null) {
            collection.remove(fvE2);
            if (collection.isEmpty()) {
                this.d.remove(fso2);
            }
        }
    }

    public void a(fso fso2) {
        this.d.remove(fso2);
    }

    public static fyc_0 a() {
        return b;
    }

    public void a(boolean bl) {
        if (this.e == bl) {
            return;
        }
        if (!bl) {
            this.f = this.c;
            this.a(null, true);
        } else {
            this.a(this.f, true);
            this.f = null;
        }
        this.e = bl;
    }

    public void c(@Nullable fvE fvE2) {
        this.a(fvE2, false);
    }

    private void a(@Nullable fvE fvE2, boolean bl) {
        fcz_1 fcz_12;
        fvE fvE3;
        boolean bl2 = this.e || bl;
        fvE fvE4 = fvE3 = fvE2 != null && fvE2.getFocusable() ? fvE2 : null;
        if (bl2 && fvE3 == this.c || !bl2 && fvE3 == this.f) {
            return;
        }
        fvE fvE5 = this.c;
        if (bl2) {
            this.c = fvE3;
        } else {
            this.f = fvE3;
            this.c = null;
        }
        if (fvE5 != null && fvE5.getFocusable()) {
            fcz_12 = new fcz_1(fvE5, false);
            fvE5.dispatchEvent(fcz_12);
        }
        if (this.c != null && this.c.getFocusable()) {
            fcz_12 = new fcz_1(this.c, true);
            this.c.dispatchEvent(fcz_12);
        }
    }

    @Nullable
    public fvE b() {
        return this.c;
    }

    public void c() {
        if (this.c != null) {
            fvE fvE2;
            for (fvE2 = this.c; fvE2 != null && fvE2 != fta_0.getInstance() && fvE2.getModalLevel() == -1; fvE2 = fvE2.getContainer()) {
            }
            if (fvE2 != null && fvE2.getModalLevel() < fyd_0.a().c()) {
                this.c(null);
            }
        }
    }

    public void d() {
        this.b(false);
    }

    public void e() {
        this.b(true);
    }

    private void b(boolean bl) {
        fvE fvE2 = null;
        if (this.c == null) {
            for (ArrayList<fvE> arrayList : this.d.values()) {
                if (arrayList.isEmpty()) continue;
                fvE2 = arrayList.get(0);
                break;
            }
        } else {
            ArrayList<fvE> arrayList;
            fso fso2 = this.c.getRootFocusParent();
            if (fso2 != null && (arrayList = this.d.get(fso2)) != null && !arrayList.isEmpty()) {
                int n = arrayList.indexOf(this.c);
                int n2 = arrayList.size() - 1;
                if (bl && n == n2) {
                    fvE2 = arrayList.get(0);
                } else if (!bl && n == 0) {
                    fvE2 = arrayList.get(n2);
                } else if (n >= 0 && n <= n2) {
                    fvE2 = arrayList.get(n + (bl ? 1 : -1));
                } else {
                    a.error((Object)("m_focused (" + this.c + ") n'est pas enregistr\u00e9 dans les listes de widgets Focusables"));
                }
            }
        }
        this.c(fvE2);
    }
}

