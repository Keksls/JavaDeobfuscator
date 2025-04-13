/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.map.hash.TLongShortHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.map.hash.TLongShortHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.log4j.Logger;

/*
 * Renamed from bvA
 */
public class bva_2 {
    private static bvc_2 c;
    private static final Logger d;
    protected final TLongObjectHashMap<Object> a = new TLongObjectHashMap();
    protected final TLongShortHashMap b = new TLongShortHashMap();

    public bva_2(bvc_2 bvc_22) {
        c = bvc_22;
    }

    public void a(ts_0 ts_02, Object object, short s2) {
        if (object instanceof bHe) {
            if (azu_0.j().k().a_() != ((bvd_2)c.e()).g() && azu_0.j().k().a_() != ((bvd_2)c.f()).g()) {
                d.error((Object)"On essaie de m\u00e9moriser la position d'un item lors d'un \u00e9change qui ne concerne pas le joueur !");
                return;
            }
            bHe bHe2 = (bHe)object;
            this.a.put(ts_02.a(), (Object)bHe2);
            this.b.put(ts_02.a(), s2);
        }
    }

    public Object a(ts_0 ts_02) {
        return this.a.get(ts_02.a());
    }

    public short b(ts_0 ts_02) {
        return this.b.get(ts_02.a());
    }

    public Object a(exk_2 exk_22, short s2) {
        bvd_2 bvd_22 = (bvd_2)c.a(azu_0.j().k().a_());
        boolean bl = !bvd_22.b(exk_22.a());
        Object object = this.a.get(exk_22.a());
        short s3 = this.b.get(exk_22.a());
        bHi bHi2 = azu_0.j().k().da();
        if (bHi2 == null) {
            d.info((Object)"Erreur lors de la r\u00e9cup\u00e9ration des sacs du local player");
            return null;
        }
        if (object == null || s3 < 0) {
            d.error((Object)"On cherche a retirer un objet qui n'a pas \u00e9t\u00e9 m\u00e9moris\u00e9 pendant l'\u00e9change");
            return null;
        }
        if (object instanceof bHe) {
            boolean bl2;
            bHe bHe2 = (bHe)object;
            boolean bl3 = false;
            exk_2 exk_23 = exk_22.v();
            exk_23.a(s2);
            bHe bHe3 = (bHe)bHi2.d(bHe2.f());
            boolean bl4 = bl2 = bHe3.c(exk_23.a()) != null;
            if (bl2) {
                bl3 = bHe3.b(exk_23.a(), exk_23.e());
                if (bl3) {
                    exk_23.release();
                }
            } else if (bHe3.b(exk_23, s3)) {
                try {
                    bl3 = bHe3.c(exk_23, s3);
                }
                catch (Exception exception) {
                    d.warn((Object)exception.getMessage());
                }
                if (bl3 && !bHe3.g(exk_23)) {
                    exk_23.release();
                }
            }
            if (bl3) {
                if (bl) {
                    this.c(exk_23);
                }
                return bHe2;
            }
            exg_2 exg_22 = bHi2.a(exk_23, true);
            if (exg_22 == null) {
                d.error((Object)"L'item n'a pu etre ajout\u00e9 nulle part. Il n'a pas \u00e9t\u00e9 ajout\u00e9 a l'inventaire");
                return null;
            }
            d.warn((Object)("L'item a \u00e9t\u00e9 plac\u00e9 dans le premier bag disponible, soit :" + exg_22.f()));
            if (bl) {
                this.c(exk_22);
            }
            return exg_22;
        }
        return null;
    }

    public void a() {
        if (azu_0.j().k().a_() != ((bvd_2)c.e()).g() && azu_0.j().k().a_() != ((bvd_2)c.f()).g()) {
            d.error((Object)"On veut remettre a z\u00e9ro les positions d'un \u00e9change qui ne nous concerne pas !");
            return;
        }
        this.a.clear();
        this.b.clear();
    }

    public void c(ts_0 ts_02) {
        if (!this.a.containsKey(ts_02.a()) || !this.b.containsKey(ts_02.a())) {
            d.error((Object)"L'objet que l'on veut retirer n'est pas m\u00e9moris\u00e9 ! ");
            return;
        }
        this.a.remove(ts_02.a());
        this.b.remove(ts_02.a());
    }

    public void a(bvc_2 bvc_22) {
        if (bvc_22 != c) {
            d.error((Object)"We want to remove items from an exchange that doesn't concern player ! ");
            return;
        }
        bvd_2 bvd_22 = (bvd_2)c.a(azu_0.j().k().a_());
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.a.forEachEntry((l, object) -> {
            exk_2 exk_22 = (exk_2)bvd_22.a(l);
            Object object2 = this.a(exk_22, exk_22.e());
            if (object2 instanceof exq_2) {
                atomicBoolean.set(true);
            }
            return true;
        });
        if (atomicBoolean.get()) {
            cyt_0.a().i();
        }
        this.a();
    }

    static {
        d = Logger.getLogger(bva_2.class);
    }
}

