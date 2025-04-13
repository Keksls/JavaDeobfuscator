/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TShortObjectProcedure
 */
import gnu.trove.procedure.TShortObjectProcedure;

/*
 * Renamed from btp
 */
class btp_0
implements TShortObjectProcedure<bts_0> {
    final /* synthetic */ bto_0 a;

    btp_0(bto_0 bto_02) {
        this.a = bto_02;
    }

    public boolean a(short s2, bts_0 bts_02) {
        byte by = bts_02.d();
        if (!this.a.i.containsKey(by)) {
            this.a.i.put(by, s2);
        } else {
            bto_0.d.error((Object)"Plusieurs tutorials sont mapp\u00e9s sur le m\u00eame eventId");
        }
        return true;
    }

    public /* synthetic */ boolean execute(short s2, Object object) {
        return this.a(s2, (bts_0)object);
    }
}

