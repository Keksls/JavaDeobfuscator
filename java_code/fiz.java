/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import com.google.common.base.Function;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

public class fiz<S extends fio_0>
extends uf_0<S, yt_2>
implements gq_1<yx_2> {
    private static final Logger k = Logger.getLogger(fiz.class);
    private Function<zq_2, S> l;

    public fiz(Function<zq_2, S> function, short s2, tv_0<S, yt_2> tv_02, tt_0<S> tt_02, boolean bl, boolean bl2, boolean bl3) {
        super(s2, tv_02, tt_02, bl, bl2, bl3);
        this.l = function;
        this.a(Ui.i);
    }

    public fiz(short s2, tv_0<S, yt_2> tv_02, tt_0<S> tt_02, boolean bl, boolean bl2, boolean bl3) {
        super(s2, tv_02, tt_02, bl, bl2, bl3);
        this.a(Ui.i);
    }

    @Override
    public boolean a(yx_2 yx_22) {
        if (this.e) {
            k.warn((Object)"Impossible d'ajouter l'information de quantit\u00e9 \u00e0 un RawSpellLevelInventory qui n'est pas pr\u00e9vu pour");
        }
        yx_22.c();
        for (fio_0 fio_02 : this) {
            if (!fio_02.j()) continue;
            yy_1 yy_12 = new yy_1();
            if (!fio_02.a(yy_12.a)) {
                return false;
            }
            yx_22.a.add(yy_12);
        }
        return true;
    }

    public zt_2 f() {
        zv_2 zv_22 = zt_2.f();
        for (fio_0 fio_02 : this) {
            zv_22.a(fio_02.t());
        }
        return zv_22.g();
    }

    @Override
    public boolean b(yx_2 yx_22) {
        this.aO_();
        if (this.e) {
            k.warn((Object)"Impossible d'ajouter les quantit\u00e9s depuis un RawStackInventory qui ne connait pas cette information");
        }
        boolean bl = true;
        fio_0 fio_02 = null;
        if (this.b == null) {
            return false;
        }
        for (yy_1 yy_12 : yx_22.a) {
            try {
                fio_02 = (fio_0)this.b.a(yy_12.a);
                if (fio_02 != null) {
                    if (((uf_0)this).a(fio_02)) continue;
                    bl = false;
                    k.error((Object)("Unable to add spell " + fio_02.aT_() + "to spell inventory"));
                    fio_02.release();
                    continue;
                }
                bl = false;
            }
            catch (uz_0 uz_02) {
                k.error((Object)aho_2.a(uz_02));
                bl = false;
                fio_02.release();
            }
            catch (Uy uy) {
                k.error((Object)aho_2.a(uy));
                bl = false;
                fio_02.release();
            }
        }
        return bl;
    }

    @Override
    public boolean a(zt_2 zt_22) {
        this.aO_();
        boolean bl = true;
        List<zq_2> list = zt_22.b();
        for (zq_2 zq_22 : list) {
            fio_0 fio_02 = (fio_0)this.l.apply((Object)zq_22);
            if (fio_02 == null) continue;
            try {
                if (((uf_0)this).a(fio_02)) continue;
                bl = false;
                k.error((Object)("Unable to add spell " + zq_22.e() + "to spell inventory"));
                fio_02.release();
            }
            catch (Uy | uz_0 ua_02) {
                k.error((Object)("Failed to add " + fio_02.am + " to inventory"), (Throwable)ua_02);
                bl = false;
                fio_02.release();
            }
        }
        return bl;
    }

    public HashMap<Long, S> g() {
        return this.a;
    }

    @Override
    public int a(int n) {
        return 0;
    }

    @Override
    public int a(int n, int n2) {
        return 0;
    }

    @Nullable
    public S p() {
        Iterator iterator = this.a.values().iterator();
        if (iterator.hasNext()) {
            fio_0 fio_02 = (fio_0)iterator.next();
            return (S)fio_02;
        }
        return null;
    }

    @Override
    public ArrayList<S> b(tw_0 tw_02) {
        return super.b(tw_02);
    }
}

