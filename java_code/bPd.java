/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.THashMap
 *  gnu.trove.procedure.TObjectProcedure
 *  org.jetbrains.annotations.Nullable
 */
import com.ankamagames.wakfu.client.console.command.debug.DisplayStatesCommand;
import gnu.trove.map.hash.THashMap;
import gnu.trove.procedure.TObjectProcedure;
import org.jetbrains.annotations.Nullable;

public class bPd
implements bQA {
    private final THashMap<abh_2, bPb> a = new THashMap();
    private long b = 0L;
    private final long c = 1L;
    private static final TObjectProcedure<bPb> d = new bPe();
    private static final TObjectProcedure<bPb> e = new bPf();

    @Nullable
    public bPb a(sd_0 sd_02, long l) {
        ajh_1 ajh_12;
        if (sd_02 == null) {
            return null;
        }
        Object object = sd_02.k();
        if (sd_02.bt_() == efc_0.b.a()) {
            object = ((eja_0)sd_02).aF();
        } else if (sd_02.bt_() == efc_0.du.a()) {
            object = ((eig_0)sd_02).aG();
        } else if (sd_02.bt_() == efc_0.dq.a() || sd_02.bt_() == efc_0.dr.a()) {
            return null;
        }
        if (object == null) {
            return null;
        }
        if (object instanceof bpl_0 && ((ajh_12 = (bph_0)((bpl_0)object).r()) == null || !((bph_0)ajh_12).f() && !DisplayStatesCommand.b())) {
            return null;
        }
        ajh_12 = this.b(sd_02);
        if (ajh_12 != null) {
            boolean bl = sd_02.f() == null || ((efh_0)sd_02.f()).Z();
            ((bPb)ajh_12).a(sd_02, bl);
            if (l != -1L) {
                ((bPb)ajh_12).a(l);
            }
        }
        return ajh_12 == null || ((bPb)ajh_12).f() == 0 ? null : ajh_12;
    }

    private bPb b(sd_0 sd_02) {
        abh_2 abh_22;
        bPb bPb2;
        Object EC = sd_02.k();
        if (EC == null) {
            return null;
        }
        long l = EC.aS_();
        if (EC.G_() == 19 || EC.G_() == 33) {
            if (this.b != 0L) {
                l = this.b;
            } else {
                this.b = l;
            }
        }
        if ((bPb2 = (bPb)this.a.get((Object)(abh_22 = new abh_2(EC.G_(), l)))) == null) {
            bPb2 = bPb.a(EC);
            this.a.put((Object)abh_22, (Object)bPb2);
        } else {
            bPb2.b((Sm)EC);
        }
        return bPb2;
    }

    public void a(sd_0 sd_02) {
        abh_2 abh_22;
        bPb bPb2;
        if (sd_02 == null) {
            return;
        }
        Object object = sd_02.k();
        if (sd_02.bt_() == efc_0.b.a()) {
            object = ((eja_0)sd_02).aF();
        }
        if (object == null) {
            return;
        }
        long l = object.aS_();
        if ((object.G_() == 19 || object.G_() == 33) && this.b != 0L) {
            l = this.b;
        }
        if (object.G_() == 28) {
            l = 1L;
        }
        if ((bPb2 = (bPb)this.a.get((Object)(abh_22 = new abh_2(object.G_(), l)))) != null) {
            bPb2.c((Sm)object);
            if (!bPb2.b()) {
                this.a.remove((Object)abh_22);
                bPb2.release();
                if (object.G_() == 19 || object.G_() == 33) {
                    this.b = 0L;
                }
            }
        }
    }

    public void a() {
        this.a.forEachValue(d);
    }

    public void b() {
        this.b = 0L;
        this.a.forEachValue(e);
        this.a.clear();
    }

    @Override
    public void c() {
        this.a();
    }
}

